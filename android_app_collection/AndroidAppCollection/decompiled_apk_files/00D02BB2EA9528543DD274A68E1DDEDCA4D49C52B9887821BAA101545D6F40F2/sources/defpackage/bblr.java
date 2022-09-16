package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
/* renamed from: bblr  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bblr implements cqfc {
    static final cqfc a = new bblr();

    private bblr() {
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        if (Build.VERSION.SDK_INT < 23 || !(view instanceof TextView)) {
            return;
        }
        ((TextView) view).setHyphenationFrequency(0);
    }
}
