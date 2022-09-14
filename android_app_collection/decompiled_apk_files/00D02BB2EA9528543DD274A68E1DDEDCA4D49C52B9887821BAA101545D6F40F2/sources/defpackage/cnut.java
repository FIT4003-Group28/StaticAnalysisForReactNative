package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
/* compiled from: PG */
/* renamed from: cnut  reason: default package */
/* loaded from: classes.dex */
public final class cnut implements Parcelable.Creator<GetServiceRequest> {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, getServiceRequest.a);
        cnwn.g(parcel, 2, getServiceRequest.b);
        cnwn.g(parcel, 3, getServiceRequest.c);
        cnwn.k(parcel, 4, getServiceRequest.d, false);
        cnwn.p(parcel, 5, getServiceRequest.e);
        cnwn.x(parcel, 6, getServiceRequest.f, i);
        cnwn.m(parcel, 7, getServiceRequest.g);
        cnwn.u(parcel, 8, getServiceRequest.h, i);
        cnwn.x(parcel, 10, getServiceRequest.i, i);
        cnwn.x(parcel, 11, getServiceRequest.j, i);
        cnwn.e(parcel, 12, getServiceRequest.k);
        cnwn.g(parcel, 13, getServiceRequest.l);
        cnwn.e(parcel, 14, getServiceRequest.m);
        cnwn.k(parcel, 15, getServiceRequest.n, false);
        cnwn.c(parcel, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetServiceRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    iBinder = cnwm.p(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) cnwm.z(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = cnwm.r(parcel, readInt);
                    break;
                case 8:
                    account = (Account) cnwm.q(parcel, readInt, Account.CREATOR);
                    break;
                case 9:
                default:
                    cnwm.d(parcel, readInt);
                    break;
                case 10:
                    featureArr = (Feature[]) cnwm.z(parcel, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) cnwm.z(parcel, readInt, Feature.CREATOR);
                    break;
                case 12:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 13:
                    i4 = cnwm.i(parcel, readInt);
                    break;
                case 14:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 15:
                    str2 = cnwm.o(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetServiceRequest[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
