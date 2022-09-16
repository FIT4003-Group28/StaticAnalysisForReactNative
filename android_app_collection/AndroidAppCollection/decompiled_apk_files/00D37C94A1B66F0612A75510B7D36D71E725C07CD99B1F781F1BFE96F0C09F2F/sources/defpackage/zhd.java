package defpackage;

import j$.util.function.Consumer;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: zhd  reason: default package */
/* loaded from: classes4.dex */
public final class zhd {
    public final zhc a;
    private final zha b;

    private zhd(zhc zhcVar, Collection collection) {
        collection.getClass();
        aqxo.p(!collection.contains(null));
        this.b = new zha(collection);
        zhcVar.getClass();
        this.a = zhcVar;
    }

    public static zhd a(zhc zhcVar) {
        return new zhd(zhcVar, amyg.a);
    }

    public final void b(final Object obj) {
        obj.getClass();
        this.b.a(new Consumer() { // from class: zhb
            @Override // j$.util.function.Consumer
            public final void accept(Object obj2) {
                zhd zhdVar = zhd.this;
                zhdVar.a.a(obj2, obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
    }

    public final void c(Object obj) {
        obj.getClass();
        this.b.b(obj);
    }

    public final void d(Object obj) {
        obj.getClass();
        this.b.c(obj);
    }
}
