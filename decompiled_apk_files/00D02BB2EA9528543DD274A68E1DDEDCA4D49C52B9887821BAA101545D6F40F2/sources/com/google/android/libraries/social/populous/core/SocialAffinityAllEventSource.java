package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class SocialAffinityAllEventSource implements Parcelable {
    public static final Parcelable.Creator<SocialAffinityAllEventSource> CREATOR = new cygt();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public SocialAffinityAllEventSource(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i != 0) {
            this.a = i;
            if (i2 != 0) {
                this.b = i2;
                if (i3 != 0) {
                    this.c = i3;
                    if (i4 != 0) {
                        this.d = i4;
                        if (i5 != 0) {
                            this.e = i5;
                            if (i6 == 0) {
                                throw null;
                            }
                            this.f = i6;
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static cygu a() {
        return new cygu();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SocialAffinityAllEventSource) {
            SocialAffinityAllEventSource socialAffinityAllEventSource = (SocialAffinityAllEventSource) obj;
            if (this.a == socialAffinityAllEventSource.a && this.b == socialAffinityAllEventSource.b && this.c == socialAffinityAllEventSource.c && this.d == socialAffinityAllEventSource.d && this.e == socialAffinityAllEventSource.e && this.f == socialAffinityAllEventSource.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((eawb.a(this.a) ^ 1000003) * 1000003) ^ eawb.a(this.b)) * 1000003) ^ eawb.a(this.c)) * 1000003) ^ eawb.a(this.d)) * 1000003) ^ eawb.a(this.e)) * 1000003) ^ eawb.a(this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a - 1);
        parcel.writeInt(this.b - 1);
        parcel.writeInt(this.c - 1);
        parcel.writeInt(this.d - 1);
        parcel.writeInt(this.e - 1);
        parcel.writeInt(this.f - 1);
    }
}
