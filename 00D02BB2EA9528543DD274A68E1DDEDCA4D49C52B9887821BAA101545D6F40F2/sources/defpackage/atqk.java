package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* renamed from: atqk  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atqk implements cqgp {
    static final cqgp a = new atqk();

    private atqk() {
    }

    @Override // defpackage.cqgp
    public final void a(View view, cqkp cqkpVar) {
        dcqe dcqeVar = atqo.a;
        azz a2 = azz.a(view.getContext(), R.drawable.animated_check);
        if (a2 != null) {
            ((ImageView) view).setImageDrawable(a2);
            a2.start();
            return;
        }
        bvoo.h("Animated drawable not found. Cannot perform animation.", new Object[0]);
    }
}
