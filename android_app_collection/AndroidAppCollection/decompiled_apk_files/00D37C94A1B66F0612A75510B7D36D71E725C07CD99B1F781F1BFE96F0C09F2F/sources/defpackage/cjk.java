package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjk  reason: default package */
/* loaded from: classes2.dex */
public final class cjk extends WeakReference {
    final chy a;
    final boolean b;
    cku c;

    public cjk(chy chyVar, cko ckoVar, ReferenceQueue referenceQueue, boolean z) {
        super(ckoVar, referenceQueue);
        hy.N(chyVar);
        this.a = chyVar;
        cku ckuVar = null;
        if (ckoVar.a && z) {
            ckuVar = ckoVar.b;
            hy.N(ckuVar);
        }
        this.c = ckuVar;
        this.b = ckoVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = null;
        clear();
    }
}
