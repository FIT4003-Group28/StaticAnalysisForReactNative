package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bagj  reason: default package */
/* loaded from: classes3.dex */
public class bagj implements baeo {
    private final List<izx> a;

    public bagj(final anhg anhgVar, final axwy axwyVar) {
        this.a = dcdc.i(new bagi(new ivc(anhgVar) { // from class: baga
            private final anhg a;

            {
                this.a = anhgVar;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                this.a.C();
            }
        }), new bagh(new ivc(axwyVar) { // from class: bagb
            private final axwy a;

            {
                this.a = axwyVar;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                this.a.r();
            }
        }), new bagf(new ivc(axwyVar) { // from class: bagc
            private final axwy a;

            {
                this.a = axwyVar;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                this.a.q();
            }
        }), new bagg(new ivc(axwyVar) { // from class: bagd
            private final axwy a;

            {
                this.a = axwyVar;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                this.a.s();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqtd a(cqtd cqtdVar) {
        return new bage(new Object[]{cqtdVar}, cqtdVar);
    }

    @Override // defpackage.izw
    @dzsi
    public cjtd b() {
        return null;
    }

    @Override // defpackage.izw
    public List<izx> c() {
        return this.a;
    }
}
