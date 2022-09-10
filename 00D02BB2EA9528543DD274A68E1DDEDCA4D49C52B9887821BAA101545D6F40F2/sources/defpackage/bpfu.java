package defpackage;
/* compiled from: PG */
/* renamed from: bpfu  reason: default package */
/* loaded from: classes3.dex */
final class bpfu implements bpsr {
    final /* synthetic */ bpfw a;

    public bpfu(bpfw bpfwVar) {
        this.a = bpfwVar;
    }

    @Override // defpackage.bpsr
    public final void a() {
        bpfw bpfwVar = this.a;
        if (bpfwVar.aD) {
            gga ggaVar = bpfwVar.aE;
            dbsk.s(ggaVar);
            jmw.d(ggaVar, new Runnable(this) { // from class: bpft
                private final bpfu a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.al.h();
                }
            });
        }
    }

    @Override // defpackage.bpsr
    public final void b() {
        gga ggaVar = this.a.aE;
        dbsk.s(ggaVar);
        ggaVar.s();
    }
}
