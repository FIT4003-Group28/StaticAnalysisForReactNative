package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ajlc  reason: default package */
/* loaded from: classes.dex */
final class ajlc implements tdp {
    final /* synthetic */ ajjk a;
    final /* synthetic */ acum b;
    private final /* synthetic */ int c;

    public ajlc(ajjk ajjkVar, acum acumVar) {
        this.a = ajjkVar;
        this.b = acumVar;
    }

    public ajlc(ajjk ajjkVar, acum acumVar, int i) {
        this.c = i;
        this.a = ajjkVar;
        this.b = acumVar;
    }

    @Override // defpackage.tdp
    public final /* synthetic */ void b(View view, View view2) {
        if (this.c == 0) {
            tfo.k(this, view);
        } else {
            tfo.k(this, view);
        }
    }

    @Override // defpackage.tdp
    public final void d(View view) {
        if (this.c == 0) {
            ajjk ajjkVar = this.a;
            ajjkVar.a.u(this.b, ajjkVar.b);
            return;
        }
        ajjk ajjkVar2 = this.a;
        ajjkVar2.a.u(this.b, ajjkVar2.b);
    }
}
