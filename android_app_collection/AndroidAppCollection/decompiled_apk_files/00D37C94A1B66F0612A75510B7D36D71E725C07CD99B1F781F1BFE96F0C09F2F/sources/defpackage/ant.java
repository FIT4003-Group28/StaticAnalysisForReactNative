package defpackage;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.view.KeyEvent;
/* compiled from: PG */
/* renamed from: ant  reason: default package */
/* loaded from: classes.dex */
public final class ant {
    public final aoc a;
    public final boolean b;
    public final int[] c;
    private final anl d;

    public ant(aoc aocVar, anl anlVar, boolean z, int[] iArr) {
        this.a = aocVar;
        this.d = anlVar;
        this.b = z;
        this.c = iArr;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        anu[] anuVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!e(selectionStart, selectionEnd) && (anuVarArr = (anu[]) editable.getSpans(selectionStart, selectionEnd, anu.class)) != null && (r2 = anuVarArr.length) > 0) {
                for (anu anuVar : anuVarArr) {
                    int spanStart = editable.getSpanStart(anuVar);
                    int spanEnd = editable.getSpanEnd(anuVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0070, code lost:
        if (r11 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007d, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ant.b(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static final void d(Spannable spannable, anq anqVar, int i, int i2) {
        spannable.setSpan(new anu(anqVar), i, i2, 33);
    }

    private static boolean e(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public final boolean c(CharSequence charSequence, int i, int i2, anq anqVar) {
        boolean a;
        if (anqVar.c == 0) {
            anl anlVar = this.d;
            bmq e = anqVar.e();
            int a2 = e.a(8);
            short s = a2 != 0 ? e.b.getShort(a2 + e.a) : (short) 0;
            if (Build.VERSION.SDK_INT >= 23 || s <= Build.VERSION.SDK_INT) {
                if (anr.a.get() == null) {
                    anr.a.set(new StringBuilder());
                }
                StringBuilder sb = (StringBuilder) anr.a.get();
                sb.setLength(0);
                while (i < i2) {
                    sb.append(charSequence.charAt(i));
                    i++;
                }
                a = ha.a(((anr) anlVar).b, sb.toString());
            } else {
                a = false;
            }
            anqVar.c = true != a ? 1 : 2;
        }
        return anqVar.c == 2;
    }
}
