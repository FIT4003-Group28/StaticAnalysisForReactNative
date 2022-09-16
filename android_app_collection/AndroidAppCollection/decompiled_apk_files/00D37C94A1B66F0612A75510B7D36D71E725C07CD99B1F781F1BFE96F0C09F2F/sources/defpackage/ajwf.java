package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ajwf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajwf implements View.OnClickListener {
    public final /* synthetic */ ajwl a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajwf(ajwl ajwlVar, int i) {
        this.b = i;
        this.a = ajwlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            ajwl ajwlVar = this.a;
            if (ajwlVar.j) {
                return;
            }
            ajwlVar.j = true;
            ajwlVar.u();
            ajwlVar.o();
            return;
        }
        ajwl ajwlVar2 = this.a;
        if (!ajwlVar2.j) {
            return;
        }
        ajwlVar2.j = false;
        ajwlVar2.u();
        ajwlVar2.o();
    }
}
