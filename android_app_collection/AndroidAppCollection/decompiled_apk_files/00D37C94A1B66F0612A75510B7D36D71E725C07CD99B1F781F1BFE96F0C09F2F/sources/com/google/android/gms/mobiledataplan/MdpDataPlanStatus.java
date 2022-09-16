package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdpDataPlanStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private static final Map t;
    private static final Map u;
    public String a;
    public String b;
    public String c;
    public long d;
    public long e;
    public MdpFlexTimeWindow[] f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public List m;
    public long n;
    public long o;
    public long p;
    public String q;
    public String r;
    public boolean s;

    static {
        HashMap hashMap = new HashMap();
        t = hashMap;
        hashMap.put(0, "UNSPECIFIED");
        hashMap.put(1, "THROTTLED");
        hashMap.put(2, "BLOCKED");
        hashMap.put(3, "PAY_AS_YOU_GO");
        u = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            u.put((String) entry.getValue(), (Integer) entry.getKey());
        }
        CREATOR = new rrb();
    }

    private MdpDataPlanStatus() {
        this.s = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdpDataPlanStatus mdpDataPlanStatus = (MdpDataPlanStatus) obj;
            if (tnk.j(this.a, mdpDataPlanStatus.a) && tnk.j(this.b, mdpDataPlanStatus.b) && tnk.j(this.c, mdpDataPlanStatus.c) && tnk.j(Long.valueOf(this.d), Long.valueOf(mdpDataPlanStatus.d)) && tnk.j(Long.valueOf(this.e), Long.valueOf(mdpDataPlanStatus.e)) && Arrays.equals(this.f, mdpDataPlanStatus.f) && tnk.j(Integer.valueOf(this.g), Integer.valueOf(mdpDataPlanStatus.g)) && tnk.j(Long.valueOf(this.n), Long.valueOf(mdpDataPlanStatus.n)) && tnk.j(Long.valueOf(this.o), Long.valueOf(mdpDataPlanStatus.o)) && tnk.j(Long.valueOf(this.p), Long.valueOf(mdpDataPlanStatus.p)) && tnk.j(this.q, mdpDataPlanStatus.q) && tnk.j(this.h, mdpDataPlanStatus.h) && tnk.j(this.r, mdpDataPlanStatus.r) && tnk.j(this.i, mdpDataPlanStatus.i) && tnk.j(Boolean.valueOf(this.s), Boolean.valueOf(mdpDataPlanStatus.s)) && tnk.j(this.j, mdpDataPlanStatus.j) && tnk.j(this.k, mdpDataPlanStatus.k) && tnk.j(Integer.valueOf(this.l), Integer.valueOf(mdpDataPlanStatus.l)) && tnk.j(this.m, mdpDataPlanStatus.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), this.h, this.i, this.j, this.k, Integer.valueOf(this.l), this.m})), Integer.valueOf(Arrays.hashCode(this.f))})), Integer.valueOf(this.g), Long.valueOf(this.n), Long.valueOf(this.o), Long.valueOf(this.p), this.q, this.r, Boolean.valueOf(this.s)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        tjk.g("PlanName", this.a, arrayList);
        tjk.g("ExpirationTime", this.b, arrayList);
        tjk.g("TrafficCategory", this.c, arrayList);
        tjk.g("QuotaBytes", Long.valueOf(this.d), arrayList);
        tjk.g("QuotaMinutes", Long.valueOf(this.e), arrayList);
        tjk.g("FlexTimeWindows", Arrays.toString(this.f), arrayList);
        int i = this.g;
        String str = (String) t.get(Integer.valueOf(i));
        if (str == null) {
            StringBuilder sb = new StringBuilder(44);
            sb.append("Illegal overusage policy string: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        tjk.g("OverUsagePolicy", str, arrayList);
        tjk.g("RemainingBytes", Long.valueOf(this.o), arrayList);
        tjk.g("RemainingMinutes", Long.valueOf(this.p), arrayList);
        tjk.g("ShortDescription", this.j, arrayList);
        tjk.g("DisplayRefreshPeriod", this.k, arrayList);
        tjk.g("PlanType", Integer.valueOf(this.l), arrayList);
        tjk.g("Pmtcs", this.m, arrayList);
        tjk.g("SnapshotTime", Long.valueOf(this.n), arrayList);
        tjk.g("Description", this.q, arrayList);
        tjk.g("PlanId", this.h, arrayList);
        tjk.g("Balance", this.r, arrayList);
        tjk.g("ModuleName", this.i, arrayList);
        tjk.g("IsActive", Boolean.valueOf(this.s), arrayList);
        return tjk.f(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.t(parcel, 4, this.d);
        tqj.t(parcel, 5, this.e);
        tqj.I(parcel, 6, this.f, i);
        tqj.s(parcel, 7, this.g);
        tqj.F(parcel, 8, this.h);
        tqj.F(parcel, 9, this.i);
        tqj.F(parcel, 10, this.j);
        tqj.F(parcel, 11, this.k);
        tqj.s(parcel, 12, this.l);
        tqj.A(parcel, 13, this.m);
        tqj.t(parcel, 20, this.n);
        tqj.t(parcel, 21, this.o);
        tqj.t(parcel, 22, this.p);
        tqj.F(parcel, 23, this.q);
        tqj.F(parcel, 24, this.r);
        tqj.o(parcel, 25, this.s);
        tqj.n(parcel, m);
    }

    public MdpDataPlanStatus(String str, String str2, String str3, long j, long j2, MdpFlexTimeWindow[] mdpFlexTimeWindowArr, int i, String str4, String str5, String str6, String str7, int i2, List list, long j3, long j4, long j5, String str8, String str9, boolean z) {
        this.s = true;
        this.a = str;
        this.h = str4;
        this.i = str5;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = mdpFlexTimeWindowArr;
        if (t.keySet().contains(Integer.valueOf(i))) {
            this.g = i;
            this.n = j3;
            this.o = j4;
            this.p = j5;
            this.q = str8;
            this.r = str9;
            this.j = str6;
            this.s = z;
            this.k = str7;
            this.l = i2;
            this.m = list;
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Illegal overusage policy: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
