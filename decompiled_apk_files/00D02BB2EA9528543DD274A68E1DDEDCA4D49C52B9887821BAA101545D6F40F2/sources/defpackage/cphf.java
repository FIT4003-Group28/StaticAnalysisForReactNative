package defpackage;

import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;
/* compiled from: PG */
/* renamed from: cphf  reason: default package */
/* loaded from: classes5.dex */
final class cphf extends cpiw {
    final /* synthetic */ cphg a;
    private volatile int b = -1;

    public cphf(cphg cphgVar) {
        this.a = cphgVar;
    }

    private final boolean l(Runnable runnable) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (cpjz.a(this.a).b() && cnxv.b(this.a, callingUid, "com.google.android.wearable.app.cn")) {
                this.b = callingUid;
            } else if (!cnxv.a(this.a, callingUid)) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Caller is not GooglePlayServices; caller UID: ");
                sb.append(callingUid);
                sb.toString();
                return false;
            } else {
                this.b = callingUid;
            }
        }
        synchronized (this.a.e) {
            cphg cphgVar = this.a;
            if (cphgVar.f) {
                return false;
            }
            cphgVar.c.post(runnable);
            return true;
        }
    }

    @Override // defpackage.cpix
    public final void b(DataHolder dataHolder) {
        cpgx cpgxVar = new cpgx(this, dataHolder);
        try {
            String valueOf = String.valueOf(dataHolder);
            int i = dataHolder.h;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append(valueOf);
            sb.append(", rows=");
            sb.append(i);
            sb.toString();
            if (l(cpgxVar)) {
            }
        } finally {
            dataHolder.close();
        }
    }

    @Override // defpackage.cpix
    public final void c(MessageEventParcelable messageEventParcelable) {
        l(new cpgy(this, messageEventParcelable));
    }

    @Override // defpackage.cpix
    public final void d(List<NodeParcelable> list) {
        l(new cphb());
    }

    @Override // defpackage.cpix
    public final void e(ChannelEventParcelable channelEventParcelable) {
        l(new cpgw(this, channelEventParcelable));
    }

    @Override // defpackage.cpix
    public final void f(final MessageEventParcelable messageEventParcelable, final cpis cpisVar) {
        l(new Runnable(this, messageEventParcelable, cpisVar) { // from class: cpgv
            private final cphf a;
            private final MessageEventParcelable b;
            private final cpis c;

            {
                this.a = this;
                this.b = messageEventParcelable;
                this.c = cpisVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MessageEventParcelable messageEventParcelable2 = this.b;
                cpis cpisVar2 = this.c;
                String str = messageEventParcelable2.d;
                String str2 = messageEventParcelable2.b;
                byte[] bArr = messageEventParcelable2.c;
                try {
                    cpisVar2.e();
                } catch (RemoteException unused) {
                }
            }
        });
    }

    @Override // defpackage.cpix
    public final void g() {
        l(new cphc());
    }

    @Override // defpackage.cpix
    public final void h() {
        l(new cphe());
    }

    @Override // defpackage.cpix
    public final void i() {
        l(new cphd());
    }

    @Override // defpackage.cpix
    public final void j() {
        l(new cpgz());
    }

    @Override // defpackage.cpix
    public final void k() {
        l(new cpha());
    }
}
