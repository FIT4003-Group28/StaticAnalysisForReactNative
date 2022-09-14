package defpackage;
/* compiled from: PG */
/* renamed from: rgp  reason: default package */
/* loaded from: classes7.dex */
final class rgp {
    final rhj a;
    int b;

    private rgp(int i, rhj rhjVar) {
        this.b = i;
        this.a = rhjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static rgp a(rhj rhjVar) {
        return new rgp(2, rhjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static rgp b(rhj rhjVar) {
        return new rgp(1, rhjVar);
    }

    public final void c() {
        boolean z = true;
        if (this.b == 1) {
            z = false;
        }
        dbsk.l(z);
        this.b = 3;
    }
}
