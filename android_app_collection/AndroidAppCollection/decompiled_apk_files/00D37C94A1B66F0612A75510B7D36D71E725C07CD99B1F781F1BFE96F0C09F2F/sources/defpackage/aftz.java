package defpackage;
/* compiled from: PG */
/* renamed from: aftz  reason: default package */
/* loaded from: classes.dex */
final class aftz implements yms {
    yms a;
    final /* synthetic */ afua b;
    private final boolean c;
    private final boolean d;

    @Override // defpackage.yms
    public final void a() {
        yms ymsVar = this.a;
        if (ymsVar != null) {
            ymsVar.a();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        throw null;
    }

    public aftz(afua afuaVar) {
        this.b = afuaVar;
        boolean z = afuaVar.c;
        boolean z2 = !z;
        this.c = z2;
        this.d = z;
        if (!z || !afuaVar.d) {
            this.a = afuaVar.a.a();
            afuaVar.b.a();
            boolean z3 = false;
            if (z && !this.a.hasNext()) {
                z3 = true;
            }
            afuaVar.d = z3;
            if (!z2) {
                this.a.getClass();
                throw null;
            }
            throw null;
        }
        afuaVar.b.a();
    }
}
