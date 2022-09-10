package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bfdi  reason: default package */
/* loaded from: classes3.dex */
public abstract class bfdi extends ges implements begd {
    public bgqo ar;

    public void aT() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract bwrs<ilo> aV();

    @Override // defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        super.l(bundle);
        bgqo bgqoVar = this.ar;
        if (bgqoVar == null) {
            return;
        }
        final bgqn a = bgqoVar.a(new dbty(this) { // from class: bfdg
            private final bfdi a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.aV();
            }
        });
        bvor.a(bd(), new mw(a) { // from class: bfdh
            private final bgqn a;

            {
                this.a = a;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                ((cjqp) obj).g(this.a);
            }
        });
    }
}
