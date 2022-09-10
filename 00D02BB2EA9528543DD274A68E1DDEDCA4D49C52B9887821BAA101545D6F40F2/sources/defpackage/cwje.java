package defpackage;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: cwje  reason: default package */
/* loaded from: classes5.dex */
public final class cwje {
    private final dcdc<String> a;
    private dbsg<Float> b = dbpy.a;

    public cwje(dcdc<String> dcdcVar) {
        dbsk.a(dcdcVar.size() > 0);
        this.a = dcdcVar;
    }

    public final void a(Chip chip, int i) {
        String str;
        float f = i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) chip.getLayoutParams();
        View view = (View) chip.getParent();
        float paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + chip.getPaddingLeft() + chip.getPaddingRight();
        czwv czwvVar = chip.d;
        float f2 = f - ((paddingLeft + (czwvVar != null ? czwvVar.k : 0.0f)) + (czwvVar != null ? czwvVar.l : 0.0f));
        if (!this.b.a() || f2 != this.b.b().floatValue()) {
            this.b = dbsg.i(Float.valueOf(f2));
            if (f2 <= 0.0f) {
                str = (String) dcft.s(this.a);
            } else {
                TextPaint paint = chip.getPaint();
                int i2 = 0;
                while (true) {
                    if (i2 < this.a.size() - 1) {
                        if (paint.measureText(this.a.get(i2)) <= f2) {
                            str = this.a.get(i2);
                            break;
                        }
                        i2++;
                    } else {
                        str = (String) dcft.s(this.a);
                        break;
                    }
                }
            }
            if (str.contentEquals(chip.getText())) {
                return;
            }
            chip.setText(str);
        }
    }
}
