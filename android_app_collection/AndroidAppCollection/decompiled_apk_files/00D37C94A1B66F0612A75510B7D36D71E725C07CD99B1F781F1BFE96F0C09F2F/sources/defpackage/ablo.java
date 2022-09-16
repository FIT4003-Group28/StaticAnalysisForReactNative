package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ablo  reason: default package */
/* loaded from: classes.dex */
final class ablo implements View.OnClickListener {
    final /* synthetic */ ablp a;

    public ablo(ablp ablpVar) {
        this.a = ablpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.dismiss();
    }
}
