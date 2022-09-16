package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: qqv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qqv implements Runnable {
    public final /* synthetic */ qqy a;
    private final /* synthetic */ int b;

    public /* synthetic */ qqv(qqy qqyVar) {
        this.a = qqyVar;
    }

    public /* synthetic */ qqv(qqy qqyVar, int i) {
        this.b = i;
        this.a = qqyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.g("Service disconnected");
                return;
            } else {
                this.a.b();
                return;
            }
        }
        final qqy qqyVar = this.a;
        while (true) {
            synchronized (qqyVar) {
                if (qqyVar.a != 2) {
                    return;
                }
                if (!qqyVar.d.isEmpty()) {
                    final qrb qrbVar = (qrb) qqyVar.d.poll();
                    qqyVar.e.put(qrbVar.a, qrbVar);
                    qqyVar.f.b.schedule(new Runnable() { // from class: qqx
                        @Override // java.lang.Runnable
                        public final void run() {
                            qqy.this.c(qrbVar.a);
                        }
                    }, 30L, TimeUnit.SECONDS);
                    Context context = qqyVar.f.a;
                    Messenger messenger = qqyVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = qrbVar.c;
                    obtain.arg1 = qrbVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", qrbVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", qrbVar.d);
                    obtain.setData(bundle);
                    try {
                        qqz qqzVar = qqyVar.c;
                        Messenger messenger2 = qqzVar.a;
                        if (messenger2 == null) {
                            CloudMessagingMessengerCompat cloudMessagingMessengerCompat = qqzVar.b;
                            if (cloudMessagingMessengerCompat != null) {
                                cloudMessagingMessengerCompat.b(obtain);
                            } else {
                                throw new IllegalStateException("Both messengers are null");
                                break;
                            }
                        } else {
                            messenger2.send(obtain);
                        }
                    } catch (RemoteException e) {
                        qqyVar.g(e.getMessage());
                    }
                } else {
                    qqyVar.d();
                    return;
                }
            }
        }
    }
}
