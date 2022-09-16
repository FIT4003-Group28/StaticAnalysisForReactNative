package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: anki  reason: default package */
/* loaded from: classes.dex */
public final class anki {
    public final AtomicInteger c;
    public final ankt[] d;
    public boolean a = false;
    public boolean b = true;
    public volatile int e = 0;

    public anki(ankt[] anktVarArr) {
        this.d = anktVarArr;
        this.c = new AtomicInteger(anktVarArr.length);
    }

    public final void a() {
        ankt[] anktVarArr;
        if (this.c.decrementAndGet() != 0 || !this.a) {
            return;
        }
        for (ankt anktVar : this.d) {
            if (anktVar != null) {
                anktVar.cancel(this.b);
            }
        }
    }
}
