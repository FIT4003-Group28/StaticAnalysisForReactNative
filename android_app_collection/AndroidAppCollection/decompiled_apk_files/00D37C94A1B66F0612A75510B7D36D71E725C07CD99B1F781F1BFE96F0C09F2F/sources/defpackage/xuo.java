package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: xuo  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xuo implements View.OnClickListener {
    public final /* synthetic */ xuz a;
    public final /* synthetic */ apoj b;
    private final /* synthetic */ int c;

    public /* synthetic */ xuo(xuz xuzVar, apoj apojVar) {
        this.a = xuzVar;
        this.b = apojVar;
    }

    public /* synthetic */ xuo(xuz xuzVar, apoj apojVar, int i) {
        this.c = i;
        this.a = xuzVar;
        this.b = apojVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c == 0) {
            xuz xuzVar = this.a;
            apoj apojVar = this.b;
            aafo aafoVar = xuzVar.af;
            apzg apzgVar = apojVar.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
            xuzVar.aM();
            return;
        }
        xuz xuzVar2 = this.a;
        apoj apojVar2 = this.b;
        aafo aafoVar2 = xuzVar2.af;
        apzg apzgVar2 = apojVar2.p;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar2.c(apzgVar2, null);
    }
}
