package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: cvvm  reason: default package */
/* loaded from: classes5.dex */
public final class cvvm<ContentT> {
    public ContentT a;
    private final CopyOnWriteArrayList<cvvl<ContentT>> b = new CopyOnWriteArrayList<>();

    public cvvm() {
    }

    public final void a(cvvl<ContentT> cvvlVar) {
        this.b.add(cvvlVar);
    }

    public final void b(cvvl<ContentT> cvvlVar) {
        this.b.remove(cvvlVar);
    }

    public final void c(ContentT contentt) {
        if (czhw.a(contentt, this.a)) {
            return;
        }
        ContentT contentt2 = this.a;
        this.a = contentt;
        Iterator<cvvl<ContentT>> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(contentt2);
        }
    }

    public cvvm(ContentT contentt) {
        this.a = contentt;
    }
}
