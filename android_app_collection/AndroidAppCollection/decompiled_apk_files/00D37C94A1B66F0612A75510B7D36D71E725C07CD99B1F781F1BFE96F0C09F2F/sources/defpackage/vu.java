package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vu  reason: default package */
/* loaded from: classes4.dex */
public final class vu implements Runnable {
    final /* synthetic */ vv a;

    public vu(vv vvVar) {
        this.a = vvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vv vvVar = this.a;
        vvVar.b = null;
        vvVar.drawableStateChanged();
    }
}
