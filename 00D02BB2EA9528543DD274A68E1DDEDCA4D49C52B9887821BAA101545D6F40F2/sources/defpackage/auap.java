package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auap  reason: default package */
/* loaded from: classes2.dex */
public final class auap implements View.OnAttachStateChangeListener {
    final /* synthetic */ auax a;

    public auap(auax auaxVar) {
        this.a = auaxVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        auax auaxVar = this.a;
        auan auanVar = auaxVar.d;
        auaq auaqVar = auaxVar.B;
        dbsk.s(auaqVar);
        auanVar.i = auaqVar;
        btrm btrmVar = auanVar.a;
        dceq a = dcet.a();
        a.b(amqo.class, new auao(0, amqo.class, auanVar, bvrj.UI_THREAD));
        a.b(crhp.class, new auao(1, crhp.class, auanVar, bvrj.UI_THREAD));
        btrmVar.g(auanVar, a.a());
        auax auaxVar2 = this.a;
        auay auayVar = auaxVar2.e;
        auar auarVar = auaxVar2.C;
        dbsk.s(auarVar);
        auayVar.b = auarVar;
        btrm btrmVar2 = auayVar.a;
        dceq a2 = dcet.a();
        a2.b(cria.class, new auaz(0, cria.class, auayVar));
        a2.b(crhy.class, new auaz(1, crhy.class, auayVar));
        btrmVar2.g(auayVar, a2.a());
        auax auaxVar3 = this.a;
        aubb aubbVar = auaxVar3.f;
        auas auasVar = auaxVar3.D;
        dbsk.s(auasVar);
        aubbVar.e = auasVar;
        aubbVar.a();
        aubbVar.b();
        aubbVar.a.f(aubbVar.d);
        auasVar.a(aubbVar.b);
        auasVar.b(aubbVar.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aubb aubbVar = this.a.f;
        aubbVar.a.g(aubbVar.d);
        aubbVar.e = null;
        auay auayVar = this.a.e;
        auayVar.a.a(auayVar);
        auayVar.b = null;
        auan auanVar = this.a.d;
        auanVar.a.a(auanVar);
        auanVar.d();
        auanVar.c(null);
        auanVar.i = null;
        auanVar.b = null;
        auanVar.c = -1;
    }
}
