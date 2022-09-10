package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
/* compiled from: PG */
/* renamed from: dahb  reason: default package */
/* loaded from: classes5.dex */
final class dahb implements View.OnTouchListener {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ dahe b;

    public dahb(dahe daheVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = daheVar;
        this.a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.b.f()) {
                this.b.d = false;
            }
            this.b.e(this.a);
        }
        return false;
    }
}
