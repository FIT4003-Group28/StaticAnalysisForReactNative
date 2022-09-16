package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
/* compiled from: PG */
/* renamed from: bqp  reason: default package */
/* loaded from: classes4.dex */
public final class bqp extends View {
    public static final /* synthetic */ int c = 0;
    public boolean a;
    public float b;

    static {
        new bqo(Float.class);
    }

    public bqp(Context context) {
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
}
