package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: sub  reason: default package */
/* loaded from: classes4.dex */
public final class sub {
    public static final /* synthetic */ int a = 0;
    private static final String b = "sub";
    private static final AtomicInteger c = new AtomicInteger(1);

    public static void a(RecyclerView recyclerView, tcu tcuVar, awmt awmtVar, tcr tcrVar, tdz tdzVar, tdq tdqVar) {
        tcq a2 = tcs.a();
        a2.a = recyclerView;
        a2.h = tdzVar;
        a2.f = tdqVar;
        tcuVar.b(awmtVar, tcrVar.a(a2).a()).Q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
        if (r14 == 0) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cyr b(defpackage.cyv r26, defpackage.tdr r27, defpackage.tdi r28, defpackage.aypf r29, defpackage.tda r30, defpackage.axmr r31, java.util.List r32, defpackage.tcu r33, defpackage.dle r34, java.util.concurrent.atomic.AtomicBoolean r35, defpackage.tes r36, boolean r37, java.util.concurrent.atomic.AtomicReference r38, defpackage.tfw r39, defpackage.tfw r40, defpackage.tfw r41, defpackage.axna r42, defpackage.tcr r43) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sub.b(cyv, tdr, tdi, aypf, tda, axmr, java.util.List, tcu, dle, java.util.concurrent.atomic.AtomicBoolean, tes, boolean, java.util.concurrent.atomic.AtomicReference, tfw, tfw, tfw, axna, tcr):cyr");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(String str, suc sucVar, tcr tcrVar, dle dleVar, AtomicBoolean atomicBoolean) {
        dle dleVar2;
        if (str != null && dleVar != null && (dleVar2 = (dle) szk.a.put(str, dleVar)) != null) {
            szk.b.remove(dleVar2.a());
        }
        if (sucVar != null) {
            sucVar.b(tcrVar, tcrVar);
        }
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(cyv cyvVar, azqb azqbVar, axmr axmrVar, dcz dczVar, dcz dczVar2, dcz dczVar3, dcz dczVar4, dcz dczVar5) {
        dle dleVar = new dle(null);
        dczVar.a = dleVar;
        dczVar5.a = new sua(axmrVar, cyvVar.b, dleVar);
        dczVar4.a = new AtomicBoolean(false);
        if (azqbVar != null) {
            dczVar2.a = (tes) azqbVar.get();
        }
        dczVar3.a = new AtomicBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(String str, suc sucVar, tcr tcrVar, dle dleVar) {
        dle dleVar2;
        if (sucVar != null) {
            sucVar.c(tcrVar);
        }
        if (str == null || (dleVar2 = (dle) szk.a.get(str)) == null || dleVar2 != dleVar) {
            return;
        }
        szk.a.remove(str);
        szk.b.remove(dleVar2.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(axmr axmrVar, AtomicReference atomicReference, dle dleVar, AtomicBoolean atomicBoolean) {
        RecyclerView a2;
        if (atomicReference == null || atomicReference.get() == null) {
            return;
        }
        int i = 0;
        if (!atomicBoolean.getAndSet(false) || (a2 = dleVar.a()) == null) {
            return;
        }
        int aG = axmrVar.aG();
        int width = aG == 1 ? a2.getWidth() : 0;
        if (aG != 1) {
            i = a2.getHeight();
        }
        ((tes) atomicReference.get()).b(a2, width, i);
    }
}
