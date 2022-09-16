package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.apps.youtube.app.extensions.reel.videoeffects.stickers.text.ColorChip;
/* compiled from: PG */
/* renamed from: hwh  reason: default package */
/* loaded from: classes3.dex */
public final class hwh implements View.OnTouchListener, View.OnClickListener {
    public final hwd a;
    public final hwl b;
    public Activity c;
    public ViewGroup d;
    public ViewGroup e;
    public EditText f;
    public ColorChip g;
    public boolean h;
    public hvp i;
    private final acth j;

    public hwh(acth acthVar, hwd hwdVar, hwl hwlVar) {
        this.j = acthVar;
        this.a = hwdVar;
        this.b = hwlVar;
    }

    public final ColorChip a(hwg hwgVar) {
        for (int i = 0; i < this.d.getChildCount(); i++) {
            View childAt = ((ViewGroup) this.d.getChildAt(i)).getChildAt(0);
            if (childAt instanceof ColorChip) {
                ColorChip colorChip = (ColorChip) childAt;
                if (hwgVar.a(colorChip)) {
                    return colorChip;
                }
            }
        }
        return null;
    }

    public final void b(ColorChip colorChip) {
        int i;
        if (colorChip == null) {
            return;
        }
        colorChip.setScaleX(1.33f);
        colorChip.setScaleY(1.33f);
        ColorChip colorChip2 = this.g;
        int i2 = 0;
        if (colorChip2 != null && !colorChip.equals(colorChip2)) {
            hvp hvpVar = this.i;
            if (hvpVar != null) {
                hvpVar.a.h(false);
            }
            this.g.setScaleX(1.0f);
            this.g.setScaleY(1.0f);
        }
        this.g = colorChip;
        hwl hwlVar = this.b;
        EditText editText = this.f;
        int i3 = hwlVar.b;
        if (i3 == 0) {
            i = colorChip.a;
        } else if (i3 != 1) {
            i = colorChip.d;
            i2 = Color.argb(128, Color.red(colorChip.c), Color.green(colorChip.c), Color.blue(colorChip.c));
        } else {
            i = colorChip.b;
            i2 = colorChip.a;
        }
        editText.setTextColor(i);
        editText.setBackgroundColor(i2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b((ColorChip) view);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, final MotionEvent motionEvent) {
        if (view == this.d) {
            final Rect rect = new Rect();
            ColorChip a = a(new hwg() { // from class: hwf
                @Override // defpackage.hwg
                public final boolean a(ColorChip colorChip) {
                    Rect rect2 = rect;
                    MotionEvent motionEvent2 = motionEvent;
                    ((View) colorChip.getParent()).getHitRect(rect2);
                    return rect2.contains((int) motionEvent2.getX(), (int) motionEvent2.getY());
                }
            });
            if (a == null) {
                return true;
            }
            this.j.oi().H(3, new acte(actj.UPLOAD_VIDEO_EDITING_TEXT_COLOR_BUTTON), null);
            b(a);
            return true;
        }
        return false;
    }
}
