package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnua  reason: default package */
/* loaded from: classes.dex */
public final class cnua extends cojb {
    final /* synthetic */ cnui a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnua(cnui cnuiVar, Looper looper) {
        super(looper);
        this.a = cnuiVar;
    }

    private static final void a(Message message) {
        cnub cnubVar = (cnub) message.obj;
        cnubVar.c();
        cnubVar.e();
    }

    private static final boolean c(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        TListener tlistener;
        if (this.a.o.get() != message.arg1) {
            if (!c(message)) {
                return;
            }
            a(message);
        } else if ((message.what != 1 && message.what != 7 && message.what != 4 && message.what != 5) || this.a.s()) {
            PendingIntent pendingIntent = null;
            if (message.what == 4) {
                this.a.l = new ConnectionResult(message.arg2);
                cnui cnuiVar = this.a;
                if (!cnuiVar.m && !TextUtils.isEmpty(cnuiVar.b()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(cnuiVar.b());
                        cnui cnuiVar2 = this.a;
                        if (!cnuiVar2.m) {
                            cnuiVar2.E(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                ConnectionResult connectionResult = this.a.l;
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(8);
                }
                this.a.h.a(connectionResult);
                this.a.D(connectionResult);
            } else if (message.what == 5) {
                ConnectionResult connectionResult2 = this.a.l;
                if (connectionResult2 == null) {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.a.h.a(connectionResult2);
                this.a.D(connectionResult2);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
                this.a.h.a(connectionResult3);
                this.a.D(connectionResult3);
            } else if (message.what == 6) {
                this.a.E(5, null);
                cnuu cnuuVar = this.a.p;
                if (cnuuVar != null) {
                    cnuuVar.a.Pj(message.arg2);
                }
                this.a.Sl(message.arg2);
                this.a.F(5, 1, null);
            } else if (message.what != 2 || this.a.r()) {
                if (c(message)) {
                    cnub cnubVar = (cnub) message.obj;
                    synchronized (cnubVar) {
                        tlistener = cnubVar.d;
                        if (cnubVar.e) {
                            String valueOf = String.valueOf(cnubVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                            sb.append("Callback proxy ");
                            sb.append(valueOf);
                            sb.append(" being reused. This is not safe.");
                            sb.toString();
                        }
                    }
                    if (tlistener != 0) {
                        try {
                            cnubVar.d();
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    synchronized (cnubVar) {
                        cnubVar.e = true;
                    }
                    cnubVar.e();
                    return;
                }
                int i = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i);
                sb2.toString();
                new Exception();
            } else {
                a(message);
            }
        } else {
            a(message);
        }
    }
}
