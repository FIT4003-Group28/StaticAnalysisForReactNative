package defpackage;
/* compiled from: PG */
/* renamed from: bttz  reason: default package */
/* loaded from: classes4.dex */
final class bttz implements Runnable {
    final /* synthetic */ btua a;

    public bttz(btua btuaVar) {
        this.a = btuaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e();
        this.a.d.set(false);
    }
}
