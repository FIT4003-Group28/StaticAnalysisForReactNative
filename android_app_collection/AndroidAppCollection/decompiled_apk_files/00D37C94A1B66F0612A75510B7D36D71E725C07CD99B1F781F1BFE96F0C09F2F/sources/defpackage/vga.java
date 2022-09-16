package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vga  reason: default package */
/* loaded from: classes4.dex */
public final class vga implements Runnable {
    final /* synthetic */ vfz a;

    public vga(vfz vfzVar) {
        this.a = vfzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vgb.a.add(this.a);
        if (vgb.b != -1) {
            this.a.b(vgb.b);
        }
    }
}
