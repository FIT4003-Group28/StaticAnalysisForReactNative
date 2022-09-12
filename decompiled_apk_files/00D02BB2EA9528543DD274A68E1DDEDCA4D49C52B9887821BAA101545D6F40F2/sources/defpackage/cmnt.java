package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: PG */
/* renamed from: cmnt  reason: default package */
/* loaded from: classes5.dex */
public final class cmnt {
    public final Handler a;

    public cmnt(Handler handler) {
        this.a = handler;
    }

    public final Message a(int i) {
        return this.a.obtainMessage(i);
    }

    public final Message b(int i, Object obj) {
        return this.a.obtainMessage(i, obj);
    }

    public final Message c(int i, int i2, int i3, Object obj) {
        return this.a.obtainMessage(i, i2, i3, obj);
    }

    public final void d() {
        this.a.removeMessages(2);
    }

    public final void e(int i) {
        this.a.sendEmptyMessage(i);
    }
}
