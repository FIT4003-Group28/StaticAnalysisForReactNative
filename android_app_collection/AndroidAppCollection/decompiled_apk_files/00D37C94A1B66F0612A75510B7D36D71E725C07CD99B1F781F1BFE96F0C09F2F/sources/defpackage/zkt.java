package defpackage;
/* compiled from: PG */
/* renamed from: zkt  reason: default package */
/* loaded from: classes4.dex */
final class zkt implements Runnable {
    final /* synthetic */ zku a;

    public zkt(zku zkuVar) {
        this.a = zkuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.invalidateSelf();
    }
}
