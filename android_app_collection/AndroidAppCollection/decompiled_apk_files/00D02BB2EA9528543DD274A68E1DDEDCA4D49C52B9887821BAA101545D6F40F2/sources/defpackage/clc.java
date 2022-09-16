package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: clc  reason: default package */
/* loaded from: classes.dex */
public final class clc {
    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static CharSequence b(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public static void c(Parcel parcel, CharSequence charSequence) {
        if (charSequence != null) {
            parcel.writeInt(1);
            TextUtils.writeToParcel(charSequence, parcel, 1);
            return;
        }
        parcel.writeInt(0);
    }

    public static <T extends Parcelable> T d(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void f(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
