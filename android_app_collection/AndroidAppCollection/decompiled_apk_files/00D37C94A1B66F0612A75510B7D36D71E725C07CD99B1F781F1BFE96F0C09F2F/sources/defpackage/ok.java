package defpackage;

import android.view.Menu;
import android.view.MenuItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ok  reason: default package */
/* loaded from: classes3.dex */
public final class ok implements rd {
    final /* synthetic */ ot a;
    private final rd b;

    public ok(ot otVar, rd rdVar) {
        this.a = otVar;
        this.b = rdVar;
    }

    @Override // defpackage.rd
    public final void a(re reVar) {
        this.b.a(reVar);
        ot otVar = this.a;
        if (otVar.l != null) {
            otVar.e.getDecorView().removeCallbacks(this.a.m);
        }
        ot otVar2 = this.a;
        if (otVar2.k != null) {
            otVar2.N();
            ot otVar3 = this.a;
            ln q = lj.q(otVar3.k);
            q.c(0.0f);
            otVar3.n = q;
            this.a.n.f(new oj(this));
        }
        ot otVar4 = this.a;
        ob obVar = otVar4.f;
        if (obVar != null) {
            obVar.onSupportActionModeFinished(otVar4.j);
        }
        ot otVar5 = this.a;
        otVar5.j = null;
        lj.K(otVar5.p);
    }

    @Override // defpackage.rd
    public final boolean b(re reVar, MenuItem menuItem) {
        return this.b.b(reVar, menuItem);
    }

    @Override // defpackage.rd
    public final boolean c(re reVar, Menu menu) {
        return this.b.c(reVar, menu);
    }

    @Override // defpackage.rd
    public final boolean d(re reVar, Menu menu) {
        lj.K(this.a.p);
        return this.b.d(reVar, menu);
    }
}
