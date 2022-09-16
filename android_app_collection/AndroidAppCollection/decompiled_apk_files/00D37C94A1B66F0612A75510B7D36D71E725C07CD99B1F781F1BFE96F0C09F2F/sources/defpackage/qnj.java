package defpackage;

import android.util.LruCache;
import com.google.android.gms.cast.MediaQueueItem;
/* compiled from: PG */
/* renamed from: qnj  reason: default package */
/* loaded from: classes4.dex */
final class qnj extends LruCache {
    final /* synthetic */ qnl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnj(qnl qnlVar) {
        super(20);
        this.a = qnlVar;
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        MediaQueueItem mediaQueueItem = (MediaQueueItem) obj2;
        MediaQueueItem mediaQueueItem2 = (MediaQueueItem) obj3;
        if (!z) {
            return;
        }
        this.a.g.add(num);
    }
}
