package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alqt  reason: default package */
/* loaded from: classes.dex */
public final class alqt implements dbty<bnss> {
    final /* synthetic */ alrc a;

    public alqt(alrc alrcVar) {
        this.a = alrcVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ bnss a() {
        bnss bnssVar;
        alur aluqVar;
        alrc alrcVar = this.a;
        amyd a = alrcVar.k.a();
        alra alraVar = new alra(a);
        Context context = alrcVar.e;
        boolean z = Build.VERSION.SDK_INT >= 24 && !alrcVar.l.b();
        int i = context.getApplicationInfo().flags & 536870912;
        if (anac.e || i == 0 || z) {
            bnsp bnspVar = new bnsp(context, alraVar);
            bnspVar.setZOrderOnTop(false);
            bnssVar = bnspVar;
        } else {
            bnssVar = new bnsq(context, alraVar);
        }
        bnssVar.setTransparent(true);
        bnssVar.setRenderer(a);
        bnssVar.a().setFocusable(true);
        bnssVar.a().setImportantForAccessibility(2);
        akzh b = alrcVar.b();
        akyw akywVar = alrcVar.r;
        if (a.l()) {
            aluqVar = new alut(b, akywVar, a.j, a.k);
        } else {
            aluqVar = new aluq(a.c, a.m, b, akywVar, a.j, a.k, a.l.a().booleanValue() ? null : Choreographer.getInstance());
        }
        amqu amquVar = a.e;
        int identityHashCode = System.identityHashCode(a);
        if (b == null) {
            amquVar.f.remove(Integer.valueOf(identityHashCode));
        } else {
            amquVar.f.put(Integer.valueOf(identityHashCode), new amqs(b));
        }
        a.d = bnssVar;
        a.h = aluqVar;
        if (a.l()) {
            bnssVar.b();
        } else {
            aluqVar.a();
        }
        return bnssVar;
    }
}
