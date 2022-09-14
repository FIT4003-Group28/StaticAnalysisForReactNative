package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c.e.a.b.d.e.y2;
import com.google.firebase.auth.a1;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class n0 implements Parcelable.Creator<k0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k0 createFromParcel(Parcel parcel) {
        int b2 = com.google.android.gms.common.internal.x.b.b(parcel);
        y2 y2Var = null;
        g0 g0Var = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        m0 m0Var = null;
        a1 a1Var = null;
        o oVar = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int a2 = com.google.android.gms.common.internal.x.b.a(parcel);
            switch (com.google.android.gms.common.internal.x.b.a(a2)) {
                case 1:
                    y2Var = (y2) com.google.android.gms.common.internal.x.b.a(parcel, a2, y2.CREATOR);
                    break;
                case 2:
                    g0Var = (g0) com.google.android.gms.common.internal.x.b.a(parcel, a2, g0.CREATOR);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 5:
                    arrayList = com.google.android.gms.common.internal.x.b.c(parcel, a2, g0.CREATOR);
                    break;
                case 6:
                    arrayList2 = com.google.android.gms.common.internal.x.b.c(parcel, a2);
                    break;
                case 7:
                    str3 = com.google.android.gms.common.internal.x.b.b(parcel, a2);
                    break;
                case 8:
                    bool = com.google.android.gms.common.internal.x.b.f(parcel, a2);
                    break;
                case 9:
                    m0Var = (m0) com.google.android.gms.common.internal.x.b.a(parcel, a2, m0.CREATOR);
                    break;
                case 10:
                    z = com.google.android.gms.common.internal.x.b.e(parcel, a2);
                    break;
                case 11:
                    a1Var = (a1) com.google.android.gms.common.internal.x.b.a(parcel, a2, a1.CREATOR);
                    break;
                case 12:
                    oVar = (o) com.google.android.gms.common.internal.x.b.a(parcel, a2, o.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.x.b.o(parcel, a2);
                    break;
            }
        }
        com.google.android.gms.common.internal.x.b.d(parcel, b2);
        return new k0(y2Var, g0Var, str, str2, arrayList, arrayList2, str3, bool, m0Var, z, a1Var, oVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k0[] newArray(int i) {
        return new k0[i];
    }
}
