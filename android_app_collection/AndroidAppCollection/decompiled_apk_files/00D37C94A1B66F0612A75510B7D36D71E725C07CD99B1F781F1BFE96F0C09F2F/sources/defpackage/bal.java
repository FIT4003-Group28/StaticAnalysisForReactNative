package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bal  reason: default package */
/* loaded from: classes2.dex */
final class bal extends ban {
    public long a;
    public long[] b;
    public long[] c;

    public bal() {
        super(new azd());
        this.a = -9223372036854775807L;
        this.b = new long[0];
        this.c = new long[0];
    }

    private static Double d(pwu pwuVar) {
        return Double.valueOf(Double.longBitsToDouble(pwuVar.o()));
    }

    private static String f(pwu pwuVar) {
        int m = pwuVar.m();
        int i = pwuVar.b;
        pwuVar.H(m);
        return new String(pwuVar.a, i, m);
    }

    private static HashMap g(pwu pwuVar) {
        int l = pwuVar.l();
        HashMap hashMap = new HashMap(l);
        for (int i = 0; i < l; i++) {
            String f = f(pwuVar);
            Object e = e(pwuVar, pwuVar.i());
            if (e != null) {
                hashMap.put(f, e);
            }
        }
        return hashMap;
    }

    @Override // defpackage.ban
    protected final boolean a(pwu pwuVar) {
        return true;
    }

    @Override // defpackage.ban
    protected final boolean b(pwu pwuVar, long j) {
        if (pwuVar.i() == 2 && "onMetaData".equals(f(pwuVar)) && pwuVar.i() == 8) {
            HashMap g = g(pwuVar);
            Object obj = g.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.a = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = g.get("keyframes");
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

    private static Object e(pwu pwuVar, int i) {
        if (i != 0) {
            boolean z = false;
            if (i == 1) {
                if (pwuVar.i() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 8) {
                        return g(pwuVar);
                    }
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) d(pwuVar).doubleValue());
                        pwuVar.H(2);
                        return date;
                    }
                    int l = pwuVar.l();
                    ArrayList arrayList = new ArrayList(l);
                    for (int i2 = 0; i2 < l; i2++) {
                        Object e = e(pwuVar, pwuVar.i());
                        if (e != null) {
                            arrayList.add(e);
                        }
                    }
                    return arrayList;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String f = f(pwuVar);
                    int i3 = pwuVar.i();
                    if (i3 == 9) {
                        return hashMap;
                    }
                    Object e2 = e(pwuVar, i3);
                    if (e2 != null) {
                        hashMap.put(f, e2);
                    }
                }
            } else {
                return f(pwuVar);
            }
        } else {
            return d(pwuVar);
        }
    }
}
