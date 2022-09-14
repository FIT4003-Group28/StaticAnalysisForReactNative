package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cqpx  reason: default package */
/* loaded from: classes.dex */
final class cqpx extends cqpz {
    @Override // defpackage.cqpz
    protected final Reference a(Object obj, ReferenceQueue referenceQueue) {
        return new WeakReference(obj, referenceQueue);
    }
}
