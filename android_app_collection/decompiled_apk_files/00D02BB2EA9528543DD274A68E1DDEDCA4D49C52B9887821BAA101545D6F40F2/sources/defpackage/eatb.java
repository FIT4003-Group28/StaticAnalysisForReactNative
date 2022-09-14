package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eatb  reason: default package */
/* loaded from: classes6.dex */
public final class eatb extends eaox implements Serializable {
    public static final eaox a = new eatb();
    private static final long serialVersionUID = 2656707858124633367L;

    private eatb() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.eaox
    public final eaoz a() {
        return eaoz.l;
    }

    @Override // defpackage.eaox
    public final boolean b() {
        return true;
    }

    @Override // defpackage.eaox
    public final boolean c() {
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(eaox eaoxVar) {
        long d = eaoxVar.d();
        if (d == 1) {
            return 0;
        }
        return d > 1 ? -1 : 1;
    }

    @Override // defpackage.eaox
    public final long d() {
        return 1L;
    }

    @Override // defpackage.eaox
    public final long e(long j, int i) {
        return easy.a(j, i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eatb) {
            eatb eatbVar = (eatb) obj;
            return true;
        }
        return false;
    }

    @Override // defpackage.eaox
    public final long f(long j, long j2) {
        return easy.a(j, j2);
    }

    @Override // defpackage.eaox
    public final int h(long j, long j2) {
        return easy.d(easy.b(j, j2));
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.eaox
    public final long i(long j, long j2) {
        return easy.b(j, j2);
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
