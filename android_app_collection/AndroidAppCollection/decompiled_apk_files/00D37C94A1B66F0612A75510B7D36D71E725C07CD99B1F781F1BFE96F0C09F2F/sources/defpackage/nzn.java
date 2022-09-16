package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: nzn  reason: default package */
/* loaded from: classes3.dex */
public abstract class nzn {
    public abstract float a();

    public abstract Rect b();

    public abstract Rect c();

    public abstract View d();

    public final View e() {
        View d = d();
        d.getClass();
        return d;
    }

    public final void f() {
        if (!g()) {
            return;
        }
        e().setTranslationX(c().left);
        e().setTranslationY(c().top);
    }

    public abstract boolean g();
}
