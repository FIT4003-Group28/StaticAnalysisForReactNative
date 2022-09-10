package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ciwa  reason: default package */
/* loaded from: classes4.dex */
public class ciwa implements civv {
    public final civz a;
    private final Set<chvd> b;
    private final String c;
    private List<? extends civu> d = Collections.nCopies(2, new civx());

    public ciwa(cqhn cqhnVar, Set<chvd> set, String str, civz civzVar) {
        this.b = set;
        this.a = civzVar;
        this.c = str;
    }

    @Override // defpackage.civv
    public Boolean a() {
        return Boolean.valueOf(this.b.contains(chvd.CHANGE_PLACE));
    }

    @Override // defpackage.civv
    public cqkl b() {
        ciwi ciwiVar = (ciwi) this.a;
        ciwiVar.a.f();
        ciwj ciwjVar = ciwiVar.a;
        chvb bZ = chve.e.bZ();
        chvd chvdVar = chvd.CHANGE_PLACE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chve chveVar = (chve) bZ.b;
        chveVar.b = chvdVar.f;
        int i = chveVar.a | 1;
        chveVar.a = i;
        chxr chxrVar = ciwiVar.a.ai;
        chxrVar.getClass();
        chveVar.c = chxrVar;
        chveVar.a = i | 2;
        ciwjVar.Nw(bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.civv
    public Boolean c() {
        return Boolean.valueOf(this.b.contains(chvd.DISMISS_PLACE));
    }

    @Override // defpackage.civv
    public cqkl d() {
        ciwi ciwiVar = (ciwi) this.a;
        ciwiVar.a.f();
        ciwj ciwjVar = ciwiVar.a;
        chvb bZ = chve.e.bZ();
        chvd chvdVar = chvd.DISMISS_PLACE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chve chveVar = (chve) bZ.b;
        chveVar.b = chvdVar.f;
        int i = chveVar.a | 1;
        chveVar.a = i;
        chxr chxrVar = ciwiVar.a.ai;
        chxrVar.getClass();
        chveVar.c = chxrVar;
        chveVar.a = i | 2;
        ciwjVar.Nw(bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.civv
    public Boolean e() {
        return Boolean.valueOf(this.b.contains(chvd.REMOVE_FROM_TIMELINE));
    }

    @Override // defpackage.civv
    public cqkl f() {
        civz civzVar = this.a;
        chvb bZ = chve.e.bZ();
        chvd chvdVar = chvd.REMOVE_FROM_TIMELINE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chve chveVar = (chve) bZ.b;
        chveVar.b = chvdVar.f;
        int i = chveVar.a | 1;
        chveVar.a = i;
        final ciwi ciwiVar = (ciwi) civzVar;
        chxr chxrVar = ciwiVar.a.ai;
        chxrVar.getClass();
        chveVar.c = chxrVar;
        chveVar.a = i | 2;
        final chve bK = bZ.bK();
        ciwiVar.a.f();
        cjta b = cjtd.b();
        b.g(ciwiVar.a.aj);
        iii iiiVar = new iii();
        iiiVar.a = ciwiVar.a.ad.getString(R.string.REMOVE_FROM_TIMELINE_CONFIRMATION_DIALOG_TITLE);
        ciwj ciwjVar = ciwiVar.a;
        iiiVar.b = ciwjVar.ad.getString(R.string.REMOVE_FROM_TIMELINE_CONFIRMATION_DIALOG_BODY, new Object[]{ciwjVar.ak.c});
        iiiVar.d(ciwiVar.a.ad.getString(R.string.REMOVE_FROM_TIMELINE_CONFIRMATION_DIALOG_OK_BUTTON), new View.OnClickListener(ciwiVar, bK) { // from class: ciwh
            private final ciwi a;
            private final chve b;

            {
                this.a = ciwiVar;
                this.b = bK;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ciwi ciwiVar2 = this.a;
                ciwiVar2.a.Nw(this.b);
            }
        }, b.b(dtxl.hA));
        iiiVar.c(ciwiVar.a.ad.getString(R.string.CANCEL_BUTTON), null, b.b(dtxl.hz));
        ciwj ciwjVar2 = ciwiVar.a;
        iiiVar.a(ciwjVar2.ad, ciwjVar2.ae).k();
        return cqkl.a;
    }

    @Override // defpackage.civv
    public Boolean g() {
        return Boolean.valueOf(this.b.contains(chvd.LEARN_MORE));
    }

    @Override // defpackage.civv
    public cqkl h() {
        ciwi ciwiVar = (ciwi) this.a;
        ciwiVar.a.f();
        ciwj ciwjVar = ciwiVar.a;
        chvb bZ = chve.e.bZ();
        chvd chvdVar = chvd.LEARN_MORE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chve chveVar = (chve) bZ.b;
        chveVar.b = chvdVar.f;
        chveVar.a |= 1;
        ciwjVar.Nw(bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.civv
    public cjtd i(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        if (!this.c.isEmpty()) {
            b.g(this.c);
        }
        return b.a();
    }

    @Override // defpackage.civv
    public List<? extends civu> j() {
        return this.d;
    }

    public void k(List<dwjb> list) {
        this.d = dcbg.b(list).s(new dbrn(this) { // from class: civw
            private final ciwa a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new civy((dwjb) obj, this.a.a);
            }
        }).z();
        cqkx.p(this);
    }
}
