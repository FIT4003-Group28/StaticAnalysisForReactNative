package defpackage;

import android.os.Parcel;
import com.google.android.apps.auto.sdk.SearchItem;
/* compiled from: PG */
/* renamed from: cly  reason: default package */
/* loaded from: classes5.dex */
public abstract class cly extends clb implements clz {
    public cly() {
        super("com.google.android.apps.auto.sdk.ISearchCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b();
            parcel2.writeNoException();
        } else if (i == 2) {
            c();
            parcel2.writeNoException();
        } else if (i == 3) {
            d(parcel.readString());
            parcel2.writeNoException();
        } else if (i == 4) {
            boolean e = e(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(e ? 1 : 0);
        } else if (i != 5) {
            return false;
        } else {
            f((SearchItem) clc.d(parcel, SearchItem.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
