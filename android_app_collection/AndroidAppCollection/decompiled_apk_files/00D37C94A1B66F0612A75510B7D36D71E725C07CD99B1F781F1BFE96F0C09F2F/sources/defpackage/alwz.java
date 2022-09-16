package defpackage;

import android.os.Build;
import android.view.ViewTreeObserver;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alwz  reason: default package */
/* loaded from: classes.dex */
public final class alwz implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ alxa b;

    public alwz(alxa alxaVar, TextView textView) {
        this.b = alxaVar;
        this.a = textView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int lineCount = this.a.getLineCount();
        alxa alxaVar = this.b;
        if (lineCount > alxaVar.e) {
            this.a.setTextSize(0, alxaVar.c);
            if (Build.VERSION.SDK_INT >= 28) {
                TextView textView = this.a;
                alxa alxaVar2 = this.b;
                textView.setLineHeight(Math.round(alxaVar2.d + alxaVar2.c));
            }
            this.a.invalidate();
            return false;
        }
        return true;
    }
}
