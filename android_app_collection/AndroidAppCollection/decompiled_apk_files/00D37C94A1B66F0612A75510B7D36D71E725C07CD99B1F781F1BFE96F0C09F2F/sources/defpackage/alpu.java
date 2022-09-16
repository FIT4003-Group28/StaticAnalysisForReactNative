package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: alpu  reason: default package */
/* loaded from: classes.dex */
final class alpu implements View.OnTouchListener {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ alpx b;

    public alpu(alpx alpxVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = alpxVar;
        this.a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.b.g()) {
                this.b.d = false;
            }
            this.b.e(this.a);
        }
        return false;
    }
}
