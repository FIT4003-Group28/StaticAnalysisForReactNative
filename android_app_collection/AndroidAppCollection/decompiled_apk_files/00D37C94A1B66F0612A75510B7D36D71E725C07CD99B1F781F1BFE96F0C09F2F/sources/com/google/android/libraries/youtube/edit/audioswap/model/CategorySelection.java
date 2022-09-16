package com.google.android.libraries.youtube.edit.audioswap.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class CategorySelection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new xcg(9);
    public CharSequence a;
    public List b;

    public CategorySelection(Parcel parcel) {
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = new ArrayList();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            aopa createBuilder = apis.a.createBuilder();
            try {
                createBuilder.mo38mergeFrom(bArr, aoos.b());
                this.b.add((apis) createBuilder.mo39build());
            } catch (aopx e) {
                zep.d("Cannot deserialize AudioTracksCategoryRenderer from stored proto byte[] in parcel. Safely ignoring.", e);
            }
        }
    }

    public CategorySelection(CharSequence charSequence, List list) {
        this.a = charSequence;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CategorySelection) {
                CategorySelection categorySelection = (CategorySelection) obj;
                return this.a.equals(categorySelection.a) && this.b.equals(categorySelection.b);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.a, parcel, 0);
        parcel.writeInt(this.b.size());
        for (apis apisVar : this.b) {
            byte[] byteArray = apisVar.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        }
    }
}
