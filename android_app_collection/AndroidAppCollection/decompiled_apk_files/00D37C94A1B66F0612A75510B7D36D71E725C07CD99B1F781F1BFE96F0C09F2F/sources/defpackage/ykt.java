package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
/* compiled from: PG */
/* renamed from: ykt  reason: default package */
/* loaded from: classes4.dex */
final class ykt extends SoftReference {
    public final Object a;

    public ykt(Object obj, Object obj2, ReferenceQueue referenceQueue) {
        super(obj2, referenceQueue);
        this.a = obj;
    }
}
