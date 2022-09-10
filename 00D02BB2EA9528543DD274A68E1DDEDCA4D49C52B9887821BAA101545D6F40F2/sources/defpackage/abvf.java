package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: abvf  reason: default package */
/* loaded from: classes2.dex */
public class abvf implements izf<abom> {
    private final List<abom> a;

    @Override // defpackage.izf
    public List<abom> Pd() {
        return this.a;
    }

    public abvf(final abvd abvdVar, djrs djrsVar, final absg absgVar) {
        dsrj<djrm> dsrjVar = djrsVar.a;
        final ddho ddhoVar = absgVar == absg.AREA_EXPLORE ? dtxj.cP : dtxr.aJ;
        final ddho ddhoVar2 = absgVar == absg.AREA_EXPLORE ? dtxj.cZ : dtxr.bp;
        this.a = dcbg.b(dsrjVar).s(new dbrn(abvdVar, ddhoVar, ddhoVar2, absgVar) { // from class: abve
            private final abvd a;
            private final ddho b;
            private final ddho c;
            private final absg d;

            {
                this.a = abvdVar;
                this.b = ddhoVar;
                this.c = ddhoVar2;
                this.d = absgVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                abvd abvdVar2 = this.a;
                ddho ddhoVar3 = this.b;
                ddho ddhoVar4 = this.c;
                djrm djrmVar = (djrm) obj;
                return abvdVar2.a(djrmVar, null, true != djrmVar.u.isEmpty() ? ddhoVar4 : ddhoVar3, false, this.d);
            }
        }).z();
    }
}
