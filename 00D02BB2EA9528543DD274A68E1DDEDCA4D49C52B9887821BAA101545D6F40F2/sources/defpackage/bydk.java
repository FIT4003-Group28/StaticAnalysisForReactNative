package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: bydk  reason: default package */
/* loaded from: classes4.dex */
public final class bydk {
    private final Context a;

    public bydk(Context context) {
        this.a = context;
    }

    public static List<bydn> e(List<byef> list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (byef byefVar : list) {
            long timeInMillis = byefVar.e.getTimeInMillis();
            long timeInMillis2 = byefVar.f.getTimeInMillis();
            StringBuilder sb = new StringBuilder(41);
            sb.append(timeInMillis);
            sb.append("-");
            sb.append(timeInMillis2);
            String sb2 = sb.toString();
            bydn bydnVar = (bydn) hashMap.get(sb2);
            if (bydnVar != null) {
                bydnVar.a(byefVar.b);
            } else {
                bydn bydnVar2 = new bydn(byefVar.b, byefVar.e.get(11), byefVar.e.get(12), byefVar.f.get(11), byefVar.f.get(12));
                arrayList.add(bydnVar2);
                hashMap.put(sb2, bydnVar2);
            }
        }
        byea[] values = byea.values();
        int length = values.length;
        bydn bydnVar3 = null;
        for (int i = 0; i < length; i++) {
            byea byeaVar = values[i];
            boolean z = true;
            for (byef byefVar2 : list) {
                z &= byefVar2.b != byeaVar;
            }
            if (z) {
                if (bydnVar3 == null) {
                    bydnVar3 = new bydn(byeaVar);
                } else {
                    bydnVar3.a(byeaVar);
                }
            }
        }
        if (bydnVar3 != null) {
            arrayList.add(bydnVar3);
        }
        return arrayList;
    }

    private final void j(List<String> list, bydn bydnVar) {
        if (bydnVar.c()) {
            list.add(this.a.getString(R.string.BUSINESS_HOURS_OPEN_24_HOURS_SUMMARY));
        } else if (bydnVar.a) {
            list.add(this.a.getString(R.string.BUSINESS_HOURS_CLOSED_ALL_DAY_SUMMARY));
        } else {
            Context context = this.a;
            list.add(context.getString(R.string.BUSINESS_HOURS_TIME_SUMMARY, bvtb.j(context, bydnVar.b, bydnVar.c, 0), bvtb.j(this.a, bydnVar.d, bydnVar.e, 0)));
        }
    }

    private final bydi k(Set<byea> set, @dzsi Map<byea, String> map, Boolean bool, Boolean bool2, int i) {
        String str;
        Set<byea> set2;
        ArrayList a = dchl.a();
        byea byeaVar = null;
        String str2 = null;
        byea byeaVar2 = null;
        for (byea byeaVar3 : map != null ? map.keySet() : Arrays.asList(byea.values())) {
            if (map == null) {
                set2 = set;
                str = null;
            } else {
                str = map.get(byeaVar3);
                set2 = set;
            }
            if (set2.contains(byeaVar3)) {
                if (byeaVar2 == null) {
                    a.add(new bydj(byeaVar3.j, byeaVar3.i, str, 1));
                } else if (byeaVar2.c().compareTo(byeaVar3) == 0) {
                    str2 = map == null ? null : map.get(byeaVar3);
                    byeaVar = byeaVar3;
                } else {
                    if (byeaVar != null) {
                        a.add(new bydj(byeaVar.j, byeaVar.i, str2, 2));
                    }
                    a.add(new bydj(byeaVar3.j, byeaVar3.i, str, 3));
                    byeaVar = null;
                }
                byeaVar2 = byeaVar3;
            }
        }
        if (byeaVar != null) {
            a.add(new bydj(byeaVar.j, byeaVar.i, str2, 2));
        }
        int size = a.size() + ((bool.booleanValue() || bool2.booleanValue()) ? 1 : 0);
        int size2 = a.size();
        String str3 = "";
        String str4 = str3;
        for (int i2 = 0; i2 < size2; i2++) {
            bydj bydjVar = (bydj) a.get(i2);
            int i3 = size > i ? bydjVar.b : bydjVar.a;
            int i4 = bydjVar.a;
            String str5 = bydjVar.c;
            if (bydjVar.a(1)) {
                str3 = str5 == null ? this.a.getString(i3) : str5;
                if (str5 == null) {
                    str5 = this.a.getString(i4);
                }
                str4 = str5;
            } else if (bydjVar.a(2)) {
                str3 = h(str3, i3, str5);
                str4 = h(str4, i4, str5);
            } else if (bydjVar.a(3)) {
                str3 = i(str3, i3, str5);
                str4 = i(str4, i4, str5);
            }
        }
        return new bydd(str3, str4);
    }

