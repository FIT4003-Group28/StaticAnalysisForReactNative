package defpackage;
/* compiled from: PG */
/* renamed from: bqkr  reason: default package */
/* loaded from: classes4.dex */
public final class bqkr {
    public final dcdn<String, bqkl> a;

    public bqkr(dcbg<bqkl> dcbgVar) {
        this.a = dcbgVar.D(bqkm.a);
    }

    public final boolean a(bqkl bqklVar) {
        return this.a.containsKey(bqklVar.a());
    }

    public final dcdc<bbtm> b() {
        return c().s(bqkq.a).z();
    }

    public final dcbg<bqkl> c() {
        return dcbg.b(this.a.values());
    }
}
