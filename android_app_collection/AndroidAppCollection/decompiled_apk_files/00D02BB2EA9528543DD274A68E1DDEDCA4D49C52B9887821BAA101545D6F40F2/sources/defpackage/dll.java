package defpackage;
/* compiled from: PG */
/* renamed from: dll  reason: default package */
/* loaded from: classes6.dex */
public final class dll {
    final /* synthetic */ dln a;
    private final dyeu b;
    private final Object c = new Object();
    private boolean d;

    public dll(dln dlnVar, dyeu dyeuVar) {
        this.a = dlnVar;
        this.b = dyeuVar;
    }

    public final dyeu a() {
        dyeu dyeuVar;
        synchronized (this.c) {
            dbsk.l(!this.d);
            dyeuVar = this.b;
        }
        return dyeuVar;
    }

    public final void b() {
        synchronized (this.c) {
            dln dlnVar = this.a;
            synchronized (dlnVar.a) {
                int i = dlnVar.c - 1;
                dlnVar.c = i;
                if (i <= 0) {
                    dlnVar.c = 0;
                    dyhi dyhiVar = dlnVar.b;
                    dbsk.s(dyhiVar);
                    dyhiVar.f();
                    dyhiVar.b();
                    dlnVar.b = null;
                }
            }
            this.d = true;
        }
    }
}
