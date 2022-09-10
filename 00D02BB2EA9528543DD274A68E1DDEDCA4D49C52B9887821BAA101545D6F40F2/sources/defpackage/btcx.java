package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: btcx  reason: default package */
/* loaded from: classes4.dex */
public final class btcx implements Runnable {
    private final btcw a;
    private final bvjj b;
    private final ckcw c;

    public btcx(btcw btcwVar, bvjj bvjjVar, ckcw ckcwVar) {
        this.a = btcwVar;
        this.b = bvjjVar;
        this.c = ckcwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String z = this.b.z(bvjk.R, null);
        if (dbsj.d(z)) {
            return;
        }
        dbsg<Locale> b = btbp.b(z);
        if (!this.a.b() || !b.a() || !this.a.a().contains(b.b().getLanguage())) {
            return;
        }
        this.b.ac(bvjk.Q, z);
        this.b.P(bvjk.R);
        ((ckco) this.c.a(ckfr.b)).a(btbz.a(b.b()) - 1);
    }
}
