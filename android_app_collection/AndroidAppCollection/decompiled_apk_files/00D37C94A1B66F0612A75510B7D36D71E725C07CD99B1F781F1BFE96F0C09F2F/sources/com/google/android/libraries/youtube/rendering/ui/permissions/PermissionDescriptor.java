package com.google.android.libraries.youtube.rendering.ui.permissions;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class PermissionDescriptor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aiqg(18);
    public int a;
    public acup b;
    public acup c;

    public PermissionDescriptor(int i, actj actjVar, actj actjVar2) {
        this.a = i;
        this.b = acuo.b(actjVar.II);
        this.c = acuo.b(actjVar2.II);
    }

    public PermissionDescriptor(int i, acup acupVar, acup acupVar2) {
        this.a = i;
        this.b = acupVar;
        this.c = acupVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b.a);
        parcel.writeInt(this.c.a);
    }

    public PermissionDescriptor(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = acuo.b(parcel.readInt());
        this.c = acuo.b(parcel.readInt());
    }
}
