package defpackage;
/* compiled from: PG */
/* renamed from: ameq  reason: default package */
/* loaded from: classes.dex */
final class ameq implements btni {
    final /* synthetic */ amfd a;

    public ameq(amfd amfdVar) {
        this.a = amfdVar;
    }

    @Override // defpackage.btni
    public final int b(float f) {
        final amfd amfdVar = this.a;
        synchronized (amfdVar.h) {
            amfdVar.h.a().e();
        }
        synchronized (amfdVar.g) {
            amfdVar.g.a().e();
        }
        if (amfdVar.n != null) {
            amfdVar.n.c();
        }
        amfdVar.e.execute(new Runnable(amfdVar) { // from class: amem
            private final amfd a;

            {
                this.a = amfdVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                brc.a(this.a.a).c();
            }
        });
        return 0;
    }

    @Override // defpackage.btni
    public final String c() {
        return null;
    }
}
