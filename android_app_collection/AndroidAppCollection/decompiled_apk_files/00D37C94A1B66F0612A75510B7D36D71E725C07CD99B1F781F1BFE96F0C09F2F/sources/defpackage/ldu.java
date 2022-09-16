package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ldu  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ldu implements View.OnClickListener {
    public final /* synthetic */ ldv a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldu(ldv ldvVar, int i) {
        this.b = i;
        this.a = ldvVar;
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
        leu leuVar2 = this.a.a;
        if (leuVar2 == null) {
            return;
        }
        leuVar2.h();
    }
}
