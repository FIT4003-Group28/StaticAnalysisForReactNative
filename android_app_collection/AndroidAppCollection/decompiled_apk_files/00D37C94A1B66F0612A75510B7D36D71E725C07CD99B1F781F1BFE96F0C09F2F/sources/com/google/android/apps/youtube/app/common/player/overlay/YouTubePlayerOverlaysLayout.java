package com.google.android.apps.youtube.app.common.player.overlay;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubePlayerOverlaysLayout extends aizi implements ahyg, zam, ezg {
    public List a;
    public Map b;
    public ezx c;
    public ViewGroup d;
    public fgc e;
    public zbq f;

    public YouTubePlayerOverlaysLayout(Context context) {
        super(context);
    }

    private final void f(ezx ezxVar) {
        if (ezxVar.k() || ezxVar.g() || ezxVar.d()) {
            this.f.c(null);
        } else {
            this.f.c(this);
        }
    }

    private final void j() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            fgd fgdVar = (fgd) this.a.get(i);
            if (this.c == ezx.NONE || l(fgdVar) || q(fgdVar) == null) {
                fgdVar.h(this.c);
            }
        }
    }

    private final void k() {
        int size = this.a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            fgd fgdVar = (fgd) this.a.get(i2);
            View q = q(fgdVar);
            if (q != null) {
                View view = null;
                while (i < getChildCount()) {
                    view = getChildAt(i);
                    if (this.b.get(view) != null) {
                        break;
                    }
                    i++;
                }
                if (l(fgdVar)) {
                    if (q != view) {
                        addView(q, i, fgdVar.c());
                    }
                    i++;
                } else {
                    removeView(q);
                }
            }
        }
        bringChildToFront(this.d);
    }

    private final boolean l(fgd fgdVar) {
        return !this.c.g() && fgdVar.mY(this.c);
    }

    private static final aizf m(aizf aizfVar) {
        return aizfVar instanceof fgf ? ((fgf) aizfVar).a : aizfVar;
    }

    private static final ahyh p(aizf aizfVar) {
        aizf m = m(aizfVar);
        if (m instanceof ahyh) {
            return (ahyh) m;
        }
        return null;
    }

    private static final View q(aizf aizfVar) {
        ahyh p = p(aizfVar);
        if (p == null || p.nI()) {
            return aizfVar.kZ();
        }
        return null;
    }

    @Override // defpackage.ahyg
    public final void d(ahyh ahyhVar, View view) {
        int size = this.a.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                aizf aizfVar = (aizf) this.a.get(i);
                if (aizfVar == ahyhVar || aizfVar == m(aizfVar)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            z = true;
        }
        aqxo.y(z);
        this.b.put(view, (fgd) this.a.get(i));
        k();
    }

    @Override // defpackage.zam
    public final void e(View view) {
        f(this.c);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ViewGroup) findViewById(R.id.player_overlays_custom_views_container);
    }

    @Override // defpackage.aizi, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    @Override // defpackage.aizi, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.aizi
    protected final List pK() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.e.a.Z(new ayqb() { // from class: fgg
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = YouTubePlayerOverlaysLayout.this;
                Rect rect = (Rect) obj;
                if (youTubePlayerOverlaysLayout.m.equals(rect)) {
                    return;
                }
                youTubePlayerOverlaysLayout.m.set(rect);
                youTubePlayerOverlaysLayout.requestLayout();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aizi
    public final void pL(aizf aizfVar, View view) {
        fgd fgfVar;
        if (aizfVar instanceof fgd) {
            fgfVar = (fgd) aizfVar;
        } else {
            fgfVar = new fgf(aizfVar);
        }
        this.a.add(fgfVar);
        if (view != null) {
            this.b.put(view, fgfVar);
        }
    }

    @Override // defpackage.aizi
    public final void pM(aizf... aizfVarArr) {
        for (aizf aizfVar : aizfVarArr) {
            View q = q(aizfVar);
            ahyh p = p(aizfVar);
            if (q != null || p != null) {
                if (p != null) {
                    p.ns(this);
                }
                pL(aizfVar, q);
            } else {
                String valueOf = String.valueOf(aizfVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Overlay ");
                sb.append(valueOf);
                sb.append(" does not provide a View");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        k();
        j();
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        ezxVar.getClass();
        if (ezxVar == this.c) {
            return;
        }
        this.c = ezxVar;
        f(ezxVar);
        k();
        j();
        if (ezxVar.j()) {
            lj.V(this, 1);
            return;
        }
        lj.V(this, 2);
        clearFocus();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    public YouTubePlayerOverlaysLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
