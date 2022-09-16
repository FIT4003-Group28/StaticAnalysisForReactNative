package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azwi  reason: default package */
/* loaded from: classes2.dex */
public final class azwi implements azra, azrb {
    public static final azwi a = new azwi();

    private azwi() {
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
        return this;
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
