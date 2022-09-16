package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bsii  reason: default package */
/* loaded from: classes4.dex */
public class bsii implements bsha {
    private final Resources a;
    private final List<Integer> b = new ArrayList();
    private dbsg<Integer> c = dbpy.a;
    private final aeqs d;
    @dzsi
    private aeqr e;

    public bsii(Resources resources, aeqs aeqsVar) {
        this.a = resources;
        this.d = aeqsVar;
    }

    @Override // defpackage.bsha
    public final CharSequence h() {
        return "";
    }

    @Override // defpackage.bsha
    public final void m(bsjm bsjmVar) {
        dbsg<Integer> i;
        this.b.clear();
        this.c = dbpy.a;
        this.e = null;
        for (djkt djktVar : bsjmVar.v(19)) {
            dbsg<djlp> a = bsli.a(djktVar.c);
            if (a.a()) {
                this.b.add(Integer.valueOf(a.b().b));
            }
        }
        Collections.sort(this.b);
        Set<dspd> c = bsjmVar.c(18);
        if (c.size() != 1) {
            c.size();
            i = dbpy.a;
        } else {
            dbsg<djlp> a2 = bsli.a(c.iterator().next());
            i = !a2.a() ? dbpy.a : dbsg.i(Integer.valueOf(a2.b().b));
        }
        this.c = i;
        if (!i.a()) {
            return;
        }
        Integer b = this.c.b();
        if (!this.b.contains(b)) {
            return;
        }
        this.e = this.d.a(dcdc.r(this.b), b);
    }

    @Override // defpackage.bsha
    public final void n(bsjm bsjmVar) {
        aeqr aeqrVar = this.e;
        if (aeqrVar == null) {
            return;
        }
        Integer a = aeqrVar.a();
        if (this.c.a() && a.equals(this.c.b())) {
            return;
        }
        djmu bZ = djmv.c.bZ();
        djlo bZ2 = djlp.c.bZ();
        int intValue = a.intValue();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djlp djlpVar = (djlp) bZ2.b;
        djlpVar.a |= 1;
        djlpVar.b = intValue;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmv djmvVar = (djmv) bZ.b;
        djlp bK = bZ2.bK();
        bK.getClass();
        djmvVar.b = bK;
        djmvVar.a = 23;
        bsjmVar.u(18, bZ.bK().bR(), 2);
        int intValue2 = a.intValue();
        dnnh bZ3 = dnnn.l.bZ();
        dqxb bZ4 = dqxc.c.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqxc dqxcVar = (dqxc) bZ4.b;
        dqxcVar.a |= 1;
        dqxcVar.b = intValue2;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnnn dnnnVar = (dnnn) bZ3.b;
        dqxc bK2 = bZ4.bK();
        bK2.getClass();
        dnnnVar.j = bK2;
        dnnnVar.a |= 4096;
        bsjmVar.p(bZ3.bK());
    }

    @Override // defpackage.bsha
    public final String q() {
        return this.c.a() ? Integer.toString(this.c.b().intValue()) : "";
    }

    @Override // defpackage.bsha
    public final String r() {
        return this.a.getString(R.string.RESTRICTION_HOTEL_OCCUPANCY_DESCRIPTION);
    }

    @Override // defpackage.bsha
    @dzsi
    public final cqtd s() {
        return cqrt.g(2131232834, cqrt.c(true != t() ? R.color.google_grey800 : R.color.google_blue600));
    }

    @Override // defpackage.bsha
    public final boolean t() {
        return this.c.a();
    }

    @Override // defpackage.bsha
    public final void u(cqiv cqivVar) {
        if (this.e != null) {
            cqivVar.a(new bsgq(), this.e);
        }
    }
}
