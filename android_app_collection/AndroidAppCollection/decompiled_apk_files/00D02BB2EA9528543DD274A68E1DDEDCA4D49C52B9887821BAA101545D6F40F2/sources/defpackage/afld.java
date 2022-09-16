package defpackage;
/* compiled from: PG */
/* renamed from: afld  reason: default package */
/* loaded from: classes2.dex */
public final class afld implements afni {
    public final dxio<qbt> a;

    public afld(dxio<qbt> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.afni
    public final Runnable a(vun vunVar, amsy amsyVar, qbs qbsVar) {
        return new aflb(this, this.a.a().e().l(vunVar, amsyVar), qbsVar, vunVar);
    }

    @Override // defpackage.afni
    public final Runnable b(vun vunVar, qbs qbsVar) {
        return new aflc(this, qbsVar, vunVar);
    }
}
