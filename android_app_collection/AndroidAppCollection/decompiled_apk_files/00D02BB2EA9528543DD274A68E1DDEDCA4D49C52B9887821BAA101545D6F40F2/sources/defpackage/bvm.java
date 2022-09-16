package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: bvm  reason: default package */
/* loaded from: classes.dex */
final class bvm extends WeakReference<bwv<?>> {
    final btw a;
    final boolean b;
    bxd<?> c;

    public bvm(btw btwVar, bwv<?> bwvVar, ReferenceQueue<? super bwv<?>> referenceQueue) {
        super(bwvVar, referenceQueue);
        cjn.b(btwVar);
        this.a = btwVar;
        this.c = null;
        this.b = bwvVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = null;
        clear();
    }
}
