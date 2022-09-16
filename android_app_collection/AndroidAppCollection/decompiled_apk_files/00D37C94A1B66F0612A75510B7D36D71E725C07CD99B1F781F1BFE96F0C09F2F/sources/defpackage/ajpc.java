package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ajpc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajpc implements View.OnClickListener {
    public final /* synthetic */ ajpf a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajpc(ajpf ajpfVar, int i) {
        this.b = i;
        this.a = ajpfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            ajpf ajpfVar = this.a;
            ajpfVar.c.setVisibility(0);
            ajpfVar.d.setVisibility(8);
            ajpfVar.e = false;
            return;
        }
        ajpf ajpfVar2 = this.a;
        ajpfVar2.d.setVisibility(0);
        ajpfVar2.c.setVisibility(8);
        ajpfVar2.e = true;
    }
}
