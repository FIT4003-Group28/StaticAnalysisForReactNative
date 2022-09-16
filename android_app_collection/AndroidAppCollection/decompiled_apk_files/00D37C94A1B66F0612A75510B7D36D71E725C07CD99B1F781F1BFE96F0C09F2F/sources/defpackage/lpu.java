package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lpu  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lpu implements View.OnClickListener {
    public final /* synthetic */ lpw a;
    private final /* synthetic */ int b;

    public /* synthetic */ lpu(lpw lpwVar, int i) {
        this.b = i;
        this.a = lpwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            lpw lpwVar = this.a;
            lpwVar.ap.c(lpwVar.at, null);
            return;
        }
        lpw lpwVar2 = this.a;
        lpwVar2.ap.c(lpwVar2.au, null);
    }
}
