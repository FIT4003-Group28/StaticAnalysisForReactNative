package defpackage;

import android.content.Intent;
import android.view.View;
/* compiled from: PG */
/* renamed from: cxwy  reason: default package */
/* loaded from: classes5.dex */
final class cxwy implements View.OnClickListener {
    final /* synthetic */ cxxa a;
    final /* synthetic */ cxwm b;
    final /* synthetic */ cxwz c;

    public cxwy(cxwz cxwzVar, cxxa cxxaVar, cxwm cxwmVar) {
        this.c = cxwzVar;
        this.a = cxxaVar;
        this.b = cxwmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int f = this.a.f();
        cxxb cxxbVar = this.c.e;
        int i = true != (cxxbVar.e instanceof cxwo) ? 0 : 3;
        if (f > i) {
            f = i;
        }
        cxxbVar.b(5, f);
        this.c.e.e.b(this.b);
        bwdn bwdnVar = this.c.e.i;
        Intent intent = (Intent) bwdnVar.a.get(this.b.a());
        if (intent != null) {
            bwdnVar.b.aP(cjql.a, intent, true);
        }
    }
}
