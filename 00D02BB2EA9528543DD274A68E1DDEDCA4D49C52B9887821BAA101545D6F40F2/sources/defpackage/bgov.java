package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgov  reason: default package */
/* loaded from: classes3.dex */
public class bgov implements bgns {
    @dzsi
    public final bgpb a;
    @dzsi
    public final bgqj b;
    public final bgnr c;
    int d;
    @dzsi
    private final bgno e;
    @dzsi
    private final bgnx f;
    private final bgpd g;
    private final btvo h;
    private final bgnt i;
    private final bgnp j;
    private final Activity k;
    private final dipk l;
    private final bgnk m;
    private final String n;
    private final List<bgfa> o;
    private final bgnc p;
    private final apnq q;
    @dzsi
    private cqqw r;
    @dzsi
    private final bgnw s;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018c  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [bgqj, bgpb, cqqw] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bgov(android.app.Activity r18, defpackage.btvo r19, defpackage.cqhn r20, defpackage.dxio<defpackage.bvvw> r21, defpackage.dxio<defpackage.apyz> r22, defpackage.bgoq r23, defpackage.bgpj r24, defpackage.bgqk r25, defpackage.bgpa r26, defpackage.bgos r27, defpackage.bhhf r28, defpackage.bgpg r29, defpackage.bgnc r30, defpackage.bgpe r31, defpackage.bgpc r32, defpackage.dipk r33, boolean r34, int r35, defpackage.apnq r36, java.util.HashSet<defpackage.bgqj> r37, defpackage.bgez r38, defpackage.ilo r39, defpackage.bgnk r40, defpackage.bgnr r41) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgov.<init>(android.app.Activity, btvo, cqhn, dxio, dxio, bgoq, bgpj, bgqk, bgpa, bgos, bhhf, bgpg, bgnc, bgpe, bgpc, dipk, boolean, int, apnq, java.util.HashSet, bgez, ilo, bgnk, bgnr):void");
    }

    @Override // defpackage.bgns
    @dzsi
    public bgno a() {
        return this.e;
    }

    @Override // defpackage.bgns
    @dzsi
    public bgnx b() {
        return this.f;
    }

    @Override // defpackage.bgns
    @dzsi
    public bgnu c() {
        return this.a;
    }

    @Override // defpackage.bgns
    @dzsi
    public bgoc d() {
        return this.b;
    }

    @Override // defpackage.bgns
    public bgnt e() {
        return this.i;
    }

    @Override // defpackage.bgns
    public cjtd f() {
        bgnk bgnkVar = bgnk.PLACESHEET_CAROUSEL;
        ddho ddhoVar = this.m.ordinal() != 1 ? dtxu.aC : dtxy.jz;
        cjta cjtaVar = new cjta();
        cjtaVar.d = ddhoVar;
        dipk dipkVar = this.l;
        cjtaVar.b = dipkVar.p;
        cjtaVar.g(dipkVar.q);
        bgnf.a(cjtaVar, this.l);
        return cjtaVar.a();
    }

    @Override // defpackage.bgns
    public Boolean g() {
        boolean z = true;
        if (this.i.f().isEmpty() && !this.i.s().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgns
    public bgnp h() {
        return this.j;
    }

    @Override // defpackage.bgns
    public String i() {
        return this.k.getString(R.string.POST_STREAM_CONTAINER_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(this.d + 1), this.n, this.i.j()});
    }

    @Override // defpackage.bgns
    public cqfc j() {
        return new cqfc(this) { // from class: bgou
            private final bgov a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                bgov bgovVar = this.a;
                if (bgovVar.a == null && bgovVar.b == null) {
                    return;
                }
                ((bgpn) bgovVar.c).a.l();
            }
        };
    }

    @Override // defpackage.bgns
    public Boolean k() {
        boolean z = true;
        if (!p().booleanValue() || this.l.m.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgns
    public bgfa l(int i) {
        return this.o.get(i);
    }

    @Override // defpackage.bgns
    public List<diov> m() {
        return this.l.m;
    }

    @Override // defpackage.bgns
    @dzsi
    public cjtd n() {
        if (!p().booleanValue() || !k().booleanValue()) {
            return null;
        }
        cjta b = cjtd.b();
        b.d = dtxu.aN;
        b.g(this.l.q);
        return b.a();
    }

    @Override // defpackage.bgns
    @dzsi
    public cqqw o() {
        if (p().booleanValue() && this.r == null) {
            bgnc bgncVar = this.p;
            bgpd bgpdVar = this.g;
            apnq apnqVar = this.q;
            Activity activity = (Activity) ((dxjd) bgncVar.a).a;
            bgnc.a(activity, 1);
            btvo a = bgncVar.b.a();
            bgnc.a(a, 2);
            bgnc.a(bgncVar.c.a(), 3);
            cjqy a2 = bgncVar.d.a();
            bgnc.a(a2, 4);
            bgnc.a(this, 5);
            bgnc.a(bgpdVar, 6);
            bgnc.a(apnqVar, 7);
            this.r = new bgnb(activity, a, a2, this, bgpdVar, apnqVar);
        }
        return this.r;
    }

    @Override // defpackage.bgns
    public Boolean p() {
        return Boolean.valueOf(this.h.getPlaceSheetParameters().w());
    }

    @Override // defpackage.bgns
    public bgnv q() {
        return this.g;
    }

    @Override // defpackage.bgns
    @dzsi
    public bgnw r() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(int i) {
        this.d = i;
        this.e.f(i);
        bgqj bgqjVar = this.b;
        if (bgqjVar != null) {
            bgqjVar.a(i);
        }
        this.i.u(i);
        this.j.f(i);
        bgnw bgnwVar = this.s;
        if (bgnwVar != null) {
            bgnwVar.j(i);
        }
        bgnx bgnxVar = this.f;
        if (bgnxVar != null) {
            bgnxVar.h(i);
        }
        if (this.o.size() > 1) {
            for (bgfa bgfaVar : this.o) {
                bgfaVar.a(i);
            }
        }
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long t() {
        return this.l.d;
    }
}
