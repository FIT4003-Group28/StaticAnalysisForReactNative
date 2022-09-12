package defpackage;
/* compiled from: PG */
/* renamed from: um  reason: default package */
/* loaded from: classes7.dex */
final class um extends ok {
    final /* synthetic */ un a;
    private boolean b = false;
    private int c = 0;

    public um(un unVar) {
        this.a = unVar;
    }

    @Override // defpackage.ok, defpackage.oj
    public final void b() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            oj ojVar = this.a.b;
            if (ojVar != null) {
                ojVar.b();
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    @Override // defpackage.ok, defpackage.oj
    public final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        oj ojVar = this.a.b;
        if (ojVar == null) {
            return;
        }
        ojVar.c();
    }
}
