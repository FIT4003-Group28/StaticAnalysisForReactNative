package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* compiled from: PG */
/* renamed from: bqn  reason: default package */
/* loaded from: classes4.dex */
public final class bqn extends View {
    public static final /* synthetic */ int b = 0;
    public float a;

    static {
        new bqm(Float.class);
    }

    public bqn(Context context) {
        super(context);
        new Paint();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        getWidth();
    }

    public void setSelection(int i, boolean z, boolean z2) {
    }
}
