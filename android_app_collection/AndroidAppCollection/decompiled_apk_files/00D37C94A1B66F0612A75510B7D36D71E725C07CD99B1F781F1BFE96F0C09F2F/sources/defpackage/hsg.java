package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hsg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hsg implements View.OnClickListener {
    public final /* synthetic */ hsl a;
    private final /* synthetic */ int b;

    public /* synthetic */ hsg(hsl hslVar, int i) {
        this.b = i;
        this.a = hslVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.j();
        } else {
            this.a.c.setText("");
        }
    }
}
