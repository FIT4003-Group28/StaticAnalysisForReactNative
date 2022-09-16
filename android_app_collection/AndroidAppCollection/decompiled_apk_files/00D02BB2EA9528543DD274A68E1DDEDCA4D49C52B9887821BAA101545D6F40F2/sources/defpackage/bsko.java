package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bsko  reason: default package */
/* loaded from: classes4.dex */
public class bsko implements bsjq {
    public final brfq a;
    public final djml b;
    public final bzmm c;
    public boolean d;
    private final cklq e;
    private final bsjm f;
    private final Resources g;
    @dzsi
    private final bsha h;
    private final ddho i;
    private final boolean j;
    @dzsi
    private bsks k;

    private bsko(djml djmlVar, bsjm bsjmVar, @dzsi bsha bshaVar, bskq bskqVar, Resources resources, bzmm bzmmVar, brfq brfqVar, cklq cklqVar) {
        ddho e;
        this.b = djmlVar;
        this.f = bsjmVar;
        this.h = bshaVar;
        this.g = resources;
        djmk b = djmk.b(djmlVar.g);
        boolean z = false;
        if ((b == null ? djmk.ALWAYS_SHOW : b).equals(djmk.SHOW_AS_VALUE_SELECTOR) && bshaVar != null) {
            z = true;
        }
        this.j = z;
        this.c = bzmmVar;
        this.a = brfqVar;
        this.e = cklqVar;
        if (!z) {
            e = bskqVar.a();
        } else {
            int i = djmlVar.c;
            e = i == 10 ? bskqVar.e() : i == 7 ? bskqVar.d() : bskqVar.b();
        }
        this.i = e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bsko o(defpackage.djml r10, defpackage.bsjm r11, @defpackage.dzsi defpackage.bsha r12, defpackage.bskq r13, android.content.res.Resources r14, defpackage.bzmm r15, defpackage.brfq r16, defpackage.cklq r17) {
        /*
            r1 = r10
            int r0 = r1.g
            djmk r0 = defpackage.djmk.b(r0)
            if (r0 != 0) goto Lb
            djmk r0 = defpackage.djmk.ALWAYS_SHOW
        Lb:
            djmk r2 = defpackage.djmk.SHOW_AS_VALUE_SELECTOR
            boolean r0 = r0.equals(r2)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L39
            int r0 = r1.g
            djmk r0 = defpackage.djmk.b(r0)
            if (r0 != 0) goto L1f
            djmk r0 = defpackage.djmk.ALWAYS_SHOW
        L1f:
            djmk r4 = defpackage.djmk.UNKNOWN_VISIBILITY
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L39
            dspd r0 = r1.b
            boolean r0 = r0.u()
            if (r0 != 0) goto L39
            java.lang.String r0 = r1.e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            int r4 = r1.g
            djmk r4 = defpackage.djmk.b(r4)
            if (r4 != 0) goto L44
            djmk r4 = defpackage.djmk.ALWAYS_SHOW
        L44:
            djmk r5 = defpackage.djmk.SHOW_AS_VALUE_SELECTOR
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4f
            if (r12 == 0) goto L4f
            goto L50
        L4f:
            r2 = 0
        L50:
            if (r0 != 0) goto L57
            if (r2 == 0) goto L55
            goto L57
        L55:
            r0 = 0
            return r0
        L57:
            bsko r9 = new bsko
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsko.o(djml, bsjm, bsha, bskq, android.content.res.Resources, bzmm, brfq, cklq):bsko");
    }

    @Override // defpackage.bskm
    public String a() {
        if (this.j) {
            bsha bshaVar = this.h;
            dbsk.s(bshaVar);
            return bshaVar.q();
        }
        return this.b.e;
    }

    @Override // defpackage.bskm
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bskm
    public Boolean d() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.bskm
    public cqkl e(cjqm cjqmVar) {
        if (!this.j) {
            this.e.a(ckls.REFINEMENT_ITEM_CLICKED);
            p(this.f);
        }
        bsks bsksVar = this.k;
        if (bsksVar != null) {
            if (this.j) {
                bsksVar.i(this.b.c);
            } else {
                bsksVar.h(this.f, cjqmVar);
            }
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bskm
    public cjtd f() {
        cjta b = cjtd.b();
        b.d = this.i;
        djml djmlVar = this.b;
        b.b = djmlVar.h;
        b.g(djmlVar.i);
        ddes bZ = ddet.D.bZ();
        ddfp bZ2 = ddfq.c.bZ();
        int i = this.b.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddfq ddfqVar = (ddfq) bZ2.b;
        ddfqVar.a |= 2;
        ddfqVar.b = i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddfq bK = bZ2.bK();
        bK.getClass();
        ddetVar.u = bK;
        ddetVar.a |= 8388608;
        b.s(bZ.bK());
        ddzy bZ3 = deab.c.bZ();
        deaa deaaVar = this.d ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        deab deabVar = (deab) bZ3.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ3.bK();
        return b.a();
    }

    @Override // defpackage.bskm
    @dzsi
    public cqtd g() {
        if (this.j) {
            bsha bshaVar = this.h;
            dbsk.s(bshaVar);
            return bshaVar.s();
        }
        return null;
    }

    @Override // defpackage.bskm
    public View.OnClickListener h() {
        return bskj.a(this);
    }

    @Override // defpackage.bskm
    public Boolean i() {
        return bskj.b();
    }

    @Override // defpackage.bskm
    public cqfc j() {
        return new cqfc(this) { // from class: bskn
            private final bsko a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                bsko bskoVar = this.a;
                if (!z || bskoVar.b.c != 25 || !bskoVar.d) {
                    return;
                }
                brfq brfqVar = bskoVar.a;
                brfqVar.a = view;
                bskoVar.c.a(brfqVar);
            }
        };
    }

    @Override // defpackage.bsjq
    public void k(@dzsi bsks bsksVar) {
        this.k = bsksVar;
    }

    @Override // defpackage.bsjq
    public djmk l() {
        djmk b = djmk.b(this.b.g);
        return b == null ? djmk.ALWAYS_SHOW : b;
    }

    @Override // defpackage.bsjq
    public void m(boolean z) {
        this.d = z;
    }

    @Override // defpackage.bsjq
    public void n() {
    }

    public void p(bsjm bsjmVar) {
        if (c().booleanValue()) {
            m(false);
            djml djmlVar = this.b;
            bsjmVar.d(djmlVar.c, djmlVar.b);
            return;
        }
        m(true);
        djml djmlVar2 = this.b;
        int i = djmlVar2.c;
        dspd dspdVar = djmlVar2.b;
        int a = djmi.a(djmlVar2.d);
        if (a == 0) {
            a = 2;
        }
        bsjmVar.u(i, dspdVar, a);
    }

    @Override // defpackage.bskm
    public String b() {
        String string;
        String string2;
        if (!this.j) {
            if (c().booleanValue()) {
                string = this.g.getString(R.string.RESTRICTION_SELECTED);
            } else {
                string = this.g.getString(R.string.RESTRICTION_NOT_SELECTED);
            }
            return this.g.getString(R.string.BINARY_STATE_PIVOT_DESCRIPTION, this.b.e, string);
        }
        bsha bshaVar = this.h;
        dbsk.s(bshaVar);
        if (bshaVar.t()) {
            Resources resources = this.g;
            bsha bshaVar2 = this.h;
            dbsk.s(bshaVar2);
            string2 = resources.getString(R.string.VALUE_SELECTOR_PIVOT_SELECTED, bshaVar2.q());
        } else {
            string2 = this.g.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        Resources resources2 = this.g;
        bsha bshaVar3 = this.h;
        dbsk.s(bshaVar3);
        return resources2.getString(R.string.VALUE_SELECTOR_PIVOT_WITH_SELECTED_STATE, bshaVar3.r(), string2);
    }
}
