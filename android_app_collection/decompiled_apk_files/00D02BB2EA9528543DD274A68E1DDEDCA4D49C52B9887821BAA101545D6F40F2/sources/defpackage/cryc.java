package defpackage;
/* compiled from: PG */
/* renamed from: cryc  reason: default package */
/* loaded from: classes5.dex */
public final class cryc<T> implements cap<crxy, T> {
    public static final /* synthetic */ int a = 0;
    private final can<crxy, cac> b;
    private final cap<cac, T> c;

    static {
        dcrc.b("FifeModelLoader");
        btz.c("com.google.android.libraries.glide.fife.FifeModelLoader.useBatchSizeAsAlternate", false, crxz.a);
    }

    public cryc(cap<cac, T> capVar) {
        dehx.a();
        this.c = capVar;
        this.b = new can<>(2000L);
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(crxy crxyVar) {
        return true;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao b(crxy crxyVar, int i, int i2, bua buaVar) {
        crxy crxyVar2 = crxyVar;
        cac a2 = this.b.a(crxyVar2, i, i2);
        if (a2 == null) {
            cac cacVar = new cac(cxot.b(crxyVar2.a, crxyVar2.b.a, cryd.d(i), cryd.d(i2)), cad.a);
            this.b.b(crxyVar2, i, i2, cacVar);
            a2 = cacVar;
        }
        return this.c.b(a2, i, i2, buaVar);
    }
}
