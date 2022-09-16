package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.mdx.manualpairing.TvCodeEditText;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: addz  reason: default package */
/* loaded from: classes.dex */
final class addz implements TextWatcher, View.OnKeyListener, View.OnTouchListener {
    private static final amvn a = amvn.p(new HashSet(Arrays.asList(7, 8, 9, 10, 11, 12, 13, 14, 15, 16)));
    private final adea b;
    private final TvCodeEditText c;
    private final int d;
    private final int e;

    public addz(adea adeaVar, TvCodeEditText tvCodeEditText, int i, int i2) {
        this.b = adeaVar;
        this.c = tvCodeEditText;
        this.d = i;
        this.e = i2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        Editable mo589getText = this.c.mo589getText();
        if (mo589getText == null) {
            return false;
        }
        String obj = mo589getText.toString();
        int length = obj.length();
        int length2 = adea.a(obj).length();
        if (i == 67) {
            if (keyEvent.getAction() == 0) {
                int i2 = this.d;
                if (length2 % i2 == 0 && length > i2 && length < this.e) {
                    int i3 = length - 2;
                    this.c.setText(mo589getText.subSequence(0, i3));
                    this.c.setSelection(i3);
                    return true;
                }
            }
            i = 67;
        }
        if (!a.contains(Integer.valueOf(i)) || keyEvent.getAction() != 1 || length2 % this.d != 0 || length >= this.e) {
            return false;
        }
        String concat = String.valueOf(obj).concat(" ");
        this.c.setText(concat);
        this.c.setSelection(concat.length());
        return true;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (adea.a(charSequence.toString()).length() == this.e) {
            adea adeaVar = this.b;
            String a2 = adea.a(String.valueOf(adeaVar.g.mo589getText()));
            if (a2.length() != adeaVar.h) {
                return;
            }
            TypedValue typedValue = new TypedValue();
            adeaVar.a.getTheme().resolveAttribute(16842873, typedValue, false);
            TypedArray obtainStyledAttributes = adeaVar.a.obtainStyledAttributes(typedValue.data, new int[]{16843067});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            if (drawable != null) {
                ((Animatable) drawable).start();
                adeaVar.f.p(drawable);
                adeaVar.f.s(zhn.f(adeaVar.a, R.attr.ytCallToAction));
            }
            adeaVar.d.k(new adit(a2), yit.c(adeaVar.a, new addy(adeaVar)));
            return;
        }
        adea adeaVar2 = this.b;
        int d = zhn.d(adeaVar2.a, R.attr.ytCallToAction);
        adeaVar2.f.j(d);
        adeaVar2.f.D(ColorStateList.valueOf(d));
        adeaVar2.f.p(null);
        adeaVar2.i.getBackground().setColorFilter(zhn.d(adeaVar2.a, R.attr.ytIconDisabled), PorterDuff.Mode.MULTIPLY);
        adeaVar2.i.setTextColor(zhn.d(adeaVar2.a, R.attr.ytTextDisabled));
        adeaVar2.i.setEnabled(false);
        adeaVar2.i.setTag(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.onTouchEvent(motionEvent);
        view.performClick();
        TvCodeEditText tvCodeEditText = this.c;
        tvCodeEditText.setSelection(tvCodeEditText.length());
        return true;
    }
}
