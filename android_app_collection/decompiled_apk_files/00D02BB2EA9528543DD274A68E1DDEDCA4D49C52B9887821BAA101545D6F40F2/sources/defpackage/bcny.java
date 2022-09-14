package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bcny  reason: default package */
/* loaded from: classes3.dex */
final class bcny implements View.OnClickListener {
    final /* synthetic */ bcnu a;
    final /* synthetic */ int b;

    public bcny(bcnu bcnuVar, int i) {
        this.a = bcnuVar;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g.a(view, this.b);
    }
}
