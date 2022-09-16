package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahjo  reason: default package */
/* loaded from: classes.dex */
public final class ahjo extends ProgressBar {
    private final ahmr a;

    public ahjo(Context context, ahmr ahmrVar, int i, boolean z, int i2) {
        super(context, null, i2);
        this.a = ahmrVar;
        setIndeterminate(z);
        setLayoutParams(new ViewGroup.LayoutParams(i, i));
        if (z) {
            getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        } else {
            setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_circle));
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        Canvas t = this.a.t();
        if (t != null) {
            super.onDraw(t);
            this.a.x();
        }
    }
}
