package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bajz  reason: default package */
/* loaded from: classes2.dex */
public final class bajz extends bahv implements Serializable {
    public static final bahv a = new bajz();
    private static final long serialVersionUID = 2656707858124633367L;

    private bajz() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.bahv
    public final int a(long j, long j2) {
        return bajw.a(bajw.d(j, j2));
    }

    @Override // defpackage.bahv
    public final long b(long j, int i) {
        return bajw.b(j, i);
    }

    @Override // defpackage.bahv
    public final long c(long j, long j2) {
        return bajw.b(j, j2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long e = ((bahv) obj).e();
        if (e == 1) {
            return 0;
        }
        return e > 1 ? -1 : 1;
    }

    @Override // defpackage.bahv
    public final long d(long j, long j2) {
        return bajw.d(j, j2);
    }

    @Override // defpackage.bahv
    public final long e() {
        return 1L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bajz) {
            bajz bajzVar = (bajz) obj;
            return true;
        }
        return false;
    }

    @Override // defpackage.bahv
    public final bahx f() {
        return bahx.l;
    }

    @Override // defpackage.bahv
    public final boolean g() {
        return true;
    }

    @Override // defpackage.bahv
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
