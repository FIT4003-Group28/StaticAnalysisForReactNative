package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
/* compiled from: PG */
/* renamed from: ahzj  reason: default package */
/* loaded from: classes.dex */
public class ahzj extends ahyf {
    protected RelativeLayout a;
    protected ViewGroup b;
    public View c;
    public boolean d;

    public ahzj(Context context) {
        super(context);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.a = new RelativeLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        this.a.addView(frameLayout);
        return this.a;
    }

    @Override // defpackage.aizf
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams c() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public /* bridge */ /* synthetic */ void d(Context context, View view) {
        throw null;
    }

    public final void l() {
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
            return;
        }
        this.a.sendAccessibilityEvent(8);
    }

    public final void m(int i) {
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(i);
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                if (i == 0 && viewGroup.getParent() == null) {
                    this.a.addView(this.b);
                }
                if (i != 0) {
                    ViewParent parent = this.b.getParent();
                    RelativeLayout relativeLayout2 = this.a;
                    if (parent == relativeLayout2) {
                        relativeLayout2.removeAllViews();
                    }
                }
            }
        }
        this.d = i == 0;
        X();
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.d;
    }
}
