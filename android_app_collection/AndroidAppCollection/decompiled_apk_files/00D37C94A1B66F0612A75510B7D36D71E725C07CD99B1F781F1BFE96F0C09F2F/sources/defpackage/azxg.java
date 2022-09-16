package defpackage;
/* compiled from: PG */
/* renamed from: azxg  reason: default package */
/* loaded from: classes2.dex */
public final class azxg implements azra {
    public static final azus b = new azus();
    public final Throwable a;
    private final azrb c = b;

    public azxg(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.azrd
    public final Object fold(Object obj, azsg azsgVar) {
        return aydc.b(this, obj, azsgVar);
    }

    @Override // defpackage.azra, defpackage.azrd
    public final azra get(azrb azrbVar) {
        return aydc.c(this, azrbVar);
    }

    @Override // defpackage.azra
    public final azrb getKey() {
        return this.c;
    }

    @Override // defpackage.azrd
    public final azrd minusKey(azrb azrbVar) {
        return aydc.d(this, azrbVar);
    }

    @Override // defpackage.azrd
    public final azrd plus(azrd azrdVar) {
        return aydc.e(this, azrdVar);
    }
}
