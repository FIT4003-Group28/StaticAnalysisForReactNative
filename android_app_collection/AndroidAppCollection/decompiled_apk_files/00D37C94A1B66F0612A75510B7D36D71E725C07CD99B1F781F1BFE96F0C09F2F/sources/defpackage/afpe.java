package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.youtube.R;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: afpe  reason: default package */
/* loaded from: classes.dex */
public final class afpe {
    public static final amvn a = amvn.p(new HashSet(amuk.r("#")));
    private static final BreakIterator b = BreakIterator.getCharacterInstance();

    private afpe() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(EditText editText) {
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect = new Rect();
            editText.getPaint().getTextBounds(editText.getHint(), 0, editText.getHint().length(), rect);
            return (rect.width() / editText.getWidth()) + 1;
        }
        return editText.getLineCount();
    }

    public static tcs b(afoy afoyVar) {
        ajwp[] ajwpVarArr;
        tcq a2 = tcs.a();
        a2.a = afoyVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(afoyVar.mo589getText());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(afoyVar.mo589getText());
        afnw.c(spannableStringBuilder);
        aopa createBuilder = awma.a.createBuilder();
        String trim = spannableStringBuilder.toString().trim();
        createBuilder.copyOnWrite();
        awma awmaVar = (awma) createBuilder.instance;
        trim.getClass();
        awmaVar.b |= 1;
        awmaVar.c = trim;
        awma awmaVar2 = (awma) createBuilder.mo39build();
        String obj = afoyVar.mo589getText().toString();
        aopa createBuilder2 = awsv.a.createBuilder();
        createBuilder2.copyOnWrite();
        awsv awsvVar = (awsv) createBuilder2.instance;
        awmaVar2.getClass();
        awsvVar.d = awmaVar2;
        awsvVar.c |= 1;
        boolean isFocused = afoyVar.isFocused();
        createBuilder2.copyOnWrite();
        awsv awsvVar2 = (awsv) createBuilder2.instance;
        awsvVar2.c |= 4;
        awsvVar2.f = isFocused;
        createBuilder2.copyOnWrite();
        awsv awsvVar3 = (awsv) createBuilder2.instance;
        awsvVar3.c |= 128;
        awsvVar3.j = false;
        int selectionStart = afoyVar.getSelectionStart();
        createBuilder2.copyOnWrite();
        awsv awsvVar4 = (awsv) createBuilder2.instance;
        awsvVar4.c |= 256;
        awsvVar4.k = selectionStart;
        int selectionEnd = afoyVar.getSelectionEnd();
        createBuilder2.copyOnWrite();
        awsv awsvVar5 = (awsv) createBuilder2.instance;
        awsvVar5.c |= 512;
        awsvVar5.l = selectionEnd;
        createBuilder2.copyOnWrite();
        awsv awsvVar6 = (awsv) createBuilder2.instance;
        obj.getClass();
        awsvVar6.c |= 64;
        awsvVar6.i = obj;
        BreakIterator breakIterator = b;
        breakIterator.setText(obj);
        breakIterator.first();
        int i = 0;
        while (b.next() != -1) {
            i++;
        }
        createBuilder2.copyOnWrite();
        awsv awsvVar7 = (awsv) createBuilder2.instance;
        awsvVar7.c |= 1024;
        awsvVar7.m = i;
        String trim2 = awmaVar2.c.trim();
        createBuilder2.copyOnWrite();
        awsv awsvVar8 = (awsv) createBuilder2.instance;
        trim2.getClass();
        awsvVar8.c |= 2;
        awsvVar8.e = trim2;
        Layout layout = afoyVar.getLayout();
        if (layout != null) {
            float a3 = afnw.a(layout, afoyVar);
            createBuilder2.copyOnWrite();
            awsv awsvVar9 = (awsv) createBuilder2.instance;
            awsvVar9.c |= 8;
            awsvVar9.g = a3;
        }
        for (ajwp ajwpVar : (ajwp[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ajwp.class)) {
            int spanStart = spannableStringBuilder2.getSpanStart(ajwpVar);
            int spanEnd = spannableStringBuilder2.getSpanEnd(ajwpVar);
            aopa createBuilder3 = awsp.a.createBuilder();
            createBuilder3.copyOnWrite();
            awsp awspVar = (awsp) createBuilder3.instance;
            awspVar.b |= 2;
            awspVar.d = spanEnd - spanStart;
            createBuilder3.copyOnWrite();
            awsp awspVar2 = (awsp) createBuilder3.instance;
            awspVar2.b |= 1;
            awspVar2.c = spanStart;
            String str = ajwpVar.a;
            createBuilder3.copyOnWrite();
            awsp awspVar3 = (awsp) createBuilder3.instance;
            str.getClass();
            awspVar3.b |= 4;
            awspVar3.e = str;
            awsp awspVar4 = (awsp) createBuilder3.mo39build();
            createBuilder2.copyOnWrite();
            awsv awsvVar10 = (awsv) createBuilder2.instance;
            awspVar4.getClass();
            aopu aopuVar = awsvVar10.h;
            if (!aopuVar.c()) {
                awsvVar10.h = aopi.mutableCopy(aopuVar);
            }
            awsvVar10.h.add(awspVar4);
        }
        aopc aopcVar = (aopc) awon.a.createBuilder();
        aopcVar.e(awsv.b, (awsv) createBuilder2.mo39build());
        a2.e = (awon) aopcVar.mo39build();
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static afoy c(Context context) {
        afoy afoyVar = new afoy(context);
        afoyVar.setPadding(0, 0, 0, 0);
        return afoyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(dad dadVar, dad dadVar2, dad dadVar3) {
        return (((AtomicInteger) dadVar2.b).get() == ((AtomicInteger) dadVar2.a).get() && !(((AtomicBoolean) dadVar.a).get() ^ true) && dadVar3.a == dadVar3.b) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(dcz dczVar) {
        dczVar.a = new AtomicInteger(((AtomicInteger) dczVar.a).get() + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(dcz dczVar, dcz dczVar2, int i, int i2) {
        dczVar.a = new AtomicInteger(i);
        dczVar2.a = new AtomicInteger(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(dcz dczVar, dcz dczVar2, dcz dczVar3, dcz dczVar4, dcz dczVar5) {
        dczVar2.a = new AtomicInteger(0);
        dczVar3.a = new AtomicInteger(41);
        dczVar4.a = new AtomicInteger(0);
        dczVar.a = new AtomicBoolean(false);
        dczVar5.a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(int i, int i2, ddj ddjVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2) {
        int i3;
        ddjVar.a = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        if (atomicInteger.get() == 0) {
            int i4 = atomicInteger2.get();
            i3 = i4 + i4;
        } else {
            i3 = (atomicInteger.get() + 1) * atomicInteger2.get();
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            ddjVar.b = i3;
        } else {
            ddjVar.b = Math.min(i3, size);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(cyv cyvVar, awsw awswVar, tfj tfjVar, teb tebVar, tcu tcuVar, tda tdaVar, AtomicBoolean atomicBoolean, dcz dczVar, dcz dczVar2, dcz dczVar3, dcz dczVar4, dcz dczVar5, dcz dczVar6) {
        View view;
        dczVar.a = false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        awma awmaVar = awswVar.d;
        if (awmaVar == null) {
            awmaVar = awma.a;
        }
        awma awmaVar2 = awmaVar;
        int i = 0;
        while (true) {
            if (i >= awmaVar2.f.size()) {
                break;
            }
            awmd awmdVar = (awmd) awmaVar2.f.get(i);
            if (awmaVar2.f.size() <= i || awmdVar.e != 0) {
                i++;
            } else {
                float f = awmdVar.h;
                if (f != 0.0f) {
                    dczVar4.a = Float.valueOf(f);
                }
            }
        }
        if ((awmaVar2.b & 1) != 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(afnw.b(tdaVar, cyvVar.b, awmaVar2, tcuVar, tfjVar, tebVar));
            if ((awswVar.c & 256) != 0 && awswVar.l) {
                int length = spannableStringBuilder2.length();
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    } else if (spannableStringBuilder2.charAt(length) == '\n') {
                        spannableStringBuilder2.delete(length, length + 1);
                    }
                }
            }
            if (awswVar.m.size() > 0) {
                int orElse = zhn.j(cyvVar.b, R.attr.ytBadgeChipBackground).orElse(0);
                float measuredWidth = tdaVar.b != null ? view.getMeasuredWidth() * 0.85f : 0.0f;
                if (measuredWidth > 0.0f) {
                    afnw.e(spannableStringBuilder2, measuredWidth, orElse, awswVar);
                    dczVar.a = true;
                } else {
                    afop.a(cyvVar);
                }
            } else {
                dczVar.a = true;
            }
            spannableStringBuilder = spannableStringBuilder2;
        } else {
            dczVar.a = true;
        }
        awma awmaVar3 = awswVar.e;
        if (awmaVar3 == null) {
            awmaVar3 = awma.a;
        }
        awma awmaVar4 = awmaVar3;
        if (awmaVar4.c.length() > 0) {
            dczVar3.a = SpannableString.valueOf(afnw.b(tdaVar, cyvVar.b, awmaVar4, tcuVar, tfjVar, tebVar));
        }
        dczVar2.a = spannableStringBuilder;
        dczVar5.a = Boolean.valueOf(awswVar.r);
        dczVar6.a = Boolean.valueOf(awswVar.t);
        boolean z = atomicBoolean.get();
        boolean z2 = awswVar.t;
        if (awswVar.r || z != z2) {
            afop.a(cyvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(final cyv cyvVar, final afoy afoyVar, final SpannableStringBuilder spannableStringBuilder, final SpannableString spannableString, Float f, final awsw awswVar, awmt awmtVar, final awmt awmtVar2, final awmt awmtVar3, final tcu tcuVar, afpt afptVar, afpx afpxVar, akss akssVar, aagi aagiVar, afvn afvnVar, ajxz ajxzVar, ajvm ajvmVar, ayor ayorVar, acti actiVar, boolean z, AtomicBoolean atomicBoolean, tda tdaVar, teb tebVar, tfj tfjVar, boolean z2, boolean z3, AtomicBoolean atomicBoolean2) {
        afoyVar.b = cyvVar;
        if (z2) {
            afoyVar.post(new Runnable() { // from class: afot
                @Override // java.lang.Runnable
                public final void run() {
                    afoy afoyVar2 = afoy.this;
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    awsw awswVar2 = awswVar;
                    amvn amvnVar = afpe.a;
                    afoyVar2.setText(spannableStringBuilder2);
                    if (awswVar2.i) {
                        afoyVar2.requestFocus();
                    } else {
                        afoyVar2.clearFocus();
                    }
                }
            });
        }
        Context context = afoyVar.b.b;
        final InputMethodManager inputMethodManager = (InputMethodManager) zew.B(context).getSystemService("input_method");
        if (atomicBoolean2.get() || !z3) {
            if (atomicBoolean2.get() && !z3) {
                afoyVar.setShowSoftInputOnFocus(true);
                inputMethodManager.showSoftInput(afoyVar, 1);
                atomicBoolean2.set(false);
            }
        } else {
            inputMethodManager.hideSoftInputFromWindow(afoyVar.getWindowToken(), 0);
            afoyVar.setShowSoftInputOnFocus(false);
            atomicBoolean2.set(true);
        }
        if (awswVar.i) {
            afoyVar.requestFocus();
        } else {
            afoyVar.clearFocus();
        }
        if (z) {
            if (atomicBoolean.get() && !afoyVar.a.isEmpty()) {
                return;
            }
            atomicBoolean.set(true);
            afoyVar.setMinLines(1);
            if ((awswVar.c & 128) == 0 || awswVar.k) {
                afoyVar.setMaxLines(Integer.MAX_VALUE);
                if ((awswVar.c & 256) != 0 && awswVar.l) {
                    afoyVar.setImeOptions(6);
                    afoyVar.setRawInputType(afoyVar.getInputType() & (-131073));
                }
            } else {
                afoyVar.setMaxLines(1);
            }
            afoyVar.setBackground(null);
            awma awmaVar = awswVar.d;
            if (awmaVar == null) {
                awmaVar = awma.a;
            }
            int i = 3;
            if (awswVar.s) {
                i = 16;
            } else if ((awmaVar.b & 4) != 0) {
                avcc avccVar = avcc.SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN;
                int H = awwc.H(awmaVar.d);
                if (H == 0) {
                    H = 1;
                }
                int i2 = H - 1;
                if (i2 != 1) {
                    i = i2 != 2 ? i2 != 3 ? 8388611 : 1 : 5;
                }
            } else {
                i = 48;
            }
            afoyVar.setGravity(i);
            if (awmaVar.f.size() == 1) {
                awmd awmdVar = (awmd) awmaVar.f.get(0);
                if (l(awmaVar, awmdVar)) {
                    if ((awmdVar.b & 32) != 0) {
                        afoyVar.setTextColor(ColorStateList.valueOf(awmdVar.i));
                    }
                    k(spannableStringBuilder);
                }
            }
            awma awmaVar2 = awswVar.e;
            if (awmaVar2 == null) {
                awmaVar2 = awma.a;
            }
            if (awmaVar2.f.size() == 1) {
                awmd awmdVar2 = (awmd) awmaVar2.f.get(0);
                if (awmaVar2.f.size() > 0 && l(awmaVar2, awmdVar2)) {
                    if ((awmdVar2.b & 32) != 0) {
                        afoyVar.setHintTextColor(ColorStateList.valueOf(awmdVar2.i));
                    }
                    k(spannableString);
                }
            }
            if (f != null) {
                afoyVar.setTextSize(f.floatValue());
            }
            afoyVar.b();
            if (awswVar.u) {
                afoyVar.f = true;
                afoyVar.g = context;
                afoyVar.h = new ajvi(context, ajxzVar, ajvmVar, true, new afox(afoyVar), true);
                afoyVar.c(aagiVar.a(afvnVar.c()), ayorVar, awmtVar, tcuVar);
            } else if (awswVar.v) {
                afoyVar.c(aagiVar.a(afvnVar.c()), ayorVar, awmtVar, tcuVar);
            }
            final afpc afpcVar = new afpc(cyvVar.b, afoyVar, tfjVar, tebVar, tdaVar, actiVar, awmtVar, tcuVar, awswVar.l, awswVar.q, afptVar, afpxVar, akssVar, awswVar.n, awswVar.o, awswVar.j || !awswVar.n.isEmpty() || !awswVar.o.isEmpty());
            afpcVar.c = new ArrayList();
            for (int i3 = 0; i3 < awswVar.p.size(); i3++) {
                afpcVar.c.add((awsu) awswVar.p.get(i3));
            }
            boolean z4 = awswVar.l;
            afoyVar.c = z4;
            if ((awswVar.c & 256) != 0) {
                afpcVar.b = z4;
            }
            afoyVar.addTextChangedListener(afpcVar);
            afoyVar.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: afor
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z5) {
                    InputMethodManager inputMethodManager2 = inputMethodManager;
                    afoy afoyVar2 = afoyVar;
                    awmt awmtVar4 = awmtVar2;
                    tcu tcuVar2 = tcuVar;
                    afpc afpcVar2 = afpcVar;
                    awmt awmtVar5 = awmtVar3;
                    amvn amvnVar = afpe.a;
                    if (z5) {
                        inputMethodManager2.showSoftInput(afoyVar2, 1);
                        if (awmtVar4 == null) {
                            return;
                        }
                        tcuVar2.b(awmtVar4, afpe.b((afoy) view)).Q();
                        return;
                    }
                    inputMethodManager2.hideSoftInputFromWindow(afoyVar2.getWindowToken(), 0);
                    afpcVar2.b();
                    if (awmtVar5 == null) {
                        return;
                    }
                    tcuVar2.b(awmtVar5, afpe.b((afoy) view)).Q();
                }
            });
            afoyVar.post(new Runnable() { // from class: afos
                @Override // java.lang.Runnable
                public final void run() {
                    afoy afoyVar2 = afoy.this;
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    SpannableString spannableString2 = spannableString;
                    awsw awswVar2 = awswVar;
                    cyv cyvVar2 = cyvVar;
                    amvn amvnVar = afpe.a;
                    afoyVar2.setText(spannableStringBuilder2);
                    afoyVar2.setHint(spannableString2);
                    if (awswVar2.i) {
                        afoyVar2.requestFocus();
                    }
                    afoyVar2.post(new afou(afoyVar2, cyvVar2));
                }
            });
        }
    }

    private static void k(CharSequence charSequence) {
        if (!(charSequence instanceof SpannableString)) {
            return;
        }
        SpannableString spannableString = (SpannableString) charSequence;
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), ForegroundColorSpan.class)) {
            spannableString.removeSpan(foregroundColorSpan);
        }
    }

    private static boolean l(awma awmaVar, awmd awmdVar) {
        return awmdVar.e == 0 && (awmaVar.c.isEmpty() ? 0L : (long) awmaVar.c.length()) <= ((long) awmdVar.f);
    }
}
