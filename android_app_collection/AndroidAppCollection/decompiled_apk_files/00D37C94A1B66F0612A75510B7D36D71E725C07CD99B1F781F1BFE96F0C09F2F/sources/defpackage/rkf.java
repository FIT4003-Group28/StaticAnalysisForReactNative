package defpackage;
/* compiled from: PG */
/* renamed from: rkf  reason: default package */
/* loaded from: classes4.dex */
public final class rkf {
    private static final Object b = new Object();
    public final String a;
    private final rke c;
    private final Object d;
    private final Object e = new Object();
    private volatile Object f = null;
    private volatile Object g = null;

    public rkf(String str, Object obj, rke rkeVar) {
        this.a = str;
        this.d = obj;
        this.c = rkeVar;
    }

    public final Object a() {
        return b(null);
    }

    public final Object b(Object obj) {
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (rqt.a == null) {
            return this.d;
        }
        boolean z = rqt.a.a;
        synchronized (b) {
            if (rjm.a()) {
                return this.g == null ? this.d : this.g;
            }
            try {
                for (rkf rkfVar : rkg.a) {
                    if (!rjm.a()) {
                        Object obj2 = null;
                        try {
                            rke rkeVar = rkfVar.c;
                            if (rkeVar != null) {
                                obj2 = rkeVar.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (b) {
                            rkfVar.g = obj2;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            rke rkeVar2 = this.c;
            if (rkeVar2 != null) {
                try {
                    return rkeVar2.a();
                } catch (IllegalStateException unused3) {
                    boolean z2 = rqt.a.a;
                    return this.d;
                } catch (SecurityException unused4) {
                    boolean z3 = rqt.a.a;
                    return this.d;
                }
            }
            boolean z4 = rqt.a.a;
            return this.d;
        }
    }
}
