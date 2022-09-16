package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wct  reason: default package */
/* loaded from: classes4.dex */
public final class wct extends ClickableSpan {
    final /* synthetic */ int a;
    final /* synthetic */ wcu b;

    public wct(wcu wcuVar, int i) {
        this.b = wcuVar;
        this.a = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i = this.a;
        if (i == R.string.other_methods_suffix) {
            this.b.c.j(4);
        } else if (i != R.string.use_fingerprint_suffix) {
        } else {
            this.b.c.j(6);
        }
    }
}
