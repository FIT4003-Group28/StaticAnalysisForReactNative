package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cnf  reason: default package */
/* loaded from: classes2.dex */
public final class cnf implements chy {
    public URL b;
    private final cng c;
    private final URL d;
    private final String e;
    private String f;
    private volatile byte[] g;
    private int h;

    public cnf(String str) {
        cng cngVar = cng.a;
        this.d = null;
        hy.P(str);
        this.e = str;
        hy.N(cngVar);
        this.c = cngVar;
    }

    @Override // defpackage.chy
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        URL url = this.d;
        hy.N(url);
        return url.toString();
    }

    public final String c() {
        if (TextUtils.isEmpty(this.f)) {
            String str = this.e;
            if (TextUtils.isEmpty(str)) {
                URL url = this.d;
                hy.N(url);
                str = url.toString();
            }
            this.f = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f;
    }

    public final Map d() {
        cng cngVar = this.c;
        cnj cnjVar = (cnj) cngVar;
        if (cnjVar.c == null) {
            synchronized (cngVar) {
                if (((cnj) cngVar).c == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((cnj) cngVar).b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = ((cni) list.get(i)).a;
                            if (!TextUtils.isEmpty(str)) {
                                sb.append(str);
                                if (i != list.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(sb2)) {
                            hashMap.put((String) entry.getKey(), sb2);
                        }
                    }
                    ((cnj) cngVar).c = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return cnjVar.c;
    }

    @Override // defpackage.chy
    public final boolean equals(Object obj) {
        if (obj instanceof cnf) {
            cnf cnfVar = (cnf) obj;
            if (b().equals(cnfVar.b()) && this.c.equals(cnfVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.chy
    public final int hashCode() {
        int i = this.h;
        if (i == 0) {
            int hashCode = b().hashCode();
            this.h = hashCode;
            int hashCode2 = (hashCode * 31) + this.c.hashCode();
            this.h = hashCode2;
            return hashCode2;
        }
        return i;
    }

    public final String toString() {
        return b();
    }

    public cnf(URL url) {
        cng cngVar = cng.a;
        hy.N(url);
        this.d = url;
        this.e = null;
        hy.N(cngVar);
        this.c = cngVar;
    }
}
