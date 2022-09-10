package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: dyjb  reason: default package */
/* loaded from: classes6.dex */
public final class dyjb {
    public static final List<dyjb> a;
    public static final dyjb b;
    public static final dyjb c;
    public static final dyjb d;
    public static final dyjb e;
    public static final dyjb f;
    public static final dyjb g;
    public static final dyjb h;
    public static final dyjb i;
    public static final dyjb j;
    public static final dyjb k;
    public static final dyjb l;
    public static final dyjb m;
    static final dyhs<dyjb> n;
    static final dyhs<String> o;
    private static final dyhv<String> s;
    public final dyiy p;
    public final String q;
    public final Throwable r;

    static {
        dyiy[] values;
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (dyiy dyiyVar : dyiy.values()) {
            dyjb dyjbVar = (dyjb) treeMap.put(Integer.valueOf(dyiyVar.r), new dyjb(dyiyVar, null, null));
            if (dyjbVar != null) {
                String name = dyjbVar.p.name();
                String name2 = dyiyVar.name();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 34 + String.valueOf(name2).length());
                sb.append("Code value duplication between ");
                sb.append(name);
                sb.append(" & ");
                sb.append(name2);
                throw new IllegalStateException(sb.toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        b = dyiy.OK.b();
        c = dyiy.CANCELLED.b();
        d = dyiy.UNKNOWN.b();
        e = dyiy.INVALID_ARGUMENT.b();
        f = dyiy.DEADLINE_EXCEEDED.b();
        g = dyiy.NOT_FOUND.b();
        dyiy.ALREADY_EXISTS.b();
        h = dyiy.PERMISSION_DENIED.b();
        i = dyiy.UNAUTHENTICATED.b();
        j = dyiy.RESOURCE_EXHAUSTED.b();
        dyiy.FAILED_PRECONDITION.b();
        k = dyiy.ABORTED.b();
        dyiy.OUT_OF_RANGE.b();
        dyiy.UNIMPLEMENTED.b();
        l = dyiy.INTERNAL.b();
        m = dyiy.UNAVAILABLE.b();
        dyiy.DATA_LOSS.b();
        n = dyhs.e("grpc-status", false, new dyiz());
        dyja dyjaVar = new dyja();
        s = dyjaVar;
        o = dyhs.e("grpc-message", false, dyjaVar);
    }

    private dyjb(dyiy dyiyVar, @dzsi String str, @dzsi Throwable th) {
        dbsk.t(dyiyVar, "code");
        this.p = dyiyVar;
        this.q = str;
        this.r = th;
    }

    public static dyjb a(int i2) {
        if (i2 >= 0) {
            List<dyjb> list = a;
            if (i2 <= list.size()) {
                return list.get(i2);
            }
        }
        dyjb dyjbVar = d;
        StringBuilder sb = new StringBuilder(24);
        sb.append("Unknown code ");
        sb.append(i2);
        return dyjbVar.g(sb.toString());
    }

    public static dyjb b(dyiy dyiyVar) {
        return dyiyVar.b();
    }

    public static dyjb c(Throwable th) {
        dbsk.t(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof dyjc)) {
                if (th2 instanceof dyjd) {
                    return ((dyjd) th2).a;
                }
            } else {
                return ((dyjc) th2).a;
            }
        }
        return d.f(th);
    }

    public static dyhw d(Throwable th) {
        while (th != null) {
            if (!(th instanceof dyjc)) {
                if (!(th instanceof dyjd)) {
                    th = th.getCause();
                } else {
                    return ((dyjd) th).b;
                }
            } else {
                dyjc dyjcVar = (dyjc) th;
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(dyjb dyjbVar) {
        if (dyjbVar.q == null) {
            return dyjbVar.p.toString();
        }
        String valueOf = String.valueOf(dyjbVar.p);
        String str = dyjbVar.q;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }

    public final dyjb f(Throwable th) {
        return dbsd.a(this.r, th) ? this : new dyjb(this.p, this.q, th);
    }

    public final dyjb g(String str) {
        return dbsd.a(this.q, str) ? this : new dyjb(this.p, str, this.r);
    }

    public final dyjb h(String str) {
        if (str == null) {
            return this;
        }
        String str2 = this.q;
        if (str2 == null) {
            return new dyjb(this.p, str, this.r);
        }
        dyiy dyiyVar = this.p;
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str.length());
        sb.append(str2);
        sb.append("\n");
        sb.append(str);
        return new dyjb(dyiyVar, sb.toString(), this.r);
    }

    public final boolean i() {
        return dyiy.OK == this.p;
    }

    public final dyjd j() {
        return new dyjd(this);
    }

    public final dyjd k(@dzsi dyhw dyhwVar) {
        return new dyjd(this, dyhwVar);
    }

    public final dyjc l() {
        return new dyjc(this);
    }

    public final String toString() {
        dbsb b2 = dbsc.b(this);
        b2.b("code", this.p.name());
        b2.b("description", this.q);
        Throwable th = this.r;
        String str = th;
        if (th != null) {
            str = dbue.g(th);
        }
        b2.b("cause", str);
        return b2.toString();
    }
}
