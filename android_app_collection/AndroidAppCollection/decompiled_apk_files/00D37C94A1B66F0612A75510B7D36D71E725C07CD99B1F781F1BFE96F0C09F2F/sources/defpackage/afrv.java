package defpackage;

import android.util.LruCache;
/* compiled from: PG */
/* renamed from: afrv  reason: default package */
/* loaded from: classes.dex */
final class afrv extends LruCache {
    public afrv(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        String str = (String) obj;
        return ((cer) obj2).a.length;
    }
}
