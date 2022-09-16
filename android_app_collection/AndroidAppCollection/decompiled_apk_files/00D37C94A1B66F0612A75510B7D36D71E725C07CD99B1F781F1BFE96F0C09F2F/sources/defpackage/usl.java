package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: usl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class usl implements View.OnClickListener {
    public final /* synthetic */ usu a;
    private final /* synthetic */ int b;

    public /* synthetic */ usl(usu usuVar) {
        this.a = usuVar;
    }

    public /* synthetic */ usl(usu usuVar, int i) {
        this.b = i;
        this.a = usuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.mJ().onBackPressed();
            return;
        }
        usu usuVar = this.a;
        usuVar.d.setVisibility(0);
        usuVar.e.setVisibility(0);
        usuVar.ae.setVisibility(8);
        usuVar.c.setVisibility(8);
        usuVar.n();
    }
}
