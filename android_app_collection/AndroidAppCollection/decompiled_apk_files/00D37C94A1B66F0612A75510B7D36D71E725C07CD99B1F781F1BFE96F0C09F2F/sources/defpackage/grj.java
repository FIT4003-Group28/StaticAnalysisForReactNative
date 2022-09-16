package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: grj  reason: default package */
/* loaded from: classes3.dex */
final class grj extends HashMap {
    public grj(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(String str, amqo amqoVar) {
        if (containsKey(str)) {
            return get(str);
        }
        Object obj = amqoVar.get();
        put(str, obj);
        return obj;
    }
}
