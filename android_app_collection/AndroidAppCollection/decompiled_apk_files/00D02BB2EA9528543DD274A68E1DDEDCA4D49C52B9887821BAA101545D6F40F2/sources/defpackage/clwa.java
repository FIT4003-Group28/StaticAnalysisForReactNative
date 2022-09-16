package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clwa  reason: default package */
/* loaded from: classes5.dex */
public final class clwa extends clwc {
    public long a;
    public long[] b;
    public long[] c;

    public clwa() {
        super(new clum());
        this.a = -9223372036854775807L;
        this.b = new long[0];
        this.c = new long[0];
    }

    private static Double d(cmnk cmnkVar) {
        return Double.valueOf(Double.longBitsToDouble(cmnkVar.t()));
    }

    private static String e(cmnk cmnkVar) {
        int m = cmnkVar.m();
        int i = cmnkVar.b;
        cmnkVar.h(m);
        return new String(cmnkVar.a, i, m);
    }

    private static HashMap<String, Object> f(cmnk cmnkVar) {
        int v = cmnkVar.v();
        HashMap<String, Object> hashMap = new HashMap<>(v);
        for (int i = 0; i < v; i++) {
            String e = e(cmnkVar);
            Object g = g(cmnkVar, cmnkVar.l());
            if (g != null) {
                hashMap.put(e, g);
            }
        }
        return hashMap;
    }

    @Override // defpackage.clwc
    protected final boolean a(cmnk cmnkVar) {
        return true;
    }

    @Override // defpackage.clwc
    protected final boolean b(cmnk cmnkVar, long j) {
        if (cmnkVar.l() == 2 && "onMetaData".equals(e(cmnkVar)) && cmnkVar.l() == 8) {
            HashMap<String, Object> f = f(cmnkVar);
            Object obj = f.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > dcyn.a) {
                    this.a = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = f.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.b = new long[size];
                    this.c = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.b = new long[0];
                            this.c = new long[0];
                            break;
                        }
                        this.b[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.c[i] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }

    private static Object g(cmnk cmnkVar, int i) {
        if (i != 0) {
            boolean z = false;
            if (i == 1) {
                if (cmnkVar.l() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 8) {
                        return f(cmnkVar);
                    }
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) d(cmnkVar).doubleValue());
                        cmnkVar.h(2);
                        return date;
                    }
                    int v = cmnkVar.v();
                    ArrayList arrayList = new ArrayList(v);
                    for (int i2 = 0; i2 < v; i2++) {
                        Object g = g(cmnkVar, cmnkVar.l());
                        if (g != null) {
                            arrayList.add(g);
                        }
                    }
                    return arrayList;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String e = e(cmnkVar);
                    int l = cmnkVar.l();
                    if (l == 9) {
                        return hashMap;
                    }
                    Object g2 = g(cmnkVar, l);
                    if (g2 != null) {
                        hashMap.put(e, g2);
                    }
                }
            } else {
                return e(cmnkVar);
            }
        } else {
            return d(cmnkVar);
        }
    }
}
