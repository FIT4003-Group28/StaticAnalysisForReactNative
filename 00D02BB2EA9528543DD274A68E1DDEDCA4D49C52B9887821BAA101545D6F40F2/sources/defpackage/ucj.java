package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ucj  reason: default package */
/* loaded from: classes7.dex */
public class ucj implements ubs {
    public final tgg a;
    private boolean b = false;

    public ucj(tgg tggVar, cqhn cqhnVar) {
        this.a = tggVar;
    }

    @Override // defpackage.ubs
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: uci
            private final ucj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a();
            }
        };
    }

    @Override // defpackage.ubs
    public boolean b() {
        return this.b;
    }

    @Override // defpackage.ubs
    public cjtd c() {
        return cjtd.a(dtxn.cP);
    }

    public void d(boolean z) {
        if (this.b != z) {
            this.b = z;
            cqkx.p(this);
        }
    }
}
