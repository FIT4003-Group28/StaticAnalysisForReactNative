package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ablv  reason: default package */
/* loaded from: classes.dex */
final class ablv implements View.OnClickListener {
    final /* synthetic */ ablw a;

    public ablv(ablw ablwVar) {
        this.a = ablwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.dismiss();
    }
}
