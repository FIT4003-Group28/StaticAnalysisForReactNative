package defpackage;

import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bbcj  reason: default package */
/* loaded from: classes3.dex */
public class bbcj extends bban implements bayp {
    private final bwqv a;
    private final bbat b;
    private final bbca c;
    private final dxio<axwi> h;
    private final aotj i;
    private boolean j;
    @dzsi
    private Runnable k;
    private final Map<bayo, Boolean> l;

    public bbcj(gga ggaVar, bwqv bwqvVar, bbca bbcaVar, bbat bbatVar, dxio<axwi> dxioVar, aotj aotjVar) {
        super(ggaVar);
        this.j = false;
        this.k = null;
        HashMap hashMap = new HashMap();
        this.l = hashMap;
        this.a = bwqvVar;
        this.c = bbcaVar;
        this.b = bbatVar;
        this.h = dxioVar;
        this.i = aotjVar;
        hashMap.put(bayo.OWNED, false);
        hashMap.put(bayo.FOLLOWED, false);
    }

    private final void x(baad baadVar) {
        dbsg m = dcft.m(this.e, new bbci(baadVar));
        if (m.a()) {
            ((bbbz) m.b()).u(baadVar);
        }
    }

    @Override // defpackage.bayp
    public Boolean a(bayo bayoVar) {
        if (this.l.containsKey(bayoVar)) {
            return this.l.get(bayoVar);
        }
        return false;
    }

    @Override // defpackage.bayp
    public cqkl b(bayo bayoVar) {
        this.l.put(bayoVar, false);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bayp
    public cqkl c() {
        this.d.D(ayrr.g(this.a, bwrs.a(this.h.a().a(""))));
        return cqkl.a;
    }

    @Override // defpackage.bban, defpackage.bayl
    public Boolean d() {
        boolean z = false;
        if (!this.j && this.k == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bayp
    public Boolean e() {
        return Boolean.valueOf(!w().booleanValue());
    }

    @Override // defpackage.bayp
    public Boolean f() {
        return Boolean.valueOf(!e().booleanValue());
    }

    @Override // defpackage.bayp
    public aosl g() {
        anhg a = this.i.a.a();
        aotj.a(a);
        return new aoti(a);
    }

    public void j(azrb azrbVar) {
        baad baadVar;
        bayj bayjVar;
        if (!azrbVar.a() && (baadVar = azrbVar.a) != null) {
            int i = azrbVar.b - 1;
            if (i != 0) {
                if (i == 1) {
                    x(baadVar);
                } else if (i == 2 && (bayjVar = (bayj) dcft.l(this.e, new bbci(baadVar), null)) != null) {
                    this.e.remove(bayjVar);
                }
            } else if (baadVar.q()) {
                int n = dcft.n(this.e, new bbci(baadVar));
                if (n >= 0) {
                    this.e.remove(n);
                    this.e.add(n, this.c.a(baadVar));
                }
            } else {
                this.e.add(this.c.a(baadVar));
                Collections.sort(this.e, dclu.f(baab.FAVORITES, baab.WANT_TO_GO, baab.STARRED_PLACES, baab.CUSTOM).g(bbcb.a).h(dcmw.a.g(bbcc.a)));
            }
        }
        cqkx.p(this);
    }

    public void k(azrc azrcVar) {
        baad baadVar = azrcVar.a;
        if (baadVar != null) {
            x(baadVar);
        }
        cqkx.p(this);
    }

    public void l(azrh azrhVar) {
        this.b.u(bbcd.a);
        cqkx.p(this);
    }

    @Override // defpackage.bayl
    public baye n() {
        if (this.j || this.k == null) {
            return new bbch();
        }
        gga ggaVar = this.d;
        String string = ggaVar.getString(R.string.SAVED_PLACES_RETRY_SYNC_HEADLINE_TEXT);
        Runnable runnable = this.k;
        dbsk.s(runnable);
        return new bbao(ggaVar, string, null, false, runnable);
    }

    public void s(azrg azrgVar) {
        this.b.u(bbce.a);
        cqkx.p(this);
    }

    public void t(List<baad> list) {
        this.e.clear();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        for (baad baadVar : list) {
            this.e.add(this.c.a(baadVar));
            if (baadVar.q() && baadVar.o() == baab.WANT_TO_GO) {
                this.b.u(bbcf.a);
                this.e.add(this.b);
            }
            if (baadVar.z()) {
                i++;
            } else {
                i2++;
            }
        }
        this.l.put(bayo.FOLLOWED, Boolean.valueOf(i > 20));
        Map<bayo, Boolean> map = this.l;
        if (i2 > 20) {
            z = true;
        }
        map.put(bayo.OWNED, Boolean.valueOf(z));
    }

    public void u(boolean z) {
        this.j = true;
    }

    public void v(boolean z, @dzsi Runnable runnable) {
        this.j = false;
        this.k = runnable;
    }

    public Boolean w() {
        return Boolean.valueOf(dcft.m(this.e, bbcg.a).a());
    }
}
