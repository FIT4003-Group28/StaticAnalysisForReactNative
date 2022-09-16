package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dc  reason: default package */
/* loaded from: classes3.dex */
public final class dc implements Runnable {
    final /* synthetic */ dh a;

    public dc(dh dhVar) {
        this.a = dhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dh dhVar = this.a;
        dhVar.a.onDismiss(dhVar.d);
    }
}
