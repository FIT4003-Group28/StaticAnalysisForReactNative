package defpackage;

import android.content.res.TypedArray;
import android.view.View;
/* compiled from: PG */
/* renamed from: czwa  reason: default package */
/* loaded from: classes5.dex */
final class czwa implements View.OnClickListener {
    final /* synthetic */ czwe a;

    public czwa(czwe czweVar) {
        this.a = czweVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        czwe czweVar = this.a;
        if (!czweVar.b || !czweVar.isShowing()) {
            return;
        }
        czwe czweVar2 = this.a;
        if (!czweVar2.d) {
            TypedArray obtainStyledAttributes = czweVar2.getContext().obtainStyledAttributes(new int[]{16843611});
            czweVar2.c = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            czweVar2.d = true;
        }
        if (!czweVar2.c) {
            return;
        }
        this.a.cancel();
    }
}
