package com.google.android.libraries.social.peoplekit.configs;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PeopleKitConfigImpl implements PeopleKitConfig {
    public static final Parcelable.Creator<PeopleKitConfigImpl> CREATOR = new cxsr();
    public final String a;
    public final PeopleKitVisualElementPath b;
    public final int c;
    private final String d;
    private final czgq e;
    private final String f;
    private final String g;
    private final int h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;

    public PeopleKitConfigImpl(Parcel parcel) {
        this.a = parcel.readString();
        this.d = parcel.readString();
        this.c = czgo.a(parcel.readInt());
        this.e = czgq.b(parcel.readInt());
        this.b = (PeopleKitVisualElementPath) parcel.readParcelable(PeopleKitVisualElementPath.class.getClassLoader());
        if (parcel.readInt() != 0) {
            this.f = parcel.readString();
        } else {
            this.f = null;
        }
        this.g = parcel.readString();
        this.h = parcel.readInt();
        boolean z = true;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.n = parcel.readInt() != 0;
        this.o = parcel.readInt() != 0;
        this.p = parcel.readInt() != 0;
        this.q = parcel.readInt() != 0;
        this.r = parcel.readInt() != 0;
        this.s = parcel.readInt() != 0;
        this.t = parcel.readInt() == 0 ? false : z;
    }

    public static cxss u() {
        return new cxss();
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final String b() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final czgq c() {
        return this.e;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final PeopleKitVisualElementPath d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final String e() {
        return this.f;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final String f() {
        return this.g;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final int g() {
        return this.h;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean h() {
        return this.i;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean i() {
        return this.k;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean j() {
        return this.j;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean k() {
        return this.l;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean l() {
        return this.m;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean m() {
        return this.n;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean n() {
        return this.o;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean o() {
        return this.p;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean p() {
        return this.q;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean q() {
        return this.r;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean r() {
        return this.s;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final boolean s() {
        return this.t;
    }

    @Override // com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig
    public final int t() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.d);
        int i2 = this.c;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeInt(this.e.M);
            parcel.writeParcelable(this.b, 0);
            int i4 = !TextUtils.isEmpty(this.f) ? 1 : 0;
            parcel.writeInt(i4);
            if (i4 != 0) {
                parcel.writeString(this.f);
            }
            parcel.writeString(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeInt(this.m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeInt(this.p ? 1 : 0);
            parcel.writeInt(this.q ? 1 : 0);
            parcel.writeInt(this.r ? 1 : 0);
            parcel.writeInt(this.s ? 1 : 0);
            parcel.writeInt(this.t ? 1 : 0);
            return;
        }
        throw null;
    }

    public PeopleKitConfigImpl(cxss cxssVar) {
        this.a = cxssVar.a;
        this.d = null;
        this.c = cxssVar.j;
        this.e = cxssVar.b;
        PeopleKitVisualElementPath peopleKitVisualElementPath = cxssVar.c;
        this.b = peopleKitVisualElementPath == null ? new PeopleKitVisualElementPath() : peopleKitVisualElementPath;
        this.f = null;
        this.g = cxssVar.d;
        this.h = cxssVar.e;
        this.i = false;
        this.j = false;
        this.k = cxssVar.f;
        this.l = false;
        this.m = true;
        this.n = cxssVar.g;
        this.o = cxssVar.h;
        this.p = true;
        this.q = true;
        this.r = cxssVar.i;
        this.s = true;
        this.t = false;
    }
}
