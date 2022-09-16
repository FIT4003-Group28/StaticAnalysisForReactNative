package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
/* compiled from: PG */
/* renamed from: zng  reason: default package */
/* loaded from: classes4.dex */
public final class zng extends Handler implements View.OnSystemUiVisibilityChangeListener {
    public final Window a;
    public final int b;
    public boolean c;
    public boolean d;
    private final View e;
    private int f;

    public zng(Window window, View view) {
        view.getClass();
        this.e = view;
        window.getClass();
        this.a = window;
        view.setOnSystemUiVisibilityChangeListener(this);
        this.f = view.getSystemUiVisibility();
        this.b = window.getNavigationBarColor();
    }

    private final void c() {
        removeMessages(0);
        int i = this.f;
        boolean z = true;
        boolean z2 = (i & 5380) == 5380;
        if ((i & 768) != 768) {
            z = false;
        }
        if (this.c == z2 && this.d == z) {
            return;
        }
        sendEmptyMessageDelayed(0, 500L);
    }

    public final void a() {
        c();
        int i = true != this.c ? 0 : 5380;
        if (this.d) {
            i |= 768;
        }
        this.e.setSystemUiVisibility(i);
    }

    public final void b(int i) {
        this.a.setNavigationBarColor(i);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 0) {
            return;
        }
        a();
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.f = i;
        c();
    }
}
