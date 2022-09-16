package defpackage;

import android.content.res.TypedArray;
import android.view.View;
/* compiled from: PG */
/* renamed from: aljk  reason: default package */
/* loaded from: classes.dex */
final class aljk implements View.OnClickListener {
    final /* synthetic */ aljo a;

    public aljk(aljo aljoVar) {
        this.a = aljoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aljo aljoVar = this.a;
        if (!aljoVar.d || !aljoVar.isShowing()) {
            return;
        }
        aljo aljoVar2 = this.a;
        if (!aljoVar2.f) {
            TypedArray obtainStyledAttributes = aljoVar2.getContext().obtainStyledAttributes(new int[]{16843611});
            aljoVar2.e = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            aljoVar2.f = true;
        }
        if (!aljoVar2.e) {
            return;
        }
        this.a.cancel();
    }
}
