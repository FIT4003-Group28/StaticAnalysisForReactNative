package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wbm  reason: default package */
/* loaded from: classes4.dex */
final class wbm extends ClickableSpan {
    final /* synthetic */ int a;
    final /* synthetic */ wbn b;

    public wbm(wbn wbnVar, int i) {
        this.b = wbnVar;
        this.a = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i = this.a;
        if (i == R.string.other_methods_suffix) {
            this.b.d.j(4);
        } else if (i != R.string.use_password_suffix) {
        } else {
            this.b.d.j(7);
        }
    }
}
