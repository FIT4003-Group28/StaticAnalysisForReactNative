package com.google.android.apps.youtube.app.settings.presenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TimeRangeView extends FrameLayout {
    public final Context a;
    public lll b;
    public lll c;
    public int d;
    public int e;
    public List f;
    public aurm g;
    private final ViewStub h;
    private final ViewStub i;

    public TimeRangeView(Context context) {
        this(context, null);
    }

    public final int a() {
        return this.b.a;
    }

    public final int b() {
        return this.c.a;
    }

    public final boolean c(aurm aurmVar, int i) {
        this.d = 2;
        this.e = 1;
        this.g = aurmVar;
        List g = llm.g(aurmVar);
        this.f = g;
        if (g.size() != 2) {
            return false;
        }
        ViewStub viewStub = this.h;
        if (viewStub != null) {
            lll lllVar = new lll(this.a, viewStub, (aurt) this.f.get(0));
            this.b = lllVar;
            if (i >= 0) {
                lllVar.c.add(new lli(this, i));
            }
        }
        ViewStub viewStub2 = this.i;
        if (viewStub2 != null) {
            this.c = new lll(this.a, viewStub2, (aurt) this.f.get(1));
        }
        return true;
    }

    public final void d(aurm aurmVar) {
        List g = llm.g(aurmVar);
        this.f = g;
        if (g.size() != this.d) {
            return;
        }
        lll lllVar = this.b;
        if (lllVar != null) {
            lllVar.a(this.a, (aurt) this.f.get(0));
        }
        lll lllVar2 = this.c;
        if (lllVar2 == null) {
            return;
        }
        lllVar2.a(this.a, (aurt) this.f.get(this.e));
    }

    public TimeRangeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimeRangeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new ArrayList();
        this.a = context;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        inflate(context, R.layout.time_range_view, this);
        this.h = (ViewStub) findViewById(R.id.lower_bound_view_stub);
        this.i = (ViewStub) findViewById(R.id.upper_bound_view_stub);
    }
}
