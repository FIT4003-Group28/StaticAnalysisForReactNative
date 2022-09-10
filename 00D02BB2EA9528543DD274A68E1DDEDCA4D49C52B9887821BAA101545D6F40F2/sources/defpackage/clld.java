package defpackage;

import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: clld  reason: default package */
/* loaded from: classes5.dex */
public final class clld implements cllf {
    private static final dcep<String> b = dcep.D("http", "https", "file");
    public final dehp a;

    public clld(dehp dehpVar) {
        this.a = dehpVar;
    }

    public static void c() {
        if (!Thread.interrupted()) {
            return;
        }
        throw new clle("Request canceled");
    }

    public static void d(@dzsi URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    @Override // defpackage.cllf
    public final cllg a(String str) {
        return new clla(this, str);
    }

    @Override // defpackage.cllf
    public final Set<String> b() {
        return b;
    }
}
