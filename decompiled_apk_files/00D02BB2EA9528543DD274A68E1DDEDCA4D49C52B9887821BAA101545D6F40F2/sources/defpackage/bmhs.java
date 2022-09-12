package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bmhs  reason: default package */
/* loaded from: classes3.dex */
public class bmhs implements cqkp, bega {
    private final xhx a;
    @dzsi
    private List<xhv> b;

    public bmhs(xhx xhxVar) {
        this.a = xhxVar;
    }

    @dzsi
    public List<xhv> a() {
        return this.b;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c;
        this.b = null;
        if (bwrsVar == null || (c = bwrsVar.c()) == null || !c.ba()) {
            return;
        }
        dcbg b = dcbg.b(c.bP().k);
        final xhx xhxVar = this.a;
        xhxVar.getClass();
        this.b = b.s(new dbrn(xhxVar) { // from class: bmhr
            private final xhx a;

            {
                this.a = xhxVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.a((dpgh) obj);
            }
        }).z();
    }

    @Override // defpackage.bega
    public void u() {
        this.b = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        List<xhv> list = this.b;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
