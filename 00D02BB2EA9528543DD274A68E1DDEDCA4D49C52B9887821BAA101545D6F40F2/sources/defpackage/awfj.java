package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: awfj  reason: default package */
/* loaded from: classes3.dex */
final class awfj implements View.OnClickListener {
    final /* synthetic */ awfk a;

    public awfj(awfk awfkVar) {
        this.a = awfkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.c.k()) {
            boolean z = this.a.c.i() == 0;
            this.a.d.g(z);
            Runnable runnable = this.a.h;
            if (runnable != null) {
                runnable.run();
            }
            if (z) {
                awfk awfkVar = this.a;
                cjql cjqlVar = awfkVar.i;
                if (cjqlVar == null) {
                    return;
                }
                awfkVar.f.n(cjqlVar, new cjte(deaf.TAP), awfk.a);
                return;
            }
            awfk awfkVar2 = this.a;
            cjql cjqlVar2 = awfkVar2.j;
            if (cjqlVar2 == null) {
                return;
            }
            awfkVar2.f.n(cjqlVar2, new cjte(deaf.TAP), awfk.b);
        }
    }
}
