package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dcaa  reason: default package */
/* loaded from: classes5.dex */
final class dcaa extends dbxi<dcla> {
    final /* synthetic */ dcae a;
    private final Iterator<Map.Entry> b;

    public dcaa(dcae dcaeVar) {
        this.a = dcaeVar;
        this.b = dcaeVar.a.entrySet().iterator();
    }

    @Override // defpackage.dbxi
    protected final /* bridge */ /* synthetic */ dcla a() {
        while (this.b.hasNext()) {
            Map.Entry next = this.b.next();
            int i = ((AtomicInteger) next.getValue()).get();
            if (i != 0) {
                return new dclf(next.getKey(), i);
            }
        }
        return b();
    }
}
