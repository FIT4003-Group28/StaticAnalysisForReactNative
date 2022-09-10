package defpackage;
/* compiled from: PG */
/* renamed from: ccts  reason: default package */
/* loaded from: classes4.dex */
public final class ccts<ReqT, ResT> implements btzi<ReqT, ResT> {
    private final bvqg<ResT> a;
    private final bvqg<btzy> b;

    public ccts(bvqg<ResT> bvqgVar, bvqg<btzy> bvqgVar2) {
        this.a = bvqgVar;
        this.b = bvqgVar2;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<ReqT> btzrVar, btzy btzyVar) {
        this.b.NU(btzyVar);
    }

    @Override // defpackage.btzi
    public final void QZ(btzr<ReqT> btzrVar, ResT rest) {
        this.a.NU(rest);
    }
}
