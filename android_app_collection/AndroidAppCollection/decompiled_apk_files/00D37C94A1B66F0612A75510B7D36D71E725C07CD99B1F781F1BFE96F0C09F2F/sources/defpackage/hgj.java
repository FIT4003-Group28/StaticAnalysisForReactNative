package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hgj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hgj implements View.OnClickListener {
    public final /* synthetic */ hgk a;
    private final /* synthetic */ int b;

    public /* synthetic */ hgj(hgk hgkVar) {
        this.a = hgkVar;
    }

    public /* synthetic */ hgj(hgk hgkVar, int i) {
        this.b = i;
        this.a = hgkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            hgf hgfVar = this.a.b;
            hgfVar.b.i.z();
            hgfVar.a.j();
        } else if (i == 1) {
            hgf hgfVar2 = this.a.b;
            hgfVar2.b.i.z();
            hgfVar2.b.b();
        } else {
            this.a.b.b.i.z();
        }
    }
}
