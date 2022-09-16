package defpackage;

import android.os.Handler;
import android.view.View;
/* compiled from: PG */
/* renamed from: gyx  reason: default package */
/* loaded from: classes3.dex */
public final class gyx {
    final View a;
    public long e;
    private final Runnable g;
    private final Runnable h;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    private final Handler f = new Handler();

    public gyx(View view) {
        this.a = view;
        this.g = new gyw(this, view, 1);
        this.h = new gyw(this, view);
    }

    public final void a() {
        if (!this.b) {
            this.f.removeCallbacks(this.g);
            this.c = false;
        } else if (this.d) {
        } else {
            this.d = true;
            long currentTimeMillis = System.currentTimeMillis() - this.e;
            if (currentTimeMillis >= 300) {
                this.f.post(this.h);
            } else {
                this.f.postDelayed(this.h, 300 - currentTimeMillis);
            }
        }
    }

    public final void b() {
        this.f.removeCallbacks(this.g);
        this.f.removeCallbacks(this.h);
        this.c = false;
        this.d = false;
        this.b = false;
        gyy.d(this.a);
    }

    public final void c() {
        if (this.b) {
            this.f.removeCallbacks(this.h);
            this.d = false;
        } else if (this.c) {
        } else {
            this.c = true;
            this.f.postDelayed(this.g, 300L);
        }
    }
}
