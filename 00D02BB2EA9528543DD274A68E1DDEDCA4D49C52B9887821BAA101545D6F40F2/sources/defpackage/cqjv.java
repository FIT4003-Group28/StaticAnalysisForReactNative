package defpackage;

import android.content.Context;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: cqjv  reason: default package */
/* loaded from: classes.dex */
public final class cqjv {
    private static final Class<?>[] a = new Class[0];
    private static final Object[] b = new Object[0];

    private cqjv() {
    }

    public static <T extends cqkp, V> Boolean A(V v, V v2) {
        Object f = cqny.f(v);
        Object f2 = cqny.f(v2);
        if (f != null || f2 != null) {
            Boolean bool = new Boolean(false);
            cqny.e(bool, new cqjm(f, v, f2, v2));
            return bool;
        }
        return Boolean.valueOf(dbsd.a(v, v2));
    }

    public static <T> T a(@dzsi T t, cqkp cqkpVar, Context context) {
        Object f = cqny.f(t);
        return f == null ? t : (T) b(f, cqkpVar, context);
    }

    public static <T> T b(Object obj, cqkp cqkpVar, Context context) {
        boolean z;
        if (obj instanceof cqnx) {
            return (T) ((cqnx) obj).a(cqkpVar, b);
        }
        if (obj instanceof cqjb) {
            if (cqgx.a() == null) {
                cqgx.b(context);
                z = true;
            } else {
                z = false;
            }
            T t = (T) ((cqjb) obj).a(cqkpVar, context);
            if (z) {
                cqgx.c();
            }
            return t;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Can't evaluate property: ");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public static CharSequence c(Integer num) {
        Object f = cqny.f(num);
        if (f != 0) {
            num = f;
        }
        if (num instanceof CharSequence) {
            return (CharSequence) num;
        }
        String str = new String();
        cqny.e(str, new cqjn(num));
        return str;
    }

    public static <V extends cqkp> cqnf<V> d(cqku cqkuVar, cqjb<V, ?> cqjbVar) {
        return e(cqkuVar, cqjbVar, cqfb.d);
    }

    public static <V extends cqkp> cqnf<V> e(cqku cqkuVar, cqjb<V, ?> cqjbVar, cqkv cqkvVar) {
        return new cqnb(cqkuVar, cqjbVar, cqkvVar);
    }

    public static <V extends cqkp> cqnf<V> f(cqku cqkuVar, cqlc<V, ?> cqlcVar) {
        return g(cqkuVar, cqlcVar, cqfb.d);
    }

    public static <V extends cqkp> cqnf<V> g(cqku cqkuVar, cqlc<V, ?> cqlcVar, cqkv cqkvVar) {
        return new cqno(cqkuVar, cqlcVar, cqkvVar);
    }

    public static <V extends cqkp> cqnf<V> h(cqku cqkuVar, @dzsi cqkl cqklVar) {
        return new cqmz(cqkuVar, cqklVar == null ? null : cqny.g(cqklVar), cqfb.d, true);
    }

    public static <V extends cqkp> cqnf<V> i(cqku cqkuVar, @dzsi Object obj, cqkv cqkvVar) {
        Object f = cqny.f(obj);
        if (f == null) {
            f = obj;
        }
        if (f instanceof cqjb) {
            return new cqnb(cqkuVar, (cqjb) f, cqkvVar);
        }
        if (f instanceof cqnx) {
            return new cqnh(cqkuVar, (cqnx) f, cqkvVar);
        }
        return new cqmz(cqkuVar, obj, cqkvVar, cqvl.a(obj));
    }

    public static <V extends cqkp> cqnf<V> j(cqku cqkuVar, @dzsi Object obj) {
        return i(cqkuVar, obj, cqfb.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends cqkp> cqnf<T> k(Boolean bool, cqnf<T> cqnfVar, cqnf<T> cqnfVar2) {
        Object f = cqny.f(bool);
        if (f != 0) {
            bool = f;
        }
        if (bool instanceof Boolean) {
            return bool.booleanValue() ? cqnfVar : cqnfVar2;
        }
        return o(bool, cqnfVar, cqnfVar2);
    }

    public static <T extends cqkp> cqnf<T> l(final cqlc<T, Boolean> cqlcVar, cqnf<T> cqnfVar, cqnf<T> cqnfVar2) {
        return o(new cqjb(cqlcVar) { // from class: cqji
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return (Boolean) this.a.a(cqkpVar);
            }
        }, cqnfVar, cqnfVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends cqkp> cqmn<T> m(Boolean bool, cqmn<T> cqmnVar, cqmn<T> cqmnVar2) {
        Object f = cqny.f(bool);
        if (f != 0) {
            bool = f;
        }
        if (bool instanceof Boolean) {
            return bool.booleanValue() ? cqmnVar : cqmnVar2;
        }
        return p(bool, cqmnVar, cqmnVar2);
    }

    public static <T extends cqkp> cqmn<T> n(final cqlc<T, Boolean> cqlcVar, cqmn<T> cqmnVar, cqmn<T> cqmnVar2) {
        return p(new cqjb(cqlcVar) { // from class: cqjj
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return (Boolean) this.a.a(cqkpVar);
            }
        }, cqmnVar, cqmnVar2);
    }

    public static <T extends cqkp> cqnf<T> o(Object obj, cqnf<T> cqnfVar, cqnf<T> cqnfVar2) {
        return new cqmx(obj, cqnfVar, cqnfVar2);
    }

    public static <T extends cqkp> cqmn<T> p(Object obj, cqmn<T> cqmnVar, cqmn<T> cqmnVar2) {
        cqmp p;
        cqmp<T>[] cqmpVarArr = cqmnVar.a;
        cqmp<T>[] cqmpVarArr2 = cqmnVar2.a;
        int length = cqmpVarArr.length;
        dbsk.b(length == cqmpVarArr2.length, "ifThenElse was called with incompatible thenNode and elseNode: each CompoundViewProperty should have the same number of PropertyNodes.");
        cqmp[] cqmpVarArr3 = (cqmp[]) dclv.a(cqmpVarArr, length);
        for (int i = 0; i < cqmpVarArr.length; i++) {
            cqmp<T> cqmpVar = cqmpVarArr[i];
            cqmp<T> cqmpVar2 = cqmpVarArr2[i];
            if (cqmpVar == null && cqmpVar2 == null) {
                p = null;
            } else if (cqmpVar == cqmp.e && cqmpVar2 == cqmp.e) {
                p = cqmp.e;
            } else if (!(cqmpVar instanceof cqnf) || !(cqmpVar2 instanceof cqnf)) {
                if ((cqmpVar instanceof cqmn) && (cqmpVar2 instanceof cqmn)) {
                    p = p(obj, (cqmn) cqmpVar, (cqmn) cqmpVar2);
                } else {
                    throw new IllegalArgumentException("ifThenElse was called with incompatible thenNode and elseNode: each PropertyNode in thenNode should be compatible with the corresponding PropertyNode in elseNode.");
                }
            } else {
                p = o(obj, (cqnf) cqmpVar, (cqnf) cqmpVar2);
            }
            cqmpVarArr3[i] = p;
        }
        return cqmn.a(cqmpVarArr3);
    }

    public static <T extends cqkp> Boolean q(Boolean... boolArr) {
        int length = boolArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            Object f = cqny.f(boolArr[i]);
            Object obj = f;
            if (f == null) {
                obj = boolArr[i];
            }
            objArr[i] = obj;
            if (Boolean.FALSE.equals(objArr[i])) {
                return Boolean.FALSE;
            }
        }
        Boolean bool = new Boolean(false);
        cqny.e(bool, new cqjo(objArr));
        return bool;
    }

    public static <T extends cqkp> Boolean r(Boolean bool, Boolean bool2) {
        Object f = cqny.f(bool);
        if (f == null) {
            f = bool;
        }
        if (!Boolean.FALSE.equals(f)) {
            Object f2 = cqny.f(bool2);
            if (f2 == null) {
                f2 = bool2;
            }
            if (Boolean.FALSE.equals(f2)) {
                return Boolean.FALSE;
            }
            if (Boolean.TRUE.equals(f)) {
                return bool2;
            }
            if (Boolean.TRUE.equals(f2)) {
                return bool;
            }
            Boolean bool3 = new Boolean(false);
            cqny.e(bool3, new cqjp(f, f2));
            return bool3;
        }
        return Boolean.FALSE;
    }

    public static <T extends cqkp> Boolean s(Boolean... boolArr) {
        int length = boolArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            Object f = cqny.f(boolArr[i]);
            Object obj = f;
            if (f == null) {
                obj = boolArr[i];
            }
            objArr[i] = obj;
            if (Boolean.TRUE.equals(objArr[i])) {
                return Boolean.TRUE;
            }
        }
        Boolean bool = new Boolean(false);
        cqny.e(bool, new cqjq(objArr));
        return bool;
    }

    public static <T extends cqkp> Boolean t(Boolean bool, Boolean bool2) {
        Object f = cqny.f(bool);
        if (f == null) {
            f = bool;
        }
        if (!Boolean.TRUE.equals(f)) {
            Object f2 = cqny.f(bool2);
            if (f2 == null) {
                f2 = bool2;
            }
            if (Boolean.TRUE.equals(f2)) {
                return Boolean.TRUE;
            }
            if (Boolean.FALSE.equals(f)) {
                return bool2;
            }
            if (Boolean.FALSE.equals(f2)) {
                return bool;
            }
            Boolean bool3 = new Boolean(false);
            cqny.e(bool3, new cqjr(f, f2));
            return bool3;
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends cqkp> Boolean u(Boolean bool) {
        Object f = cqny.f(bool);
        if (f != 0) {
            bool = f;
        }
        if (bool instanceof Boolean) {
            return Boolean.valueOf(!bool.booleanValue());
        }
        Boolean bool2 = new Boolean(false);
        cqny.e(bool2, new cqjs(bool));
        return bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V extends cqkp, T> Boolean v(@dzsi T t) {
        Object f = cqny.f(t);
        if (f != 0) {
            t = f;
        }
        if ((f instanceof cqnx) || (f instanceof cqjb)) {
            Boolean bool = new Boolean(false);
            cqny.e(bool, new cqjt(f));
            return bool;
        }
        return Boolean.valueOf(y(t));
    }

    public static <V extends cqkp> cqjb<V, Boolean> w(final cqjb<V, ?> cqjbVar) {
        return new cqjb(cqjbVar) { // from class: cqjk
            private final cqjb a;

            {
                this.a = cqjbVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return cqjv.v(this.a.a(cqkpVar, context));
            }
        };
    }

    public static <V extends cqkp> cqlc<V, Boolean> x(cqlc<V, ?> cqlcVar) {
        return new cqju(cqlcVar);
    }

    public static boolean y(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;
        } else if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        } else {
            if (!(obj instanceof Iterable)) {
                return false;
            }
            return dcft.w((Iterable) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V extends cqkp, T> Integer z(@dzsi T t) {
        Object f = cqny.f(t);
        if (f != 0) {
            t = f;
        }
        if ((f instanceof cqnx) || (f instanceof cqjb)) {
            Integer num = new Integer(0);
            cqny.e(num, new cqjl(f));
            return num;
        }
        return Integer.valueOf(((Collection) t).size());
    }
}
