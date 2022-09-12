package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AncsNotificationParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AncsNotificationParcelable> CREATOR = new cphm();
    public int a;
    public final String b;
    @dzsi
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final byte g;
    public final byte h;
    public final byte i;
    public final byte j;
    @dzsi
    public final String k;
    @dzsi
    private final String l;

    public AncsNotificationParcelable(int i, String str, @dzsi String str2, String str3, String str4, String str5, @dzsi String str6, byte b, byte b2, byte b3, byte b4, @dzsi String str7) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.l = str6;
        this.g = b;
        this.h = b2;
        this.i = b3;
        this.j = b4;
        this.k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
        if (this.a != ancsNotificationParcelable.a || this.g != ancsNotificationParcelable.g || this.h != ancsNotificationParcelable.h || this.i != ancsNotificationParcelable.i || this.j != ancsNotificationParcelable.j || !this.b.equals(ancsNotificationParcelable.b)) {
            return false;
        }
        String str = this.c;
        if (str == null ? ancsNotificationParcelable.c != null : !str.equals(ancsNotificationParcelable.c)) {
            return false;
        }
        if (!this.d.equals(ancsNotificationParcelable.d) || !this.e.equals(ancsNotificationParcelable.e) || !this.f.equals(ancsNotificationParcelable.f)) {
            return false;
        }
        String str2 = this.l;
        if (str2 == null ? ancsNotificationParcelable.l != null : !str2.equals(ancsNotificationParcelable.l)) {
            return false;
        }
        String str3 = this.k;
        String str4 = ancsNotificationParcelable.k;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    public final int hashCode() {
        int hashCode = (((this.a + 31) * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str2 = this.l;
        int hashCode3 = (((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        String str3 = this.k;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.l;
        byte b = this.g;
        byte b2 = this.h;
        byte b3 = this.i;
        byte b4 = this.j;
        String str7 = this.k;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 211 + length2 + length3 + length4 + length5 + String.valueOf(str6).length() + String.valueOf(str7).length());
        sb.append("AncsNotificationParcelable{, id=");
        sb.append(i);
        sb.append(", appId='");
        sb.append(str);
        sb.append('\'');
        sb.append(", dateTime='");
        sb.append(str2);
        sb.append('\'');
        sb.append(", notificationText='");
        sb.append(str3);
        sb.append('\'');
        sb.append(", title='");
        sb.append(str4);
        sb.append('\'');
        sb.append(", subtitle='");
        sb.append(str5);
        sb.append('\'');
        sb.append(", displayName='");
        sb.append(str6);
        sb.append('\'');
        sb.append(", eventId=");
        sb.append((int) b);
        sb.append(", eventFlags=");
        sb.append((int) b2);
        sb.append(", categoryId=");
        sb.append((int) b3);
        sb.append(", categoryCount=");
        sb.append((int) b4);
        sb.append(", packageName='");
        sb.append(str7);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.k(parcel, 5, this.d, false);
        cnwn.k(parcel, 6, this.e, false);
        cnwn.k(parcel, 7, this.f, false);
        String str = this.l;
        if (str == null) {
            str = this.b;
        }
        cnwn.k(parcel, 8, str, false);
        cnwn.f(parcel, 9, this.g);
        cnwn.f(parcel, 10, this.h);
        cnwn.f(parcel, 11, this.i);
        cnwn.f(parcel, 12, this.j);
        cnwn.k(parcel, 13, this.k, false);
        cnwn.c(parcel, d);
    }
}
