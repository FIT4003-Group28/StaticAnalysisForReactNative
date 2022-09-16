package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kbz  reason: default package */
/* loaded from: classes3.dex */
final class kbz extends jo {
    final /* synthetic */ kcb b;

    public kbz(kcb kcbVar) {
        this.b = kcbVar;
    }

    @Override // defpackage.jo
    public final void d(View view, mh mhVar) {
        super.d(view, mhVar);
        if (view.isClickable()) {
            mhVar.A(this.b.b.getString(R.string.accessibility_chapters_list_button_hint));
        }
    }
}
