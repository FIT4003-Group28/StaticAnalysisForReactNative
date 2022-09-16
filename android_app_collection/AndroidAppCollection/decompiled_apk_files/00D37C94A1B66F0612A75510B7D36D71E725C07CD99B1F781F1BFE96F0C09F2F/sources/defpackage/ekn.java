package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ekn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ekn implements View.OnClickListener {
    public final /* synthetic */ ekx a;
    public final /* synthetic */ apoj b;
    private final /* synthetic */ int c;

    public /* synthetic */ ekn(ekx ekxVar, apoj apojVar) {
        this.a = ekxVar;
        this.b = apojVar;
    }

    public /* synthetic */ ekn(ekx ekxVar, apoj apojVar, int i) {
        this.c = i;
        this.a = ekxVar;
        this.b = apojVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c == 0) {
            ekx ekxVar = this.a;
            apoj apojVar = this.b;
            aafo aafoVar = ekxVar.b;
            apzg apzgVar = apojVar.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
            return;
        }
        ekx ekxVar2 = this.a;
        apoj apojVar2 = this.b;
        aafo aafoVar2 = ekxVar2.b;
        apzg apzgVar2 = apojVar2.p;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar2.a(apzgVar2);
    }
}
