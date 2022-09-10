package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RichTextView extends AppCompatTextView implements dapk {
    private daph b;
    private dapk c;

    public RichTextView(Context context) {
        super(context);
        b();
    }

    private final void b() {
        daph daphVar = new daph(this);
        this.b = daphVar;
        od.c(this, daphVar);
    }

    @Override // defpackage.dapk
    public final boolean a(dapl daplVar) {
        dapk dapkVar = this.c;
        if (dapkVar != null) {
            return dapkVar.a(daplVar);
        }
        return false;
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        daph daphVar = this.b;
        if (daphVar != null) {
            ne neVar = daphVar.b;
            if ((neVar instanceof ams) && ((ams) neVar).k(motionEvent)) {
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        Drawable[] compoundDrawablesRelative;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        for (Drawable drawable : getCompoundDrawablesRelative()) {
            if (drawable != null && drawable.setState(drawableState)) {
                invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        MovementMethod movementMethod = getMovementMethod();
        if (movementMethod instanceof daqg) {
            daqg daqgVar = (daqg) movementMethod;
            if (daqgVar.b == motionEvent) {
                return daqgVar.a;
            }
        }
        return onTouchEvent;
    }

    public void setOnLinkClickListener(dapk dapkVar) {
        this.c = dapkVar;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Annotation[] annotationArr;
        Context context = getContext();
        boolean z = true;
        if (charSequence instanceof Spanned) {
            SpannableString spannableString = new SpannableString(charSequence);
            for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
                String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(33);
                        sb.append("Cannot find resource: ");
                        sb.append(0);
                        sb.toString();
                        identifier = 0;
                    }
                    dapm.a(spannableString, annotation, new TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    annotation.getValue();
                    dapm.a(spannableString, annotation, new dapl(), new TypefaceSpan("sans-serif-medium"));
                }
            }
            charSequence = spannableString;
        }
        super.setText(charSequence, bufferType);
        if (!(charSequence instanceof Spanned) || ((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length <= 0) {
            z = false;
        }
        if (z) {
            setMovementMethod(new daqg());
        } else {
            setMovementMethod(null);
        }
        setFocusable(z);
        if (Build.VERSION.SDK_INT >= 25) {
            setRevealOnFocusHint(false);
            setFocusableInTouchMode(z);
        }
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
