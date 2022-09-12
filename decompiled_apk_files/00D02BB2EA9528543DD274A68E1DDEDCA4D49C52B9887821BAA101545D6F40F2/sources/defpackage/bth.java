package defpackage;
/* compiled from: PG */
/* renamed from: bth  reason: default package */
/* loaded from: classes.dex */
public final class bth<T> implements cap<cac, T> {
    private final bte a;
    private final btg b;

    public bth(btg btgVar, bti btiVar) {
        this.b = btgVar;
        this.a = new bte(btiVar);
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(cac cacVar) {
        return true;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao b(cac cacVar, int i, int i2, bua buaVar) {
        cac cacVar2 = cacVar;
        return new cao(cacVar2, new btf(this.a, cacVar2));
    }
}
