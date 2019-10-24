import java.util.HashMap;

public class DicionarioDeIP {
    public static void main(String[] args) {
        Site[] sites = new Site[] {
            new Site("www.facebook.com", "123.456.789", false),
            new Site("www.youtube.com", "456.123.789", false),
            new Site("www.furb.br/ava3", "167.943.158", true),
            new Site("www.twitter.com", "147.258.369", false),
            new Site("www.gmail.com", "951.753.852", true),
            new Site("www.bradesco.com", "751.953.456", true)
        };

        HashMap<String, Site> hashMapSites = new HashMap<>();
        inserirSites(sites, hashMapSites);

        Site site = acessarSite("www.twitter.com", hashMapSites);

        if(site != null) {
            if (site.isStatus())
                System.out.println("Esse site está bloqueado.");
            else
                System.out.println(site);
        } else {
            System.out.println("Esse site não está cadastrado.");
        }

        System.out.println(imprimirSites(hashMapSites));
    }

    public static void inserirSites(Site[] sites, HashMap<String, Site> hashMapSites) {
        for(Site site : sites) {
            inserirSite(site, hashMapSites);
        }
    }

    public static void inserirSite(Site site, HashMap<String, Site> hashMapSites) {
        hashMapSites.put(site.getNome(), site);
    }

    public static Site acessarSite(String nomeSite, HashMap<String, Site> hashMapSites) {
        Site site = hashMapSites.get(nomeSite);
        return site;
    }

    public static String imprimirSites(HashMap<String, Site> hashMapSites) {
        StringBuilder string = new StringBuilder();

        for (Site site : hashMapSites.values()) {
            string.append(site).append("\n");
        }

        return string.toString();
    }
}
