package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arg  reason: default package */
/* loaded from: classes2.dex */
public final class arg implements Runnable {
    final /* synthetic */ arm a;

    public arg(arm armVar) {
        this.a = armVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d();
    }
}
