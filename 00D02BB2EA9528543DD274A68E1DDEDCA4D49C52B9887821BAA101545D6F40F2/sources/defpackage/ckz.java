package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ckz  reason: default package */
/* loaded from: classes5.dex */
public final class ckz {
    private static final Pattern b = Pattern.compile("[?&]adurl=([^&]*)");
    private static final dcdc<String> c = dcdc.f("googleadservices");
    private static final dcdc<String> d = dcdc.f("google");
    public final Uri a;

    public ckz(Uri uri) {
        this.a = uri;
    }

    public final boolean a() {
        String host = this.a.getHost();
        if (!dbsj.d(host)) {
            List asList = Arrays.asList(host.split("[.]", -1));
            if (asList.size() > 1 && ((String) asList.get(0)).equals("www")) {
                asList = asList.subList(1, asList.size());
            }
            if ((asList.size() == 2 && c.contains(asList.get(0)) && ((String) asList.get(1)).equals("com")) || ((asList.size() == 2 || asList.size() == 3) && d.contains(asList.get(0)) && (asList.size() != 2 ? !(asList.size() != 3 || ((!((String) asList.get(1)).equals("co") && !((String) asList.get(1)).equals("com")) || ((String) asList.get(2)).length() != 2)) : ((String) asList.get(1)).equals("com")))) {
                List<String> pathSegments = this.a.getPathSegments();
                if (!pathSegments.isEmpty() && ((String) dcft.s(pathSegments)).equals("aclk") && "2".equals(this.a.getQueryParameter(ckx.SONIC_ENABLED_KEY.e))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final dbsg<String> b(Map<ckx, String> map) {
        dbsg dbsgVar;
        String uri = this.a.toString();
        Matcher matcher = b.matcher(uri);
        if (matcher.find()) {
            dbsgVar = dbsg.i(Integer.valueOf(matcher.start()));
        } else {
            dbsgVar = dbpy.a;
        }
        if (!dbsgVar.a()) {
            return dbpy.a;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((dcdn) map).entrySet()) {
            ckx ckxVar = ckx.SONIC_ENABLED_KEY;
            sb.append(((ckx) entry.getKey()).e);
            sb.append("=");
            sb.append((String) entry.getValue());
            sb.append("&");
        }
        String substring = uri.substring(0, ((Integer) dbsgVar.b()).intValue() + 1);
        String substring2 = uri.substring(((Integer) dbsgVar.b()).intValue() + 1);
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(valueOf).length() + String.valueOf(substring2).length());
        sb2.append(substring);
        sb2.append(valueOf);
        sb2.append(substring2);
        return dbsg.i(sb2.toString());
    }
}
