package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qwk  reason: default package */
/* loaded from: classes4.dex */
public final class qwk extends rfm {
    final /* synthetic */ qwr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwk(qwr qwrVar, Looper looper) {
        super(looper);
        this.a = qwrVar;
    }

    private static final void a(Message message) {
        qwl qwlVar = (qwl) message.obj;
        qwlVar.b();
        qwlVar.f();
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        if (this.a.F.get() != message.arg1) {
            if (!b(message)) {
                return;
            }
            a(message);
        } else if ((message.what != 1 && message.what != 7 && message.what != 4 && message.what != 5) || this.a.x()) {
            PendingIntent pendingIntent = null;
            if (message.what == 4) {
                this.a.C = new ConnectionResult(message.arg2);
                qwr qwrVar = this.a;
                if (!qwrVar.D && !TextUtils.isEmpty(qwrVar.c()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(qwrVar.c());
                        qwr qwrVar2 = this.a;
                        if (!qwrVar2.D) {
                            qwrVar2.k(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                ConnectionResult connectionResult = this.a.C;
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(8);
                }
                this.a.v.a(connectionResult);
                this.a.q();
            } else if (message.what == 5) {
                ConnectionResult connectionResult2 = this.a.C;
                if (connectionResult2 == null) {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.a.v.a(connectionResult2);
                this.a.q();
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                this.a.v.a(new ConnectionResult(message.arg2, pendingIntent));
                this.a.q();
            } else if (message.what == 6) {
                this.a.k(5, null);
                qwi qwiVar = this.a.y;
                if (qwiVar != null) {
                    qwiVar.a(message.arg2);
                }
                int i = message.arg2;
                System.currentTimeMillis();
                this.a.J(5, 1, null);
            } else if (message.what != 2 || this.a.w()) {
                if (b(message)) {
                    qwl qwlVar = (qwl) message.obj;
                    synchronized (qwlVar) {
                        obj = qwlVar.d;
                        if (qwlVar.e) {
                            String valueOf = String.valueOf(qwlVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                            sb.append("Callback proxy ");
                            sb.append(valueOf);
                            sb.append(" being reused. This is not safe.");
                            Log.w("GmsClient", sb.toString());
                        }
                    }
                    if (obj != null) {
                        try {
                            qwlVar.d();
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    synchronized (qwlVar) {
                        qwlVar.e = true;
                    }
                    qwlVar.f();
                    return;
                }
                int i2 = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i2);
                Log.wtf("GmsClient", sb2.toString(), new Exception());
            } else {
                a(message);
            }
        } else {
            a(message);
        }
    }
}
