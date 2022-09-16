package defpackage;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: umo  reason: default package */
/* loaded from: classes4.dex */
public final class umo {
    private final amuk a;
    private ampq b = amon.a;

    public umo(amuk amukVar) {
        aqxo.p(((amxx) amukVar).c > 0);
        this.a = amukVar;
    }

    public final void a(TextView textView, int i) {
        String str;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        View view = (View) textView.getParent();
        float paddingLeft = i - (((((view.getPaddingLeft() + view.getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + textView.getPaddingLeft()) + textView.getPaddingRight());
        if (!this.b.h() || paddingLeft != ((Float) this.b.c()).floatValue()) {
            this.b = ampq.j(Float.valueOf(paddingLeft));
            if (paddingLeft <= 0.0f) {
                str = (String) arey.s(this.a);
            } else {
                TextPaint paint = textView.getPaint();
                int i2 = 0;
                while (true) {
                    amuk amukVar = this.a;
                    if (i2 < ((amxx) amukVar).c - 1) {
                        if (paint.measureText((String) amukVar.get(i2)) <= paddingLeft) {
                            str = (String) this.a.get(i2);
                            break;
                        }
                        i2++;
                    } else {
                        str = (String) arey.s(amukVar);
                        break;
                    }
                }
            }
            if (str.contentEquals(textView.getText())) {
                return;
            }
            textView.setText(str);
        }
    }
}
