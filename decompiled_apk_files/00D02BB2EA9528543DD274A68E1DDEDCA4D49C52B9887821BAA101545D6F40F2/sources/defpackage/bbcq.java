package defpackage;

import android.os.Bundle;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbcq  reason: default package */
/* loaded from: classes3.dex */
public final class bbcq extends bbea<bbnf> {
    private static final dcqe g = dcqe.c("bbcq");
    private bboh ad;
    public bwqv c;
    public bboi d;

    @Override // defpackage.ges
    protected final void Nv() {
        ((bbcr) btsx.b(bbcr.class, this)).cB(this);
    }

    @Override // defpackage.bbea
    protected final cqiw<bbnf> bn() {
        return new bbje();
    }

    @Override // defpackage.bbea
    protected final /* bridge */ /* synthetic */ bbnf bo() {
        return this.ad;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2;
        bbdy bbdyVar;
        super.l(bundle);
        if (bundle != null) {
            bundle2 = bundle;
        } else {
            bundle2 = this.o;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
        }
        try {
            bwrs e = this.c.e(ilo.class, bundle2, "pm");
            boolean z = bundle2.getBoolean("filter place sentiment key", false);
            boolean z2 = bundle2.getBoolean("enable personalization feedback key", true);
            boolean z3 = bundle2.getBoolean("enable dining preferences option", true);
            fd G = G();
            if (G instanceof bbdy) {
                bbdyVar = (bbdy) G;
            } else {
                if (G != null) {
                    bvoo.h("[discovery-p13n-ui-eng@]: EditPersonalScoreMatchDialogFragment::setTargetFragment must be called with an instance of PersonalizationFeedbackCompletionListenerFragment.", new Object[0]);
                }
                bbdyVar = null;
            }
            bboi bboiVar = this.d;
            dbsk.s(e);
            Runnable runnable = new Runnable(this) { // from class: bbcp
                private final bbcq a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    gn gnVar = this.a.A;
                    if (gnVar != null) {
                        gnVar.f();
                    }
                }
            };
            gga a = bboiVar.a.a();
            bboi.a(a, 1);
            btvo a2 = bboiVar.b.a();
            bboi.a(a2, 2);
            dxio a3 = ((dxjh) bboiVar.c).a();
            bboi.a(a3, 3);
            dxio a4 = ((dxjh) bboiVar.d).a();
            bboi.a(a4, 4);
            dxio a5 = ((dxjh) bboiVar.e).a();
            bboi.a(a5, 5);
            Executor a6 = bboiVar.f.a();
            bboi.a(a6, 6);
            bbnl a7 = bboiVar.g.a();
            bboi.a(a7, 7);
            bboi.a(e, 8);
            bboi.a(runnable, 13);
            this.ad = new bboh(a, a2, a3, a4, a5, a6, a7, e, z, z2, z3, bbdyVar, runnable);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbea
    public final cqjg w() {
        return bbje.a;
    }
}
