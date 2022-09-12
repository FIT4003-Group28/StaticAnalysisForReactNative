package defpackage;

import java.io.Serializable;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: eatl  reason: default package */
/* loaded from: classes6.dex */
public final class eatl extends eaox implements Serializable {
    private static HashMap<eaoz, eatl> a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final eaoz b;

    private eatl(eaoz eaozVar) {
        this.b = eaozVar;
    }

    public static synchronized eatl j(eaoz eaozVar) {
        eatl eatlVar;
        synchronized (eatl.class) {
            HashMap<eaoz, eatl> hashMap = a;
            if (hashMap == null) {
                a = new HashMap<>(7);
                eatlVar = null;
            } else {
                eatlVar = hashMap.get(eaozVar);
            }
            if (eatlVar == null) {
                eatl eatlVar2 = new eatl(eaozVar);
                a.put(eaozVar, eatlVar2);
                return eatlVar2;
            }
            return eatlVar;
        }
    }

    private final UnsupportedOperationException l() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append(valueOf);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }

    private Object readResolve() {
        return j(this.b);
    }

    @Override // defpackage.eaox
    public final eaoz a() {
        return this.b;
    }

    @Override // defpackage.eaox
    public final boolean b() {
        return false;
    }

    @Override // defpackage.eaox
    public final boolean c() {
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(eaox eaoxVar) {
        return 0;
    }

    @Override // defpackage.eaox
    public final long d() {
        return 0L;
    }

    @Override // defpackage.eaox
    public final long e(long j, int i) {
        throw l();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eatl)) {
            return false;
        }
        eatl eatlVar = (eatl) obj;
        eatlVar.k();
        return eatlVar.k().equals(k());
    }

    @Override // defpackage.eaox
    public final long f(long j, long j2) {
        throw l();
    }

    @Override // defpackage.eaox
    public final int h(long j, long j2) {
        throw l();
    }

    public final int hashCode() {
        return k().hashCode();
    }

    @Override // defpackage.eaox
    public final long i(long j, long j2) {
        throw l();
    }

    public final String k() {
        return this.b.m;
    }

    public final String toString() {
        String k = k();
        StringBuilder sb = new StringBuilder(k.length() + 26);
        sb.append("UnsupportedDurationField[");
        sb.append(k);
        sb.append(']');
        return sb.toString();
    }
}
