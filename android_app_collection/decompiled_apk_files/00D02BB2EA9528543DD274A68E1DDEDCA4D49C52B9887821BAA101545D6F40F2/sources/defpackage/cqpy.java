package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
/* compiled from: PG */
/* renamed from: cqpy  reason: default package */
/* loaded from: classes.dex */
public final class cqpy extends cqpz {
    @Override // defpackage.cqpz
    protected final Reference a(Object obj, ReferenceQueue referenceQueue) {
        return new SoftReference(obj, referenceQueue);
    }
}
