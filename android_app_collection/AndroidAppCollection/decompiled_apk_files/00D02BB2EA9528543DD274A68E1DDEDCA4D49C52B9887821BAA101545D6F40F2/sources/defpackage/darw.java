package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: darw  reason: default package */
/* loaded from: classes5.dex */
public final class darw extends daul {
    private static final davd e = new dave("=&-_.!~*'()@:$,;/?:", false);
    public List<String> a;
    public String b;
    private String f;
    private String g;
    private String h;
    private int i;

    public darw() {
        this.i = -1;
    }

    public static List<String> f(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i = 0;
        while (z) {
            int indexOf = str.indexOf(47, i);
            boolean z2 = indexOf != -1;
            arrayList.add(davc.b(z2 ? str.substring(i, indexOf) : str.substring(i)));
            i = indexOf + 1;
            z = z2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Set<Map.Entry<String, Object>> set, StringBuilder sb) {
        boolean z = true;
        for (Map.Entry<String, Object> entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String d = davc.d(entry.getKey());
                if (value instanceof Collection) {
                    for (Object obj : (Collection) value) {
                        j(z, sb, d, obj);
                        z = false;
                    }
                } else {
                    j(z, sb, d, value);
                    z = false;
                }
            }
        }
    }

    private static URL i(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private static void j(boolean z, StringBuilder sb, String str, Object obj) {
        if (z) {
            sb.append('?');
        } else {
            sb.append('&');
        }
        sb.append(str);
        String d = davc.d(obj.toString());
        if (d.length() != 0) {
            sb.append('=');
            sb.append(d);
        }
    }

    @Override // defpackage.daul
    /* renamed from: b */
    public final darw d() {
        darw darwVar = (darw) super.clone();
        List<String> list = this.a;
        if (list != null) {
            darwVar.a = new ArrayList(list);
        }
        return darwVar;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f;
        dbsk.s(str);
        sb.append(str);
        sb.append("://");
        String str2 = this.h;
        if (str2 != null) {
            sb.append(davc.b.a(str2));
            sb.append('@');
        }
        String str3 = this.g;
        dbsk.s(str3);
        sb.append(str3);
        int i = this.i;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        String valueOf = String.valueOf(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        List<String> list = this.a;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str4 = this.a.get(i2);
                if (i2 != 0) {
                    sb2.append('/');
                }
                if (str4.length() != 0) {
                    sb2.append(davc.c(str4));
                }
            }
        }
        g(entrySet(), sb2);
        String str5 = this.b;
        if (str5 != null) {
            sb2.append('#');
            sb2.append(e.a(str5));
        }
        String valueOf2 = String.valueOf(sb2.toString());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final URL e(String str) {
        try {
            return new URL(i(c()), str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof darw)) {
            return c().equals(((darw) obj).c());
        }
        return false;
    }

    public final void h(String str, Object obj) {
        super.a(str, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return c().hashCode();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return c();
    }

    public darw(String str) {
        this(i(str));
    }

    public darw(URL url) {
        String protocol = url.getProtocol();
        String host = url.getHost();
        int port = url.getPort();
        String path = url.getPath();
        String ref = url.getRef();
        String query = url.getQuery();
        String userInfo = url.getUserInfo();
        this.i = -1;
        this.f = protocol.toLowerCase(Locale.US);
        this.g = host;
        this.i = port;
        this.a = f(path);
        String str = null;
        this.b = ref != null ? davc.b(ref) : null;
        if (query != null) {
            dasq.a(query, this);
        }
        this.h = userInfo != null ? davc.b(userInfo) : str;
    }
}
