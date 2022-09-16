package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lej  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lej implements View.OnClickListener {
    public final /* synthetic */ lek a;
    private final /* synthetic */ int b;

    public /* synthetic */ lej(lek lekVar, int i) {
        this.b = i;
        this.a = lekVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            leu leuVar = this.a.a;
            if (leuVar == null) {
                return;
            }
            ((lec) leuVar).e();
            return;
        }
        lek lekVar = this.a;
        lekVar.b.setVisibility(4);
        lekVar.c.setVisibility(8);
        leu leuVar2 = lekVar.a;
        if (leuVar2 == null) {
            return;
        }
        leuVar2.h();
    }
}
