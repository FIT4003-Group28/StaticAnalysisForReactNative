package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: bcnz  reason: default package */
/* loaded from: classes3.dex */
final class bcnz implements View.OnAttachStateChangeListener {
    @dzsi
    apnr a;
    public final Rect b = new Rect();
    @dzsi
    public View c;
    final /* synthetic */ bcoc d;

    public bcnz(bcoc bcocVar) {
        this.d = bcocVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.c = view;
        apnr apnrVar = this.a;
        if (apnrVar != null) {
            apnrVar.a(this.d);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c = null;
        apnr apnrVar = this.a;
        if (apnrVar != null) {
            apnrVar.b(this.d);
        }
    }
}
