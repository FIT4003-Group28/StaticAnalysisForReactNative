package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: icz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class icz implements View.OnClickListener {
    public final /* synthetic */ idj a;
    private final /* synthetic */ int b;

    public /* synthetic */ icz(idj idjVar, int i) {
        this.b = i;
        this.a = idjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            ier ierVar = this.a.u;
            if (ierVar == null) {
                return;
            }
            ierVar.aQ();
        } else if (i != 1) {
            ier ierVar2 = this.a.u;
            if (ierVar2 == null) {
                return;
            }
            ierVar2.aQ();
        } else {
            ier ierVar3 = this.a.u;
            if (ierVar3 == null) {
                return;
            }
            ierVar3.aQ();
        }
    }
}
