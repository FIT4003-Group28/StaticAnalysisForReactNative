package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dbha  reason: default package */
/* loaded from: classes5.dex */
final class dbha extends LinearLayout {
    public final dbes a;
    public boolean b;
    public dbij c;
    public final ArrayList<dbgz> d;
    private final View e;
    private final Picture f;

    public dbha(Context context, View view) {
        super(context);
        this.f = new Picture();
        this.b = false;
        this.d = new ArrayList<>();
        dbjb.d(view, "Parameter \"view\" was null.");
        this.a = new dbes();
        this.e = view;
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(dbgz dbgzVar) {
        if (!this.d.contains(dbgzVar)) {
            this.d.add(dbgzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        dbij dbijVar = this.c;
        if (dbijVar != null) {
            ViewParent parent = getParent();
            FrameLayout frameLayout = dbijVar.d;
            if (parent == frameLayout) {
                frameLayout.removeView(this);
            }
            this.c = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Surface b = this.a.b();
        if (!b.isValid()) {
            return;
        }
        if (this.e.isDirty()) {
            Canvas beginRecording = this.f.beginRecording(this.e.getWidth(), this.e.getHeight());
            beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
            super.dispatchDraw(beginRecording);
            this.f.endRecording();
            Canvas lockCanvas = b.lockCanvas(null);
            this.f.draw(lockCanvas);
            b.unlockCanvasAndPost(lockCanvas);
            this.b = true;
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.a().setDefaultBufferSize(this.e.getWidth(), this.e.getHeight());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        ArrayList<dbgz> arrayList = this.d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.get(i5).a();
        }
    }
}
