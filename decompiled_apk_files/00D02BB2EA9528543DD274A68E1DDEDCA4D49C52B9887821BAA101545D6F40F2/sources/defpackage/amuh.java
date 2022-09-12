package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: amuh  reason: default package */
/* loaded from: classes2.dex */
public abstract class amuh implements Iterable<amub> {
    private static final dcqe a = dcqe.c("amuh");
    public static final amuh b = new amsn(dcdc.e(), -1, null);

    public static amuh d(amub amubVar) {
        return f(0, dcdc.f(amubVar));
    }

    public static amuh e(int i, amub... amubVarArr) {
        return f(i, Arrays.asList(amubVarArr));
    }

    public static amuh f(int i, List<amub> list) {
        if (list == null || list.isEmpty()) {
            return b;
        }
        if (i >= list.size() || i < 0) {
            bvoo.h("selectedIndex %d not in loaded RouteList, which has size %d.", Integer.valueOf(i), Integer.valueOf(list.size()));
            return b;
        }
        return new amsn(dcdc.r(list), i, list.get(0).h);
    }

    public static amuh g(amte amteVar, Context context, int i) {
        dbsk.s(context);
        dbsk.s(amteVar);
        List<amub> a2 = amteVar.a(context);
        if (a2.isEmpty()) {
            return b;
        }
        if (i >= a2.size()) {
            bvoo.h("selectedIndex %d not in loaded RouteList, which has size %d.", Integer.valueOf(i), Integer.valueOf(a2.size()));
            return b;
        }
        return new amsn(dcdc.r(a2), i, amteVar.d());
    }

    public abstract dcdc<amub> a();

    public abstract int b();

    @dzsi
    public abstract dqvj c();

    public final boolean h(amuh amuhVar) {
        return dchl.m(a(), amuhVar.a());
    }

    public final amuh i(int i) {
        return new amsn(a(), i, c());
    }

    @Override // java.lang.Iterable
    public final Iterator<amub> iterator() {
        return a().listIterator();
    }

    public final boolean j() {
        return !a().isEmpty();
    }

    public final amub k() {
        return l(b());
    }

    public final amub l(int i) {
        return a().get(i);
    }

    public final int m() {
        return a().size();
    }

    public final boolean n() {
        return a().isEmpty();
    }
}
