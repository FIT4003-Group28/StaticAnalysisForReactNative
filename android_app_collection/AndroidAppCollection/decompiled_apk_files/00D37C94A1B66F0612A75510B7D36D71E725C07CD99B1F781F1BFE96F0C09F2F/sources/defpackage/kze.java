package defpackage;

import android.view.ViewTreeObserver;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: kze  reason: default package */
/* loaded from: classes3.dex */
final class kze implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ kzg b;

    public kze(kzg kzgVar, TextView textView) {
        this.b = kzgVar;
        this.a = textView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int lineCount = this.a.getLineCount();
        kzg kzgVar = this.b;
        if (lineCount != kzgVar.z || !kzgVar.f) {
            return true;
        }
        kzgVar.e.b();
        return true;
    }
}
