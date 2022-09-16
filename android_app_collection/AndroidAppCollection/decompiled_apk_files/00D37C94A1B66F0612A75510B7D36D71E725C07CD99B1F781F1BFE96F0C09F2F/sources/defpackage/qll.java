package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;
/* compiled from: PG */
/* renamed from: qll  reason: default package */
/* loaded from: classes4.dex */
public final class qll extends dvd implements IInterface {
    final /* synthetic */ qlu a;

    public qll() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qll(qlu qluVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider");
        this.a = qluVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            qlu qluVar = this.a;
            Context context = qluVar.a;
            String str = qluVar.b;
            CastOptions castOptions = qluVar.c;
            rad m = new qku(context, str, readString, castOptions, new qor(context, castOptions, qluVar.e)).m();
            parcel2.writeNoException();
            dve.i(parcel2, m);
        } else if (i == 2) {
            boolean z = this.a.c.d;
            parcel2.writeNoException();
            dve.e(parcel2, z);
        } else if (i == 3) {
            String str2 = this.a.b;
            parcel2.writeNoException();
            parcel2.writeString(str2);
        } else if (i != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(213380000);
        }
        return true;
    }
}
