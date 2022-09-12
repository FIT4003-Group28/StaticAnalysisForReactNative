package defpackage;
/* compiled from: PG */
/* renamed from: cohg  reason: default package */
/* loaded from: classes5.dex */
public final class cohg extends cohk {
    private final cogc a;
    private final dbug b;
    private final Object c = new Object();
    private boolean d = false;

    public cohg(cogc cogcVar, dbug dbugVar) {
        this.a = cogcVar;
        this.b = dbugVar;
    }

    @Override // defpackage.cohl
    public final void b() {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.close();
        }
    }

    @Override // defpackage.cohl
    public final void c(@dzsi cohj cohjVar) {
        dbsk.a(cohjVar != null);
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            this.a.a(new cohh(this, cohjVar, this.b));
        }
    }

    @Override // defpackage.cohl
    public final void d() {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            this.a.b();
        }
    }
}
