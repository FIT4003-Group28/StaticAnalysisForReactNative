package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cyfn  reason: default package */
/* loaded from: classes5.dex */
public final class cyfn<K, V> {
    public final long a;
    private final cyfm b = new cyfm(this);

    public cyfn(long j, TimeUnit timeUnit) {
        this.a = timeUnit.toMillis(j);
    }

    public final V a(K k) {
        V v;
        synchronized (this.b) {
            cyfm cyfmVar = this.b;
            cyfl cyflVar = (cyfl) cyfmVar.get(k);
            v = null;
            if (cyflVar != null) {
                if (cyflVar.a()) {
                    cyfmVar.remove(k);
                } else {
                    v = (V) cyflVar.a;
                }
            }
        }
        return v;
    }

    public final void b(K k, V v) {
        synchronized (this.b) {
            cyfm cyfmVar = this.b;
            cyfmVar.put(k, new cyfl(cyfmVar.a, v));
        }
    }
}
