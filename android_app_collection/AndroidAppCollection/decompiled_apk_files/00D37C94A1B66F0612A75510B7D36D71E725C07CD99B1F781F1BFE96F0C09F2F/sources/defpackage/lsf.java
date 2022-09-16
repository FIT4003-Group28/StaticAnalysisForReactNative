package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lsf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lsf implements View.OnClickListener {
    public final /* synthetic */ lsl a;
    private final /* synthetic */ int b;

    public /* synthetic */ lsf(lsl lslVar) {
        this.a = lslVar;
    }

    public /* synthetic */ lsf(lsl lslVar, int i) {
        this.b = i;
        this.a = lslVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            lsl lslVar = this.a;
            lslVar.c.clearFocus();
            lse lseVar = lslVar.h;
            if (lseVar != null) {
                lseVar.d();
            }
            zag.i(lslVar.c);
            if (lslVar.f) {
                lslVar.g();
                lslVar.h(true);
                return;
            }
            lslVar.g();
            lslVar.f();
            return;
        }
        lsl lslVar2 = this.a;
        lslVar2.g();
        if (lslVar2.c.hasFocus()) {
            return;
        }
        lslVar2.c.requestFocus();
        zag.p(lslVar2.c);
    }
}
