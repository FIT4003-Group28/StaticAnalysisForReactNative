package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: qtp  reason: default package */
/* loaded from: classes4.dex */
public final class qtp {
    private final int a;
    private final qso b;
    private final qsm c;
    private final String d;

    public qtp(qso qsoVar, qsm qsmVar, String str) {
        this.b = qsoVar;
        this.c = qsmVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{qsoVar, qsmVar, str});
    }

    public final String a() {
        return this.b.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qtp)) {
            return false;
        }
        qtp qtpVar = (qtp) obj;
        return tnk.j(this.b, qtpVar.b) && tnk.j(this.c, qtpVar.c) && tnk.j(this.d, qtpVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
