package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UdcCacheResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UdcCacheResponse> CREATOR = new cpdt();
    public final List<UdcSetting> a;
    public final int[] b;
    public final boolean c;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class SettingAvailability extends AbstractSafeParcelable {
        public static final Parcelable.Creator<SettingAvailability> CREATOR = new cpdi();
        public final boolean a;

        public SettingAvailability(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof SettingAvailability) && this.a == ((SettingAvailability) obj).a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
        }

        public final String toString() {
            cnvu b = cnvv.b(this);
            b.a("CanShowValue", Boolean.valueOf(this.a));
            return b.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.e(parcel, 2, this.a);
            cnwn.c(parcel, d);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class UdcSetting extends AbstractSafeParcelable {
        public static final Parcelable.Creator<UdcSetting> CREATOR = new cpdw();
        public final int a;
        public final int b;
        public final SettingAvailability c;

        public UdcSetting(int i, int i2, SettingAvailability settingAvailability) {
            this.a = i;
            this.b = i2;
            this.c = settingAvailability;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof UdcSetting)) {
                return false;
            }
            UdcSetting udcSetting = (UdcSetting) obj;
            return this.a == udcSetting.a && this.b == udcSetting.b && cnvv.a(this.c, udcSetting.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
        }

        public final String toString() {
            cnvu b = cnvv.b(this);
            b.a("SettingId", Integer.valueOf(this.a));
            b.a("SettingValue", Integer.valueOf(this.b));
            b.a("SettingAvailability", this.c);
            return b.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.g(parcel, 2, this.a);
            cnwn.g(parcel, 3, this.b);
            cnwn.u(parcel, 4, this.c, i);
            cnwn.c(parcel, d);
        }
    }

    public UdcCacheResponse(List<UdcSetting> list, int[] iArr, boolean z) {
        this.a = list;
        this.b = iArr;
        this.c = z;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UdcCacheResponse)) {
            return false;
        }
        UdcCacheResponse udcCacheResponse = (UdcCacheResponse) obj;
        return this.a.equals(udcCacheResponse.a) && Arrays.equals(this.b, udcCacheResponse.b) && this.c == udcCacheResponse.c;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("Settings", this.a);
        b.a("ConsentableSettings", Arrays.toString(this.b));
        b.a("CanMostLikelyStartConsentFlow", Boolean.valueOf(this.c));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 2, this.a);
        cnwn.q(parcel, 3, this.b);
        cnwn.e(parcel, 4, this.c);
        cnwn.c(parcel, d);
    }
}
