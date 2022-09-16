package c.e.a.b.d.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private static g f3853a;

    public e(Looper looper) {
        super(looper);
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    private void a(Message message, long j) {
        g gVar = f3853a;
        if (gVar != null) {
            gVar.a(this, message, j);
        }
    }

    protected void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        g gVar = f3853a;
        if (gVar == null) {
            a(message);
            return;
        }
        Object a2 = gVar.a(this, message);
        try {
            a(message);
        } finally {
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        a(message, j);
        return super.sendMessageAtTime(message, j);
    }
}
