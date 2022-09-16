package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubeTextView extends TextView {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    private boolean f;
    public boolean g;
    public boolean h;
    public int i;
    private int j;
    private boolean k;
    private int l;
    private yzu m;

    public YouTubeTextView(Context context) {
        super(context);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        e(context, null, 0, 0);
    }

    private final void a(TypedArray typedArray) {
        if (isInEditMode()) {
            return;
        }
        int indexCount = typedArray.getIndexCount();
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArray.getIndex(i6);
            int[] iArr = yzz.a;
            if (index == 5) {
                this.a = typedArray.getBoolean(5, false);
            } else if (index == 1) {
                i5 = typedArray.getInt(1, i5);
            } else if (index == 6) {
                i2 = typedArray.getInt(6, i2);
            } else if (index == 12) {
                i3 = typedArray.getInt(12, i3);
            } else if (index == 11) {
                i4 = typedArray.getInt(11, i4);
            } else if (index == 4) {
                this.i = typedArray.getColor(4, 0);
                this.h = true;
            } else if (index == 8) {
                this.e = typedArray.getColor(8, 0);
                this.d = true;
            } else if (index == 9) {
                this.j = typedArray.getColor(9, 0);
                this.f = true;
            } else if (index == 10) {
                this.l = typedArray.getDimensionPixelSize(10, 0);
                this.k = true;
            } else if (index == 7) {
                this.c = typedArray.getBoolean(7, true);
            }
        }
        Context context = getContext();
        ajgo ajgoVar = null;
        if (i2 != -1) {
            ajgoVar = ajgo.e(i2);
        } else if (i3 != -1) {
            ajgoVar = ajgo.f(i3);
        } else if (i4 != -1) {
            ajgo[] values = ajgo.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                ajgo ajgoVar2 = values[i];
                if (ajgoVar2.v == i4) {
                    ajgoVar = ajgoVar2;
                    break;
                }
                i++;
            }
        }
        if (ajgoVar == null) {
            return;
        }
        setTypeface(ajgoVar.d(context, i5), i5);
    }

    private final void e(Context context, AttributeSet attributeSet, int i, int i2) {
        if (isInEditMode()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            boolean isFocusable = isFocusable();
            yzu yzuVar = new yzu(this);
            this.m = yzuVar;
            lj.M(this, yzuVar);
            setFocusable(isFocusable);
        }
        Resources.Theme theme = context.getTheme();
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(null, yzz.i, i, i2);
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, yzz.i, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(0, 0);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, yzz.i);
            a(obtainStyledAttributes3);
            obtainStyledAttributes3.recycle();
        }
        a(obtainStyledAttributes2);
        obtainStyledAttributes2.recycle();
    }

    private final void f() {
        if (this.a) {
            CharSequence text = getText();
            if (!(text instanceof Spanned) || ((ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class)).length <= 0) {
                b();
            } else {
                c();
            }
        }
    }

    public final void b() {
        this.b = false;
        setMovementMethod(getDefaultMovementMethod());
    }

    public final void c() {
        this.b = true;
        boolean isLongClickable = isLongClickable();
        setMovementMethod(zax.a());
        setLongClickable(isLongClickable);
    }

    public final void d(boolean z) {
        this.a = z;
        if (z) {
            f();
        } else {
            b();
        }
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT >= 26 || !this.m.t(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            this.g = false;
            super.onTouchEvent(motionEvent);
            return this.g;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (this.c) {
            super.scrollTo(i, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ajgd[] ajgdVarArr;
        ajge[] ajgeVarArr;
        if (charSequence instanceof Spanned) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.strike_through_line_width);
            Spanned spanned = (Spanned) charSequence;
            for (ajgd ajgdVar : (ajgd[]) spanned.getSpans(0, charSequence.length(), ajgd.class)) {
                if (this.d) {
                    ajgdVar.a.setColor(this.e);
                    ajgdVar.b = true;
                }
                ajgdVar.a.setStrokeWidth(dimensionPixelSize);
            }
            int dimensionPixelSize2 = this.k ? this.l : getContext().getResources().getDimensionPixelSize(R.dimen.underline_line_width);
            for (ajge ajgeVar : (ajge[]) spanned.getSpans(0, charSequence.length(), ajge.class)) {
                if (this.f) {
                    ajgeVar.a.setColor(this.j);
                    ajgeVar.b = true;
                }
                ajgeVar.a.setStrokeWidth(dimensionPixelSize2);
            }
        }
        super.setText(charSequence, bufferType);
        f();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        ajgo e = ajgo.e(-1);
        if (e != null) {
            setTypeface(e.d(getContext(), 0), 0);
        }
        this.i = 0;
        this.e = 0;
        this.j = 0;
        this.l = 0;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        super.setTextAppearance(context, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, yzz.i);
        a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        e(context, attributeSet, 0, 0);
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        e(context, attributeSet, i, 0);
    }

    public YouTubeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = false;
        this.c = true;
        this.h = false;
        this.d = false;
        this.f = false;
        this.k = false;
        e(context, attributeSet, i, i2);
    }
}
