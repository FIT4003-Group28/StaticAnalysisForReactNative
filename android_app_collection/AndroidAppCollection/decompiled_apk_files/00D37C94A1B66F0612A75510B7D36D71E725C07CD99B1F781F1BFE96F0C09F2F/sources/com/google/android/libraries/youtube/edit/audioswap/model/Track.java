package com.google.android.libraries.youtube.edit.audioswap.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class Track implements Parcelable {
    public static final Parcelable.Creator CREATOR = new xcg(12);
    public final Spanned a;
    public final Spanned b;
    public final int c;
    public final Uri d;
    public final avhn e;
    public final Spanned f;
    private final Spanned g;

    public Track(Parcel parcel) {
        Spanned spanned = (Spanned) parcel.readValue(Spanned.class.getClassLoader());
        spanned.getClass();
        this.a = spanned;
        Spanned spanned2 = (Spanned) parcel.readValue(Spanned.class.getClassLoader());
        spanned2.getClass();
        this.b = spanned2;
        this.c = parcel.readInt();
        Uri uri = (Uri) parcel.readValue(Uri.class.getClassLoader());
        uri.getClass();
        this.d = uri;
        avhn avhnVar = null;
        try {
            int readInt = parcel.readInt();
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            avhnVar = readInt > 0 ? (avhn) aopi.parseFrom(avhn.a, bArr) : avhnVar;
        } catch (aopx e) {
            zep.d("Cannot deserialize thumbnail details", e);
        } finally {
            this.e = null;
        }
        this.g = (Spanned) parcel.readValue(Spanned.class.getClassLoader());
        this.f = (Spanned) parcel.readValue(Spanned.class.getClassLoader());
        aqxo.p(this.c > 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track track = (Track) obj;
        return TextUtils.equals(this.b, track.b) && TextUtils.equals(this.a, track.a) && this.c == track.c && akzj.f(this.d, track.d) && akzj.f(this.e, track.e) && TextUtils.equals(this.g, track.g) && TextUtils.equals(this.f, track.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, this.g, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeValue(this.b);
        parcel.writeInt(this.c);
        parcel.writeValue(this.d);
        avhn avhnVar = this.e;
        byte[] byteArray = avhnVar != null ? avhnVar.toByteArray() : new byte[0];
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
        parcel.writeValue(this.g);
        parcel.writeValue(this.f);
    }

    public Track(Spanned spanned, Spanned spanned2, int i, Uri uri, avhn avhnVar, Spanned spanned3, Spanned spanned4) {
        aqxo.p(i > 0);
        spanned.getClass();
        this.a = spanned;
        spanned2.getClass();
        this.b = spanned2;
        this.c = i;
        uri.getClass();
        this.d = uri;
        this.e = avhnVar;
        this.g = spanned3;
        this.f = spanned4;
    }
}
