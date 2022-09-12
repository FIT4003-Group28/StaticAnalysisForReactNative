package defpackage;

import android.os.Handler;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnie  reason: default package */
/* loaded from: classes5.dex */
public final class cnie extends cmxv {
    private final WeakReference<cnif> a;

    public cnie(cnif cnifVar) {
        this.a = new WeakReference<>(cnifVar);
    }

    @Override // defpackage.cmxw
    public final void b(int i, int i2, int i3) {
        cnif cnifVar = this.a.get();
        if (cnifVar == null) {
            return;
        }
        Handler handler = cnifVar.b;
        handler.sendMessage(handler.obtainMessage(1, i, i2, Integer.valueOf(i3)));
    }

    @Override // defpackage.cmxw
    public final void c(int i) {
        cnif cnifVar = this.a.get();
        if (cnifVar == null) {
            return;
        }
        Handler handler = cnifVar.b;
        handler.sendMessage(handler.obtainMessage(2, i, 0));
    }
}
