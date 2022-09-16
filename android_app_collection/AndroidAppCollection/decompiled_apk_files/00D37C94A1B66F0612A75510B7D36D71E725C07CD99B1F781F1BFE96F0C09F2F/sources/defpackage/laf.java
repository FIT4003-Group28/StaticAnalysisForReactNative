package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: laf  reason: default package */
/* loaded from: classes3.dex */
final class laf implements View.OnClickListener {
    final /* synthetic */ laj a;
    private final /* synthetic */ int b;

    public laf(laj lajVar) {
        this.a = lajVar;
    }

    public laf(laj lajVar, int i) {
        this.b = i;
        this.a = lajVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            laj lajVar = this.a;
            lajVar.b = !lajVar.b;
            lajVar.f();
            return;
        }
        laj lajVar2 = this.a;
        aafo aafoVar = lajVar2.a;
        apzg apzgVar = lajVar2.c.d;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, null);
    }
}
