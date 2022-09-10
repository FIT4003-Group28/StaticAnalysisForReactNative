package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: avab  reason: default package */
/* loaded from: classes2.dex */
final class avab implements View.OnClickListener {
    final /* synthetic */ avac a;

    public avab(avac avacVar) {
        this.a = avacVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        avac avacVar = this.a;
        avacVar.g.e(avacVar.c.a, aufs.ENABLED);
    }
}
