package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: bvuy  reason: default package */
/* loaded from: classes4.dex */
public final class bvuy {
    private final Map<String, bvux> b = new HashMap();
    private final AtomicLong a = new AtomicLong();

    private final synchronized String c() {
        return String.format("i%1s", Long.valueOf(this.a.getAndIncrement()));
    }

    public final bvux a(String str, Map<String, Object> map) {
        bvux bvuxVar = new bvux(str, c(), map);
        this.b.put(bvuxVar.b, bvuxVar);
        return bvuxVar;
    }

    public final bvux b(String str) {
        if (!this.b.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new NoSuchElementException(valueOf.length() != 0 ? "No WebViewFunctionCall with callId: ".concat(valueOf) : new String("No WebViewFunctionCall with callId: "));
        }
        bvux remove = this.b.remove(str);
        dbsk.s(remove);
        return remove;
    }
}
