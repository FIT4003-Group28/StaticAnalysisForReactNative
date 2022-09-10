package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: awfz  reason: default package */
/* loaded from: classes3.dex */
public final class awfz implements View.OnClickListener {
    final /* synthetic */ awga a;

    public awfz(awga awgaVar) {
        this.a = awgaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cjql cjqlVar;
        if (this.a.a.k()) {
            int i = this.a.a.i();
            awga awgaVar = this.a;
            awgaVar.c.T(bvjk.ei, awgaVar.f, i == 0);
            Runnable runnable = this.a.g;
            if (runnable != null) {
                runnable.run();
            }
            cjtd cjtdVar = i == 0 ? this.a.i : this.a.j;
            if (i == 0) {
                cjqlVar = this.a.k;
            } else {
                cjqlVar = this.a.l;
            }
            if (cjtdVar != null && cjqlVar != null) {
                this.a.e.n(cjqlVar, new cjte(deaf.TAP), cjtdVar);
            }
        }
        for (Runnable runnable2 : this.a.b) {
            runnable2.run();
        }
    }
}
