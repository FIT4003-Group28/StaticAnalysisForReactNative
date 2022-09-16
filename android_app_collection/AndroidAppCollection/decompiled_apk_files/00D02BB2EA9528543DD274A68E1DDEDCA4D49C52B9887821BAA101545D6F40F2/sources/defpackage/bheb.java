package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bheb  reason: default package */
/* loaded from: classes3.dex */
public final class bheb {
    @dzsi
    public String a;
    @dzsi
    public dpua b;
    private final Executor e;
    private final bvej g;
    public final Set<bhiu> c = new HashSet();
    private boolean f = false;
    public boolean d = false;

    public bheb(Executor executor, bvej bvejVar) {
        this.e = executor;
        this.g = bvejVar;
    }

    private final void c(String str) {
        this.f = true;
        didb bZ = didc.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        didc didcVar = (didc) bZ.b;
        str.getClass();
        didcVar.a |= 2;
        didcVar.b = str;
        this.g.b(bZ.bK(), new bhea(this), this.e);
    }

    public final void a(ilo iloVar, bhiu bhiuVar) {
        String cQ = iloVar.cQ();
        if (TextUtils.isEmpty(cQ)) {
            this.a = null;
            this.b = null;
            this.c.clear();
            this.d = false;
        } else if (!cQ.equals(this.a)) {
            this.a = cQ;
            this.b = null;
            this.c.clear();
            this.c.add(bhiuVar);
            bhiuVar.l(true);
            c(cQ);
        } else {
            dpua dpuaVar = this.b;
            if (dpuaVar != null) {
                bhiuVar.k(dpuaVar);
                cqkx.p(bhiuVar);
            } else if (this.f) {
                this.c.add(bhiuVar);
            } else if (!this.d) {
            } else {
                this.c.add(bhiuVar);
                String str = this.a;
                str.getClass();
                c(str);
            }
        }
    }
}
