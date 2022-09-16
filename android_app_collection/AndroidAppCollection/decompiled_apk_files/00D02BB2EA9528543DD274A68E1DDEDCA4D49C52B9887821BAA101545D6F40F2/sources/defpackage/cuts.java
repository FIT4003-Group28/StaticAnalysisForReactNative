package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;
/* compiled from: PG */
/* renamed from: cuts  reason: default package */
/* loaded from: classes5.dex */
public final class cuts implements cvdw, cvdu, cvdv {
    private static final dcdc<cvec> b = dcdc.f(cvec.SUGGESTION_LIST);
    private static final cutq h = new cutq();
    public cvee a;
    private final cuuc c;
    private cuss<cufp> d;
    private final cuvx e;
    private cuib f;
    private final cutq g = h;

    public cuts(cuuc cuucVar, cuvx cuvxVar) {
        this.c = cuucVar;
        this.e = cuvxVar;
    }

    private static final dbsg<String> k(dbsg<cugu> dbsgVar) {
        if (!dbsgVar.a() || dbsgVar.b().f().a() == 1) {
            return dbpy.a;
        }
        return dbsgVar.h(cutp.a);
    }

    @Override // defpackage.cvdw
    public final cvdu a() {
        return this;
    }

    @Override // defpackage.cvdw
    public final dbsg<cvdv> b() {
        return dbsg.i(this);
    }

    @Override // defpackage.cvdw
    public final dbsg<cuij> c(cugu cuguVar) {
        return dbpy.a;
    }

    @Override // defpackage.cvdu
    public final List<cvec> d() {
        return b;
    }

    @Override // defpackage.cvdu
    public final acl e(ViewGroup viewGroup, cvec cvecVar) {
        cutv cutvVar = new cutv(viewGroup.getContext(), this.g, this.e);
        cutn cutnVar = new cutn();
        cutnVar.a = this.c;
        cutvVar.setSuggestionClickListener(cutnVar);
        cutvVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return new cutr(cutvVar);
    }

    @Override // defpackage.cvdu
    public final void f(acl aclVar, cved cvedVar, ctyy ctyyVar) {
        if (aclVar instanceof cutr) {
            cutv cutvVar = (cutv) ((cutr) aclVar).a;
            cuib d = cvedVar.d();
            dccx F = dcdc.F();
            dcdc<cuhz> c = d.c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                cuhz cuhzVar = c.get(i);
                if (this.c.b(cuhzVar.d())) {
                    F.g(cuhzVar);
                }
            }
            cuia f = d.f();
            f.f(F.f());
            cuib a = f.a();
            cutl cutlVar = cutvVar.U;
            cutlVar.m = a;
            cutlVar.s();
            if (a.d() == 1) {
                cutvVar.setLayoutManager(cutvVar.S);
            } else if (a.d() == 2) {
                cutvVar.setLayoutManager(cutvVar.T);
            }
        }
    }

    @Override // defpackage.cvdu
    public final boolean g(cugu cuguVar) {
        return true;
    }

    @Override // defpackage.cvdv
    public final void h(cvee cveeVar) {
        this.a = cveeVar;
    }

    @Override // defpackage.cvdv
    public final void i(csuk csukVar, ConversationId conversationId, ctyy ctyyVar) {
        cuss<cufp> c = csukVar.c(ctyyVar, conversationId);
        this.d = c;
        c.q(new cusr(this) { // from class: cuto
            private final cuts a;

            {
                this.a = this;
            }

            @Override // defpackage.cusr
            public final void a(Object obj) {
                cufp cufpVar = (cufp) obj;
                cvee cveeVar = this.a.a;
                if (cveeVar != null) {
                    cveeVar.a();
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        r2 = defpackage.dbpy.a;
     */
    @Override // defpackage.cvdv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dehn<defpackage.dcdc<defpackage.cved>> j(defpackage.dcdc<defpackage.cved> r9) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuts.j(dcdc):dehn");
    }
}
