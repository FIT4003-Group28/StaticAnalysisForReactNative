package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cgsg  reason: default package */
/* loaded from: classes4.dex */
public final class cgsg {
    public final Map<dwpc, cgsf> a = new HashMap();
    public final Map<dwpc, cgwg> b = new HashMap();

    public final void a(cgwg cgwgVar) {
        this.b.put(cgwgVar.F(), cgwgVar);
        this.a.put(cgwgVar.F(), cgsf.QUEUED);
    }

    public final void b(dwpc dwpcVar, cgsf cgsfVar) {
        if (dwpcVar.equals(dwpc.e)) {
            return;
        }
        this.a.put(dwpcVar, cgsfVar);
    }

    public final void c(dwpc dwpcVar) {
        if (dwpcVar.equals(dwpc.e)) {
            return;
        }
        this.a.put(dwpcVar, cgsf.COMPLETED);
        cgwg cgwgVar = this.b.get(dwpcVar);
        if (cgwgVar == null) {
            return;
        }
        cgwgVar.u(cgwf.POSTED);
    }

    public final void d(dwpc dwpcVar) {
        this.a.remove(dwpcVar);
        this.b.remove(dwpcVar);
    }

    public final cgsf e(dwpc dwpcVar) {
        cgsf cgsfVar = this.a.get(dwpcVar);
        return cgsfVar != null ? cgsfVar : cgsf.NOT_TRACKED;
    }

    @dzsi
    public final cgwg f(dwpc dwpcVar) {
        return this.b.get(dwpcVar);
    }
}
