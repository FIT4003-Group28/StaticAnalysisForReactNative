package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bzoo  reason: default package */
/* loaded from: classes4.dex */
public class bzoo extends FrameLayout {
    public gga a;
    public cjqy b;
    public ite c;
    boolean d;
    @dzsi
    public bzmn e;
    protected final List<bzon> f;

    public bzoo(Context context) {
        super(context);
        this.f = new ArrayList();
        ((bzop) bttc.a(bzop.class, this)).xE(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public static final cjtd c() {
        return cjtd.a(dtyd.aV);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public static final cjtd d() {
        return cjtd.a(dtyd.aW);
    }

    public final void a(List<View> list, @dzsi bzmn bzmnVar) {
        this.d = true;
        this.f.clear();
        for (int i = 0; i < list.size(); i++) {
            this.f.add(new bzon(list.get(i)));
        }
        this.e = bzmnVar;
        cjqg.h(this, cjtd.a(dtyd.aU));
        this.c.c(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(int i) {
        View findViewById = this.a.findViewById(i);
        if (findViewById != null) {
            cjqg.h(findViewById, d());
            this.c.c(findViewById);
            findViewById.setOnClickListener(new bzol(this));
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        bzmn bzmnVar;
        super.onConfigurationChanged(configuration);
        if (getVisibility() != 0 || (bzmnVar = this.e) == null) {
            return;
        }
        bzmnVar.PO();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (int i5 = 0; i5 < this.f.size(); i5++) {
            View view = this.f.get(i5).a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i6 = iArr[0];
            int i7 = iArr[1];
            getLocationOnScreen(iArr);
            int i8 = i6 - iArr[0];
            int i9 = i7 - iArr[1];
            if (view instanceof ExpandingScrollView) {
                ExpandingScrollView expandingScrollView = (ExpandingScrollView) view;
                i9 = (expandingScrollView.M() - expandingScrollView.C(expandingScrollView.f)) + expandingScrollView.getTop();
            }
            this.f.get(i5).b = new Rect(i8, i9, view.getWidth() + i8, view.getHeight() + i9);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (int i = 0; i < this.f.size(); i++) {
            Rect rect = this.f.get(i).b;
            if (rect != null && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                bzmn bzmnVar = this.e;
                if (bzmnVar != null && action == 0) {
                    bzmnVar.PL();
                }
                return false;
            }
        }
        bzmn bzmnVar2 = this.e;
        if (bzmnVar2 == null || action != 0) {
            return true;
        }
        bzmnVar2.PM();
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        bzmn bzmnVar = this.e;
        if (bzmnVar != null) {
            bzmnVar.PN(i);
        }
    }

    public bzoo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new ArrayList();
        ((bzop) bttc.a(bzop.class, this)).xE(this);
    }

    public bzoo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new ArrayList();
        ((bzop) bttc.a(bzop.class, this)).xE(this);
    }
}
