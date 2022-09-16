package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: zgp  reason: default package */
/* loaded from: classes4.dex */
public final class zgp {
    public String a;
    private final Uri b;
    private final HashMap c;
    private final List d;
    private int e;

    private zgp(Uri uri) {
        int i;
        int i2;
        uri.getClass();
        this.b = uri;
        this.c = new HashMap();
        this.d = new ArrayList();
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery != null) {
            int length = encodedQuery.length();
            for (int i3 = 0; i3 < length; i3 = i2 + 1) {
                int indexOf = encodedQuery.indexOf(61, i3);
                int indexOf2 = encodedQuery.indexOf(38, i3);
                if (indexOf2 >= 0 && indexOf2 < indexOf) {
                    indexOf = -1;
                }
                if (indexOf > 0 && indexOf2 > 0) {
                    i = indexOf + 1;
                    i2 = indexOf2;
                    indexOf2 = indexOf;
                } else if (indexOf < 0) {
                    indexOf2 = indexOf2 < 0 ? length : indexOf2;
                    i2 = indexOf2;
                    i = i2;
                } else {
                    indexOf2 = indexOf;
                    i = indexOf + 1;
                    i2 = length;
                }
                l(encodedQuery.substring(i3, indexOf2), indexOf > 0 ? encodedQuery.substring(i, i2) : null, null, true, false);
            }
        }
    }

    public static zgp b(Uri uri) {
        return new zgp(uri);
    }

    public static zgp c(zgp zgpVar) {
        return new zgp(zgpVar);
    }

    private final zgo l(String str, String str2, String str3, boolean z, boolean z2) {
        int i = this.e;
        this.e = i + 1;
        zgo zgoVar = new zgo(str, str2, str3, z, z2, i);
        zgo zgoVar2 = (zgo) this.c.put(zgoVar.c, zgoVar);
        this.d.add(zgoVar);
        return zgoVar2;
    }

    public final Uri a() {
        Uri.Builder buildUpon = this.b.buildUpon();
        StringBuilder sb = new StringBuilder(4096);
        String str = "";
        for (zgo zgoVar : this.d) {
            if (zgoVar != null) {
                sb.append(str);
                sb.append(zgoVar.a ? zgoVar.c : Uri.encode(zgoVar.c));
                if (zgoVar.b || zgoVar.e != null) {
                    sb.append('=');
                    sb.append(zgoVar.a ? zgoVar.e : Uri.encode(zgoVar.e, zgoVar.d));
                }
                str = "&";
            }
        }
        buildUpon.encodedQuery(sb.toString());
        String str2 = this.a;
        if (str2 != null) {
            buildUpon.authority(str2);
        }
        return buildUpon.build();
    }

    public final String d(String str) {
        zgo zgoVar = (zgo) this.c.get(str);
        if (zgoVar != null) {
            return zgoVar.e;
        }
        return null;
    }

    public final void e(String str) {
        if (!this.c.containsKey("welc")) {
            l("welc", str, null, true, true);
        }
    }

    public final void f(String str, String str2) {
        String d = d(str);
        if (d == null) {
            l(str, str2, ",:;", false, true);
        } else {
            g(str, String.format("%s%s%s", d, ",", str2));
        }
    }

    public final void g(String str, String str2) {
        zgo l = l(str, str2, null, false, true);
        if (l != null) {
            this.d.set(l.f, null);
        }
    }

    public final void h(String str, String str2) {
        if (!this.c.containsKey(str)) {
            l(str, str2, null, false, true);
        }
    }

    public final void i(String str, String str2, String str3) {
        if (!this.c.containsKey(str)) {
            l(str, str2, str3, false, true);
        }
    }

    public final void j(String str) {
        zgo zgoVar = (zgo) this.c.remove(str);
        if (zgoVar != null) {
            this.d.set(zgoVar.f, null);
        }
    }

    public final void k(String str, int i) {
        h(str, String.valueOf(i));
    }

    public final String toString() {
        return a().toString();
    }

    private zgp(zgp zgpVar) {
        this.b = zgpVar.b;
        this.a = zgpVar.a;
        this.e = zgpVar.e;
        this.c = new HashMap(zgpVar.c);
        this.d = new ArrayList(zgpVar.d);
    }
}
