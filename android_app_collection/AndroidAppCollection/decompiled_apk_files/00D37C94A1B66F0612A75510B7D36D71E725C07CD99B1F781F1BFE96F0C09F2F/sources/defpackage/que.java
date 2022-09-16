package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: que  reason: default package */
/* loaded from: classes4.dex */
public final class que {
    public final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());
    public final Map b = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.b) {
            hashMap2 = new HashMap(this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).l(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((rvh) entry2.getKey()).c(new qsp(status));
            }
        }
    }
}
