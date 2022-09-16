package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
/* compiled from: PG */
/* renamed from: abqb  reason: default package */
/* loaded from: classes.dex */
public final class abqb extends View {
    public abqa a;
    private final Runnable b;

    public abqb(Context context) {
        super(context);
        this.b = new abpz(this);
        setImportantForAccessibility(2);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(this.b);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        onConfigurationChanged(getContext().getResources().getConfiguration());
    }
}
