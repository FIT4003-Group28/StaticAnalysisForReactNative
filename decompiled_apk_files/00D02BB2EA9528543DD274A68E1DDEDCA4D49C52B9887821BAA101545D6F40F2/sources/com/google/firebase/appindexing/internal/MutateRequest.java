package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MutateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MutateRequest> CREATOR = new deok();
    public final int a;
    public final Thing[] b;
    public final String[] c;
    public final String[] d;
    public final ActionImpl e;
    public final String f;
    public final String g;

    public MutateRequest(int i, Thing[] thingArr) {
        this(i, thingArr, null, null, null, null, null);
    }

    public MutateRequest(int i, Thing[] thingArr, String[] strArr, String[] strArr2, ActionImpl actionImpl, String str, String str2) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7) {
            i = 0;
        }
        this.a = i;
        this.b = thingArr;
        this.c = strArr;
        this.d = strArr2;
        this.e = actionImpl;
        this.f = str;
        this.g = str2;
    }

    public static MutateRequest newInvalidForTesting() {
        return new MutateRequest(0, null, null, null, null, null, null);
    }

    public static MutateRequest newPatch(Thing... thingArr) {
        return new MutateRequest(2, thingArr);
    }

    public static MutateRequest newRemove(String... strArr) {
        return new MutateRequest(3, null, strArr, null, null, null, null);
    }

    public static MutateRequest newRemoveAll() {
        return new MutateRequest(4, null, null, null, null, null, null);
    }

    public static MutateRequest newRemoveTypes(String... strArr) {
        return new MutateRequest(6, null, null, strArr, null, null, null);
    }

    public static MutateRequest newReportUserAction(ActionImpl actionImpl, String str, String str2) {
        return new MutateRequest(7, null, null, null, actionImpl, str, str2);
    }

    public static MutateRequest newUpdate(Thing... thingArr) {
        return new MutateRequest(1, thingArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.x(parcel, 2, this.b, i);
        cnwn.v(parcel, 3, this.c);
        cnwn.v(parcel, 5, this.d);
        cnwn.u(parcel, 6, this.e, i);
        cnwn.k(parcel, 7, this.f, false);
        cnwn.k(parcel, 8, this.g, false);
        cnwn.c(parcel, d);
    }
}
