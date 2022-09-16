package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mjf  reason: default package */
/* loaded from: classes3.dex */
final class mjf implements View.OnClickListener {
    final /* synthetic */ mjh a;

    public mjf(mjh mjhVar) {
        this.a = mjhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mjh mjhVar = this.a;
        mjg mjgVar = mjhVar.c;
        if (mjgVar == null) {
            return;
        }
        mjgVar.c = true;
        mjhVar.b.setText(mjgVar.b);
        mjhVar.a.setVisibility(8);
    }
}
