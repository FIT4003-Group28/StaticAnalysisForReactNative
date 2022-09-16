package defpackage;

import android.text.SpannableString;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sxf  reason: default package */
/* loaded from: classes4.dex */
public final class sxf {
    public static final /* synthetic */ int a = 0;
    private static final Map b = DesugarCollections.synchronizedMap(new HashMap());
    private static final Map c = DesugarCollections.synchronizedMap(new HashMap());

    static void a(SpannableString spannableString, Object obj, int i, int i2) {
        int min = i < 0 ? 0 : Math.min(i, spannableString.length());
        int length = i2 <= 0 ? spannableString.length() : Math.min(i2 + min, spannableString.length());
        if (min == length) {
            return;
        }
        spannableString.setSpan(obj, min, length, 18);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(tdg tdgVar, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, AtomicReference atomicReference4) {
        tdgVar.a();
        atomicReference.lazySet(null);
        atomicReference2.lazySet(null);
        atomicReference3.lazySet(null);
        atomicReference4.lazySet(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x05be, code lost:
        if (r0 < 0) goto L259;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:300:? -> B:91:0x01ec). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.CharSequence c(defpackage.tda r31, defpackage.cyv r32, defpackage.axmn r33, defpackage.tcu r34, final defpackage.tfj r35, defpackage.teb r36, java.util.Map r37, defpackage.tdg r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxf.c(tda, cyv, axmn, tcu, tfj, teb, java.util.Map, tdg, boolean, boolean):java.lang.CharSequence");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence d(tda tdaVar, cyv cyvVar, axmn axmnVar, tcu tcuVar, tfj tfjVar, teb tebVar, Map map) {
        return c(tdaVar, cyvVar, axmnVar, tcuVar, tfjVar, tebVar, map, tdg.a, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(cyv cyvVar, axnk axnkVar, tcu tcuVar, tfj tfjVar, tda tdaVar, teb tebVar, Map map, tdg tdgVar, boolean z, boolean z2, dcz dczVar, dcz dczVar2, dcz dczVar3, dcz dczVar4) {
        dczVar.a = new AtomicReference(axnkVar.aI());
        dczVar2.a = new AtomicReference(axnkVar.aJ());
        dczVar3.a = new AtomicReference(c(tdaVar, cyvVar, tfy.b(axnkVar.aI()), tcuVar, tfjVar, tebVar, map, tdgVar, z, z2));
        dczVar4.a = new AtomicReference(c(tdaVar, cyvVar, tfy.b(axnkVar.aJ()), tcuVar, tfjVar, tebVar, map, tdgVar, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020e, code lost:
        if (r0.aN() > 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0210, code lost:
        r6.a.U = new defpackage.swe();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cyr f(defpackage.cyv r13, defpackage.axnk r14, defpackage.tcu r15, defpackage.tfj r16, defpackage.teb r17, defpackage.tda r18, java.util.Map r19, defpackage.tdg r20, boolean r21, boolean r22, java.lang.Boolean r23, java.util.concurrent.atomic.AtomicReference r24, java.util.concurrent.atomic.AtomicReference r25, java.util.concurrent.atomic.AtomicReference r26, java.util.concurrent.atomic.AtomicReference r27) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxf.f(cyv, axnk, tcu, tfj, teb, tda, java.util.Map, tdg, boolean, boolean, java.lang.Boolean, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference):cyr");
    }
}
