package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bgqa  reason: default package */
/* loaded from: classes3.dex */
class bgqa implements jbk {
    final /* synthetic */ bgqd a;

    public bgqa(bgqd bgqdVar) {
        this.a = bgqdVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz a = jhz.a();
        a.x = false;
        a.q = cqta.f();
        a.g = ibl.b();
        a.f(new View.OnClickListener(this) { // from class: bgpz
            private final bgqa a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bgqa bgqaVar = this.a;
                cjqy cjqyVar = bgqaVar.a.a;
                cjta b = cjtd.b();
                b.d = dtxu.aR;
                b.g(bgqaVar.a.c.q);
                cjqyVar.i(b.a());
                bgqaVar.a.b.s();
            }
        });
        return a.b();
    }
}
