package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vtu  reason: default package */
/* loaded from: classes4.dex */
public final class vtu implements Runnable {
    final /* synthetic */ vtz a;

    public vtu(vtz vtzVar) {
        this.a = vtzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean h;
        synchronized (this.a.c) {
            if (!this.a.d) {
                while (this.a.c.size() > 0) {
                    vtz vtzVar = this.a;
                    vtzVar.d = true;
                    int intValue = ((Integer) vtzVar.c.peek()).intValue();
                    if (intValue == 0) {
                        h = this.a.h(true);
                    } else if (intValue == 1) {
                        h = this.a.h(false);
                    } else {
                        StringBuilder sb = new StringBuilder(60);
                        sb.append("VideoPlayerCodecManager: unknown pending action: ");
                        sb.append(intValue);
                        vqy.b(sb.toString());
                        this.a.c.remove();
                    }
                    if (!h) {
                        break;
                    }
                    this.a.c.remove();
                }
                this.a.d = false;
            }
        }
    }
}
