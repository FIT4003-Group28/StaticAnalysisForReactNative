package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dri  reason: default package */
/* loaded from: classes3.dex */
public final class dri extends drf {
    /* JADX INFO: Access modifiers changed from: protected */
    public dri() {
        this.a.add(drr.APPLY);
        this.a.add(drr.BLOCK);
        this.a.add(drr.BREAK);
        this.a.add(drr.CASE);
        this.a.add(drr.DEFAULT);
        this.a.add(drr.CONTINUE);
        this.a.add(drr.DEFINE_FUNCTION);
        this.a.add(drr.FN);
        this.a.add(drr.IF);
        this.a.add(drr.QUOTE);
        this.a.add(drr.RETURN);
        this.a.add(drr.SWITCH);
        this.a.add(drr.TERNARY);
    }

    private static dqz c(dpu dpuVar, List list) {
        dqt.m(drr.FN, 2, list);
        dqz b = dpuVar.b((dqz) list.get(0));
        dqz b2 = dpuVar.b((dqz) list.get(1));
        if (!(b2 instanceof dqo)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b2.getClass().getCanonicalName()));
        }
        List m = ((dqo) b2).m();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new dqy(b.i(), m, arrayList, dpuVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
        if (r8.equals("continue") == false) goto L67;
     */
    @Override // defpackage.drf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dqz a(java.lang.String r8, defpackage.dpu r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dri.a(java.lang.String, dpu, java.util.List):dqz");
    }
}
