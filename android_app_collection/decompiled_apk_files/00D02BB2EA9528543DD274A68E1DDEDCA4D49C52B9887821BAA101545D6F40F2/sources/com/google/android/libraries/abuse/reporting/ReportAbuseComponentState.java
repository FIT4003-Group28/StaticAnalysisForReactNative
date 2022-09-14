package com.google.android.libraries.abuse.reporting;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ReportAbuseComponentState implements Parcelable {
    public static final Parcelable.Creator<ReportAbuseComponentState> CREATOR = new cplp();
    public ckf a;
    public ArrayList<ReportAbuseCardConfigParcel> b;
    public ArrayList<ArrayList<ckn>> c;
    public boolean d;
    public ArrayList<ckn> e;
    public ckn f;
    private Map<Integer, String> g;
    private Set<String> h;
    private HashMap<String, ckd> i;
    private HashMap<String, ckh> j;
    private boolean k;

    public ReportAbuseComponentState(Parcel parcel) {
        this.a = (ckf) dsqw.cq(ckf.e, parcel.createByteArray());
        String[] createStringArray = parcel.createStringArray();
        this.h = new HashSet(createStringArray.length);
        for (String str : createStringArray) {
            this.h.add(str);
        }
        Bundle readBundle = parcel.readBundle();
        this.i = new HashMap<>();
        for (String str2 : readBundle.keySet()) {
            this.i.put(str2, (ckd) dsqw.cq(ckd.g, readBundle.getByteArray(str2)));
        }
        Bundle readBundle2 = parcel.readBundle();
        this.j = new HashMap<>();
        for (String str3 : readBundle2.keySet()) {
            this.j.put(str3, (ckh) dsqw.cq(ckh.g, readBundle2.getByteArray(str3)));
        }
        int[] createIntArray = parcel.createIntArray();
        String[] createStringArray2 = parcel.createStringArray();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < createIntArray.length; i++) {
            hashMap.put(Integer.valueOf(createIntArray[i]), createStringArray2[i]);
        }
        this.g = Collections.unmodifiableMap(hashMap);
        ReportAbuseCardConfigParcel[] reportAbuseCardConfigParcelArr = (ReportAbuseCardConfigParcel[]) parcel.createTypedArray(ReportAbuseCardConfigParcel.CREATOR);
        this.b = new ArrayList<>();
        for (ReportAbuseCardConfigParcel reportAbuseCardConfigParcel : reportAbuseCardConfigParcelArr) {
            this.b.add(reportAbuseCardConfigParcel);
        }
        int readInt = parcel.readInt();
        this.c = new ArrayList<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.c.add(f(parcel));
        }
        this.d = ((Boolean) parcel.readValue(null)).booleanValue();
        this.k = ((Boolean) parcel.readValue(null)).booleanValue();
        this.e = f(parcel);
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray.length == 0) {
            this.f = null;
        } else {
            this.f = (ckn) dsqw.cq(ckn.j, createByteArray);
        }
    }

    private static final ArrayList<ckn> f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList<ckn> arrayList = new ArrayList<>(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((ckn) dsqw.cq(ckn.j, parcel.createByteArray()));
        }
        return arrayList;
    }

    private static final <T extends dsqw> void g(T t, Parcel parcel) {
        if (t == null) {
            parcel.writeByteArray(new byte[0]);
        } else {
            parcel.writeByteArray(t.bS());
        }
    }

    private static final <T extends dsqw> void h(List<T> list, Parcel parcel) {
        parcel.writeInt(list.size());
        for (T t : list) {
            g(t, parcel);
        }
    }

    public final String a(Integer num) {
        return this.g.get(num);
    }

    public final ArrayList<ckd> b() {
        boolean z;
        ArrayList<ckd> arrayList = new ArrayList<>();
        Iterator<String> it = this.f.d.iterator();
        while (true) {
            char c = 4;
            if (it.hasNext()) {
                ckd c2 = c(it.next());
                Iterator<String> it2 = c2.d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!this.h.contains(it2.next())) {
                            z = false;
                        }
                    } else {
                        z = true;
                    }
                }
                switch (c2.c) {
                    case 0:
                        c = 1;
                        break;
                    case 1:
                        c = 2;
                        break;
                    case 2:
                        c = 3;
                        break;
                    case 3:
                        break;
                    case 4:
                        c = 5;
                        break;
                    case 5:
                        c = 6;
                        break;
                    case 6:
                        c = 7;
                        break;
                    case 7:
                        c = '\b';
                        break;
                    case 8:
                        c = '\t';
                        break;
                    case 9:
                        c = '\n';
                        break;
                    case 10:
                        c = 11;
                        break;
                    case 11:
                        c = '\f';
                        break;
                    case 12:
                        c = '\r';
                        break;
                    case 13:
                        c = 14;
                        break;
                    case 14:
                        c = 15;
                        break;
                    case 15:
                        c = 16;
                        break;
                    case 16:
                        c = 17;
                        break;
                    case 17:
                        c = 18;
                        break;
                    case 18:
                        c = 19;
                        break;
                    case 19:
                        c = 20;
                        break;
                    case 20:
                        c = 21;
                        break;
                    case 21:
                        c = 22;
                        break;
                    default:
                        c = 0;
                        break;
                }
                if (z && (c2.f || c != 0)) {
                    arrayList.add(c2);
                }
            } else {
                if (arrayList.isEmpty()) {
                    ckn cknVar = this.f;
                    if ((cknVar.a & 4) != 0 && !cknVar.e) {
                        arrayList.add(c("undo"));
                        arrayList.add(c("no_action"));
                    }
                }
                return arrayList;
            }
        }
    }

    public final ckd c(String str) {
        return this.i.get(str);
    }

    public final ckh d(String str) {
        return this.j.get(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ReportAbuseCardConfigParcel e() {
        int size = this.b.size() - 1;
        if (size < 0) {
            return null;
        }
        return this.b.get(size);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g(this.a, parcel);
        parcel.writeStringArray((String[]) this.h.toArray(new String[0]));
        Bundle bundle = new Bundle();
        for (String str : this.i.keySet()) {
            bundle.putByteArray(str, this.i.get(str).bS());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (String str2 : this.j.keySet()) {
            bundle2.putByteArray(str2, this.j.get(str2).bS());
        }
        parcel.writeBundle(bundle2);
        int[] iArr = new int[this.g.size()];
        String[] strArr = new String[this.g.size()];
        int i2 = 0;
        for (Integer num : this.g.keySet()) {
            iArr[i2] = num.intValue();
            strArr[i2] = this.g.get(num);
            i2++;
        }
        parcel.writeIntArray(iArr);
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray((ReportAbuseCardConfigParcel[]) this.b.toArray(new ReportAbuseCardConfigParcel[0]), i);
        parcel.writeInt(this.c.size());
        ArrayList<ArrayList<ckn>> arrayList = this.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            h(arrayList.get(i3), parcel);
        }
        parcel.writeValue(Boolean.valueOf(this.d));
        parcel.writeValue(Boolean.valueOf(this.k));
        h(this.e, parcel);
        g(this.f, parcel);
    }

    public ReportAbuseComponentState(ckf ckfVar, Set<String> set) {
        this.d = false;
        this.f = null;
        this.c = new ArrayList<>();
        this.b = new ArrayList<>();
        this.h = set;
        this.a = ckfVar;
        this.k = false;
        this.i = new HashMap<>();
        this.j = new HashMap<>();
        this.e = new ArrayList<>();
        ckf ckfVar2 = this.a;
        HashMap hashMap = new HashMap();
        Iterator<ckl> it = ckfVar2.d.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            ckl next = it.next();
            int a = ckk.a(next.b);
            if (a != 0) {
                i = a;
            }
            hashMap.put(Integer.valueOf(i - 1), next.c);
        }
        this.g = Collections.unmodifiableMap(hashMap);
        for (ckd ckdVar : this.a.b) {
            this.i.put(ckdVar.b, ckdVar);
        }
        Map<Integer, String> map = this.g;
        HashMap<String, ckd> hashMap2 = this.i;
        ckc bZ = ckd.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ckd ckdVar2 = (ckd) bZ.b;
        int i2 = ckdVar2.a | 2;
        ckdVar2.a = i2;
        ckdVar2.c = 2;
        ckdVar2.a = i2 | 1;
        ckdVar2.b = "no_action";
        String str = map.get(18);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ckd ckdVar3 = (ckd) bZ.b;
        str.getClass();
        ckdVar3.a |= 4;
        ckdVar3.e = str;
        ckc bZ2 = ckd.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ckd ckdVar4 = (ckd) bZ2.b;
        int i3 = ckdVar4.a | 2;
        ckdVar4.a = i3;
        ckdVar4.c = 2;
        ckdVar4.a = i3 | 1;
        ckdVar4.b = "undo";
        String str2 = map.get(15);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ckd ckdVar5 = (ckd) bZ2.b;
        str2.getClass();
        ckdVar5.a |= 4;
        ckdVar5.e = str2;
        ckc bZ3 = ckd.g.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ckd ckdVar6 = (ckd) bZ3.b;
        int i4 = ckdVar6.a | 2;
        ckdVar6.a = i4;
        ckdVar6.c = 2;
        ckdVar6.a = 1 | i4;
        ckdVar6.b = "finish_reporting";
        String str3 = map.get(16);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ckd ckdVar7 = (ckd) bZ3.b;
        str3.getClass();
        ckdVar7.a |= 4;
        ckdVar7.e = str3;
        hashMap2.put("no_action", bZ.bK());
        hashMap2.put("undo", bZ2.bK());
        hashMap2.put("finish_reporting", bZ3.bK());
        for (ckh ckhVar : this.a.c) {
            this.j.put(ckhVar.b, ckhVar);
        }
    }
}
