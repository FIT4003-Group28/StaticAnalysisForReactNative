package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcsk  reason: default package */
/* loaded from: classes.dex */
public final class dcsk {
    public static final dcrk a;
    private static final Set<dcqy<?>> b;
    private static final dcrv<dcqx> c;

    static {
        Set<dcqy<?>> singleton = Collections.singleton(dcqj.a);
        b = singleton;
        c = dcry.a(singleton);
        a = new dcsj();
    }

    public static String a(dcrj dcrjVar) {
        return dcrn.a(dcrjVar.j());
    }

    public static String b(dcrj dcrjVar, dcrp dcrpVar) {
        if (e(dcrjVar, b)) {
            dcrv<dcqx> dcrvVar = c;
            StringBuilder sb = new StringBuilder();
            d(dcrjVar, dcrpVar, dcrvVar, sb);
            return sb.toString();
        }
        return a(dcrjVar);
    }

    @Deprecated
    public static void c(dcrj dcrjVar, dcrp dcrpVar, dctj dctjVar) {
        dcrjVar.d();
        dctjVar.setMessage(b(dcrjVar, dcrpVar));
        dctjVar.setThrown((Throwable) dcrjVar.l().e(dcqj.a));
    }

    public static void d(dcrj dcrjVar, dcrp dcrpVar, dcrv<dcqx> dcrvVar, StringBuilder sb) {
        dcsc dcsbVar;
        dcsc dcscVar;
        if (dcrjVar.h() != null) {
            dcre dcreVar = new dcre(dcrjVar.h(), dcrjVar.i(), sb);
            dcreVar.c().b(dcreVar);
            int i = dcreVar.d;
            if (((i + 1) & i) != 0 || (dcreVar.e > 31 && i != -1)) {
                throw new dcug(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(i ^ (-1)))));
            }
            dcreVar.c().c(dcreVar.b, dcreVar.d(), dcreVar.c, dcreVar.d().length());
            StringBuilder sb2 = dcreVar.b;
            if (dcrjVar.i().length > dcreVar.e + 1) {
                sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
            }
        } else {
            sb.append(dcrn.a(dcrjVar.j()));
        }
        dcrp l = dcrjVar.l();
        int a2 = l.a();
        if (a2 == 0) {
            dcscVar = dcsc.a;
        } else {
            if (a2 > 28) {
                dcsbVar = new dcsb(dcrpVar, l);
            } else {
                dcsbVar = new dcsa(dcrpVar, l);
            }
            dcscVar = dcsbVar;
        }
        dcri dcriVar = new dcri(sb);
        dcscVar.a(dcrvVar, dcriVar);
        if (dcriVar.c) {
            dcriVar.b.append(dcriVar.a);
        }
    }

    public static boolean e(dcrj dcrjVar, Set<dcqy<?>> set) {
        if (dcrjVar.h() == null) {
            dcrp l = dcrjVar.l();
            int a2 = l.a();
            boolean z = a2 <= set.size();
            int i = 0;
            while (z) {
                if (i >= a2) {
                    return false;
                }
                z = set.contains(l.b(i));
                i++;
            }
        }
        return true;
    }
}
