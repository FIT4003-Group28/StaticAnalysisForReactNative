package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: dbij  reason: default package */
/* loaded from: classes5.dex */
public final class dbij {
    public final View a;
    public final WindowManager b;
    public final WindowManager.LayoutParams c;
    public final FrameLayout d;
    public final ViewGroup.LayoutParams e;

    public dbij(Context context, View view) {
        this.a = view;
        this.b = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 1000, 16777752, -3);
        layoutParams.setTitle("ViewRenderableWindow");
        this.c = layoutParams;
        this.d = new FrameLayout(context);
        this.e = new ViewGroup.LayoutParams(-2, -2);
    }
}
