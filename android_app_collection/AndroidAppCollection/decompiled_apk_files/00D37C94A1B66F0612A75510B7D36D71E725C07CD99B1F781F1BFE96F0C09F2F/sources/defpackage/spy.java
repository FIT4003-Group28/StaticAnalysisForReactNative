package defpackage;

import android.util.LruCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: spy  reason: default package */
/* loaded from: classes4.dex */
public final class spy implements spx {
    public static final int a = ao.g(aono.class.getName());
    public static final Map b;
    public static final sqv c;
    public final LruCache d = new sqc();
    public final LruCache e = new LruCache(100);
    public final squ f;

    static {
        amum amumVar = new amum();
        amumVar.f(0, "WIRETYPE_VARINT");
        amumVar.f(1, "WIRETYPE_FIXED64");
        amumVar.f(2, "WIRETYPE_LENGTH_DELIMITED");
        amumVar.f(3, "WIRETYPE_START_GROUP");
        amumVar.f(4, "WIRETYPE_END_GROUP");
        amumVar.f(5, "WIRETYPE_FIXED32");
        amumVar.b();
        b = new HashMap();
        c = new sqv();
    }

    public spy(squ squVar) {
        this.f = squVar;
    }

    public static boolean a(List list) {
        return !list.isEmpty();
    }

    public static boolean b(int i, int i2) {
        return i == a && i2 == 2;
    }

    public static boolean c(spt sptVar, List list, srb srbVar, ampq ampqVar) {
        sqh sqrVar;
        aosz aoszVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aotd aotdVar = (aotd) it.next();
            aotc f = ao.f(aotdVar);
            if (f.b != 1) {
                sqrVar = new sqr(sqj.a, f, sptVar);
            } else {
                sqj sqjVar = sqj.a;
                if (f.b == 1) {
                    aoszVar = aosz.b(((Integer) f.c).intValue());
                    if (aoszVar == null) {
                        aoszVar = aosz.CB_NONE;
                    }
                } else {
                    aoszVar = aosz.CB_NONE;
                }
                sqrVar = sqjVar.a(aoszVar, sptVar);
            }
            if (!sqrVar.a()) {
                if (!axra.b()) {
                    return false;
                }
                aopa b2 = srbVar.b(3);
                b2.copyOnWrite();
                aotf aotfVar = (aotf) b2.instance;
                aotf aotfVar2 = aotf.a;
                aotfVar.j = aotdVar.bU;
                aotfVar.b |= 128;
                aotc f2 = ao.f(aotdVar);
                b2.copyOnWrite();
                aotf aotfVar3 = (aotf) b2.instance;
                f2.getClass();
                aotfVar3.k = f2;
                aotfVar3.b |= 512;
                if (ampqVar.h()) {
                    b2.T(((Integer) ampqVar.c()).intValue());
                }
                srbVar.a(b2);
                return false;
            }
        }
        return true;
    }

    public static List d(bapx bapxVar) {
        bapy bapyVar = (bapy) Collections.unmodifiableMap(bapxVar.d).get(-2032180703);
        if (bapyVar == null) {
            return amuk.q();
        }
        return new aops(bapyVar.d, bapy.a);
    }

    public static List e(baqb baqbVar) {
        bapy bapyVar = (bapy) Collections.unmodifiableMap(baqbVar.b).get(-2032180703);
        if (bapyVar == null) {
            return amuk.q();
        }
        return new aops(bapyVar.d, bapy.a);
    }
}
