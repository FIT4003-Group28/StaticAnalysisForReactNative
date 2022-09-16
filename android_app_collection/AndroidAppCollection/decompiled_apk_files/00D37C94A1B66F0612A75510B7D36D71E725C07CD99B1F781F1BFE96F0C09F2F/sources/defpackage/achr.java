package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: achr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class achr implements View.OnClickListener {
    public final /* synthetic */ acid a;
    private final /* synthetic */ int b;

    public /* synthetic */ achr(acid acidVar, int i) {
        this.b = i;
        this.a = acidVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            acid acidVar = this.a;
            acidVar.aK();
            acic acicVar = acidVar.af;
            if (acicVar == null) {
                return;
            }
            acicVar.aC();
            return;
        }
        acid acidVar2 = this.a;
        acidVar2.aM();
        acidVar2.aE();
        acidVar2.aG();
    }
}
