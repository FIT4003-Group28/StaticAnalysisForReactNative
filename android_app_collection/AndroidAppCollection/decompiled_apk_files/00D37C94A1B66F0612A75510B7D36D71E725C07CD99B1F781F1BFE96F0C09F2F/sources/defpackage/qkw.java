package defpackage;

import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
/* compiled from: PG */
/* renamed from: qkw  reason: default package */
/* loaded from: classes4.dex */
public final class qkw extends dvd implements qkx {
    final /* synthetic */ qku a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkw(qku qkuVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
        this.a = qkuVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            qjj qjjVar = this.a.c;
            if (qjjVar != null) {
                qvx b = qvy.b();
                b.a = new qjs((qjz) qjjVar, readString, readString2, 1);
                b.c = 8407;
                ((qst) qjjVar).v(b.a()).q(new qkr(this, 1));
            }
            parcel2.writeNoException();
        } else if (i == 2) {
            final String readString3 = parcel.readString();
            final LaunchOptions launchOptions = (LaunchOptions) dve.a(parcel, LaunchOptions.CREATOR);
            qjj qjjVar2 = this.a.c;
            if (qjjVar2 != null) {
                qvx b2 = qvy.b();
                final qjz qjzVar = (qjz) qjjVar2;
                b2.a = new qvo() { // from class: qjr
                    @Override // defpackage.qvo
                    public final void a(Object obj, Object obj2) {
                        qjz qjzVar2 = qjz.this;
                        String str = readString3;
                        LaunchOptions launchOptions2 = launchOptions;
                        qjzVar2.f();
                        qpp qppVar = (qpp) ((qpk) obj).D();
                        Parcel pv = qppVar.pv();
                        pv.writeString(str);
                        dve.g(pv, launchOptions2);
                        qppVar.py(13, pv);
                        qjzVar2.h((rvh) obj2);
                    }
                };
                b2.c = 8406;
                ((qst) qjjVar2).v(b2.a()).q(new qkr(this));
            }
            parcel2.writeNoException();
        } else if (i == 3) {
            final String readString4 = parcel.readString();
            qjj qjjVar3 = this.a.c;
            if (qjjVar3 != null) {
                qvx b3 = qvy.b();
                final qjz qjzVar2 = (qjz) qjjVar3;
                b3.a = new qvo() { // from class: qjp
                    @Override // defpackage.qvo
                    public final void a(Object obj, Object obj2) {
                        qjz qjzVar3 = qjz.this;
                        String str = readString4;
                        qjzVar3.f();
                        qpp qppVar = (qpp) ((qpk) obj).D();
                        Parcel pv = qppVar.pv();
                        pv.writeString(str);
                        qppVar.py(5, pv);
                        synchronized (qjzVar3.i) {
                            if (qjzVar3.f == null) {
                                qjzVar3.f = (rvh) obj2;
                                return;
                            }
                            ((rvh) obj2).a(qjz.e(2001));
                        }
                    }
                };
                b3.c = 8409;
                ((qst) qjjVar3).v(b3.a());
            }
            parcel2.writeNoException();
        } else if (i == 4) {
            this.a.d(parcel.readInt());
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(213380000);
        }
        return true;
    }

    public qkw() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }
}
