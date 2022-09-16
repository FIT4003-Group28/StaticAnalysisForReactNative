package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dmd  reason: default package */
/* loaded from: classes3.dex */
public final class dmd {
    protected static final ColorStateList a;
    protected static final ColorStateList b;
    static final CharSequence c;
    static final CharSequence d;
    protected static final Drawable e;
    protected static final Typeface f;
    protected static final MovementMethod g;
    private static final Drawable h;
    private static final Rect i;
    private static final InputFilter[] j;

    static {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        h = colorDrawable;
        a = ColorStateList.valueOf(-16777216);
        b = ColorStateList.valueOf(-3355444);
        c = "";
        d = "";
        e = colorDrawable;
        f = Typeface.DEFAULT;
        g = ArrowKeyMovementMethod.getInstance();
        i = new Rect();
        j = new InputFilter[0];
    }

    static Drawable a(cyv cyvVar, Drawable drawable) {
        if (drawable == h) {
            TypedArray obtainStyledAttributes = cyvVar.b.obtainStyledAttributes(null, new int[]{16842964}, 16842862, 0);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(dad dadVar, dad dadVar2, dad dadVar3, dad dadVar4, dad dadVar5, dad dadVar6, dad dadVar7, dad dadVar8, dad dadVar9, dad dadVar10, dad dadVar11, dad dadVar12, dad dadVar13, dad dadVar14, dad dadVar15, dad dadVar16, dad dadVar17, dad dadVar18, dad dadVar19, dad dadVar20, dad dadVar21, dad dadVar22, dad dadVar23, dad dadVar24, dad dadVar25, dad dadVar26, dad dadVar27) {
        if (k(dadVar27.a, dadVar27.b) && k(dadVar.a, dadVar.b) && k(dadVar2.a, dadVar2.b) && k(dadVar4.a, dadVar4.b) && k(dadVar5.a, dadVar5.b) && k(dadVar6.a, dadVar6.b) && k(dadVar7.a, dadVar7.b) && k(dadVar8.a, dadVar8.b) && k(dadVar9.a, dadVar9.b) && k(dadVar10.a, dadVar10.b) && k(dadVar11.a, dadVar11.b) && k(dadVar12.a, dadVar12.b) && k(dadVar13.a, dadVar13.b) && k(dadVar14.a, dadVar14.b) && k(dadVar15.a, dadVar15.b) && k(dadVar16.a, dadVar16.b) && k(dadVar17.a, dadVar17.b) && k(dadVar18.a, dadVar18.b)) {
            List list = (List) dadVar19.a;
            List list2 = (List) dadVar19.b;
            if (list != null || list2 != null) {
                if (list != null && list2 != null && list.size() == list2.size()) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        InputFilter inputFilter = (InputFilter) list.get(i2);
                        InputFilter inputFilter2 = (InputFilter) list2.get(i2);
                        if (!(inputFilter instanceof InputFilter.AllCaps) || !(inputFilter2 instanceof InputFilter.AllCaps)) {
                            if (!(inputFilter instanceof InputFilter.LengthFilter) || !(inputFilter2 instanceof InputFilter.LengthFilter)) {
                                if (!k(inputFilter, inputFilter2)) {
                                    break;
                                }
                            } else if (((InputFilter.LengthFilter) inputFilter).getMax() != ((InputFilter.LengthFilter) inputFilter2).getMax()) {
                                break;
                            }
                        }
                    }
                }
            }
            if (k(dadVar20.a, dadVar20.b) && k(dadVar21.a, dadVar21.b) && ((!((Boolean) dadVar21.b).booleanValue() || (k(dadVar22.a, dadVar22.b) && k(dadVar23.a, dadVar23.b))) && k(dadVar24.a, dadVar24.b) && k(dadVar25.a, dadVar25.b) && k(dadVar26.a, dadVar26.b))) {
                Drawable drawable = (Drawable) dadVar3.a;
                Drawable drawable2 = (Drawable) dadVar3.b;
                if (drawable == null && drawable2 != null) {
                    return true;
                }
                if (drawable != null && drawable2 == null) {
                    return true;
                }
                if (drawable != null && drawable2 != null) {
                    if (!(drawable instanceof ColorDrawable) || !(drawable2 instanceof ColorDrawable)) {
                        if (!k(drawable.getConstantState(), drawable2.getConstantState())) {
                            return true;
                        }
                    } else if (((ColorDrawable) drawable).getColor() != ((ColorDrawable) drawable2).getColor()) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(dcz dczVar) {
        dczVar.a = Integer.valueOf(((Integer) dczVar.a).intValue() + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(dcz dczVar, dcz dczVar2, dcz dczVar3, CharSequence charSequence) {
        dczVar.a = new AtomicReference();
        dczVar3.a = 0;
        dczVar2.a = new AtomicReference(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(cyv cyvVar, int i2, int i3, ddj ddjVar, CharSequence charSequence, Drawable drawable, ColorStateList colorStateList, ColorStateList colorStateList2, int i4, int i5, Typeface typeface, int i6, int i7, int i8, int i9, int i10, List list, boolean z, int i11, int i12, AtomicReference atomicReference) {
        dmc dmcVar = new dmc(cyvVar.b);
        CharSequence charSequence2 = (CharSequence) atomicReference.get();
        if (charSequence2 instanceof Spannable) {
            charSequence2 = charSequence2.toString();
        }
        l(cyvVar, dmcVar, charSequence, a(cyvVar, drawable == h ? dmcVar.getBackground() : drawable), colorStateList, colorStateList2, i4, i5, typeface, i6, i7, i8, i9, i10, list, z, i11, dmcVar.getMovementMethod(), charSequence2, i12);
        dmcVar.measure(dnt.f(i2), dnt.f(i3));
        ddjVar.b = dmcVar.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i2) == 0) {
            ddjVar.a = 0;
        } else {
            ddjVar.a = Math.min(View.MeasureSpec.getSize(i2), dmcVar.getMeasuredWidth());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static dmb f(Context context) {
        return new dmb(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(cyv cyvVar, dmb dmbVar, List list) {
        if (list != null && list.size() > 0) {
            dmbVar.e = list.size() == 1 ? (TextWatcher) list.get(0) : new dma(list);
            TextWatcher textWatcher = dmbVar.e;
            if (textWatcher != null && (textWatcher instanceof dmg)) {
                ((dmg) textWatcher).a = dmbVar;
            }
            dmbVar.addTextChangedListener(textWatcher);
        }
        dmbVar.c = cyvVar;
        int i2 = dlz.Q;
        cyr cyrVar = cyvVar.f;
        daq daqVar = null;
        dmbVar.a = cyrVar == null ? null : ((dlz) cyrVar).I;
        if (cyrVar != null) {
            dlz dlzVar = (dlz) cyrVar;
        }
        if (cyrVar != null) {
            dlz dlzVar2 = (dlz) cyrVar;
        }
        if (cyrVar != null) {
            dlz dlzVar3 = (dlz) cyrVar;
        }
        if (cyrVar != null) {
            daqVar = ((dlz) cyrVar).f178J;
        }
        dmbVar.b = daqVar;
        if (cyrVar == null) {
            return;
        }
        dlz dlzVar4 = (dlz) cyrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(dmb dmbVar) {
        TextWatcher textWatcher = dmbVar.e;
        if (textWatcher != null) {
            dmbVar.removeTextChangedListener(textWatcher);
            TextWatcher textWatcher2 = dmbVar.e;
            if (textWatcher2 != null && (textWatcher2 instanceof dmg)) {
                ((dmg) textWatcher2).a = null;
            }
            dmbVar.e = null;
        }
        dmbVar.c = null;
        dmbVar.a = null;
        dmbVar.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(dmb dmbVar, AtomicReference atomicReference) {
        dmbVar.d = null;
        atomicReference.set(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(cyv cyvVar, dmb dmbVar, CharSequence charSequence, Drawable drawable, ColorStateList colorStateList, ColorStateList colorStateList2, int i2, int i3, Typeface typeface, int i4, int i5, int i6, int i7, int i8, List list, boolean z, int i9, MovementMethod movementMethod, int i10, AtomicReference atomicReference, AtomicReference atomicReference2) {
        atomicReference2.set(dmbVar);
        l(cyvVar, dmbVar, charSequence, a(cyvVar, drawable), colorStateList, colorStateList2, i2, i3, typeface, i4, i5, i6, i7, i8, list, z, i9, movementMethod, (CharSequence) atomicReference.get(), i10);
        dmbVar.d = atomicReference;
    }

    private static boolean k(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static void l(cyv cyvVar, EditText editText, CharSequence charSequence, Drawable drawable, ColorStateList colorStateList, ColorStateList colorStateList2, int i2, int i3, Typeface typeface, int i4, int i5, int i6, int i7, int i8, List list, boolean z, int i9, MovementMethod movementMethod, CharSequence charSequence2, int i10) {
        int i11;
        if (i3 == -1) {
            editText.setTextSize(2, 14.0f);
        } else {
            editText.setTextSize(0, i3);
        }
        if (z) {
            i11 = i6 | 131073;
            editText.setMinLines(1);
            editText.setMaxLines(i9);
        } else {
            i11 = i6 & (-131073);
            editText.setLines(1);
        }
        if (i7 == 0) {
            if (i11 != editText.getInputType()) {
                editText.setInputType(i11);
            }
        } else {
            editText.setRawInputType(i7);
        }
        if (list != null) {
            editText.setFilters((InputFilter[]) list.toArray(new InputFilter[list.size()]));
        } else {
            editText.setFilters(j);
        }
        editText.setHint(charSequence);
        editText.setBackground(drawable);
        if (drawable == null || !drawable.getPadding(i)) {
            editText.setPadding(0, 0, 0, 0);
        }
        editText.setShadowLayer(0.0f, 0.0f, 0.0f, -7829368);
        editText.setTypeface(typeface, 0);
        editText.setGravity(i5);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setClickable(true);
        editText.setLongClickable(true);
        editText.setCursorVisible(true);
        editText.setTextColor(colorStateList);
        editText.setHintTextColor(colorStateList2);
        editText.setHighlightColor(i2);
        editText.setMovementMethod(movementMethod);
        int imeOptions = editText.getImeOptions();
        editText.setImeOptions(i8);
        if (imeOptions != i8) {
            ((InputMethodManager) cyvVar.b.getSystemService("input_method")).restartInput(editText);
        }
        editText.setError(null, null);
        editText.setEllipsize(null);
        editText.setTextAlignment(i4);
        if (charSequence2 != null && !k(editText.getText().toString(), charSequence2.toString())) {
            editText.setText(charSequence2);
            if (!(editText instanceof dmc)) {
                editText.setSelection(charSequence2.length());
            }
        }
        if (i10 != 0) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            if (Build.VERSION.SDK_INT >= 29) {
                Drawable textCursorDrawable = editText.getTextCursorDrawable();
                textCursorDrawable.setColorFilter(porterDuffColorFilter);
                editText.setTextCursorDrawable(textCursorDrawable);
            } else {
                try {
                    Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    int i12 = declaredField.getInt(editText);
                    Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(editText);
                    Drawable a2 = akf.a(editText.getContext(), i12);
                    a2.setColorFilter(porterDuffColorFilter);
                    Drawable[] drawableArr = {a2, a2};
                    Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
                    declaredField3.setAccessible(true);
                    declaredField3.set(obj, drawableArr);
                } catch (Exception unused) {
                }
            }
            lj.P(editText, ColorStateList.valueOf(i10));
        }
    }
}
