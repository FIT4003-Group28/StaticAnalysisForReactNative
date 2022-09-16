package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aiix  reason: default package */
/* loaded from: classes.dex */
public final class aiix {
    public final aadd a;
    public final axxl b;
    public final axxj c;
    public final aacz d;
    private final axxb e;

    public aiix(aacz aaczVar, aadd aaddVar, axxl axxlVar, axxj axxjVar, axxb axxbVar) {
        this.d = aaczVar;
        this.a = aaddVar;
        this.b = axxlVar;
        this.c = axxjVar;
        this.e = axxbVar;
    }

    public static boolean A(aadd aaddVar) {
        attv attvVar = d(aaddVar).d;
        if (attvVar == null) {
            attvVar = attv.a;
        }
        return attvVar.t;
    }

    public static boolean B(aadd aaddVar) {
        return e(aaddVar).q;
    }

    public static atzt D(aacz aaczVar) {
        if (aaczVar == null || aaczVar.b() == null) {
            return null;
        }
        atzt atztVar = aaczVar.b().v;
        return atztVar == null ? atzt.a : atztVar;
    }

    public static boolean E(aacz aaczVar) {
        atzt D = D(aaczVar);
        return D != null && D.n;
    }

    public static boolean F(aacz aaczVar) {
        atzt D = D(aaczVar);
        return D != null && D.o;
    }

    public static boolean G(aacz aaczVar) {
        if (aaczVar == null || aaczVar.b() == null) {
            return false;
        }
        atzt atztVar = aaczVar.b().v;
        if (atztVar == null) {
            atztVar = atzt.a;
        }
        return atztVar.b;
    }

    public static boolean H(aacz aaczVar) {
        if (aaczVar == null || aaczVar.b() == null) {
            return false;
        }
        atzt atztVar = aaczVar.b().v;
        if (atztVar == null) {
            atztVar = atzt.a;
        }
        return atztVar.d;
    }

    public static boolean I(aacz aaczVar) {
        if (aaczVar == null || aaczVar.b() == null) {
            return false;
        }
        atzt atztVar = aaczVar.b().v;
        if (atztVar == null) {
            atztVar = atzt.a;
        }
        return atztVar.c;
    }

    public static boolean J(aacz aaczVar) {
        atzt D = D(aaczVar);
        return D != null && D.h;
    }

    private static apgh K(aadd aaddVar) {
        apgh apghVar = e(aaddVar).d;
        return apghVar == null ? apgh.a : apghVar;
    }

    public static int a(aadd aaddVar) {
        auaf e = e(aaddVar);
        if (e == null) {
            return 0;
        }
        aubv aubvVar = e.r;
        if (aubvVar == null) {
            aubvVar = aubv.a;
        }
        return aubvVar.b;
    }

    public static long b(aadd aaddVar, long j) {
        int i = e(aaddVar).e;
        return i == 0 ? j : i;
    }

    public static long c(aadd aaddVar) {
        int i = K(aaddVar).b;
        if (i <= 0) {
            return -1L;
        }
        return i;
    }

    public static atdy d(aadd aaddVar) {
        if (aaddVar == null || aaddVar.a() == null) {
            return atdy.a;
        }
        atdy atdyVar = aaddVar.a().i;
        return atdyVar == null ? atdy.a : atdyVar;
    }

    public static auaf e(aadd aaddVar) {
        if (aaddVar == null || aaddVar.a() == null) {
            return auaf.a;
        }
        auaf auafVar = aaddVar.a().j;
        return auafVar == null ? auaf.a : auafVar;
    }

    public static boolean g(aadd aaddVar) {
        return e(aaddVar).Q;
    }

    public static boolean h(aadd aaddVar) {
        auaf e = e(aaddVar);
        return e != null && e.F;
    }

    public static boolean j(aadd aaddVar) {
        atdy d = d(aaddVar);
        if (d != null) {
            atdz atdzVar = d.k;
            if (atdzVar == null) {
                atdzVar = atdz.a;
            }
            return atdzVar.c;
        }
        return false;
    }

    public static boolean k(aadd aaddVar) {
        auaf e = e(aaddVar);
        return e != null && e.A;
    }

    public static boolean n(aadd aaddVar) {
        auaf e = e(aaddVar);
        return e != null && e.w;
    }

    public static boolean o(aadd aaddVar) {
        auaf e = e(aaddVar);
        return e != null && e.u;
    }

    public static boolean p(aadd aaddVar) {
        auaf e = e(aaddVar);
        return e != null && e.v;
    }

    public static boolean q(aadd aaddVar) {
        auaf e = e(aaddVar);
        return e != null && e.C;
    }

    public static boolean t(aadd aaddVar) {
        return K(aaddVar).b > 0 && K(aaddVar).c;
    }

    public static boolean w(aadd aaddVar) {
        return e(aaddVar).z;
    }

    public static boolean y(aadd aaddVar) {
        return e(aaddVar).m;
    }

    public final boolean C() {
        Boolean bool;
        aqxe aqxeVar = this.e.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45357519L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357519L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357519L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean f() {
        atzt D = D(this.d);
        return D != null && D.r;
    }

    public final boolean i() {
        return e(this.a).K;
    }

    public final boolean l(PlaybackStartDescriptor playbackStartDescriptor) {
        if (!TextUtils.isEmpty(playbackStartDescriptor.l()) && playbackStartDescriptor.w()) {
            return e(this.a).U;
        }
        return false;
    }

    public final boolean m() {
        return e(this.a).W;
    }

    public final boolean r() {
        return e(this.a).O;
    }

    public final boolean s() {
        return e(this.a).V;
    }

    public final boolean u() {
        atzt D = D(this.d);
        return D != null && D.s;
    }

    public final boolean v() {
        atzt D = D(this.d);
        return D != null && D.q;
    }

    public final boolean x() {
        atzt D = D(this.d);
        return D != null && D.t;
    }

    public final boolean z() {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ayqi.c((AtomicReference) this.c.a.a.V(axxd.l).B().as(new ldk(atomicBoolean, 9)));
        return atomicBoolean.get();
    }
}
