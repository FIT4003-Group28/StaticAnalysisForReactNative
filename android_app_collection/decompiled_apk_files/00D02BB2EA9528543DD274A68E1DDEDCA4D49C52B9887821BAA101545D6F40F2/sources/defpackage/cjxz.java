package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cjxz  reason: default package */
/* loaded from: classes.dex */
public final class cjxz {
    @dzsi
    public cjyb a;
    @dzsi
    public Throwable b;
    public boolean c = true;
    protected final Runnable d = new cjxy();

    public final boolean a() {
        return this.a != null;
    }

    public final void b() {
        if (a()) {
            dbsk.m(this.a != null, "Already unblocked");
            this.a.d.c();
            dbsk.l(this.a.b.remove(this));
            this.a.a.removeCallbacks(this.d);
            this.b = null;
            cjyb cjybVar = this.a;
            this.a = null;
            if (!cjybVar.b.isEmpty()) {
                return;
            }
            while (!cjybVar.c.isEmpty()) {
                List<cjxx> list = cjybVar.c;
                cjxx remove = list.remove(list.size() - 1);
                dbsk.m(remove.b == cjybVar, "Not the owner of the action");
                remove.b = null;
                remove.run();
                remove.c();
            }
        }
    }

    public final void c() {
        this.c = false;
    }
}
