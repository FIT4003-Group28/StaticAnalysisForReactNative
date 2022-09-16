package defpackage;
/* compiled from: PG */
/* renamed from: kqa  reason: default package */
/* loaded from: classes7.dex */
final class kqa implements afni {
    final /* synthetic */ kqf a;

    public kqa(kqf kqfVar) {
        this.a = kqfVar;
    }

    @Override // defpackage.afni
    public final Runnable a(vun vunVar, amsy amsyVar, qbs qbsVar) {
        return b(vunVar, qbsVar);
    }

    @Override // defpackage.afni
    public final Runnable b(vun vunVar, qbs qbsVar) {
        amvh amvhVar = (amvh) dcft.t(vunVar.l, null);
        if (amvhVar == null) {
            throw new afkt("null waypoint");
        }
        return new kqe(this.a, ldm.f(amvhVar, this.a.c.getResources(), null), false);
    }
}
