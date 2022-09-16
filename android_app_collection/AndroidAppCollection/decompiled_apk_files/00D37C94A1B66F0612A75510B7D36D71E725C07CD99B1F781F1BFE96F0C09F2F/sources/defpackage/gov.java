package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: gov  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gov implements View.OnClickListener {
    public final /* synthetic */ gow a;
    private final /* synthetic */ int b;

    public /* synthetic */ gov(gow gowVar, int i) {
        this.b = i;
        this.a = gowVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.i(2);
        } else if (i == 1) {
            gow gowVar = this.a;
            gowVar.f();
            gowVar.i(1);
        } else if (i == 2) {
            this.a.i(2);
        } else {
            gow gowVar2 = this.a;
            gowVar2.f();
            gowVar2.i(1);
        }
    }
}
