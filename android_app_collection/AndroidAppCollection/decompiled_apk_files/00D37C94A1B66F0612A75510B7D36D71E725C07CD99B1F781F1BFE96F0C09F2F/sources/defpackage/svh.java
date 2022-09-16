package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.BreakIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: svh  reason: default package */
/* loaded from: classes4.dex */
public final class svh {
    public static final String a = "svh";
    public static final AtomicInteger b = new AtomicInteger();
    private static final BreakIterator c = BreakIterator.getCharacterInstance();

    private svh() {
    }

    public static tcs a(View view, tdz tdzVar) {
        tcq a2 = tcs.a();
        a2.a = view;
        a2.h = tdzVar;
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            String obj = editText.getText().toString();
            aopa createBuilder = awma.a.createBuilder();
            createBuilder.copyOnWrite();
            awma awmaVar = (awma) createBuilder.instance;
            obj.getClass();
            awmaVar.b |= 1;
            awmaVar.c = obj;
            awma awmaVar2 = (awma) createBuilder.mo39build();
            aopa createBuilder2 = awnl.a.createBuilder();
            createBuilder2.copyOnWrite();
            awnl awnlVar = (awnl) createBuilder2.instance;
            awmaVar2.getClass();
            awnlVar.d = awmaVar2;
            awnlVar.c |= 1;
            boolean isFocused = view.isFocused();
            createBuilder2.copyOnWrite();
            awnl awnlVar2 = (awnl) createBuilder2.instance;
            awnlVar2.c |= 8;
            awnlVar2.f = isFocused;
            int selectionEnd = editText.getSelectionEnd();
            createBuilder2.copyOnWrite();
            awnl awnlVar3 = (awnl) createBuilder2.instance;
            awnlVar3.c |= 2;
            awnlVar3.e = selectionEnd;
            BreakIterator breakIterator = c;
            breakIterator.setText(obj);
            breakIterator.first();
            int i = 0;
            while (c.next() != -1) {
                i++;
            }
            createBuilder2.copyOnWrite();
            awnl awnlVar4 = (awnl) createBuilder2.instance;
            awnlVar4.c |= 16;
            awnlVar4.g = i;
            aopc aopcVar = (aopc) awon.a.createBuilder();
            aopcVar.e(awnl.b, (awnl) createBuilder2.mo39build());
            a2.e = (awon) aopcVar.mo39build();
        }
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(dcz dczVar, dcz dczVar2) {
        dczVar.a = new svg();
        dczVar2.a = new AtomicBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(tfw tfwVar, TextView textView, tcu tcuVar, tda tdaVar) {
        if (tfwVar == null || textView == null) {
            return false;
        }
        tcuVar.b(tfwVar.a(), a(textView, tdaVar.u)).Q();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(axmy axmyVar, AtomicBoolean atomicBoolean, View view) {
        if (!axmyVar.aK() || !(view instanceof EditText) || !atomicBoolean.getAndSet(false)) {
            return;
        }
        view.post(new gys(view, 6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0284 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cyr f(defpackage.cyv r21, defpackage.axmy r22, defpackage.tfw r23, defpackage.tfw r24, defpackage.tfw r25, defpackage.tfw r26, defpackage.tfw r27, defpackage.tfj r28, defpackage.teb r29, defpackage.tcu r30, defpackage.tda r31, java.util.Map r32, defpackage.svg r33) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svh.f(cyv, axmy, tfw, tfw, tfw, tfw, tfw, tfj, teb, tcu, tda, java.util.Map, svg):cyr");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(tfw tfwVar, tfw tfwVar2, View view, boolean z, tcu tcuVar, tda tdaVar) {
        if (z) {
            if (tfwVar == null) {
                return;
            }
            tcuVar.b(tfwVar.a(), a(view, tdaVar.u)).Q();
        } else if (tfwVar2 == null) {
        } else {
            tcuVar.b(tfwVar2.a(), a(view, tdaVar.u)).Q();
        }
    }
}
