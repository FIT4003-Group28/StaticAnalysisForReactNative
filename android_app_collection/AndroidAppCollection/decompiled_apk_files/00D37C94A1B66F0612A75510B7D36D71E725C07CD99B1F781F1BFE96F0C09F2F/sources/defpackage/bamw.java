package defpackage;

import android.opengl.GLES20;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: bamw  reason: default package */
/* loaded from: classes2.dex */
final class bamw implements Runnable {
    final /* synthetic */ banb a;
    private Object b;

    public bamw(banb banbVar) {
        this.a = banbVar;
    }

    public final synchronized void a(Object obj) {
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        bams bamsVar;
        if (this.b == null || (bamsVar = this.a.g) == null || bamsVar.k()) {
            return;
        }
        Object obj = this.b;
        if (obj instanceof Surface) {
            this.a.g.d((Surface) obj);
            this.a.g.f();
            GLES20.glPixelStorei(3317, 1);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Invalid surface: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
