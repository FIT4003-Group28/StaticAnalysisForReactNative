package defpackage;
/* compiled from: PG */
/* renamed from: alvg  reason: default package */
/* loaded from: classes.dex */
public final class alvg {
    public final alvd a = new alvd(null);

    public final void a(Exception exc) {
        alvd alvdVar = this.a;
        synchronized (alvdVar.a) {
            if (alvdVar.c) {
                return;
            }
            alvdVar.c = true;
            alvdVar.e = exc;
            alvdVar.b.b(alvdVar);
        }
    }

    public final void b(Object obj) {
        alvd alvdVar = this.a;
        synchronized (alvdVar.a) {
            if (alvdVar.c) {
                return;
            }
            alvdVar.c = true;
            alvdVar.d = obj;
            alvdVar.b.b(alvdVar);
        }
    }
}
