package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bbag  reason: default package */
/* loaded from: classes3.dex */
public class bbag extends bban implements ayfi {
    public final bvrb a;
    public final List<bayf> b;
    public boolean c;
    private final bexy h;
    private final bbaa i;
    private final beya j;
    private final ayfl k;
    private final aybl l;
    private final batm m;
    private final Map<azxb, bazz> n;
    private boolean o;
    private int p;
    @dzsi
    private Runnable q;
    @dzsi
    private ayfk r;
    @dzsi
    private bexz s;
    @dzsi
    private List<baal> t;

    public bbag(gga ggaVar, bbaa bbaaVar, beya beyaVar, ayfl ayflVar, aybl ayblVar, batm batmVar, bvrb bvrbVar) {
        super(ggaVar);
        this.h = new bbae(this);
        this.o = false;
        this.q = null;
        this.i = bbaaVar;
        this.j = beyaVar;
        this.k = ayflVar;
        this.l = ayblVar;
        this.m = batmVar;
        this.a = bvrbVar;
        this.b = new ArrayList();
        this.n = new HashMap();
    }

    @Override // defpackage.bban, defpackage.bayl
    public List<bayf> QJ() {
        return this.b;
    }

    @Override // defpackage.bban, defpackage.bayl
    public Boolean d() {
        ayfk ayfkVar;
        boolean z = true;
        if ((this.o || this.q != null) && ((ayfkVar = this.r) == null || !ayfkVar.c().booleanValue() || this.t == null || this.b.size() >= this.t.size())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayfi
    public void e(ayfk ayfkVar) {
        cqkx.p(this);
    }

    @Override // defpackage.ayfi
    public void f(ayfk ayfkVar) {
        this.m.a(new Runnable(this) { // from class: bbab
            private final bbag a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbag bbagVar = this.a;
                bbagVar.x();
                cqkx.p(bbagVar);
            }
        });
    }

    @Override // defpackage.ayfi
    public void g(ayfk ayfkVar) {
        x();
        cqkx.p(this);
    }

    @Override // defpackage.bban, defpackage.bayl
    @dzsi
    public cqqw h() {
        return this.r;
    }

    public void j() {
        this.s = this.j.a(this.h);
    }

    public void k(boolean z) {
        this.o = true;
    }

    public void l(boolean z, @dzsi Runnable runnable) {
        this.o = false;
        this.q = runnable;
    }

    @Override // defpackage.bban, defpackage.bayl
    public cjtd r() {
        return cjtd.a(dtyg.y);
    }

    public boolean s() {
        return this.o;
    }

    public void t(boolean z) {
        List<baal> list;
        this.c = true;
        ayfk ayfkVar = this.r;
        if (ayfkVar == null || (list = this.t) == null) {
            return;
        }
        ayfkVar.i(list);
    }

    public final void u() {
        azzu azzuVar;
        bexz bexzVar = this.s;
        if (bexzVar == null || (azzuVar = bexzVar.a) == null) {
            return;
        }
        this.t = this.l.b(azzuVar.i());
        this.r = this.k.a(azzuVar, this);
        this.p = 0;
        this.b.clear();
        x();
        ayfk ayfkVar = this.r;
        dbsk.s(ayfkVar);
        List<baal> list = this.t;
        dbsk.s(list);
        ayfkVar.i(list);
    }

    public void v() {
        if (this.c) {
            u();
            cqkx.p(this);
            this.c = false;
        }
    }

    public void w() {
        ayfk ayfkVar = this.r;
        if (ayfkVar != null) {
            ayfkVar.j();
        }
    }

    public final void x() {
        bazz bazzVar;
        List<baal> list = this.t;
        if (list == null || this.r == null || this.s == null) {
            return;
        }
        while (this.p < list.size()) {
            ayfk ayfkVar = this.r;
            dbsk.s(ayfkVar);
            if (!ayfkVar.d(list.get(this.p))) {
                return;
            }
            List<bayf> list2 = this.b;
            baal baalVar = list.get(this.p);
            azxb a = baalVar.a();
            if (this.n.containsKey(a)) {
                bazzVar = this.n.get(a);
                bexz bexzVar = this.s;
                dbsk.s(bexzVar);
                bazzVar.h(bexzVar);
            } else {
                bbaa bbaaVar = this.i;
                bexz bexzVar2 = this.s;
                dbsk.s(bexzVar2);
                bazz a2 = bbaaVar.a(baalVar, bexzVar2);
                ayfk ayfkVar2 = this.r;
                dbsk.s(ayfkVar2);
                baak z = baalVar.z();
                dbsk.s(z);
                bnju h = ayfkVar2.h(z.a());
                if (h != null) {
                    a2.i(h);
                    this.n.put(a, a2);
                }
                bazzVar = a2;
            }
            list2.add(bazzVar);
            this.p++;
        }
    }

    @Override // defpackage.bayl
    public baye n() {
        if (this.o || this.q == null) {
            return new bbaf(this);
        }
        gga ggaVar = this.d;
        String string = ggaVar.getString(R.string.FOLLOWED_TAB_RETRY_SYNC_HEADLINE_TEXT);
        Runnable runnable = this.q;
        dbsk.s(runnable);
        return new bbao(ggaVar, string, null, false, runnable);
    }
}
