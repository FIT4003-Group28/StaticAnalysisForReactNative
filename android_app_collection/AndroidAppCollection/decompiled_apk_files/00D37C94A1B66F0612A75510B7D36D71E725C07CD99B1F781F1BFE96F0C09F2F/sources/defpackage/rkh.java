package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: rkh  reason: default package */
/* loaded from: classes4.dex */
public final class rkh extends dvc implements rkj {
    public rkh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.rkj
    public final String a(AppMetadata appMetadata) {
        Parcel pv = pv();
        dve.g(pv, appMetadata);
        Parcel pw = pw(11, pv);
        String readString = pw.readString();
        pw.recycle();
        return readString;
    }

    @Override // defpackage.rkj
    public final List f(String str, String str2, AppMetadata appMetadata) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        dve.g(pv, appMetadata);
        Parcel pw = pw(16, pv);
        ArrayList createTypedArrayList = pw.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        pw.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.rkj
    public final List g(String str, String str2, String str3) {
        Parcel pv = pv();
        pv.writeString(null);
        pv.writeString(str2);
        pv.writeString(str3);
        Parcel pw = pw(17, pv);
        ArrayList createTypedArrayList = pw.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        pw.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.rkj
    public final List h(String str, String str2, boolean z, AppMetadata appMetadata) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        dve.e(pv, z);
        dve.g(pv, appMetadata);
        Parcel pw = pw(14, pv);
        ArrayList createTypedArrayList = pw.createTypedArrayList(UserAttributeParcel.CREATOR);
        pw.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.rkj
    public final List i(String str, String str2, String str3, boolean z) {
        Parcel pv = pv();
        pv.writeString(null);
        pv.writeString(str2);
        pv.writeString(str3);
        dve.e(pv, z);
        Parcel pw = pw(15, pv);
        ArrayList createTypedArrayList = pw.createTypedArrayList(UserAttributeParcel.CREATOR);
        pw.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.rkj
    public final void j(AppMetadata appMetadata) {
        Parcel pv = pv();
        dve.g(pv, appMetadata);
        px(4, pv);
    }

    @Override // defpackage.rkj
    public final void k(EventParcel eventParcel, AppMetadata appMetadata) {
        Parcel pv = pv();
        dve.g(pv, eventParcel);
        dve.g(pv, appMetadata);
        px(1, pv);
    }

    @Override // defpackage.rkj
    public final void l(AppMetadata appMetadata) {
        Parcel pv = pv();
        dve.g(pv, appMetadata);
        px(18, pv);
    }

    @Override // defpackage.rkj
    public final void m(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        Parcel pv = pv();
        dve.g(pv, conditionalUserPropertyParcel);
        dve.g(pv, appMetadata);
        px(12, pv);
    }

    @Override // defpackage.rkj
    public final void n(AppMetadata appMetadata) {
        Parcel pv = pv();
        dve.g(pv, appMetadata);
        px(20, pv);
    }

    @Override // defpackage.rkj
    public final void o(long j, String str, String str2, String str3) {
        Parcel pv = pv();
        pv.writeLong(j);
        pv.writeString(str);
        pv.writeString(str2);
        pv.writeString(str3);
        px(10, pv);
    }

    @Override // defpackage.rkj
    public final void p(Bundle bundle, AppMetadata appMetadata) {
        Parcel pv = pv();
        dve.g(pv, bundle);
        dve.g(pv, appMetadata);
        px(19, pv);
    }

    @Override // defpackage.rkj
    public final void q(AppMetadata appMetadata) {
        Parcel pv = pv();
        dve.g(pv, appMetadata);
        px(6, pv);
    }

    @Override // defpackage.rkj
    public final void r(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        Parcel pv = pv();
        dve.g(pv, userAttributeParcel);
        dve.g(pv, appMetadata);
        px(2, pv);
    }

    @Override // defpackage.rkj
    public final byte[] s(EventParcel eventParcel, String str) {
        Parcel pv = pv();
        dve.g(pv, eventParcel);
        pv.writeString(str);
        Parcel pw = pw(9, pv);
        byte[] createByteArray = pw.createByteArray();
        pw.recycle();
        return createByteArray;
    }
}
