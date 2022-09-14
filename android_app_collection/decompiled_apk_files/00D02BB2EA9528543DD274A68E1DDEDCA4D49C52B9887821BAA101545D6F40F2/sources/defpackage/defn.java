package defpackage;
/* compiled from: PG */
/* renamed from: defn  reason: default package */
/* loaded from: classes6.dex */
public final class defn implements defg {
    final /* synthetic */ deft a;
    final /* synthetic */ defw b;

    public defn(defw defwVar, deft deftVar) {
        this.b = defwVar;
        this.a = deftVar;
    }

    @Override // defpackage.defg
    public final /* bridge */ /* synthetic */ dehn a(Object obj) {
        return this.b.b.a(this.a, (Throwable) obj);
    }

    public final String toString() {
        return this.a.toString();
    }
}
