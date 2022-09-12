package defpackage;

import android.os.Looper;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: cncj  reason: default package */
/* loaded from: classes5.dex */
public final class cncj extends cncb {
    public final cnce g;
    public final dehn<Void> h;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    public cncj(cnce cnceVar, Looper looper) {
        super(looper);
        this.g = cnceVar;
        cnjh cnjhVar = new cnjh();
        dbty dbtyVar = new dbty(this) { // from class: cncf
            private final cncj a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                final cncj cncjVar = this.a;
                return new cnix(new dbsz(cncjVar) { // from class: cnch
                    private final cncj a;

                    {
                        this.a = cncjVar;
                    }

                    @Override // defpackage.dbsz
                    public final void NU(Object obj) {
                        cncj cncjVar2 = this.a;
                        RemoteException remoteException = (RemoteException) obj;
                        int i = cnjc.a;
                        cncjVar2.n();
                    }
                });
            }
        };
        if (cnjhVar.a == 0) {
            cnjhVar.a = dbtyVar.a();
        }
        Object[] objArr = new Object[0];
        T t = cnjhVar.a;
        if (t != 0) {
            this.f = (cnix) t;
            this.h = deew.h(degp.q(cnceVar.a()), new dbrn(this) { // from class: cncg
                private final cncj a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    Void r2 = (Void) obj;
                    this.a.i();
                    return null;
                }
            }, new cnjj(new cojb(Looper.getMainLooper())));
            return;
        }
        throw new NullPointerException(dbtx.b("None of the supplied values were non-null!", objArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cncb
    public final cmxn h() {
        dbsk.m(this.g != null, "Client is not connected yet.");
        cmxn b = this.g.b();
        dbsk.s(b);
        return b;
    }

    public final String toString() {
        String str;
        cnce cnceVar = this.g;
        if (cnceVar != null) {
            String valueOf = String.valueOf(cnceVar.getClass());
            int hashCode = this.g.hashCode();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
            sb.append(valueOf);
            sb.append("@");
            sb.append(hashCode);
            str = sb.toString();
        } else {
            str = "null";
        }
        String valueOf2 = String.valueOf(getClass());
        int hashCode2 = hashCode();
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 13 + String.valueOf(str).length());
        sb2.append(valueOf2);
        sb2.append("@");
        sb2.append(hashCode2);
        sb2.append("/");
        sb2.append(str);
        return sb2.toString();
    }
}
