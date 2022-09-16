package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: tge  reason: default package */
/* loaded from: classes4.dex */
public final class tge {
    static final tda a = tda.a().a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cyr a(cyv cyvVar, tfm tfmVar, tda tdaVar, AtomicReference atomicReference, AtomicReference atomicReference2) {
        if (atomicReference2.get() == null || ((WeakReference) atomicReference2.get()).get() != tfmVar) {
            atomicReference2.set(new WeakReference(tfmVar));
            atomicReference.set(null);
        }
        cyr cyrVar = (cyr) atomicReference.get();
        if (cyrVar == null) {
            cyr a2 = tfmVar.a(cyvVar, tdaVar);
            atomicReference.set(a2);
            return a2;
        }
        return cyrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(dcz dczVar, dcz dczVar2) {
        dczVar.a = new AtomicReference();
        dczVar2.a = new AtomicReference();
    }
}
