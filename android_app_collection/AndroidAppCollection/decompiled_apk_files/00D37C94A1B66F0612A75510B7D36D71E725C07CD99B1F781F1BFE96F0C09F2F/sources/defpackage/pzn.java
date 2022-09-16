package defpackage;

import android.os.IBinder;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: pzn  reason: default package */
/* loaded from: classes4.dex */
public final class pzn extends dvc implements pzp {
    public pzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // defpackage.pzp
    public final String a(rad radVar, String str) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        pv.writeString(str);
        Parcel pw = pw(8, pv);
        String readString = pw.readString();
        pw.recycle();
        return readString;
    }

    @Override // defpackage.pzp
    public final String f(rad radVar, byte[] bArr) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        pv.writeByteArray(bArr);
        Parcel pw = pw(12, pv);
        String readString = pw.readString();
        pw.recycle();
        return readString;
    }

    @Override // defpackage.pzp
    public final String g() {
        Parcel pw = pw(1, pv());
        String readString = pw.readString();
        pw.recycle();
        return readString;
    }

    @Override // defpackage.pzp
    public final void h(rad radVar) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        px(9, pv);
    }

    @Override // defpackage.pzp
    public final void i(String str, String str2) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        px(2, pv);
    }
}
