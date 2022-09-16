package defpackage;

import android.graphics.Rect;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afnw  reason: default package */
/* loaded from: classes.dex */
public final class afnw {
    public static final /* synthetic */ int a = 0;
    private static final Map b = DesugarCollections.synchronizedMap(new HashMap());

    public static float a(Layout layout, EditText editText) {
        int lineBottom = layout.getLineBottom(layout.getLineForOffset(editText.getSelectionStart()));
        Rect rect = new Rect();
        editText.getLocalVisibleRect(rect);
        Rect rect2 = new Rect();
        editText.getGlobalVisibleRect(rect2);
        return (lineBottom - rect.top) + editText.getPaddingTop() + rect2.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:? -> B:82:0x018d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence b(defpackage.tda r16, final android.content.Context r17, defpackage.awma r18, defpackage.tcu r19, final defpackage.tfj r20, defpackage.teb r21) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afnw.b(tda, android.content.Context, awma, tcu, tfj, teb):java.lang.CharSequence");
    }

    public static void c(Editable editable) {
        ajwp[] ajwpVarArr;
        for (ajwp ajwpVar : (ajwp[]) editable.getSpans(0, editable.length(), ajwp.class)) {
            int spanStart = editable.getSpanStart(ajwpVar);
            int spanEnd = editable.getSpanEnd(ajwpVar);
            if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
                String valueOf = String.valueOf(ajwpVar.a);
                editable.replace(spanStart, spanEnd, valueOf.length() != 0 ? "@".concat(valueOf) : new String("@"));
            }
        }
        for (Object obj : (ajwp[]) editable.getSpans(0, editable.length(), ajwp.class)) {
            editable.removeSpan(obj);
        }
    }

    static void d(SpannableString spannableString, Object obj, int i, int i2) {
        int min = i < 0 ? 0 : Math.min(i, spannableString.length());
        int length = i2 <= 0 ? spannableString.length() : Math.min(i2 + min, spannableString.length());
        if (min == length) {
            return;
        }
        spannableString.setSpan(obj, min, length, 18);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, float f, int i, awsw awswVar) {
        if (spannableStringBuilder.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < awswVar.m.size(); i2++) {
                arrayList.add((awsp) awswVar.m.get(i2));
            }
            Collections.sort(arrayList, utr.k);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                awsp awspVar = (awsp) arrayList.get(i3);
                int i4 = awspVar.c;
                int i5 = awspVar.d + i4;
                if (spannableStringBuilder.charAt(i5 - 1) != ' ') {
                    spannableStringBuilder.insert(i5, " ");
                    i5++;
                }
                if (i4 != -1 && i5 != -1 && i4 < i5 && i5 <= spannableStringBuilder.length()) {
                    spannableStringBuilder.setSpan(new ajwp(awspVar.e, 2.0f, 0.0f, f, i, null), i4, i5, 33);
                }
            }
        }
    }
}
