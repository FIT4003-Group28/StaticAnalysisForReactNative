package com.android.datetimepicker.time;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RadialPickerLayout extends FrameLayout implements View.OnTouchListener {
    public int a;
    public bql b;
    public bqj c;
    public int d;
    public boolean e;
    public int f;
    private final int g;
    private int h;
    private int i;
    private int j;
    private bqk k;
    private bqp l;
    private bqp m;
    private bqn n;
    private bqn o;
    private View p;
    private int[] q;
    private boolean r;
    private float s;
    private float t;
    private AccessibilityManager u;
    private AnimatorSet v;
    private Handler w;

    public RadialPickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.w = new Handler();
        setOnTouchListener(this);
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewConfiguration.getTapTimeout();
        int i = 0;
        this.e = false;
        bqk bqkVar = new bqk(context);
        this.k = bqkVar;
        addView(bqkVar);
        bqj bqjVar = new bqj(context);
        this.c = bqjVar;
        addView(bqjVar);
        bqp bqpVar = new bqp(context);
        this.l = bqpVar;
        addView(bqpVar);
        bqp bqpVar2 = new bqp(context);
        this.m = bqpVar2;
        addView(bqpVar2);
        bqn bqnVar = new bqn(context);
        this.n = bqnVar;
        addView(bqnVar);
        bqn bqnVar2 = new bqn(context);
        this.o = bqnVar2;
        addView(bqnVar2);
        this.q = new int[361];
        int i2 = 0;
        int i3 = 8;
        int i4 = 1;
        while (true) {
            int i5 = 4;
            if (i < 361) {
                this.q[i] = i2;
                if (i4 == i3) {
                    i2 += 6;
                    if (i2 == 360) {
                        i5 = 7;
                    } else if (i2 % 30 == 0) {
                        i5 = 14;
                    }
                    i3 = i5;
                    i4 = 1;
                } else {
                    i4++;
                }
                i++;
            } else {
                this.a = -1;
                this.r = true;
                View view = new View(context);
                this.p = view;
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.p.setBackgroundColor(getResources().getColor(R.color.transparent_black));
                this.p.setVisibility(4);
                addView(this.p);
                this.u = (AccessibilityManager) context.getSystemService("accessibility");
                return;
            }
        }
    }

    private final void c(int i, int i2) {
        if (i == 0) {
            d(0, i2);
            this.n.setSelection((i2 % 12) * 30, false, false);
            this.n.invalidate();
            return;
        }
        d(1, i2);
        this.o.setSelection(i2 * 6, false, false);
        this.o.invalidate();
    }

    private final void d(int i, int i2) {
        int i3;
        if (i == 0) {
            this.h = i2;
        } else if (i == 1) {
            this.i = i2;
        } else {
            if (i2 == 0) {
                i3 = this.h % 12;
            } else if (i2 != 1) {
                return;
            } else {
                i3 = (this.h % 12) + 12;
            }
            this.h = i3;
        }
    }

    private static int e(int i, int i2) {
        int i3 = (i / 30) * 30;
        int i4 = i3 + 30;
        if (i2 != 1) {
            if (i2 == -1) {
                return i == i3 ? i3 - 30 : i3;
            } else if (i - i3 < i4 - i) {
                return i3;
            }
        }
        return i4;
    }

    public final int a() {
        int i = this.h;
        if (i < 12) {
            return 0;
        }
        return i < 24 ? 1 : -1;
    }

    public final int b() {
        int i = this.j;
        if (i != 0) {
            return 1;
        }
        return i;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText().clear();
            Time time = new Time();
            time.hour = this.h;
            time.minute = this.i;
            accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), time.normalize(true), 1));
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int min = Math.min(size, size2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(min, mode2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r8 <= r0) goto L25;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r7 = r8.getX()
            float r0 = r8.getY()
            int r8 = r8.getAction()
            r1 = 0
            r2 = 1
            r3 = -1
            if (r8 == 0) goto L9c
            r4 = 2
            r5 = 0
            if (r8 == r2) goto L62
            if (r8 == r4) goto L19
            goto L98
        L19:
            boolean r8 = r6.r
            if (r8 != 0) goto L1e
            return r2
        L1e:
            float r8 = r6.t
            float r0 = r0 - r8
            float r8 = java.lang.Math.abs(r0)
            float r0 = r6.s
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            boolean r0 = r6.e
            if (r0 != 0) goto L3b
            int r0 = r6.g
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 > 0) goto L3b
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 <= 0) goto L98
        L3b:
            int r7 = r6.d
            if (r7 == 0) goto L4c
            int r7 = r6.f
            if (r7 != r3) goto L44
            goto L98
        L44:
            r6.e = r2
            android.os.Handler r7 = r6.w
            r7.removeCallbacksAndMessages(r5)
            return r2
        L4c:
            android.os.Handler r7 = r6.w
            r7.removeCallbacksAndMessages(r5)
            int r7 = r6.d
            if (r7 == r3) goto L98
            bqj r7 = r6.c
            r7.setAmOrPmPressed(r3)
            bqj r7 = r6.c
            r7.invalidate()
            r6.d = r3
            goto L98
        L62:
            boolean r7 = r6.r
            if (r7 != 0) goto L6c
            bql r7 = r6.b
            r7.a()
            return r2
        L6c:
            android.os.Handler r7 = r6.w
            r7.removeCallbacksAndMessages(r5)
            int r7 = r6.d
            if (r7 != 0) goto L99
            bqj r7 = r6.c
            r7.setAmOrPmPressed(r3)
            bqj r7 = r6.c
            r7.invalidate()
            int r7 = r6.d
            if (r7 != r3) goto L96
            bqj r7 = r6.c
            r7.setAmOrPm(r3)
            int r7 = r6.a()
            if (r7 == r3) goto L96
            bql r7 = r6.b
            r7.a()
            r6.d(r4, r3)
        L96:
            r6.d = r3
        L98:
            return r1
        L99:
            r6.e = r1
            return r2
        L9c:
            boolean r8 = r6.r
            if (r8 != 0) goto La1
            return r2
        La1:
            r6.s = r7
            r6.t = r0
            r6.a = r3
            r6.e = r1
            r6.d = r3
            android.view.accessibility.AccessibilityManager r7 = r6.u
            r7.isTouchExplorationEnabled()
            r6.f = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.datetimepicker.time.RadialPickerLayout.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        int i3 = i == 4096 ? 1 : i == 8192 ? -1 : 0;
        if (i3 == 0) {
            return false;
        }
        int i4 = b() == 0 ? this.h : this.i;
        int b = b();
        if (b == 0) {
            i4 %= 12;
            i2 = 30;
        } else {
            i2 = 6;
            b = 1;
        }
        int e = e(i4 * i2, i3) / i2;
        int i5 = b ^ 1;
        int i6 = 1 != b ? 12 : 55;
        if (e > i6) {
            e = i5;
        } else if (e < i5) {
            e = i6;
        }
        c(b, e);
        this.b.a();
        return true;
    }

    public void setAmOrPm(int i) {
        this.c.setAmOrPm(i);
        this.c.invalidate();
        d(2, i);
    }

    public void setOnValueSelectedListener(bql bqlVar) {
        this.b = bqlVar;
    }

    public void setTime(int i, int i2) {
        c(0, i);
        c(1, i2);
    }

    public void setCurrentItemShowing(int i, boolean z) {
        if (i != 0 && i != 1) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("TimePicker does not support view at index ");
            sb.append(i);
            sb.toString();
            return;
        }
        int b = b();
        this.j = i;
        int i2 = 0;
        if (!z || i == b) {
            int i3 = 1 != i ? 255 : 0;
            if (1 == i) {
                i2 = 255;
            }
            float f = i3;
            this.l.setAlpha(f);
            this.n.setAlpha(f);
            float f2 = i2;
            this.m.setAlpha(f2);
            this.o.setAlpha(f2);
            return;
        }
        ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[4];
        if (i == 1) {
            objectAnimatorArr[0] = null;
            objectAnimatorArr[1] = null;
            objectAnimatorArr[2] = null;
            objectAnimatorArr[3] = null;
        } else {
            objectAnimatorArr[0] = null;
            objectAnimatorArr[1] = null;
            objectAnimatorArr[2] = null;
            objectAnimatorArr[3] = null;
        }
        AnimatorSet animatorSet = this.v;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.v.end();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.v = animatorSet2;
        animatorSet2.playTogether(objectAnimatorArr);
        this.v.start();
    }
}
