package defpackage;
/* compiled from: PG */
/* renamed from: aach  reason: default package */
/* loaded from: classes2.dex */
public final class aach {
    @dzsi
    public aacg a;
    private final bvrb b;
    private final aacf c;
    @dzsi
    private btzc d;
    private final butr e;

    public aach(butr butrVar, bvrb bvrbVar, aacf aacfVar) {
        this.e = butrVar;
        this.b = bvrbVar;
        this.c = aacfVar;
    }

    private final void f() {
        btzc btzcVar = this.d;
        if (btzcVar != null) {
            btzcVar.a();
            this.d = null;
        }
    }

    public final void a(aacn aacnVar) {
        this.a = new aacg();
        f();
        this.c.a(new aaco());
        aacg aacgVar = this.a;
        dbsk.s(aacgVar);
        this.d = this.e.b(aacnVar.a(), new aace(this, aacgVar), this.b.h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        f();
        c();
    }

    public final void c() {
        this.a = null;
        this.d = null;
    }

    public final boolean d(aacg aacgVar) {
        return this.a == aacgVar;
    }

    public final void e(aaco aacoVar) {
        this.c.a(aacoVar);
    }
}
