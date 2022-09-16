package defpackage;

import android.content.Intent;
import android.view.View;
/* compiled from: PG */
/* renamed from: lkc  reason: default package */
/* loaded from: classes3.dex */
public final class lkc implements View.OnClickListener {
    final /* synthetic */ lkd a;

    public lkc(lkd lkdVar) {
        this.a = lkdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b.startActivity(new Intent("com.google.android.apps.wellbeing.action.WIND_DOWN"));
    }
}
