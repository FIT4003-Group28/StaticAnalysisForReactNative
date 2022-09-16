package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bsid  reason: default package */
/* loaded from: classes4.dex */
public class bsid implements bsgt, bsha, bsgs {
    private final Resources c;
    private final cqhn d;
    @dzsi
    private bsjm f;
    private boolean g;
    private final Set<djkt> a = new LinkedHashSet();
    private final Set<djkt> b = new LinkedHashSet();
    private List<bsic> e = new ArrayList();

    public bsid(Resources resources, cqhn cqhnVar) {
        this.c = resources;
        this.d = cqhnVar;
    }

    @Override // defpackage.bsha
    /* renamed from: a */
    public String h() {
        return this.c.getString(R.string.RESTRICTION_HOTEL_CHAINS);
    }

    @Override // defpackage.bsgs
    public List<? extends jao> b() {
        return this.e;
    }

    @Override // defpackage.bsgs
    public Boolean c() {
        return Boolean.valueOf(this.g);
    }

    public void d(boolean z) {
        this.g = true;
        cqkx.p(this);
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void m(bsjm bsjmVar) {
        this.b.clear();
        this.a.clear();
        this.b.addAll(bsjmVar.v(32));
        Set<dspd> c = bsjmVar.c(31);
        for (djkt djktVar : this.b) {
            if (c.contains(djktVar.c)) {
                this.a.add(djktVar);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dccg O = dccg.O();
        for (djkt djktVar2 : this.b) {
            djmv djmvVar = (djmv) bvrs.c(djktVar2.c, (dssr) djmv.c.cu(7));
            djla djlaVar = null;
            if (djmvVar != null && djmvVar.a == 36) {
                djlaVar = (djla) djmvVar.b;
            }
            if (djlaVar != null) {
                bsic bsicVar = new bsic(this.c, djktVar2, this.a.contains(djktVar2));
                if ((djlaVar.a & 8) != 0) {
                    O.n(Long.valueOf(djlaVar.c), bsicVar);
                } else {
                    linkedHashMap.put(Long.valueOf(djlaVar.b), bsicVar);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            bsic bsicVar2 = (bsic) entry.getValue();
            bsicVar2.j(dcdc.r(O.f((Long) entry.getKey())));
            arrayList.add(bsicVar2);
        }
        this.e = arrayList;
        this.f = bsjmVar;
    }

    @Override // defpackage.bsgt, defpackage.bsha
    public void n(bsjm bsjmVar) {
        LinkedHashSet<djkt> linkedHashSet = new LinkedHashSet();
        for (bsic bsicVar : this.e) {
            linkedHashSet.addAll(bsicVar.l());
        }
        if (linkedHashSet.equals(this.a)) {
            return;
        }
        bsjmVar.e(31);
        for (djkt djktVar : linkedHashSet) {
            bsjmVar.u(31, djktVar.c, 3);
        }
    }

    @Override // defpackage.bsgt
    public void o(cqiv cqivVar) {
        if (this.b.isEmpty()) {
            return;
        }
        cqivVar.a(new bscf(), this);
    }

    @Override // defpackage.bsha
    public String q() {
        bsjm bsjmVar = this.f;
        if (bsjmVar == null) {
            return "";
        }
        for (djml djmlVar : bsjmVar.j()) {
            if (djmlVar.c == 31) {
                djmk b = djmk.b(djmlVar.g);
                if (b == null) {
                    b = djmk.ALWAYS_SHOW;
                }
                if (b == djmk.SHOW_AS_VALUE_SELECTOR) {
                    return djmlVar.e;
                }
            }
        }
        return this.c.getString(R.string.RESTRICTION_HOTEL_CHAINS);
    }

    @Override // defpackage.bsha
    public String r() {
        return h();
    }

    @Override // defpackage.bsha
    @dzsi
    public cqtd s() {
        return null;
    }

    @Override // defpackage.bsha
    public boolean t() {
        return !this.a.isEmpty();
    }

    @Override // defpackage.bsha
    public void u(cqiv cqivVar) {
        if (this.b.isEmpty()) {
            return;
        }
        cqivVar.a(new bsbp(), this);
    }
}
