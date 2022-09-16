package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.libraries.youtube.edit.preview.TrimVideoControllerView;
/* compiled from: PG */
/* renamed from: hjn  reason: default package */
/* loaded from: classes3.dex */
public final class hjn implements hpy {
    public View a;
    public ShortsVideoTrimView2 b;
    public float c;
    public boolean d;
    public TrimVideoControllerView e;

    @Override // defpackage.hpy
    public final float a() {
        if (this.d) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.hpy
    public final float b() {
        if (this.d) {
            return this.c;
        }
        return 0.0f;
    }

    @Override // defpackage.hpy
    public final View c() {
        return this.a;
    }

    public final void d() {
        this.e.g.setVisibility(0);
        this.e.f(false);
        zag.o(this.b, false);
        zag.o(this.a, false);
    }

    @Override // defpackage.hpy
    public final void e() {
        if (!this.d) {
            d();
        }
    }

    @Override // defpackage.hpy
    public final void f() {
        if (this.d) {
            this.e.g.setVisibility(8);
            this.e.f(true);
            zag.o(this.b, true);
            zag.o(this.a, true);
        }
    }

    public final void g() {
        this.d = true;
        hqb.d(this);
    }
}
