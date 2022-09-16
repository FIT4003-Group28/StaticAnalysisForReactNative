package defpackage;

import android.graphics.Bitmap;
import android.opengl.Matrix;
/* compiled from: PG */
/* renamed from: ahjx  reason: default package */
/* loaded from: classes.dex */
public final class ahjx extends ahni {
    private final float[] m;

    public ahjx(Bitmap bitmap, ahon ahonVar, ahoo ahooVar, azqb azqbVar) {
        super(bitmap, ahonVar, ahooVar, azqbVar);
        this.m = new float[16];
    }

    @Override // defpackage.ahjj, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        Matrix.setIdentityM(this.m, 0);
        super.m(new ahjy(this.m, ahjyVar.b));
    }

    @Override // defpackage.ahjj, defpackage.ahmf
    public final boolean o(ahjy ahjyVar) {
        return false;
    }

    @Override // defpackage.ahjj, defpackage.ahmf
    public final void qQ(ahoh ahohVar) {
        Matrix.setIdentityM(this.m, 0);
        super.qQ(new ahoh(this.m, ahohVar.b, ahohVar.d, ahohVar.e, ahohVar.f));
    }
}