    public final String a(Set<byea> set, Boolean bool, Boolean bool2, int i, int i2, int i3, int i4) {
        if (bool.booleanValue() || bool2.booleanValue()) {
            return f(set, bool, bool2);
        }
        return this.a.getString(R.string.BUSINESS_HOURS_DAYS_AND_TIMES_SUMMARY).replace("{0}", g(set, null, bool, bool2, 1)).replace("{1}", bvtb.j(this.a, i, i2, 0)).replace("{2}", bvtb.j(this.a, i3, i4, 0));
    }

    public final List<String> b(dgsl dgslVar, TimeZone timeZone) {
        List<byef> j = byee.j(dgslVar, timeZone);
        byee.k(j);
        List<bydn> e = e(j);
        ArrayList arrayList = new ArrayList();
        for (bydn bydnVar : e) {
            arrayList.add(a(bydnVar.b(), Boolean.valueOf(bydnVar.c()), Boolean.valueOf(bydnVar.a), bydnVar.b, bydnVar.c, bydnVar.d, bydnVar.e));
        }
        return arrayList;
    }

    public final LinkedHashMap<String, List<String>> c(dgsl dgslVar, TimeZone timeZone) {
        LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<bydi, List<String>> entry : d(dgslVar, timeZone).entrySet()) {
            linkedHashMap.put(entry.getKey().a(), entry.getValue());
        }
        return linkedHashMap;
    }

    public final LinkedHashMap<bydi, List<String>> d(dgsl dgslVar, TimeZone timeZone) {
        List<byef> j = byee.j(dgslVar, timeZone);
        byee.k(j);
        List<bydn> e = e(j);
        LinkedHashMap<bydi, List<String>> linkedHashMap = new LinkedHashMap<>();
        for (bydn bydnVar : e) {
            bydi k = k(bydnVar.b(), null, Boolean.valueOf(bydnVar.c()), Boolean.valueOf(bydnVar.a), (bydnVar.c() || bydnVar.a) ? 2 : 1);
            List<String> list = linkedHashMap.get(k);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                j(arrayList, bydnVar);
                linkedHashMap.put(k, arrayList);
            } else {
                j(list, bydnVar);
            }
        }
        return linkedHashMap;
    }

    public final String f(Set<byea> set, Boolean bool, Boolean bool2) {
        return g(set, null, bool, bool2, 2);
    }

    public final String g(Set<byea> set, @dzsi Map<byea, String> map, Boolean bool, Boolean bool2, int i) {
        String str = ((bydd) k(set, map, bool, bool2, i)).a;
        if (bool.booleanValue()) {
            if (dbsj.d(str)) {
                str = this.a.getString(R.string.BUSINESS_HOURS_OPEN_24_HOURS_SUMMARY);
            } else {
                str = this.a.getString(R.string.BUSINESS_24_HOURS_DAYS_SUMMARY).replace("{0}", str);
            }
        }
        if (bool2.booleanValue()) {
            if (dbsj.d(str)) {
                return this.a.getString(R.string.BUSINESS_HOURS_CLOSED_ALL_DAY_SUMMARY);
            }
            return this.a.getString(R.string.BUSINESS_CLOSED_DAYS_SUMMARY, str);
        }
        return str;
    }

    public final String h(String str, int i, @dzsi String str2) {
        if (str2 == null) {
            str2 = this.a.getString(i);
        }
        return str == null ? str2 : this.a.getString(R.string.BUSINESS_HOURS_CONTIGUOUS_DAYS_RANGE).replace("{0}", str).replace("{1}", str2);
    }

    public final String i(String str, int i, @dzsi String str2) {
        if (str2 == null) {
            str2 = this.a.getString(i);
        }
        return str == null ? str2 : this.a.getString(R.string.BUSINESS_HOURS_DISCONNECTED_DAYS_RANGE).replace("{0}", str).replace("{1}", str2);
    }
}
