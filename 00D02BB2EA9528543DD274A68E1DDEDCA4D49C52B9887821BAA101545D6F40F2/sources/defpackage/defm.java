package defpackage;
/* compiled from: PG */
/* renamed from: defm  reason: default package */
/* loaded from: classes6.dex */
final class defm implements defg {
    final /* synthetic */ defq a;
    final /* synthetic */ defw b;

    public defm(defw defwVar, defq defqVar) {
        this.b = defwVar;
        this.a = defqVar;
    }

    @Override // defpackage.defg
    public final dehn a(Object obj) {
        return this.b.b.b(this.a, obj);
    }

    public final String toString() {
        return this.a.toString();
    }
}
