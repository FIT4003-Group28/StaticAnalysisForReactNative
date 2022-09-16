package defpackage;

import java.util.Collection;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: jnr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jnr implements Runnable {
    public final /* synthetic */ jnw a;
    public final /* synthetic */ yiw b;
    private final /* synthetic */ int c;

    public /* synthetic */ jnr(jnw jnwVar, yiw yiwVar) {
        this.a = jnwVar;
        this.b = yiwVar;
    }

    public /* synthetic */ jnr(jnw jnwVar, yiw yiwVar, int i) {
        this.c = i;
        this.a = jnwVar;
        this.b = yiwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection emptyList;
        Collection emptyList2;
        if (this.c != 0) {
            jnw jnwVar = this.a;
            yiw yiwVar = this.b;
            if (jnwVar.a.j()) {
                emptyList2 = jnwVar.a().j();
            } else {
                emptyList2 = Collections.emptyList();
            }
            jnwVar.c.execute(new jnq(yiwVar, emptyList2, 1));
            return;
        }
        jnw jnwVar2 = this.a;
        yiw yiwVar2 = this.b;
        if (jnwVar2.a.h()) {
            emptyList = ((agrf) jnwVar2.b.get()).a().m().j();
        } else {
            emptyList = Collections.emptyList();
        }
        jnwVar2.c.execute(new jnq(yiwVar2, emptyList));
    }
}
