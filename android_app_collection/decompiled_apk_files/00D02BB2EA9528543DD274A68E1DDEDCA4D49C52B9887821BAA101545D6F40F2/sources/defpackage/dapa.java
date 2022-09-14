package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.setupcompat.view.StatusBarBackgroundLayout;
/* compiled from: PG */
/* renamed from: dapa  reason: default package */
/* loaded from: classes5.dex */
public final class dapa implements daoz {
    private final danv a;
    private StatusBarBackgroundLayout b;
    private LinearLayout c;
    private final View d;

    public dapa(danv danvVar, Window window, AttributeSet attributeSet, int i) {
        this.a = danvVar;
        View findViewById = danvVar.findViewById(R.id.suc_layout_status);
        if (findViewById == null) {
            throw new NullPointerException("sucLayoutStatus cannot be null in StatusBarMixin");
        }
        if (findViewById instanceof StatusBarBackgroundLayout) {
            this.b = (StatusBarBackgroundLayout) findViewById;
        } else {
            this.c = (LinearLayout) findViewById;
        }
        View decorView = window.getDecorView();
        this.d = decorView;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        window.setStatusBarColor(0);
        TypedArray obtainStyledAttributes = danvVar.getContext().obtainStyledAttributes(attributeSet, danw.d, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, Build.VERSION.SDK_INT < 23 || (decorView.getSystemUiVisibility() & 8192) == 8192);
        if (Build.VERSION.SDK_INT >= 23) {
            if (danvVar.d()) {
                Context context = danvVar.getContext();
                z = daou.a(context).j(context, daos.CONFIG_LIGHT_STATUS_BAR);
            }
            if (z) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            } else {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
            }
        }
        a(obtainStyledAttributes.getDrawable(1));
        obtainStyledAttributes.recycle();
    }

    public final void a(Drawable drawable) {
        if (this.a.d()) {
            Context context = this.a.getContext();
            drawable = daou.a(context).d(context, daos.CONFIG_STATUS_BAR_BACKGROUND);
        }
        StatusBarBackgroundLayout statusBarBackgroundLayout = this.b;
        if (statusBarBackgroundLayout == null) {
            this.c.setBackgroundDrawable(drawable);
        } else {
            statusBarBackgroundLayout.setStatusBarBackground(drawable);
        }
    }
}
