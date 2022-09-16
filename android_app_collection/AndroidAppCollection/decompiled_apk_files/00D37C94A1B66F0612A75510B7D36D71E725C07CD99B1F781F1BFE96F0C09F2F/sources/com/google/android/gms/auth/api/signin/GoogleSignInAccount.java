package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qhh(16);
    final int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;
    public String g;
    public long h;
    public String i;
    List j;
    public String k;
    public String l;
    private Set m = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = list;
        this.k = str7;
        this.l = str8;
    }

    public final Set a() {
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.m);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.i.equals(this.i) && googleSignInAccount.a().equals(a());
    }

    public final int hashCode() {
        return ((this.i.hashCode() + 527) * 31) + a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.F(parcel, 4, this.d);
        tqj.F(parcel, 5, this.e);
        tqj.E(parcel, 6, this.f, i);
        tqj.F(parcel, 7, this.g);
        tqj.t(parcel, 8, this.h);
        tqj.F(parcel, 9, this.i);
        tqj.J(parcel, 10, this.j);
        tqj.F(parcel, 11, this.k);
        tqj.F(parcel, 12, this.l);
        tqj.n(parcel, m);
    }
}
