package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bakg  reason: default package */
/* loaded from: classes2.dex */
public final class bakg extends bahn implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final bahp b;
    private final bahv c;

    private bakg(bahp bahpVar, bahv bahvVar) {
        if (bahvVar != null) {
            this.b = bahpVar;
            this.c = bahvVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    private Object readResolve() {
        return u(this.b, this.c);
    }

    public static synchronized bakg u(bahp bahpVar, bahv bahvVar) {
        synchronized (bakg.class) {
            HashMap hashMap = a;
            bakg bakgVar = null;
            if (hashMap == null) {
                a = new HashMap(7);
            } else {
                bakg bakgVar2 = (bakg) hashMap.get(bahpVar);
                if (bakgVar2 == null || bakgVar2.c == bahvVar) {
                    bakgVar = bakgVar2;
                }
            }
            if (bakgVar == null) {
                bakg bakgVar3 = new bakg(bahpVar, bahvVar);
                a.put(bahpVar, bakgVar3);
                return bakgVar3;
            }
            return bakgVar;
        }
    }

    private final UnsupportedOperationException v() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append(valueOf);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }

    @Override // defpackage.bahn
    public final int a(long j) {
        throw v();
    }

    @Override // defpackage.bahn
    public final int b(Locale locale) {
        throw v();
    }

    @Override // defpackage.bahn
    public final int c() {
        throw v();
    }

    @Override // defpackage.bahn
    public final int d() {
        throw v();
    }

    @Override // defpackage.bahn
    public final long e(long j, int i) {
        return this.c.b(j, i);
    }

    @Override // defpackage.bahn
    public final long f(long j) {
        throw v();
    }

    @Override // defpackage.bahn
    public final long g(long j) {
        throw v();
    }

    @Override // defpackage.bahn
    public final long h(long j, int i) {
        throw v();
    }

    @Override // defpackage.bahn
    public final long i(long j, String str, Locale locale) {
        throw v();
    }

    @Override // defpackage.bahn
    public final String j(int i, Locale locale) {
        throw v();
    }

    @Override // defpackage.bahn
    public final String k(long j, Locale locale) {
        throw v();
    }

    @Override // defpackage.bahn
    public final String l(int i, Locale locale) {
        throw v();
    }

    @Override // defpackage.bahn
    public final String m(long j, Locale locale) {
        throw v();
    }

    @Override // defpackage.bahn
    public final String n() {
        return this.b.z;
    }

    @Override // defpackage.bahn
    public final bahp o() {
        return this.b;
    }

    @Override // defpackage.bahn
    public final bahv p() {
        return this.c;
    }

    @Override // defpackage.bahn
    public final bahv q() {
        return null;
    }

    @Override // defpackage.bahn
    public final bahv r() {
        return null;
    }

    @Override // defpackage.bahn
    public final boolean s(long j) {
        throw v();
    }

    @Override // defpackage.bahn
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }
}
