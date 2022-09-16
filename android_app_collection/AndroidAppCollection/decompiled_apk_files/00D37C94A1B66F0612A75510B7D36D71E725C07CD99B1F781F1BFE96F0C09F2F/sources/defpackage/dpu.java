package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dpu  reason: default package */
/* loaded from: classes3.dex */
public final class dpu {
    public final dpu a;
    final drg b;
    final Map c = new HashMap();
    final Map d = new HashMap();

    public dpu(dpu dpuVar, drg drgVar) {
        this.a = dpuVar;
        this.b = drgVar;
    }

    public final dpu a() {
        return new dpu(this, this.b);
    }

    public final dqz b(dqz dqzVar) {
        return this.b.a(this, dqzVar);
    }

    public final dqz c(dqo dqoVar) {
        dqz dqzVar = dqz.f;
        Iterator k = dqoVar.k();
        while (k.hasNext()) {
            dqzVar = this.b.a(this, dqoVar.e(((Integer) k.next()).intValue()));
            if (dqzVar instanceof dqq) {
                break;
            }
        }
        return dqzVar;
    }

    public final dqz d(String str) {
        if (this.c.containsKey(str)) {
            return (dqz) this.c.get(str);
        }
        dpu dpuVar = this.a;
        if (dpuVar == null) {
            throw new IllegalArgumentException(String.format("%s is not defined", str));
        }
        return dpuVar.d(str);
    }

    public final void e(String str, dqz dqzVar) {
        if (this.d.containsKey(str)) {
            return;
        }
        if (dqzVar == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, dqzVar);
        }
    }

    public final void f(String str, dqz dqzVar) {
        e(str, dqzVar);
        this.d.put(str, true);
    }

    public final void g(String str, dqz dqzVar) {
        dpu dpuVar;
        if (this.c.containsKey(str) || (dpuVar = this.a) == null || !dpuVar.h(str)) {
            if (this.d.containsKey(str)) {
                return;
            }
            if (dqzVar == null) {
                this.c.remove(str);
                return;
            } else {
                this.c.put(str, dqzVar);
                return;
            }
        }
        this.a.g(str, dqzVar);
    }

    public final boolean h(String str) {
        if (this.c.containsKey(str)) {
            return true;
        }
        dpu dpuVar = this.a;
        if (dpuVar == null) {
            return false;
        }
        return dpuVar.h(str);
    }
}
