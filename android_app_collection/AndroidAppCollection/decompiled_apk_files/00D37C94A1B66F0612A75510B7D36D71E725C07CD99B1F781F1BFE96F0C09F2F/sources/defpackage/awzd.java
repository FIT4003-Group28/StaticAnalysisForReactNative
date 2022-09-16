package defpackage;
/* compiled from: PG */
/* renamed from: awzd  reason: default package */
/* loaded from: classes2.dex */
final class awzd implements Runnable {
    private final awyp a;
    private final axij b;

    public awzd(axij axijVar, awyp awypVar, byte[] bArr, byte[] bArr2) {
        this.b = axijVar;
        this.a = awypVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
