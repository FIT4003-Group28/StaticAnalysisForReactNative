package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: gdf  reason: default package */
/* loaded from: classes6.dex */
public class gdf extends Dialog {
    public boolean a;
    @dzsi
    private CharSequence b;
    private final int c;

    public gdf(Context context) {
        this(context, !btpf.b(context));
    }

    private static int a(boolean z) {
        return z ? 16974064 : 16973942;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            if (!this.a) {
                return true;
            }
            if (this.b != null) {
                List<CharSequence> text = accessibilityEvent.getText();
                CharSequence charSequence = this.b;
                dbsk.s(charSequence);
                text.add(charSequence);
                return true;
            }
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.app.Dialog
    protected final void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        dbsk.s(window);
        window.getAttributes().windowAnimations = this.c;
        Activity b = gcu.b(getContext());
        if (b != null) {
            Window window2 = b.getWindow();
            dbsk.s(window2);
            int systemUiVisibility = window2.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(systemUiVisibility);
            if (Build.VERSION.SDK_INT >= 27 && (systemUiVisibility & 16) != 0) {
                window.setNavigationBarColor(-1);
            }
        }
        if (!window.isFloating()) {
            window.setStatusBarColor(getContext().getResources().getColor(R.color.qu_status_bar_background));
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1024);
            window.addFlags(Integer.MIN_VALUE);
        }
    }

    @Override // android.app.Dialog
    public final void setTitle(@dzsi CharSequence charSequence) {
        this.b = charSequence;
        super.setTitle(charSequence);
    }

    @Override // android.app.Dialog
    public final void show() {
        if (!gcu.a(getContext())) {
            return;
        }
        Window window = getWindow();
        dbsk.s(window);
        window.addFlags(8);
        super.show();
        window.clearFlags(8);
    }

    public gdf(Context context, int i) {
        this(context, i, 16973826);
    }

    public gdf(Context context, int i, int i2) {
        super(context, i);
        this.b = null;
        this.a = true;
        this.c = i2;
    }

    public gdf(Context context, boolean z) {
        this(context, a(z));
    }

    public gdf(Context context, byte[] bArr) {
        this(context, a(true), 16973828);
    }
}
