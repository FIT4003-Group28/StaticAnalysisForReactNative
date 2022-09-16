package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dqs  reason: default package */
/* loaded from: classes3.dex */
public abstract class dqs implements dqz, dqv {
    public final String d;
    protected final Map e = new HashMap();

    public dqs(String str) {
        this.d = str;
    }

    public abstract dqz a(dpu dpuVar, List list);

    @Override // defpackage.dqz
    public dqz d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqs)) {
            return false;
        }
        dqs dqsVar = (dqs) obj;
        String str = this.d;
        if (str == null) {
            return false;
        }
        return str.equals(dqsVar.d);
    }

    @Override // defpackage.dqv
    public final dqz f(String str) {
        return this.e.containsKey(str) ? (dqz) this.e.get(str) : f;
    }

    @Override // defpackage.dqz
    public final Boolean g() {
        return true;
    }

    @Override // defpackage.dqz
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.dqz
    public final String i() {
        return this.d;
    }

    @Override // defpackage.dqz
    public final dqz kr(String str, dpu dpuVar, List list) {
        if ("toString".equals(str)) {
            return new drc(this.d);
        }
        return dqt.a(this, new drc(str), dpuVar, list);
    }

    @Override // defpackage.dqz
    public final Iterator l() {
        return dqt.b(this.e);
    }

    @Override // defpackage.dqv
    public final void r(String str, dqz dqzVar) {
        if (dqzVar == null) {
            this.e.remove(str);
        } else {
            this.e.put(str, dqzVar);
        }
    }

    @Override // defpackage.dqv
    public final boolean t(String str) {
        return this.e.containsKey(str);
    }
}
