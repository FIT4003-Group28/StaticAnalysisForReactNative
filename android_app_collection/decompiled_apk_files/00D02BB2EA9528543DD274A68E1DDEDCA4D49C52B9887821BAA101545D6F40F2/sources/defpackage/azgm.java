package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azgm  reason: default package */
/* loaded from: classes3.dex */
public final class azgm implements Runnable {
    final /* synthetic */ axwa a;
    final /* synthetic */ azgq b;

    public azgm(azgq azgqVar, axwa axwaVar) {
        this.b = azgqVar;
        this.a = axwaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.b(new azgl(this, this.b.a()), bvrj.UI_THREAD);
    }
}
