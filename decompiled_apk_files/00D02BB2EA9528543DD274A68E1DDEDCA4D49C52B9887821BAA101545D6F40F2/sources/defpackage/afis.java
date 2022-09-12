package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: afis  reason: default package */
/* loaded from: classes2.dex */
public final class afis {
    public static afir a(@dzsi Uri uri) {
        char c;
        if (uri != null && "geo.replay".equalsIgnoreCase(uri.getScheme())) {
            String authority = uri.getAuthority();
            String path = uri.getPath();
            if (authority == null) {
                authority = "";
            }
            if (path == null) {
                path = "";
            }
            String concat = path.length() != 0 ? authority.concat(path) : new String(authority);
            if (dbsj.d(concat)) {
                return null;
            }
            if (!concat.startsWith(File.separator)) {
                String valueOf = String.valueOf(File.separator);
                String valueOf2 = String.valueOf(concat);
                concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            if (concat.endsWith(File.separator)) {
                return null;
            }
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("preserve", false);
            dbsk.s(concat);
            String str = "/";
            if (concat.length() != 0) {
                Iterable<String> g = dbtm.a('/').e().g(concat);
                ArrayList arrayList = new ArrayList();
                for (String str2 : g) {
                    int hashCode = str2.hashCode();
                    if (hashCode != 46) {
                        if (hashCode == 1472 && str2.equals("..")) {
                            c = 1;
                        }
                        c = 65535;
                    } else {
                        if (str2.equals(".")) {
                            c = 0;
                        }
                        c = 65535;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            if (arrayList.size() <= 0 || ((String) arrayList.get(arrayList.size() - 1)).equals("..")) {
                                arrayList.add("..");
                            } else {
                                arrayList.remove(arrayList.size() - 1);
                            }
                        } else {
                            arrayList.add(str2);
                        }
                    }
                }
                String g2 = dbrz.f('/').g(arrayList);
                if (concat.charAt(0) == '/') {
                    String valueOf3 = String.valueOf(g2);
                    g2 = valueOf3.length() != 0 ? str.concat(valueOf3) : new String(str);
                }
                while (g2.startsWith("/../")) {
                    g2 = g2.substring(3);
                }
                if (!g2.equals("/..")) {
                    if (!"".equals(g2)) {
                        str = g2;
                    }
                }
                return new afig(str, booleanQueryParameter);
            }
            str = ".";
            return new afig(str, booleanQueryParameter);
        }
        return null;
    }
}
