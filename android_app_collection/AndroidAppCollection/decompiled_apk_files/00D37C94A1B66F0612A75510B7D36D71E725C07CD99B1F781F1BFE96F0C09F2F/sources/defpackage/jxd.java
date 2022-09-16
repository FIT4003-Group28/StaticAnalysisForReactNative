package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jxd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jxd implements View.OnClickListener {
    public final /* synthetic */ jxf a;
    private final /* synthetic */ int b;

    public /* synthetic */ jxd(jxf jxfVar, int i) {
        this.b = i;
        this.a = jxfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            jxf jxfVar = this.a;
            if (jxfVar.d.e() == null || amps.e(jxfVar.c)) {
                return;
            }
            adnt e = jxfVar.d.e();
            adnk c = adnl.c();
            c.f(jxfVar.c);
            e.L(c.a());
            jxfVar.kT();
            return;
        }
        jxf jxfVar2 = this.a;
        if (jxfVar2.d.e() == null) {
            return;
        }
        jxfVar2.d.e().E();
        jxfVar2.g(true);
    }
}
