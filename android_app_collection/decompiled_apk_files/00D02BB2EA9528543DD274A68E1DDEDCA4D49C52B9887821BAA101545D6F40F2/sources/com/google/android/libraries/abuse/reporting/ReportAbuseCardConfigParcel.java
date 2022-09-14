package com.google.android.libraries.abuse.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ReportAbuseCardConfigParcel implements Parcelable {
    public static final Parcelable.Creator<ReportAbuseCardConfigParcel> CREATOR = new cplg();
    public final String a;
    public final ArrayList<ckn> b;
    public final ArrayList<ckd> c;
    public final ckh d;
    public final boolean e;
    public final int f;
    public int g;
    public ButtonState h;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class ButtonState implements Parcelable {
        public static final Parcelable.Creator<ButtonState> CREATOR = new cplh();
        public int a;
        public int b;
        public String c;

        public ButtonState(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public ButtonState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
        }
    }

    public ReportAbuseCardConfigParcel(Parcel parcel) {
        this.a = parcel.readString();
        int readInt = parcel.readInt();
        this.b = new ArrayList<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.b.add((ckn) dsqw.cq(ckn.j, parcel.createByteArray()));
        }
        int readInt2 = parcel.readInt();
        this.c = new ArrayList<>(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.c.add((ckd) dsqw.cq(ckd.g, parcel.createByteArray()));
        }
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray.length != 0) {
            this.d = (ckh) dsqw.cq(ckh.g, createByteArray);
        } else {
            this.d = null;
        }
        this.e = ((Boolean) parcel.readValue(null)).booleanValue();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = (ButtonState) parcel.readParcelable(ButtonState.class.getClassLoader());
    }

    public ReportAbuseCardConfigParcel(String str, ArrayList<ckn> arrayList, ArrayList<ckd> arrayList2, ckh ckhVar, int i, int i2, boolean z) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = ckhVar;
        this.f = i;
        this.g = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b.size());
        ArrayList<ckn> arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(arrayList.get(i2).bS());
        }
        parcel.writeInt(this.c.size());
        ArrayList<ckd> arrayList2 = this.c;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            parcel.writeByteArray(arrayList2.get(i3).bS());
        }
        ckh ckhVar = this.d;
        if (ckhVar == null) {
            parcel.writeByteArray(new byte[0]);
        } else {
            parcel.writeByteArray(ckhVar.bS());
        }
        parcel.writeValue(Boolean.valueOf(this.e));
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeParcelable(this.h, i);
    }
}
