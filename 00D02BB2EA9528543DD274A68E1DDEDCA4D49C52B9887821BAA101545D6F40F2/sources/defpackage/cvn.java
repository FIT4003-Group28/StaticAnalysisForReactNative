package defpackage;
/* compiled from: PG */
/* renamed from: cvn  reason: default package */
/* loaded from: classes5.dex */
public final class cvn {
    public static final dcqe a = dcqe.c("cvn");
    private final cvm b;
    private final btrm c;
    private boolean d = false;

    public cvn(btrm btrmVar, dxio<amfi> dxioVar, dxio<ckcw> dxioVar2, cvv cvvVar, dujz dujzVar) {
        this.c = btrmVar;
        this.b = new cvm(dxioVar, dxioVar2, cvvVar, dujzVar);
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            btrm btrmVar = this.c;
            cvm cvmVar = this.b;
            dceq a2 = dcet.a();
            a2.b(becx.class, new cvo(becx.class, cvmVar));
            btrmVar.g(cvmVar, a2.a());
        }
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            this.c.a(this.b);
        }
    }
}
