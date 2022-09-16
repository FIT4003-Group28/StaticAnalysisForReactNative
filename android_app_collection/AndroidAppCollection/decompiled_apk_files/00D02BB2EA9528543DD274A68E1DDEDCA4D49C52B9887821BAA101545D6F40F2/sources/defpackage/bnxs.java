package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: bnxs  reason: default package */
/* loaded from: classes3.dex */
public class bnxs implements cpmx {
    public dhjx b;
    @dzsi
    public akqs c;
    @dzsi
    public String e;
    @dzsi
    public deig<cpna> f;
    private final bxer h;
    private final cqat i;
    private final btrm j;
    public final Object a = new Object();
    public final Map<String, bnxq> d = new HashMap();
    final bnxr g = new bnxr(this);

    public bnxs(dhjx dhjxVar, @dzsi akqs akqsVar, cqat cqatVar, btrm btrmVar, bxer bxerVar) {
        this.b = dhjxVar;
        this.c = akqsVar;
        this.i = cqatVar;
        this.j = btrmVar;
        this.h = bxerVar;
    }

    public final void a() {
        btrm btrmVar = this.j;
        bnxr bnxrVar = this.g;
        dceq a = dcet.a();
        a.b(bxev.class, new bnxu(bxev.class, bnxrVar, bvrj.UI_THREAD));
        btrmVar.g(bnxrVar, a.a());
    }

    public final void b() {
        this.j.a(this.g);
    }

    @Override // defpackage.cpmx
    public final cpna c(cpmz cpmzVar) {
        String str = cpmzVar.a;
        bxkx bxkxVar = new bxkx();
        bxkz d = bxkz.d(str, str.codePointCount(0, str.length()), this.i.e());
        bxkxVar.a(d);
        synchronized (this.a) {
            this.f = deig.d();
            this.e = str;
        }
        if (this.h.e(bxla.ADD_A_PLACE_ADDRESS_SELECTOR, d, this.b, this.c, null, false, false, bxkxVar, dwjm.DEFAULT_SEARCH, false, false, false) == null) {
            return new cpna();
        }
        cpna cpnaVar = new cpna();
        try {
            deig<cpna> deigVar = this.f;
            dbsk.s(deigVar);
            return deigVar.get(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            synchronized (this.a) {
                this.f = null;
                this.e = null;
                return cpnaVar;
            }
        }
    }
}
