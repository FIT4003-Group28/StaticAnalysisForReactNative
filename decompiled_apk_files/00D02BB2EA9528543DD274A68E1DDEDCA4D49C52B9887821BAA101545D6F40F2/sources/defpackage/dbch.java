package defpackage;

import android.view.View;
import com.google.ar.core.Camera;
import com.google.ar.core.Pose;
import com.google.ar.sceneform.ArSceneView;
/* compiled from: PG */
/* renamed from: dbch  reason: default package */
/* loaded from: classes5.dex */
public final class dbch extends dbcm implements dbdx {
    public final dbdz a;
    public float b;
    public float c;
    public final boolean d;
    private final dbdz x;

    public dbch(dbcs dbcsVar) {
        this.x = new dbdz();
        this.a = new dbdz();
        this.b = 0.01f;
        this.c = 30.0f;
        super.f(dbcsVar);
        dbcw dbcwVar = dbcsVar.b;
        boolean z = dbcwVar instanceof ArSceneView;
        this.d = z;
        if (!z) {
            dbcwVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: dbcg
                private final dbch a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    this.a.e();
                }
            });
        }
    }

    private final int I() {
        dbcs dbcsVar = this.e;
        if (dbcsVar != null) {
            return dbcsVar.b.getWidth();
        }
        return 1920;
    }

    private final int J() {
        dbcs dbcsVar = this.e;
        if (dbcsVar != null) {
            return dbcsVar.b.getHeight();
        }
        return 1080;
    }

    private final void K(float f, float f2, float f3, dbeb dbebVar) {
        dbdz dbdzVar = new dbdz();
        dbdz.h(this.a, this.x, dbdzVar);
        dbdz.j(dbdzVar, dbdzVar);
        int I = I();
        float J = J();
        float f4 = f / I;
        float f5 = (f4 + f4) - 1.0f;
        float f6 = (J - f2) / J;
        float f7 = (f6 + f6) - 1.0f;
        float f8 = (f3 + f3) - 1.0f;
        float[] fArr = dbdzVar.b;
        dbebVar.a = (fArr[0] * f5) + (fArr[4] * f7) + (fArr[8] * f8) + fArr[12];
        dbebVar.b = (fArr[1] * f5) + (fArr[5] * f7) + (fArr[9] * f8) + fArr[13];
        dbebVar.c = (fArr[2] * f5) + (fArr[6] * f7) + (fArr[10] * f8) + fArr[14];
        float f9 = (f5 * fArr[3]) + (f7 * fArr[7]) + (f8 * fArr[11]) + fArr[15];
        if (dbdy.a(f9, 0.0f)) {
            dbebVar.b(0.0f, 0.0f, 0.0f);
        } else {
            dbebVar.a(dbebVar.f(1.0f / f9));
        }
    }

    public final void b(Camera camera) {
        camera.getProjectionMatrix(this.a.b, 0, this.b, this.c);
        camera.getViewMatrix(this.x.b, 0);
        Pose displayOrientedPose = camera.getDisplayOrientedPose();
        dbeb dbebVar = new dbeb(displayOrientedPose.tx(), displayOrientedPose.ty(), displayOrientedPose.tz());
        dbea dbeaVar = new dbea(displayOrientedPose.qx(), displayOrientedPose.qy(), displayOrientedPose.qz(), displayOrientedPose.qw());
        dbcm dbcmVar = this.f;
        if (dbcmVar == null) {
            this.h.a(dbebVar);
        } else {
            this.h.a(dbcmVar.r(dbebVar));
        }
        super.k(63, this);
        this.k.a(dbebVar);
        this.l &= -9;
        super.q(dbeaVar);
    }

    public final dbdu c(float f, float f2) {
        dbeb dbebVar = new dbeb();
        dbeb dbebVar2 = new dbeb();
        K(f, f2, 0.0f, dbebVar);
        K(f, f2, 1.0f, dbebVar2);
        return new dbdu(dbebVar, dbeb.h(dbebVar2, dbebVar));
    }

    public final dbeb d(dbeb dbebVar) {
        dbdz dbdzVar = new dbdz();
        dbdz.h(this.a, this.x, dbdzVar);
        int I = I();
        int J = J();
        float f = dbebVar.a;
        float f2 = dbebVar.b;
        float f3 = dbebVar.c;
        dbeb dbebVar2 = new dbeb();
        float[] fArr = dbdzVar.b;
        float f4 = fArr[0];
        float f5 = fArr[4];
        float f6 = fArr[8];
        float f7 = fArr[12];
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = fArr[9];
        float f11 = fArr[13];
        float f12 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        dbebVar2.a = ((((((f4 * f) + (f5 * f2)) + (f6 * f3)) + f7) / f12) + 1.0f) * 0.5f * I;
        float f13 = J;
        dbebVar2.b = f13 - ((((((((f * f8) + (f2 * f9)) + (f3 * f10)) + f11) / f12) + 1.0f) * 0.5f) * f13);
        return dbebVar2;
    }

    public final void e() {
        if (this.d) {
            return;
        }
        int I = I();
        int J = J();
        if (I == 0 || J == 0) {
            return;
        }
        float f = I / J;
        float f2 = this.b;
        float f3 = this.c;
        if (f > 0.0f) {
            float tan = ((float) Math.tan(Math.toRadians(90.0d) * 0.5d)) * f2;
            float f4 = -tan;
            float f5 = f * tan;
            float f6 = -f5;
            float[] fArr = this.a.b;
            if (f6 == f5 || f4 == tan || f2 <= 0.0f || f3 <= f2) {
                throw new IllegalArgumentException("Invalid parameters to setPerspective, valid values:  width != height, bottom != top, near > 0.0f, far > near");
            }
            float f7 = 1.0f / (f5 - f6);
            float f8 = 1.0f / (tan - f4);
            float f9 = 1.0f / (f3 - f2);
            float f10 = f2 + f2;
            fArr[0] = f10 * f7;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f10 * f8;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
            fArr[8] = (f5 + f6) * f7;
            fArr[9] = (tan + f4) * f8;
            fArr[10] = (-(f3 + f2)) * f9;
            fArr[11] = -1.0f;
            fArr[12] = 0.0f;
            fArr[13] = 0.0f;
            fArr[14] = (-2.0f) * f3 * f2 * f9;
            fArr[15] = 0.0f;
            this.b = f2;
            this.c = f3;
            return;
        }
        throw new IllegalArgumentException("Parameter \"aspect\" must be greater than zero.");
    }

    public dbch() {
        this.x = new dbdz();
        this.a = new dbdz();
        this.b = 0.01f;
        this.c = 30.0f;
        this.d = true;
    }
}
