package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: PG */
/* renamed from: qtz  reason: default package */
/* loaded from: classes4.dex */
public final class qtz extends rfm {
    public qtz() {
        super(Looper.getMainLooper());
    }

    public final void a(qtf qtfVar, qte qteVar) {
        ThreadLocal threadLocal = BasePendingResult.e;
        sendMessage(obtainMessage(1, new Pair(qtfVar, qteVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            qtf qtfVar = (qtf) pair.first;
            qte qteVar = (qte) pair.second;
            try {
                qtfVar.a(qteVar);
            } catch (RuntimeException e) {
                BasePendingResult.m(qteVar);
                throw e;
            }
        } else if (i == 2) {
            ((BasePendingResult) message.obj).l(Status.d);
        } else {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        }
    }

    public qtz(Looper looper) {
        super(looper);
    }
}
