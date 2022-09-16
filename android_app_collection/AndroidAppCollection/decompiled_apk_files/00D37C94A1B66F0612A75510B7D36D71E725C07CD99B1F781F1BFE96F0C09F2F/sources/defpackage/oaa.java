package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
/* compiled from: PG */
/* renamed from: oaa  reason: default package */
/* loaded from: classes3.dex */
public final class oaa implements fel {
    private final ViewGroup a;
    private final NextGenWatchLayout b;

    public oaa(ViewGroup viewGroup, NextGenWatchLayout nextGenWatchLayout) {
        this.a = viewGroup;
        this.b = nextGenWatchLayout;
    }

    @Override // defpackage.fel
    public final void a(View view) {
        jfw.k();
        NextGenWatchLayout nextGenWatchLayout = this.b;
        if (nextGenWatchLayout.y.contains(view)) {
            return;
        }
        nextGenWatchLayout.y.add(view);
        nextGenWatchLayout.addView(view);
        nextGenWatchLayout.n();
        nextGenWatchLayout.requestLayout();
    }

    @Override // defpackage.fel
    public final void b(View view, View view2) {
        jfw.k();
        if (view.getParent() == null) {
            this.a.addView(view, -1, -1);
        }
        ((ViewGroup) this.b.s).addView(view2);
    }

    @Override // defpackage.fel
    public final void c(View view, View view2) {
        jfw.k();
        this.a.removeView(view);
        ((ViewGroup) this.b.s).removeView(view2);
    }

    @Override // defpackage.fel
    public final void d(View view) {
        jfw.k();
        NextGenWatchLayout nextGenWatchLayout = this.b;
        if (!nextGenWatchLayout.y.contains(view)) {
            return;
        }
        nextGenWatchLayout.y.remove(view);
        nextGenWatchLayout.removeView(view);
        nextGenWatchLayout.requestLayout();
    }

    @Override // defpackage.fel
    public final void setAlpha(float f) {
        this.a.setAlpha(f);
        this.b.setAlpha(f);
    }
}
