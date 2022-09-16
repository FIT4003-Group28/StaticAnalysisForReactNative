package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
/* compiled from: PG */
/* renamed from: amlj  reason: default package */
/* loaded from: classes.dex */
final class amlj extends PhantomReference {
    final amli a;

    public amlj(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = new amli(this);
    }
}
