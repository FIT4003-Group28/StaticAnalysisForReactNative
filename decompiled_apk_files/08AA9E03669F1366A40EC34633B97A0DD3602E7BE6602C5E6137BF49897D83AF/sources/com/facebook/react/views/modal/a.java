package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
/* compiled from: ModalHostHelper.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Point f3986a = new Point();

    /* renamed from: b  reason: collision with root package name */
    private static final Point f3987b = new Point();

    /* renamed from: c  reason: collision with root package name */
    private static final Point f3988c = new Point();

    @TargetApi(16)
    public static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) com.facebook.j.a.a.b((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(f3986a, f3987b);
        defaultDisplay.getSize(f3988c);
        int i = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", b.a.a.a.a.b.a.ANDROID_CLIENT_TYPE);
        if (z && identifier > 0) {
            i = (int) resources.getDimension(identifier);
        }
        if (f3988c.x < f3988c.y) {
            return new Point(f3986a.x, f3987b.y + i);
        }
        return new Point(f3987b.x, f3986a.y + i);
    }
}
