package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dqw  reason: default package */
/* loaded from: classes3.dex */
public class dqw implements dqz, dqv {
    public final Map a = new HashMap();

    @Override // defpackage.dqz
    public final dqz d() {
        dqw dqwVar = new dqw();
        for (Map.Entry entry : this.a.entrySet()) {
            if (entry.getValue() instanceof dqv) {
                dqwVar.a.put((String) entry.getKey(), (dqz) entry.getValue());
            } else {
                dqwVar.a.put((String) entry.getKey(), ((dqz) entry.getValue()).d());
            }
        }
        return dqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dqw) {
            return this.a.equals(((dqw) obj).a);
        }
        return false;
    }

    @Override // defpackage.dqv
    public final dqz f(String str) {
        return this.a.containsKey(str) ? (dqz) this.a.get(str) : f;
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
        return this.a.hashCode();
    }

    @Override // defpackage.dqz
    public final String i() {
        return "[object Object]";
    }

    @Override // defpackage.dqz
    public dqz kr(String str, dpu dpuVar, List list) {
        if ("toString".equals(str)) {
            return new drc(toString());
        }
        return dqt.a(this, new drc(str), dpuVar, list);
    }

    @Override // defpackage.dqz
    public final Iterator l() {
        return dqt.b(this.a);
    }

    @Override // defpackage.dqv
    public final void r(String str, dqz dqzVar) {
        if (dqzVar == null) {
            this.a.remove(str);
        } else {
            this.a.put(str, dqzVar);
        }
    }

    @Override // defpackage.dqv
    public final boolean t(String str) {
        return this.a.containsKey(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
