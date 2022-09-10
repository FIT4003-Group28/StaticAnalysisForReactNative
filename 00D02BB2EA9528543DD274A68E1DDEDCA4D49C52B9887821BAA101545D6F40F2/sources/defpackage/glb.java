package defpackage;
/* compiled from: PG */
/* renamed from: glb  reason: default package */
/* loaded from: classes.dex */
final class glb implements jbw {
    final /* synthetic */ glc a;

    public glb(glc glcVar) {
        this.a = glcVar;
    }

    @Override // defpackage.jbw
    public final void a() {
        this.a.d();
    }

    @Override // defpackage.jbw
    public final void b() {
        glc glcVar = this.a;
        if (glcVar.k == 2) {
            glcVar.t(4);
        }
    }

    @Override // defpackage.jbw
    public final void c(int i, int i2) {
        if (this.a.s().n().booleanValue()) {
            if (i % (i2 / 100) != 0 || this.a.q()) {
                double d = i;
                double d2 = i2;
                Double.isNaN(d);
                Double.isNaN(d2);
                if (d / d2 < 0.6d) {
                    return;
                }
                this.a.b.a().b(true);
                this.a.s().k();
                return;
            }
            this.a.n();
        }
    }
}
