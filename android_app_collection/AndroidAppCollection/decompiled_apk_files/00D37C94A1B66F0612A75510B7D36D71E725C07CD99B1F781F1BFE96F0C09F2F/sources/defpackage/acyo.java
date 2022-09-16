package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acyo  reason: default package */
/* loaded from: classes.dex */
public final class acyo implements acys {
    public static final String a = zep.a("MDX.browserchannel");
    public final yqh b;
    public final acyc c;
    public final Uri d;
    public final Map e;
    public final boolean f;
    public volatile String g;
    public int h;
    public String i;
    public int j = 0;
    public int k;
    public boolean l;
    private final yqh m;
    private final azqb n;
    private final adnb o;
    private final Map p;
    private final boolean q;

    public acyo(String str, azqb azqbVar, adnb adnbVar, Map map, Map map2, yqh yqhVar, yqh yqhVar2, boolean z, boolean z2) {
        Uri parse = Uri.parse(str);
        this.d = parse;
        Uri.parse(str.replace("bind", "test"));
        aqxo.p(zgt.l(parse));
        azqbVar.getClass();
        this.n = azqbVar;
        this.o = adnbVar;
        this.e = map;
        this.p = map2;
        this.b = yqhVar;
        this.m = yqhVar2;
        this.f = z;
        this.q = z2;
        this.k = 1;
        this.c = new acyc();
        this.l = false;
    }

    @Override // defpackage.acys
    public final void a() {
        this.l = true;
        ((advt) this.n.get()).c();
    }

    @Override // defpackage.acys
    public final void b() {
        if (this.q) {
            this.o.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(Map map, adwb adwbVar) {
        Uri.Builder appendQueryParameter = this.d.buildUpon().appendQueryParameter("RID", String.valueOf(this.k)).appendQueryParameter("VER", "8").appendQueryParameter("CVER", "1");
        if (this.g != null) {
            appendQueryParameter.appendQueryParameter("SID", this.g);
        }
        String str = this.i;
        if (str != null) {
            appendQueryParameter.appendQueryParameter("gsessionid", str);
        }
        if (this.f && !this.l) {
            appendQueryParameter.appendQueryParameter("auth_failure_option", "send_error");
        }
        yqu c = yqv.c(appendQueryParameter.build().toString());
        d(c);
        c.b = yqt.d(map, "UTF-8");
        yqv a2 = c.a();
        String.format("Sending HTTP POST request: %s", a2);
        adyf.d(this.m, a2, new acyj(this, adwbVar));
    }

    public final void d(yqu yquVar) {
        String b = ((advt) this.n.get()).b();
        if (b != null) {
            yquVar.c("Authorization", b.length() != 0 ? "Bearer ".concat(b) : new String("Bearer "));
        }
        String a2 = ((advt) this.n.get()).a();
        if (a2 != null) {
            yquVar.c("X-Goog-PageId", a2);
        }
        if (this.o.a() != null) {
            yquVar.c("X-YouTube-LoungeId-Token", this.o.a().c);
        }
        for (Map.Entry entry : this.p.entrySet()) {
            yquVar.c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final String toString() {
        String str = this.g;
        String str2 = this.i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length());
        sb.append("Session id: ");
        sb.append(str);
        sb.append(" GFE Session cookie: ");
        sb.append(str2);
        return sb.toString();
    }
}
