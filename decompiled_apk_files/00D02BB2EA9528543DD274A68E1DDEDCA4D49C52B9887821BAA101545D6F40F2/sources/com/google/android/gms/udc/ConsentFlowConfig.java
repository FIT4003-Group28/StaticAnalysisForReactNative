package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ConsentFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConsentFlowConfig> CREATOR = new cpdf();
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public int g;

    public ConsentFlowConfig() {
        this(false, true, false, 0, 0, true, 0);
    }

    public ConsentFlowConfig(boolean z, boolean z2, boolean z3, int i, int i2, boolean z4, int i3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i2;
        this.f = z4;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentFlowConfig)) {
            return false;
        }
        ConsentFlowConfig consentFlowConfig = (ConsentFlowConfig) obj;
        return this.a == consentFlowConfig.a && this.b == consentFlowConfig.b && this.c == consentFlowConfig.c && this.d == consentFlowConfig.d && this.e == consentFlowConfig.e && this.f == consentFlowConfig.f && this.g == consentFlowConfig.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f), Integer.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 2, this.a);
        cnwn.e(parcel, 3, this.b);
        cnwn.e(parcel, 4, this.c);
        cnwn.g(parcel, 5, this.d);
        cnwn.g(parcel, 6, this.e);
        cnwn.e(parcel, 7, this.f);
        cnwn.g(parcel, 8, this.g);
        cnwn.c(parcel, d);
    }
}
