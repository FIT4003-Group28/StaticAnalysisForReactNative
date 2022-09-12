package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dkm  reason: default package */
/* loaded from: classes6.dex */
public final class dkm implements View.OnClickListener {
    @dzsi
    public View.OnClickListener a;
    private final cjqy b;

    public dkm(cjqy cjqyVar) {
        this.b = cjqyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cjql e;
        cjqy cjqyVar = this.b;
        cjtd k = cjqg.k(view);
        if (k != null && (e = cjqg.e(view)) != null) {
            cjqyVar.j(e, k);
        }
        View.OnClickListener onClickListener = this.a;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(view);
    }
}
