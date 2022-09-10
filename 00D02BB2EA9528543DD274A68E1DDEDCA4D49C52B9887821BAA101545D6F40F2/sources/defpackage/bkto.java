package defpackage;

import android.content.res.Resources;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkto  reason: default package */
/* loaded from: classes3.dex */
public class bkto implements bksf {
    public final bkts a;
    public final blhs b;
    public final bktq c;
    private final List<bkrw> d = dcbg.c(blif.b).s(new dbrn(this) { // from class: bktm
        private final bkto a;

        {
            this.a = this;
        }

        @Override // defpackage.dbrn
        public final Object a(Object obj) {
            bkto bktoVar = this.a;
            blif blifVar = (blif) obj;
            bkts bktsVar = bktoVar.a;
            blhs blhsVar = bktoVar.b;
            int b = blifVar.b();
            int c = blifVar.c();
            cqtd cqtdVar = (cqtd) blifVar.d().h(bktn.a).f();
            cjtd a = cjtd.a(blifVar.g());
            bktq bktqVar = bktoVar.c;
            Resources a2 = bktsVar.a.a();
            bkts.a(a2, 1);
            bkts.a(blhsVar, 2);
            bkts.a(blifVar, 3);
            bkts.a(a, 7);
            bkts.a(bktqVar, 8);
            return new bktr(a2, blhsVar, blifVar, b, c, cqtdVar, a, bktqVar);
        }
    }).z();

    public bkto(bkts bktsVar, blhs blhsVar, bktq bktqVar) {
        this.a = bktsVar;
        this.b = blhsVar;
        this.c = bktqVar;
    }

    @Override // defpackage.bksf
    public List<bkrw> a() {
        return this.d;
    }
}
