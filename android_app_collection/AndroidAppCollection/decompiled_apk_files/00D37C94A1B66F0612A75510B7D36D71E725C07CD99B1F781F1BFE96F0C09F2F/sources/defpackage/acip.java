package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: acip  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acip implements View.OnClickListener {
    public final /* synthetic */ acix a;
    private final /* synthetic */ int b;

    public /* synthetic */ acip(acix acixVar, int i) {
        this.b = i;
        this.a = acixVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.b.setText((CharSequence) null);
        } else {
            this.a.a(null);
        }
    }
}
