package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qdz  reason: default package */
/* loaded from: classes4.dex */
public final class qdz extends dvd implements qea {
    final /* synthetic */ qej a;

    public qdz() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qdr qdrVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                qdrVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                if (queryLocalInterface instanceof qdr) {
                    qdrVar = (qdr) queryLocalInterface;
                } else {
                    qdrVar = new qdr(readStrongBinder);
                }
            }
            qej qejVar = this.a;
            dpa dpaVar = qejVar.a;
            dpaVar.b.m(qejVar.a(qdrVar));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdz(qej qejVar) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.a = qejVar;
    }
}
