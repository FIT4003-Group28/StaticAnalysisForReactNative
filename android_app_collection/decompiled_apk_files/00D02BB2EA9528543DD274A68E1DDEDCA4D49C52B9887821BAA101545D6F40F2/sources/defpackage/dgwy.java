package defpackage;

import com.google.gson.internal.bind.TypeAdapters$35;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* compiled from: PG */
/* renamed from: dgwy  reason: default package */
/* loaded from: classes6.dex */
public final class dgwy {
    public static final dgtl<BigInteger> A;
    public static final dgtm B;
    public static final dgtl<StringBuilder> C;
    public static final dgtm D;
    public static final dgtl<StringBuffer> E;
    public static final dgtm F;
    public static final dgtl<URL> G;
    public static final dgtm H;
    public static final dgtl<URI> I;
    public static final dgtm J;
    public static final dgtl<InetAddress> K;
    public static final dgtm L;
    public static final dgtl<UUID> M;
    public static final dgtm N;
    public static final dgtl<Currency> O;
    public static final dgtm P;
    public static final dgtm Q;
    public static final dgtl<Calendar> R;
    public static final dgtm S;
    public static final dgtl<Locale> T;
    public static final dgtm U;
    public static final dgtl<dgtc> V;
    public static final dgtm W;
    public static final dgtm X;
    public static final dgtl<Class> a;
    public static final dgtm b;
    public static final dgtl<BitSet> c;
    public static final dgtm d;
    public static final dgtl<Boolean> e;
    public static final dgtl<Boolean> f;
    public static final dgtm g;
    public static final dgtl<Number> h;
    public static final dgtm i;
    public static final dgtl<Number> j;
    public static final dgtm k;
    public static final dgtl<Number> l;
    public static final dgtm m;
    public static final dgtl<AtomicInteger> n;
    public static final dgtm o;
    public static final dgtl<AtomicBoolean> p;
    public static final dgtm q;
    public static final dgtl<AtomicIntegerArray> r;
    public static final dgtm s;
    public static final dgtl<Number> t;
    public static final dgtl<Number> u;
    public static final dgtm v;
    public static final dgtl<Character> w;
    public static final dgtm x;
    public static final dgtl<String> y;
    public static final dgtl<BigDecimal> z;

    static {
        dgtl<Class> c2 = new dgwd().c();
        a = c2;
        b = b(Class.class, c2);
        dgtl<BitSet> c3 = new dgwo().c();
        c = c3;
        d = b(BitSet.class, c3);
        dgwq dgwqVar = new dgwq();
        e = dgwqVar;
        f = new dgwr();
        g = c(Boolean.TYPE, Boolean.class, dgwqVar);
        dgws dgwsVar = new dgws();
        h = dgwsVar;
        i = c(Byte.TYPE, Byte.class, dgwsVar);
        dgwt dgwtVar = new dgwt();
        j = dgwtVar;
        k = c(Short.TYPE, Short.class, dgwtVar);
        dgwu dgwuVar = new dgwu();
        l = dgwuVar;
        m = c(Integer.TYPE, Integer.class, dgwuVar);
        dgtl<AtomicInteger> c4 = new dgwv().c();
        n = c4;
        o = b(AtomicInteger.class, c4);
        dgtl<AtomicBoolean> c5 = new dgww().c();
        p = c5;
        q = b(AtomicBoolean.class, c5);
        dgtl<AtomicIntegerArray> c6 = new dgvv().c();
        r = c6;
        s = b(AtomicIntegerArray.class, c6);
        t = new dgvw();
        dgvx dgvxVar = new dgvx();
        u = dgvxVar;
        v = b(Number.class, dgvxVar);
        dgvy dgvyVar = new dgvy();
        w = dgvyVar;
        x = c(Character.TYPE, Character.class, dgvyVar);
        dgvz dgvzVar = new dgvz();
        y = dgvzVar;
        z = new dgwa();
        A = new dgwb();
        B = b(String.class, dgvzVar);
        dgwc dgwcVar = new dgwc();
        C = dgwcVar;
        D = b(StringBuilder.class, dgwcVar);
        dgwe dgweVar = new dgwe();
        E = dgweVar;
        F = b(StringBuffer.class, dgweVar);
        dgwf dgwfVar = new dgwf();
        G = dgwfVar;
        H = b(URL.class, dgwfVar);
        dgwg dgwgVar = new dgwg();
        I = dgwgVar;
        J = b(URI.class, dgwgVar);
        dgwh dgwhVar = new dgwh();
        K = dgwhVar;
        L = d(InetAddress.class, dgwhVar);
        dgwi dgwiVar = new dgwi();
        M = dgwiVar;
        N = b(UUID.class, dgwiVar);
        dgtl<Currency> c7 = new dgwj().c();
        O = c7;
        P = b(Currency.class, c7);
        Q = new dgtm() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            @Override // defpackage.dgtm
            public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
                if (dgxdVar.a != Timestamp.class) {
                    return null;
                }
                return new dgwk(dgsxVar.d(Date.class));
            }
        };
        final dgwl dgwlVar = new dgwl();
        R = dgwlVar;
        S = new dgtm() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // defpackage.dgtm
            public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
                Class<? super T> cls = dgxdVar.a;
                if (cls == r1 || cls == r2) {
                    return dgwlVar;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + r1.getName() + "+" + r2.getName() + ",adapter=" + dgwlVar + "]";
            }
        };
        dgwm dgwmVar = new dgwm();
        T = dgwmVar;
        U = b(Locale.class, dgwmVar);
        dgwn dgwnVar = new dgwn();
        V = dgwnVar;
        W = d(dgtc.class, dgwnVar);
        X = new dgtm() { // from class: com.google.gson.internal.bind.TypeAdapters$30
            @Override // defpackage.dgtm
            public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
                Class<? super T> cls = dgxdVar.a;
                if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                    return null;
                }
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new dgwx(cls);
            }
        };
    }

    public static <TT> dgtm a(final dgxd<TT> dgxdVar, final dgtl<TT> dgtlVar) {
        return new dgtm() { // from class: com.google.gson.internal.bind.TypeAdapters$31
            @Override // defpackage.dgtm
            public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar2) {
                if (dgxdVar2.equals(dgxd.this)) {
                    return dgtlVar;
                }
                return null;
            }
        };
    }

    public static <TT> dgtm b(final Class<TT> cls, final dgtl<TT> dgtlVar) {
        return new dgtm() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // defpackage.dgtm
            public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
                if (dgxdVar.a == cls) {
                    return dgtlVar;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + dgtlVar + "]";
            }
        };
    }

    public static <TT> dgtm c(final Class<TT> cls, final Class<TT> cls2, final dgtl<? super TT> dgtlVar) {
        return new dgtm() { // from class: com.google.gson.internal.bind.TypeAdapters$33
            @Override // defpackage.dgtm
            public final <T> dgtl<T> a(dgsx dgsxVar, dgxd<T> dgxdVar) {
                Class<? super T> cls3 = dgxdVar.a;
                if (cls3 == cls || cls3 == cls2) {
                    return dgtlVar;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + dgtlVar + "]";
            }
        };
    }

    public static <T1> dgtm d(Class<T1> cls, dgtl<T1> dgtlVar) {
        return new TypeAdapters$35(cls, dgtlVar);
    }
}
