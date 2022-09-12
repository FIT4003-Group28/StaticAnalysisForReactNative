package defpackage;
/* compiled from: PG */
/* renamed from: bby  reason: default package */
/* loaded from: classes3.dex */
public final class bby extends bbz {
    private final int a;

    public bby(int i) {
        this.a = i;
    }

    @Override // defpackage.bbz
    public final void a(Throwable... thArr) {
        if (this.a > 3 || thArr.length <= 0) {
            return;
        }
        Throwable th = thArr[0];
    }

    @Override // defpackage.bbz
    public final void b(Throwable... thArr) {
        if (thArr.length > 0) {
            Throwable th = thArr[0];
        }
    }

    @Override // defpackage.bbz
    public final void c(Throwable... thArr) {
        if (thArr.length > 0) {
            Throwable th = thArr[0];
        }
    }
}
