package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dqp  reason: default package */
/* loaded from: classes3.dex */
public final class dqp implements dqz {
    private final boolean a;

    public dqp(Boolean bool) {
        if (bool == null) {
            this.a = false;
        } else {
            this.a = bool.booleanValue();
        }
    }

    @Override // defpackage.dqz
    public final dqz d() {
        return new dqp(Boolean.valueOf(this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqp) && this.a == ((dqp) obj).a;
    }

    @Override // defpackage.dqz
    public final Boolean g() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.dqz
    public final Double h() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    @Override // defpackage.dqz
    public final String i() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.dqz
    public final dqz kr(String str, dpu dpuVar, List list) {
        if (!"toString".equals(str)) {
            throw new IllegalArgumentException(String.format("%s.%s is not a function.", i(), str));
        }
        return new drc(i());
    }

    @Override // defpackage.dqz
    public final Iterator l() {
        return null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
