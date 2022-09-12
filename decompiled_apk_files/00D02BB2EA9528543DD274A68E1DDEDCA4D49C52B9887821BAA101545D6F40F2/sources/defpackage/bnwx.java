package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bnwx  reason: default package */
/* loaded from: classes.dex */
public final class bnwx extends afhm {
    public static final dbsl<afga> c = bnww.a;
    public final bnwn a;
    public final afhe b;
    private final gga d;

    public bnwx(Intent intent, @dzsi String str, gga ggaVar, bnwn bnwnVar, afhe afheVar) {
        super(intent, str, afid.REPLAY, ggaVar);
        this.a = bnwnVar;
        this.b = afheVar;
        this.d = ggaVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        final afir a = afis.a(this.f.getData());
        if (a == null) {
            return;
        }
        Runnable runnable = new Runnable(this, a) { // from class: bnwv
            private final bnwx a;
            private final afir b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bnwx bnwxVar = this.a;
                afir afirVar = this.b;
                bnwxVar.b.a(dbsj.e(bnwxVar.f.getDataString()), bnwxVar.g, null);
                bnwxVar.a.c(((afig) afirVar).a);
            }
        };
        if (((afig) a).b) {
            runnable.run();
        } else if (afhg.d(this.f)) {
            this.d.A();
            runnable.run();
        } else {
            this.d.B(runnable);
        }
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return null;
    }
}
