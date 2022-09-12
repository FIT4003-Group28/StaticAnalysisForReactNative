package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cac  reason: default package */
/* loaded from: classes.dex */
public final class cac implements btw {
    public URL b;
    private final cad c;
    private final URL d;
    private final String e;
    private String f;
    private volatile byte[] g;
    private int h;

    public cac(String str) {
        this(str, cad.a);
    }

    @Override // defpackage.btw
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = d().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f)) {
            String str = this.e;
            if (TextUtils.isEmpty(str)) {
                URL url = this.d;
                cjn.b(url);
                str = url.toString();
            }
            this.f = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f;
    }

    public final Map<String, String> c() {
        return this.c.a();
    }

    public final String d() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        URL url = this.d;
        cjn.b(url);
        return url.toString();
    }

    @Override // defpackage.btw
    public final boolean equals(Object obj) {
        if (obj instanceof cac) {
            cac cacVar = (cac) obj;
            if (d().equals(cacVar.d()) && this.c.equals(cacVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.btw
    public final int hashCode() {
        int i = this.h;
        if (i == 0) {
            int hashCode = d().hashCode();
            this.h = hashCode;
            int hashCode2 = (hashCode * 31) + this.c.hashCode();
            this.h = hashCode2;
            return hashCode2;
        }
        return i;
    }

    public final String toString() {
        return d();
    }

    public cac(String str, cad cadVar) {
        this.d = null;
        cjn.c(str);
        this.e = str;
        cjn.b(cadVar);
        this.c = cadVar;
    }

    public cac(URL url) {
        cad cadVar = cad.a;
        cjn.b(url);
        this.d = url;
        this.e = null;
        cjn.b(cadVar);
        this.c = cadVar;
    }
}
