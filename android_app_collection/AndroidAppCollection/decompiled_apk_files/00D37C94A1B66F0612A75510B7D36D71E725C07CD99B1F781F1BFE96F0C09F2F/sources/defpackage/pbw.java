package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pbw  reason: default package */
/* loaded from: classes4.dex */
public final class pbw extends Handler implements Runnable {
    public final pbx a;
    public volatile Thread b;
    final /* synthetic */ pbz c;
    private final pbv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(pbz pbzVar, Looper looper, pbx pbxVar, pbv pbvVar) {
        super(looper);
        this.c = pbzVar;
        this.a = pbxVar;
        this.d = pbvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 2) {
            pbz pbzVar = this.c;
            pbzVar.b = false;
            pbzVar.a = null;
            if (this.a.l()) {
                this.d.p();
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.d.n(this.a);
                return;
            } else if (i != 1) {
                return;
            } else {
                this.d.o(this.a, (IOException) message.obj);
                return;
            }
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b = Thread.currentThread();
            if (!this.a.l()) {
                String.valueOf(this.a.getClass().getSimpleName()).concat(".load()");
                int i = pcx.a;
                this.a.k();
            }
            sendEmptyMessage(0);
        } catch (IOException e) {
            obtainMessage(1, e).sendToTarget();
        } catch (Error e2) {
            Log.e("LoadTask", "Unexpected error loading stream", e2);
            obtainMessage(2, e2).sendToTarget();
            throw e2;
        } catch (InterruptedException unused) {
            pce.d(this.a.l());
            sendEmptyMessage(0);
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            obtainMessage(1, new pby(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            obtainMessage(1, new pby(e4)).sendToTarget();
        }
    }
}
