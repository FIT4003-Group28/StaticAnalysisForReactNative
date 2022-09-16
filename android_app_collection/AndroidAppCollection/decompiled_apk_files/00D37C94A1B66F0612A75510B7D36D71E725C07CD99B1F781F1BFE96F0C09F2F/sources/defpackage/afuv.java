package defpackage;
/* compiled from: PG */
/* renamed from: afuv  reason: default package */
/* loaded from: classes.dex */
public final class afuv implements cez {
    private final /* synthetic */ int c;
    public static final /* synthetic */ afuv b = new afuv(3);
    public static final /* synthetic */ afuv a = new afuv(1);

    public afuv() {
    }

    public /* synthetic */ afuv(int i) {
        this.c = i;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        int i = this.c;
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            return;
        }
        zep.d("Network error while sending request ", cffVar);
    }
}
