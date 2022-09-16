package com.google.android.libraries.youtube.logging.interaction;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class InteractionLoggingScreen implements Parcelable {
    public static final Parcelable.Creator CREATOR = new abjw(9);
    public final String a;
    public final String b;
    public final String c;
    public final apxg d;
    public final awbs e;
    public final int f;
    public final Map g;
    public final Map h;
    public final Set i;
    private final Set j;
    private int k;
    private int l;
    private asif m;

    public InteractionLoggingScreen(Parcel parcel) {
        this.k = 1;
        this.l = 0;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.e = (awbs) zgd.J(parcel, awbs.a);
        this.m = (asif) zgd.J(parcel, asif.a);
        this.f = parcel.readInt();
        this.d = (apxg) zgd.J(parcel, apxg.a);
        int readInt = parcel.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put((awbs) zgd.J(parcel, awbs.a), (GelVisibilityUpdate) parcel.readParcelable(GelVisibilityUpdate.class.getClassLoader()));
        }
        this.g = hashMap;
        int readInt2 = parcel.readInt();
        HashMap hashMap2 = new HashMap();
        for (int i2 = 0; i2 < readInt2; i2++) {
            hashMap2.put((awbs) zgd.J(parcel, awbs.a), (awbs) zgd.J(parcel, awbs.a));
        }
        this.h = hashMap2;
        int readInt3 = parcel.readInt();
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < readInt3; i3++) {
            hashSet.add(parcel.readString());
        }
        this.i = hashSet;
        int readInt4 = parcel.readInt();
        this.j = new HashSet();
        for (int i4 = 0; i4 < readInt4; i4++) {
            this.j.add(Integer.valueOf(parcel.readInt()));
        }
        this.k = parcel.readInt();
        this.l = parcel.readInt();
    }

    public static boolean f(apzg apzgVar) {
        return apzgVar != null && apzgVar.qn(atno.b);
    }

    private static final boolean i(awbs awbsVar) {
        if (awbsVar == null || awbsVar.c.d() <= 0) {
            return awbsVar != null && awbsVar.d > 0;
        }
        return true;
    }

    public final synchronized int a() {
        int i;
        i = this.l;
        this.l = i + 1;
        return i;
    }

    public final int b(int i) {
        Set set = this.j;
        Integer valueOf = Integer.valueOf(i);
        if (!set.contains(valueOf)) {
            this.j.add(valueOf);
            return 0;
        }
        int i2 = this.k;
        this.k = i2 + 1;
        return i2;
    }

    public final acup c() {
        return acuo.a(this.f);
    }

    public final void d(awbs awbsVar, awbs awbsVar2) {
        if (i(awbsVar)) {
            this.h.put(awbsVar, awbsVar2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(GelVisibilityUpdate gelVisibilityUpdate) {
        if (i(gelVisibilityUpdate.d)) {
            this.g.put(gelVisibilityUpdate.d, gelVisibilityUpdate);
        }
    }

    public final boolean g(awbs awbsVar) {
        if (!i(awbsVar)) {
            return false;
        }
        return this.h.containsKey(awbsVar);
    }

    public final boolean h(awbs awbsVar) {
        GelVisibilityUpdate gelVisibilityUpdate;
        int i = (i(awbsVar) && (gelVisibilityUpdate = (GelVisibilityUpdate) this.g.get(awbsVar)) != null) ? gelVisibilityUpdate.f : 1;
        return i == 2 || i == 5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        zgd.K(this.e, parcel);
        zgd.K(this.m, parcel);
        parcel.writeInt(this.f);
        apxg apxgVar = this.d;
        if (apxgVar != null) {
            zgd.K(apxgVar, parcel);
        } else {
            zgd.K(apxg.a, parcel);
        }
        Map map = this.g;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            zgd.K((aoqu) entry.getKey(), parcel);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        Map map2 = this.h;
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            zgd.K((aoqu) entry2.getKey(), parcel);
            zgd.K((aoqu) entry2.getValue(), parcel);
        }
        Set<String> set = this.i;
        parcel.writeInt(set.size());
        for (String str : set) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.j.size());
        for (Integer num : this.j) {
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
    }

    public InteractionLoggingScreen(zfq zfqVar, int i, awbs awbsVar, String str, String str2) {
        this.k = 1;
        this.l = 0;
        awbsVar.getClass();
        this.a = zfqVar.b(16);
        this.g = new HashMap();
        this.j = new HashSet();
        this.h = new HashMap();
        this.i = new HashSet();
        this.f = i;
        this.b = str;
        this.c = str2;
        this.d = null;
        this.e = awbsVar;
        this.m = asif.a;
    }
}
