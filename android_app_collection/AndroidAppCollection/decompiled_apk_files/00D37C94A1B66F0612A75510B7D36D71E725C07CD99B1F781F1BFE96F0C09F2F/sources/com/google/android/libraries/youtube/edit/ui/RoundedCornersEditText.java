package com.google.android.libraries.youtube.edit.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class RoundedCornersEditText extends EditText {
    public boolean a;
    private zym b;

    public RoundedCornersEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        this.b = new zym();
    }

    public final void a(int i) {
        if (this.a) {
            zym zymVar = this.b;
            if (i != zymVar.e) {
                zymVar.c.setPathEffect(new CornerPathEffect(i));
                zymVar.e = i;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final Drawable getBackground() {
        if (this.a) {
            return new ColorDrawable(this.b.c.getColor());
        }
        return super.getBackground();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.a) {
            zym zymVar = this.b;
            if (zymVar.c.getColor() != 0 && getText().length() != 0) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                StringBuilder sb = zymVar.b;
                sb.delete(0, sb.length());
                StringBuilder sb2 = zymVar.b;
                sb2.append((CharSequence) getText());
                sb2.append(zymVar.c.getColor());
                sb2.append(getTextSize());
                sb2.append(Arrays.toString(iArr));
                sb2.append(getTypeface());
                sb2.append(getTextAlignment());
                int hashCode = zymVar.b.toString().hashCode();
                if (hashCode != zymVar.d) {
                    zymVar.d = hashCode;
                    aakx aakxVar = zymVar.f;
                    zyl zylVar = zymVar.a;
                    zylVar.b = 0;
                    zylVar.a.clear();
                    int lineCount = getLineCount();
                    int length = getText().length();
                    for (int i = 0; i < lineCount; i++) {
                        int lineStart = getLayout().getLineStart(i);
                        if (lineStart == length || getText().charAt(lineStart) == '\n') {
                            zylVar.b(0.0f, 0.0f);
                        } else {
                            zylVar.b((getLayout().getLineLeft(i) + getPaddingLeft()) - zym.a(this), getLayout().getLineRight(i) + getPaddingLeft() + zym.a(this));
                        }
                    }
                    float textSize = getTextSize() * 0.6f;
                    aakx aakxVar2 = zymVar.f;
                    zyl zylVar2 = zymVar.a;
                    while (!zylVar2.a.isEmpty()) {
                        zyk zykVar = (zyk) zylVar2.a.poll();
                        ampq a = zylVar2.a(zykVar.a - 1);
                        if (a.h()) {
                            aakx.d(zylVar2, zykVar, (zyk) a.c(), textSize);
                        }
                        ampq a2 = zylVar2.a(zykVar.a + 1);
                        if (a2.h()) {
                            aakx.d(zylVar2, zykVar, (zyk) a2.c(), textSize);
                        }
                    }
                }
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < getLineCount(); i4++) {
                    int lineStart2 = getLayout().getLineStart(i4);
                    if (lineStart2 != getLayout().getLineEnd(i4)) {
                        if (getText().charAt(lineStart2) == '\n') {
                            if (i2 > 0) {
                                canvas.drawPath(zymVar.b(this, i3, i4 - 1), zymVar.c);
                                i2 = 0;
                            }
                            i3 = i4 + 1;
                        } else if (i4 == getLineCount() - 1) {
                            canvas.drawPath(zymVar.b(this, i3, i4), zymVar.c);
                        } else {
                            i2++;
                        }
                    } else if (i2 > 0) {
                        canvas.drawPath(zymVar.b(this, i3, i4 - 1), zymVar.c);
                        i2 = 0;
                    }
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (this.a) {
            this.b.c.setColor(i);
            invalidate();
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (this.a) {
            int i2 = (int) (0.8f * f);
            setPadding(i2, 0, i2, 0);
        }
        super.setTextSize(i, f);
    }
}
