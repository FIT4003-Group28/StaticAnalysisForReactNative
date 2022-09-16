package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zju  reason: default package */
/* loaded from: classes4.dex */
final class zju implements View.OnClickListener {
    final /* synthetic */ zjw a;

    public zju(zjw zjwVar) {
        this.a = zjwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b.dismiss();
    }
}
