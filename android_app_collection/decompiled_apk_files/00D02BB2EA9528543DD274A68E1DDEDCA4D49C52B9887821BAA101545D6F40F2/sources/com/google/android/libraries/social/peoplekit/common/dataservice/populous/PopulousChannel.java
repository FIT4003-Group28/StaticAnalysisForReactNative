package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.populous.Group;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Loggable;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Phone;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PopulousChannel implements Channel {
    public static final Parcelable.Creator<PopulousChannel> CREATOR = new cxrm();
    public final String a;
    public final int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public final String g;
    private final int h;
    private String i;
    private final AutocompleteMatchInfo j;
    private String k;
    private final AutocompleteMatchInfo l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private final boolean q;
    private final String r;
    private final int s;
    private Loggable t;

    public PopulousChannel(Parcel parcel) {
        this.h = parcel.readInt();
        this.i = parcel.readString();
        this.a = parcel.readString();
        int readInt = parcel.readInt();
        this.b = readInt;
        this.j = (AutocompleteMatchInfo) parcel.readParcelable(AutocompleteMatchInfo.class.getClassLoader());
        this.k = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.l = (AutocompleteMatchInfo) parcel.readParcelable(AutocompleteMatchInfo.class.getClassLoader());
        boolean z = false;
        this.m = parcel.readInt() == 1;
        this.n = parcel.readInt() == 1;
        this.o = parcel.readInt() == 1;
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.p = parcel.readString();
        this.g = parcel.readString();
        this.q = parcel.readInt() == 1 ? true : z;
        this.r = parcel.readString();
        this.s = parcel.readInt();
        switch (readInt) {
            case 1:
                this.t = (Loggable) parcel.readParcelable(Email.class.getClassLoader());
                return;
            case 2:
                this.t = (Loggable) parcel.readParcelable(Phone.class.getClassLoader());
                return;
            case 3:
            case 4:
            case 5:
                this.t = (Loggable) parcel.readParcelable(InAppNotificationTarget.class.getClassLoader());
                return;
            case 6:
                this.t = (Loggable) parcel.readParcelable(Group.class.getClassLoader());
                return;
            default:
                StringBuilder sb = new StringBuilder(61);
                sb.append("Cannot create ContactMethodField of unknown type: ");
                sb.append(readInt);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public PopulousChannel(cxrn cxrnVar) {
        this.h = cxrnVar.a;
        this.a = cxrnVar.b;
        this.b = cxrnVar.c;
        this.j = cxrnVar.d;
        this.c = cxrnVar.e;
        this.d = cxrnVar.f;
        this.l = cxrnVar.i;
        this.m = cxrnVar.g;
        this.n = cxrnVar.h;
        this.e = cxrnVar.j;
        this.f = cxrnVar.k;
        this.p = cxrnVar.l;
        this.g = cxrnVar.m;
        this.q = cxrnVar.n;
        this.r = cxrnVar.o;
        this.s = cxrnVar.p;
        this.t = cxrnVar.r;
        if (y()) {
            this.i = cxrnVar.q;
        }
    }

    public static cxrn C() {
        return new cxrn();
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void A() {
        this.o = true;
    }

    public final Loggable B() {
        if (this.t == null) {
            cygd l = PersonFieldMetadata.l();
            l.d(true);
            int i = this.h;
            if (i == 1) {
                l.j(cygl.USER_ENTERED);
            } else if (i == 4) {
                l.j(cygl.DEVICE);
            }
            PersonFieldMetadata i2 = l.i();
            int i3 = this.b;
            if (i3 == 1) {
                cyey e = Email.e();
                e.f(this.a);
                e.e(i2);
                this.t = e.i();
            } else if (i3 == 2) {
                cygh e2 = Phone.e();
                e2.e(this.a);
                e2.c(i2);
                this.t = e2.i();
            } else if (i3 == 3) {
                cyfi n = InAppNotificationTarget.n();
                n.g(cyep.IN_APP_GAIA);
                n.h(this.a);
                n.e(i2);
                this.t = n.i();
            } else if (i3 == 4) {
                cyfi n2 = InAppNotificationTarget.n();
                n2.g(cyep.IN_APP_PHONE);
                n2.h(this.a);
                n2.e(i2);
                this.t = n2.i();
            } else if (i3 == 5) {
                cyfi n3 = InAppNotificationTarget.n();
                n3.g(cyep.IN_APP_EMAIL);
                n3.h(this.a);
                n3.e(i2);
                this.t = n3.i();
            }
        }
        return this.t;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final int a() {
        return this.h;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String b(Context context) {
        if (TextUtils.isEmpty(this.i)) {
            int i = this.b;
            if (i == 6) {
                return null;
            }
            this.i = (i == 2 || i == 4) ? cxqz.d(this.a, context) : this.a;
        }
        return this.i;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String c() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final int d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final AutocompleteMatchInfo e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Channel) {
            return cxrc.a(this, (Channel) obj);
        }
        return false;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String f() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String g() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final AutocompleteMatchInfo h() {
        return this.l;
    }

    public final int hashCode() {
        return cxrc.b(this);
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String i(Context context) {
        String str;
        if (TextUtils.isEmpty(this.k)) {
            if (!TextUtils.isEmpty(this.c)) {
                this.k = this.c;
            } else {
                int i = this.b;
                if (i == 6) {
                    return null;
                }
                if (i == 3) {
                    this.k = this.s == 2 ? cxqz.d(this.r, context) : this.r;
                } else {
                    if (i == 4) {
                        str = cxqz.d(this.a, context);
                    } else if (i == 5) {
                        str = this.a;
                    } else {
                        this.k = b(context);
                    }
                    this.k = str;
                }
            }
        }
        return this.k;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final boolean j() {
        return this.m;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final boolean k() {
        return this.o;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final boolean l() {
        return this.n;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String m() {
        return this.e;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String n() {
        return this.f;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String o() {
        return this.g;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final boolean p() {
        return this.q;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String q() {
        return this.r;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final int r() {
        return this.s;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final String s() {
        return this.p;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void t(String str, boolean z, boolean z2) {
        this.c = str;
        this.m = z;
        this.n = z2;
        this.k = null;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.p;
        String str7 = this.r;
        int i2 = this.s;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + length3 + length4 + length5 + String.valueOf(str6).length() + String.valueOf(str7).length());
        sb.append(str);
        sb.append(" <");
        sb.append(i);
        sb.append("> ");
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        sb.append(" ");
        sb.append(str4);
        sb.append(" ");
        sb.append(str5);
        sb.append(" ");
        sb.append(str6);
        sb.append(" <");
        sb.append(str7);
        sb.append("> ");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void u(String str) {
        this.d = str;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void v(String str) {
        this.e = str;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void w(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.j, i);
        parcel.writeString(this.k);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.l, i);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.p);
        parcel.writeString(this.g);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeParcelable(this.t, i);
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final void x(String str) {
        this.p = str;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final boolean y() {
        int i = this.b;
        return i == 5 || i == 3 || i == 4;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.Channel
    public final czha z(Context context) {
        return cxrc.c(this, context);
    }
}
