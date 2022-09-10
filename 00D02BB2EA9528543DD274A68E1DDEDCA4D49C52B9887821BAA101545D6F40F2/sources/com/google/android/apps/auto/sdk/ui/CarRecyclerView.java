package com.google.android.apps.auto.sdk.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CarRecyclerView extends RecyclerView {
    private boolean S;
    private Constructor<?> T;
    private boolean U;

    public CarRecyclerView(Context context) {
        this(context, null);
    }

    private final void aw(View view, float f) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                aw(viewGroup.getChildAt(i), f);
            }
            return;
        }
        view.setAlpha(f);
    }

    public final void a() {
        int i = ((cok) this.l).d;
        if (i == -1) {
            return;
        }
        n(i);
    }

    public final void av() {
        int i = ((cok) this.l).e;
        if (i == -1) {
            return;
        }
        n(i);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        float bottom;
        int height;
        if (this.S) {
            if (view.getTop() >= getBottom() || view.getBottom() <= getBottom()) {
                if (view.getTop() < getTop() && view.getBottom() > getTop()) {
                    bottom = view.getBottom() - getTop();
                    height = view.getHeight();
                } else {
                    f = 1.0f;
                    float f2 = 1.0f - f;
                    aw(view, 1.0f - (f2 * f2));
                }
            } else {
                bottom = getBottom() - view.getTop();
                height = view.getHeight();
            }
            f = bottom / height;
            float f22 = 1.0f - f;
            aw(view, 1.0f - (f22 * f22));
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Class<?> cls;
        if (parcelable.getClass().getClassLoader() != getClass().getClassLoader()) {
            if (this.T == null) {
                Class<?>[] declaredClasses = RecyclerView.class.getDeclaredClasses();
                int length = declaredClasses.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cls = null;
                        break;
                    }
                    cls = declaredClasses[i];
                    if (cls.getCanonicalName().equals("android.support.v7.widget.RecyclerView.SavedState")) {
                        break;
                    }
                    i++;
                }
                if (cls != null) {
                    Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                    int length2 = declaredConstructors.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        Constructor<?> constructor = declaredConstructors[i2];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        if (parameterTypes.length == 1 && parameterTypes[0].getCanonicalName().equals("android.os.Parcel")) {
                            this.T = constructor;
                            constructor.setAccessible(true);
                            break;
                        }
                        i2++;
                    }
                    if (this.T == null) {
                        throw new RuntimeException("RecyclerView$SavedState constructor not found!");
                    }
                } else {
                    throw new RuntimeException("RecyclerView$SavedState not found!");
                }
            }
            Parcel obtain = Parcel.obtain();
            parcelable.writeToParcel(obtain, 0);
            try {
                super.onRestoreInstanceState((Parcelable) this.T.newInstance(obtain));
                return;
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            if (!this.U) {
                ((cok) this.l).K(this, 0);
            }
            this.U = false;
        }
        return onTouchEvent;
    }

    public void setFadeLastItem(boolean z) {
        this.S = z;
    }

    @Override // android.support.v7.widget.RecyclerView
    public final boolean u(int i, int i2) {
        this.U = true;
        return ((cok) this.l).K(this, i2);
    }

    public CarRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFocusableInTouchMode(false);
        setFocusable(false);
    }
}
