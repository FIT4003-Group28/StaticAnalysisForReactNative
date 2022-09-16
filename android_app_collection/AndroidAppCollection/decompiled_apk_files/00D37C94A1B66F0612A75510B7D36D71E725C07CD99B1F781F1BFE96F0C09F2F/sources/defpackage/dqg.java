package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dqg  reason: default package */
/* loaded from: classes3.dex */
public final class dqg extends dqs {
    final Map a;
    private final dpv b;

    public dqg(dpv dpvVar) {
        super("require");
        this.a = new HashMap();
        this.b = dpvVar;
    }

    @Override // defpackage.dqs
    public final dqz a(dpu dpuVar, List list) {
        dqz dqzVar;
        dqt.l("require", 1, list);
        String i = dpuVar.b((dqz) list.get(0)).i();
        if (this.a.containsKey(i)) {
            return (dqz) this.a.get(i);
        }
        dpv dpvVar = this.b;
        if (dpvVar.a.containsKey(i)) {
            try {
                dqzVar = (dqz) ((Callable) dpvVar.a.get(i)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(i);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            dqzVar = dqz.f;
        }
        if (dqzVar instanceof dqs) {
            this.a.put(i, (dqs) dqzVar);
        }
        return dqzVar;
    }
}
