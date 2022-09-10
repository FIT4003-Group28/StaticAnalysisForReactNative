package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cevl  reason: default package */
/* loaded from: classes4.dex */
public class cevl implements cess {
    private final gga a;
    private final ceet b;
    private final axwo c;
    private final cese d;
    private final dhsy e;
    @dzsi
    private final String f;
    private final cevz g;
    private final cevj h;
    private final List<cesr> i = new ArrayList();
    private List<cesq> j;

    public cevl(gga ggaVar, cqhn cqhnVar, ceet ceetVar, axwo axwoVar, cevj cevjVar, cese ceseVar, dhsy dhsyVar, @dzsi String str, cevz cevzVar) {
        dhsr dhsrVar;
        this.a = ggaVar;
        this.b = ceetVar;
        this.c = axwoVar;
        this.d = ceseVar;
        this.e = dhsyVar;
        this.f = str;
        this.g = cevzVar;
        this.h = cevjVar;
        if (dhsyVar.a == 7) {
            dhsrVar = (dhsr) dhsyVar.b;
        } else {
            dhsrVar = dhsr.b;
        }
        for (dhsp dhspVar : dhsrVar.a) {
            if (this.i.size() == 20) {
                break;
            }
            this.i.add(cevjVar.a(dhspVar));
        }
        this.j = o(this.i);
    }

    @dzsi
    private final cevi n(String str) {
        for (int i = 0; i < this.i.size(); i++) {
            cevi ceviVar = (cevi) this.i.get(i);
            if (ceviVar.f().equals(str)) {
                return ceviVar;
            }
        }
        return null;
    }

    private static List<cesq> o(List<cesr> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size() % 2;
        if (size == 1) {
            arrayList.add(new cevk(list.get(0), null));
        }
        while (size < list.size()) {
            arrayList.add(new cevk(list.get(size), list.get(size + 1)));
            size += 2;
        }
        return arrayList;
    }

    @Override // defpackage.cesg
    public String a() {
        return this.e.f;
    }

    @Override // defpackage.cesg
    public cqtd b() {
        return iup.e(R.raw.ic_add_circle_outline);
    }

    @Override // defpackage.cesg
    public String c() {
        return this.a.getString(R.string.CREATE_NEW_LIST);
    }

    @Override // defpackage.cesg
    public cqkl d() {
        this.c.e(this.g, bwrs.a(dcdc.e()));
        return cqkl.a;
    }

    @Override // defpackage.cesg
    public cjtd e() {
        return cjtd.a(dtxl.fg);
    }

    @Override // defpackage.cesg
    public Boolean f() {
        boolean z = false;
        if (this.d.b() && this.f == null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cesi
    public String g() {
        return this.e.d;
    }

    @Override // defpackage.cesi
    public cqkl h() {
        ceet ceetVar = this.b;
        String str = this.f;
        drds b = drds.b(this.e.c);
        if (b == null) {
            b = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
        }
        boolean z = this.f != null;
        ceer g = cees.g();
        ((ceep) g).b = this.g;
        ceetVar.l(str, b, z, g.a());
        return cqkl.a;
    }

    @Override // defpackage.cesi
    public cjtd i() {
        return cjtd.a(dtxl.ff);
    }

    @Override // defpackage.cess
    public List<cesq> j() {
        return this.j;
    }

    public void k(baad baadVar) {
        if (n(baadVar.l()) == null && baadVar.x() && this.i.size() < 20) {
            this.i.add(this.h.a(cesf.b(this.a, baadVar)));
            this.j = o(this.i);
            cqkx.p(this);
        }
    }

    public void l(baad baadVar) {
        if (!baadVar.x()) {
            m(baadVar);
            return;
        }
        cevi n = n(baadVar.l());
        if (n != null) {
            n.g(cesf.b(this.a, baadVar));
            this.j = o(this.i);
            cqkx.p(this);
            return;
        }
        k(baadVar);
    }

    public void m(baad baadVar) {
        cevi n = n(baadVar.l());
        if (n != null) {
            this.i.remove(n);
            this.j = o(this.i);
            cqkx.p(this);
        }
    }
}
