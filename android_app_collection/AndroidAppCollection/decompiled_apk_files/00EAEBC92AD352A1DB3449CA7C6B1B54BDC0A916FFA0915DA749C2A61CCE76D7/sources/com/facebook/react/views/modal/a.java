package com.facebook.react.views.modal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Point f6168a = new Point();

    /* renamed from: b  reason: collision with root package name */
    private static final Point f6169b = new Point();

    /* renamed from: c  reason: collision with root package name */
    private static final Point f6170c = new Point();

    public static Point a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        c.d.k.a.a.a(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(f6168a, f6169b);
        defaultDisplay.getSize(f6170c);
        int i = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (z && identifier > 0) {
            i = (int) resources.getDimension(identifier);
        }
        Point point = f6170c;
        return point.x < point.y ? new Point(f6168a.x, f6169b.y + i) : new Point(f6169b.x, f6168a.y + i);
    }
}
