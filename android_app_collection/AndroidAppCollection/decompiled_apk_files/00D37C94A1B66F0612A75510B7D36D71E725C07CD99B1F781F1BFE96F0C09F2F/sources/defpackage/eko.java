package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: eko  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eko implements View.OnClickListener {
    public final /* synthetic */ ekx a;
    public final /* synthetic */ apzg b;
    private final /* synthetic */ int c;

    public /* synthetic */ eko(ekx ekxVar, apzg apzgVar) {
        this.a = ekxVar;
        this.b = apzgVar;
    }

    public /* synthetic */ eko(ekx ekxVar, apzg apzgVar, int i) {
        this.c = i;
        this.a = ekxVar;
        this.b = apzgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c == 0) {
            ekx ekxVar = this.a;
            ekxVar.b.c(this.b, null);
            return;
        }
        ekx ekxVar2 = this.a;
        ekxVar2.b.c(this.b, null);
    }
}
