package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avap  reason: default package */
/* loaded from: classes2.dex */
public final class avap {
    public final avku a;
    public final avll b;
    public final avkp c;
    public final crzm<avkq> d;
    public final avoj e;
    public final Executor f;
    public final crzm<avzg> g;
    private final avki h;

    public avap(avku avkuVar, avll avllVar, avkp avkpVar, crzm<avkq> crzmVar, Executor executor, avoj avojVar, avki avkiVar, crzm<avzg> crzmVar2) {
        this.a = avkuVar;
        this.b = avllVar;
        this.c = avkpVar;
        this.d = crzmVar;
        this.e = avojVar;
        this.f = dehx.b(executor);
        this.h = avkiVar;
        this.g = crzmVar2;
    }

    public final void a() {
        avzg l = this.g.l();
        if (l == null) {
            return;
        }
        final avze b = l.b();
        final dlsw b2 = l.a().b();
        deha.q(this.h.p(b2), bvqj.b(new bvqg(this, b, b2) { // from class: avao
            private final avap a;
            private final avze b;
            private final dlsw c;

            {
                this.a = this;
                this.b = b;
                this.c = b2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
                if (r8.equals(defpackage.dlug.c) != false) goto L111;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
                if (r9.equals(r8) == false) goto L107;
             */
            @Override // defpackage.bvqg
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void NU(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 699
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.avao.NU(java.lang.Object):void");
            }
        }), this.f);
    }
}
