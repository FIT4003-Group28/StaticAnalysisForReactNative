package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zg  reason: default package */
/* loaded from: classes7.dex */
public final class zg implements Runnable {
    final /* synthetic */ zh a;

    public zg(zh zhVar) {
        this.a = zhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zh zhVar = this.a;
        zhVar.b = null;
        zhVar.drawableStateChanged();
    }
}
