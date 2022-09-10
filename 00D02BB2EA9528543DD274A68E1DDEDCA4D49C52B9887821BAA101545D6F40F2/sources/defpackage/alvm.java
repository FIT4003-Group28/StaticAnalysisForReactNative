package defpackage;

import java.util.Comparator;
import java.util.List;
/* compiled from: PG */
/* renamed from: alvm  reason: default package */
/* loaded from: classes.dex */
public final class alvm {
    public static final Comparator<dmma> b = alvl.a;
    public final dzjs<List<dmma>> a;

    public alvm(dmme dmmeVar) {
        if (dmmeVar.a.size() != dmmeVar.b.size()) {
            dmmeVar.a.size();
            dmmeVar.b.size();
        }
        int min = Math.min(dmmeVar.a.size(), dmmeVar.b.size());
        this.a = new dzjs<>(min);
        for (int i = 0; i < min; i++) {
            int f = dmmeVar.a.f(i);
            int f2 = dmmeVar.b.f(i);
            if (f2 < 0 || f2 >= dmmeVar.c.size()) {
                dmmeVar.c.size();
            } else {
                this.a.a(f, dmmeVar.c.get(f2).a);
            }
        }
    }

    public static boolean a(List<dmma> list, dmmi dmmiVar) {
        int a = dmmk.a(dmmiVar.b);
        if (a == 0) {
            a = 3;
        }
        int i = a - 1;
        if (i == 1) {
            for (dmmg dmmgVar : dmmiVar.a) {
                if (b(list, dmmgVar)) {
                    return true;
                }
            }
            return false;
        } else if (i != 2 || dmmiVar.a.isEmpty()) {
            return false;
        } else {
            for (dmmg dmmgVar2 : dmmiVar.a) {
                if (!b(list, dmmgVar2)) {
                    return false;
                }
            }
            return true;
        }
    }

    private static boolean b(List<dmma> list, dmmg dmmgVar) {
        int a = dmmk.a(dmmgVar.b);
        if (a == 0) {
            a = 2;
        }
        int i = a - 1;
        if (i == 1) {
            dsrj<dmma> dsrjVar = dmmgVar.a;
            dcgg t = dcgh.t(list.iterator());
            dcgg t2 = dcgh.t(dsrjVar.iterator());
            while (t.hasNext() && t2.hasNext()) {
                int compare = b.compare((dmma) t.a(), (dmma) t2.a());
                if (compare == 0) {
                    return true;
                }
                if (compare < 0) {
                    t.next();
                } else {
                    t2.next();
                }
            }
            return false;
        } else if (i != 2) {
            return false;
        } else {
            dsrj<dmma> dsrjVar2 = dmmgVar.a;
            if (!list.isEmpty() && !dsrjVar2.isEmpty()) {
                dcgg t3 = dcgh.t(list.iterator());
                dcgg t4 = dcgh.t(dsrjVar2.iterator());
                while (t3.hasNext() && t4.hasNext()) {
                    int compare2 = b.compare((dmma) t3.a(), (dmma) t4.a());
                    if (compare2 != 0) {
                        if (compare2 >= 0) {
                            break;
                        }
                        t3.next();
                    } else {
                        t3.next();
                        t4.next();
                    }
                }
                if (!t4.hasNext()) {
                    return true;
                }
            }
            return false;
        }
    }
}
