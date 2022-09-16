package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahjj  reason: default package */
/* loaded from: classes.dex */
public abstract class ahjj extends ahmh implements ahju, ahmd, ahlx {
    public final ahoo a;
    public boolean b;
    public ahjt e;
    protected final ahon f;
    public ahli g;
    public boolean h;
    private final azqb i;
    private boolean o;
    private List p;
    private List q;
    private boolean n = true;
    public float d = 1.0f;
    public float c = 1.0f;
    private final float[] j = new float[16];
    private final float[] k = new float[16];
    private final String m = getClass().getSimpleName();

    public ahjj(ahon ahonVar, ahoo ahooVar, azqb azqbVar) {
        this.f = ahonVar;
        this.a = ahooVar;
        this.i = azqbVar;
    }

    public final void a(ahji ahjiVar) {
        if (this.p == null) {
            this.p = new ArrayList();
        }
        this.p.add(ahjiVar);
    }

    public final void d(ahji ahjiVar) {
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(ahjiVar);
    }

    @Override // defpackage.ahmf
    public void i() {
        String valueOf = String.valueOf(this.m);
        if (valueOf.length() != 0) {
            "Shutting down renderer on ".concat(valueOf);
        }
        this.f.b();
    }

    @Override // defpackage.ahmf
    public void j(ahjy ahjyVar) {
        ahjt ahjtVar;
        if (!this.b || (ahjtVar = this.e) == null) {
            return;
        }
        ahjtVar.a();
    }

    @Override // defpackage.ahju
    public final void k(boolean z) {
        this.n = z;
        this.c = z ? 1.0f : this.d;
    }

    @Override // defpackage.ahlx
    public final void l(float f) {
        this.c = f;
    }

    @Override // defpackage.ahmf
    public void m(ahjy ahjyVar) {
        if (v() || !this.n) {
            return;
        }
        List<ahji> list = this.p;
        if (list != null) {
            for (ahji ahjiVar : list) {
                boolean z = true;
                if (!this.b && !this.h) {
                    z = false;
                }
                ahjiVar.a(z, ahjyVar.b);
            }
        }
        List<ahji> list2 = this.q;
        if (list2 == null) {
            return;
        }
        for (ahji ahjiVar2 : list2) {
            ahjiVar2.a(this.h, ahjyVar.b);
        }
    }

    @Override // defpackage.ahmf
    public final void n(float f, float f2, float f3) {
        this.a.f(f, f2, f3);
    }

    @Override // defpackage.ahmf
    public boolean o(ahjy ahjyVar) {
        ahli ahliVar;
        return this.n && !v() && (ahliVar = this.g) != null && ahliVar.a(ahjyVar).b();
    }

    protected boolean p() {
        throw null;
    }

    public abstract void q();

    @Override // defpackage.ahmf
    public void qQ(ahoh ahohVar) {
        if (this.o) {
            Matrix.setIdentityM(this.k, 0);
            ahohVar = new ahoh(this.k, ahohVar.b, ahohVar.d, ahohVar.e, ahohVar.f);
        }
        ahrk ahrkVar = (ahrk) this.i.get();
        ahrkVar.j();
        ahrkVar.d();
        boolean p = p();
        if (p) {
            GLES20.glEnable(3042);
        }
        Matrix.multiplyMM(this.j, 0, ahohVar.c, 0, this.a.a, 0);
        ahrkVar.l(this.j);
        GLES20.glUniform1f(ahrkVar.a, this.c);
        q();
        ahrkVar.c(this.f);
        ahrkVar.k();
        if (p) {
            GLES20.glDisable(3042);
        }
        Boolean bool = ahom.a;
    }

    @Override // defpackage.ahmf
    public final void qR(boolean z, ahjy ahjyVar) {
        this.b = z;
    }

    public final void r() {
        this.o = true;
    }

    @Override // defpackage.ahmd
    public final void rT(float f, float f2, float f3) {
        ahoo ahooVar = this.a;
        Matrix.setIdentityM(ahooVar.d, 0);
        Matrix.scaleM(ahooVar.d, 0, f, f2, f3);
        ahooVar.g();
    }
}
