package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: gkk  reason: default package */
/* loaded from: classes.dex */
public class gkk extends ViewGroup {
    public final Map<Integer, gkj<?>> aN;

    public gkk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aN = new ConcurrentHashMap();
    }

    public static void as() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            bvoo.f(new RuntimeException("Non-ui thread access.  See b/73241387"));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        ar(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ar(view);
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final <T extends View> gkj<T> aq(int i) {
        as();
        gkj<T> gkjVar = new gkj<>(i);
        this.aN.put(Integer.valueOf(i), gkjVar);
        return gkjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void ar(View view) {
        as();
        gkj<?> gkjVar = this.aN.get(Integer.valueOf(view.getId()));
        if (gkjVar == null) {
            String valueOf = String.valueOf(view);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
            sb.append("Child ");
            sb.append(valueOf);
            sb.append(" not found in the ViewWrappers (was not created via a newViewWrapper call).");
            throw new IllegalArgumentException(sb.toString());
        }
        if (view instanceof ViewStub) {
            final ViewStub viewStub = (ViewStub) view;
            gkj<?> aq = aq(viewStub.getInflatedId());
            this.aN.put(Integer.valueOf(aq.a), aq);
            viewStub.setOnInflateListener(new ViewStub.OnInflateListener(this, viewStub) { // from class: gkh
                private final gkk a;
                private final ViewStub b;

                {
                    this.a = this;
                    this.b = viewStub;
                }

                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(ViewStub viewStub2, View view2) {
                    this.a.aN.remove(Integer.valueOf(this.b.getId()));
                }
            });
        }
        gkjVar.b = view;
        gkjVar.c();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        as();
        for (gkj<?> gkjVar : this.aN.values()) {
            boolean z = gkjVar.d;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        as();
        for (gkj<?> gkjVar : this.aN.values()) {
            if (gkjVar.b != 0) {
                gkjVar.f();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        super.addView(view, i);
        ar(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        ar(view);
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        super.addView(view, i, i2);
        ar(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        ar(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        ar(view);
    }
}
