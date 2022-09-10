package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: buhv  reason: default package */
/* loaded from: classes4.dex */
public final class buhv implements buae<String> {
    private final btrm c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean b = false;
    public final deig<buab<String>> a = deig.d();

    public buhv(btrm btrmVar) {
        this.c = btrmVar;
    }

    @Override // defpackage.buae
    public final dehn<buab<String>> a() {
        dehn<buab<String>> o;
        buab<String> b = b();
        if (Boolean.parseBoolean((String) ((buaa) b).a)) {
            return deha.a(b);
        }
        synchronized (this) {
            o = deha.o(this.a);
        }
        return o;
    }

    public final buab<String> b() {
        if (!this.d.getAndSet(true)) {
            btrm btrmVar = this.c;
            dceq a = dcet.a();
            a.b(btwe.class, new buhw(btwe.class, this));
            btrmVar.g(this, a.a());
        }
        return buab.c("NonDefaultClientParametersReady", Boolean.toString(this.b));
    }
}
