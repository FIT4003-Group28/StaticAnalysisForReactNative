package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: ahmg  reason: default package */
/* loaded from: classes.dex */
public abstract class ahmg extends ahnp {
    private static final float[] c = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    protected final ahor a;
    protected ahot b;
    private final ahoq d;
    private float e;

    public ahmg(ahor ahorVar, ahot ahotVar) {
        ahorVar.getClass();
        this.a = ahorVar;
        this.b = ahotVar;
        this.d = new ahoq(c, 3);
    }

    @Override // defpackage.ahnp
    public final void a(ahot ahotVar) {
        this.b = ahotVar;
    }

    @Override // defpackage.ahnp
    public final void c() {
    }

    protected abstract ahru g();

    @Override // defpackage.ahmf
    public final void i() {
        this.d.b();
    }

    @Override // defpackage.ahnp, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        if (this.b.a() && !this.b.b()) {
            this.e = (float) Math.random();
        }
        this.a.h();
    }

    @Override // defpackage.ahmf
    public final void qQ(ahoh ahohVar) {
        ahru g = g();
        if (g.c == 0) {
            zep.b("Error drawing! Program not created.");
            return;
        }
        this.a.f();
        g.j();
        g.d(this.a);
        float f = this.e;
        ahot ahotVar = this.b;
        g.b.b(f, ahotVar.a, ahotVar.b);
        g.c();
        this.d.a(g.a);
        g.h();
        GLES20.glDrawArrays(5, 0, 4);
        Boolean bool = ahom.a;
        GLES20.glDisableVertexAttribArray(g.a);
    }
}
