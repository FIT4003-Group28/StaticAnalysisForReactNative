package defpackage;
/* compiled from: PG */
/* renamed from: noe  reason: default package */
/* loaded from: classes7.dex */
public final class noe {
    @dzsi
    public nou a;
    public boolean b;

    public final void a(nou nouVar) {
        dbsk.s(nouVar);
        this.a = nouVar;
    }

    public final void b(@dzsi noq noqVar, boolean z) {
        if (noqVar != null) {
            this.b = z;
            noqVar.j(this);
            return;
        }
        nou nouVar = this.a;
        if (nouVar == null) {
            return;
        }
        nouVar.c();
        this.a = null;
    }
}
