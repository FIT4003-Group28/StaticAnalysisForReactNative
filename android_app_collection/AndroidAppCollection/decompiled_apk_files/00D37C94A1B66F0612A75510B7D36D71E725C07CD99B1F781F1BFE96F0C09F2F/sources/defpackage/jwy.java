package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jwy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jwy implements View.OnClickListener {
    public final /* synthetic */ jwz a;
    private final /* synthetic */ int b;

    public /* synthetic */ jwy(jwz jwzVar, int i) {
        this.b = i;
        this.a = jwzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.a.j();
        } else if (i == 1) {
            this.a.a.j();
        } else if (i == 2) {
            this.a.a.k();
        } else {
            this.a.a.k();
        }
    }
}
