package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.cnom;
/* compiled from: PG */
/* renamed from: cnpn  reason: default package */
/* loaded from: classes.dex */
public final class cnpn<R extends cnom> extends cojb {
    public cnpn() {
        super(Looper.getMainLooper());
    }

    public final void a(cnon<? super R> cnonVar, R r) {
        int i = BasePendingResult.j;
        sendMessage(obtainMessage(1, new Pair(cnonVar, r)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            cnon cnonVar = (cnon) pair.first;
            cnom cnomVar = (cnom) pair.second;
            try {
                cnonVar.Om(cnomVar);
            } catch (RuntimeException e) {
                BasePendingResult.s(cnomVar);
                throw e;
            }
        } else if (i == 2) {
            ((BasePendingResult) message.obj).q(Status.d);
        } else {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            sb.toString();
            new Exception();
        }
    }

    public cnpn(Looper looper) {
        super(looper);
    }
}
