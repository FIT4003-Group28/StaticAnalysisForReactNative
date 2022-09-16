package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Typeface;
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
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class RichTextView extends AppCompatTextView implements alww {
    public static Typeface b;
    private alwt c;

    public RichTextView(Context context) {
        super(context);
        b();
    }

    private final void b() {
        jo alwsVar;
        if (isInEditMode()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            alwsVar = new jo();
        } else {
            alwsVar = new alws(this);
        }
        alwt alwtVar = new alwt(alwsVar);
        this.c = alwtVar;
        lj.M(this, alwtVar);
    }

    @Override // defpackage.alww
    public final void a() {
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        alwt alwtVar = this.c;
        if (alwtVar != null) {
            jo joVar = alwtVar.b;
            if ((joVar instanceof amh) && ((amh) joVar).t(motionEvent)) {
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
        if (movementMethod instanceof alxo) {
            alxo alxoVar = (alxo) movementMethod;
            if (alxoVar.b == motionEvent) {
                return alxoVar.a;
            }
        }
        return onTouchEvent;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Annotation[] annotationArr;
        TypefaceSpan typefaceSpan;
        Context context = getContext();
        boolean z = true;
        if (charSequence instanceof Spanned) {
            SpannableString spannableString = new SpannableString(charSequence);
            for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
                String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        Log.w("RichTextView", "Cannot find resource: 0");
                        identifier = 0;
                    }
                    aqgn.i(spannableString, annotation, new TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    annotation.getValue();
                    alwx alwxVar = new alwx();
                    if (b != null) {
                        typefaceSpan = new TypefaceSpan(b);
                    } else {
                        typefaceSpan = new TypefaceSpan("sans-serif-medium");
                    }
                    aqgn.i(spannableString, annotation, alwxVar, typefaceSpan);
                }
            }
            charSequence = spannableString;
        }
        super.setText(charSequence, bufferType);
        if (!(charSequence instanceof Spanned) || ((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length <= 0) {
            z = false;
        }
        if (z) {
            setMovementMethod(new alxo());
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
