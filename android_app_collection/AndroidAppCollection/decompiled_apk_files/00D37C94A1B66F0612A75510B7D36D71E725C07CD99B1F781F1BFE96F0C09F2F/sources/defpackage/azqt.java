package defpackage;
/* compiled from: PG */
/* renamed from: azqt  reason: default package */
/* loaded from: classes2.dex */
public class azqt implements azra {
    private final azrb key;

    public azqt(azrb azrbVar) {
        azrbVar.getClass();
        this.key = azrbVar;
    }

    @Override // defpackage.azrd
    public Object fold(Object obj, azsg azsgVar) {
        azsgVar.getClass();
        return aydc.b(this, obj, azsgVar);
    }

    @Override // defpackage.azra, defpackage.azrd
    public azra get(azrb azrbVar) {
        azrbVar.getClass();
        return aydc.c(this, azrbVar);
    }

    @Override // defpackage.azra
    public azrb getKey() {
        return this.key;
    }

    @Override // defpackage.azrd
    public azrd minusKey(azrb azrbVar) {
        azrbVar.getClass();
        return aydc.d(this, azrbVar);
    }

    @Override // defpackage.azrd
    public azrd plus(azrd azrdVar) {
        azrdVar.getClass();
        return aydc.e(this, azrdVar);
    }
}
