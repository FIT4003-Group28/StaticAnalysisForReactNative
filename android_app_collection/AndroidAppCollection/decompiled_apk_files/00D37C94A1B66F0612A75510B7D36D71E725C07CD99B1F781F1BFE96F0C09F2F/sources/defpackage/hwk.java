package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hwk  reason: default package */
/* loaded from: classes3.dex */
public final class hwk implements View.OnLayoutChangeListener {
    public final int a;
    public boolean b = true;
    public EditText c;
    public View d;
    public View e;
    public View f;

    public hwk(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_continue_button_height);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_continue_button_margin_bottom) - context.getResources().getDimensionPixelSize(R.dimen.text_color_picker_height);
        this.a = dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 == i6 && i4 == i8) {
            return;
        }
        this.d.post(new Runnable() { // from class: hwj
            @Override // java.lang.Runnable
            public final void run() {
                hwk hwkVar = hwk.this;
                int height = ((hwkVar.e.getHeight() - hwkVar.f.getHeight()) - hwkVar.c.getHeight()) / 2;
                if (hwkVar.b) {
                    if (height > hwkVar.a) {
                        return;
                    }
                    zgd.t(hwkVar.d, zgd.b(zgd.g(80), zgd.e(hwkVar.a)), FrameLayout.LayoutParams.class);
                    hwkVar.b = false;
                } else if (height <= hwkVar.a) {
                } else {
                    zgd.t(hwkVar.d, zgd.b(zgd.g(16), zgd.e(0)), FrameLayout.LayoutParams.class);
                    hwkVar.b = true;
                }
            }
        });
    }
}
