package defpackage;

import java.io.Serializable;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: bakh  reason: default package */
/* loaded from: classes2.dex */
public final class bakh extends bahv implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final bahx b;

    private bakh(bahx bahxVar) {
        this.b = bahxVar;
    }

    public static synchronized bakh j(bahx bahxVar) {
        bakh bakhVar;
        synchronized (bakh.class) {
            HashMap hashMap = a;
            if (hashMap == null) {
                a = new HashMap(7);
                bakhVar = null;
            } else {
                bakhVar = (bakh) hashMap.get(bahxVar);
            }
            if (bakhVar == null) {
                bakh bakhVar2 = new bakh(bahxVar);
                a.put(bahxVar, bakhVar2);
                return bakhVar2;
            }
            return bakhVar;
        }
    }

    private final UnsupportedOperationException k() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append(valueOf);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }

    private Object readResolve() {
        return j(this.b);
    }

    @Override // defpackage.bahv
    public final int a(long j, long j2) {
        throw k();
    }

    @Override // defpackage.bahv
    public final long b(long j, int i) {
        throw k();
    }

    @Override // defpackage.bahv
    public final long c(long j, long j2) {
        throw k();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bahv bahvVar = (bahv) obj;
        return 0;
    }

    @Override // defpackage.bahv
    public final long d(long j, long j2) {
        throw k();
    }

    @Override // defpackage.bahv
    public final long e() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bakh)) {
            return false;
        }
        bakh bakhVar = (bakh) obj;
        bakhVar.i();
        return bakhVar.i().equals(i());
    }

    @Override // defpackage.bahv
    public final bahx f() {
        return this.b;
    }

    @Override // defpackage.bahv
    public final boolean g() {
        return true;
    }

    @Override // defpackage.bahv
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return i().hashCode();
    }

    public final String i() {
        return this.b.m;
    }

    public final String toString() {
        String i = i();
        StringBuilder sb = new StringBuilder(i.length() + 26);
        sb.append("UnsupportedDurationField[");
        sb.append(i);
        sb.append(']');
        return sb.toString();
    }
}
