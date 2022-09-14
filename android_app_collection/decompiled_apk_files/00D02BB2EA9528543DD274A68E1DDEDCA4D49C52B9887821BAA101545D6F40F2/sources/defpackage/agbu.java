package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: agbu  reason: default package */
/* loaded from: classes2.dex */
final class agbu<K> extends WeakReference<agbt<? super K>> {
    final K a;

    public agbu(K k, agbt<? super K> agbtVar, ReferenceQueue<agbt<? super K>> referenceQueue) {
        super(agbtVar, referenceQueue);
        this.a = k;
    }
}
