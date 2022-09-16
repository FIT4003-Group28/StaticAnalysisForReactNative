package defpackage;
/* compiled from: PG */
/* renamed from: jsg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jsg implements ampg {
    public final /* synthetic */ jsi a;
    private final /* synthetic */ int b;

    public /* synthetic */ jsg(jsi jsiVar) {
        this.a = jsiVar;
    }

    public /* synthetic */ jsg(jsi jsiVar, int i) {
        this.b = i;
        this.a = jsiVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            amvl amvlVar = (amvl) obj;
            amvlVar.c(this.a.c);
            return amvlVar;
        }
        frz frzVar = (frz) obj;
        frzVar.e(new jsg(this.a));
        return frzVar;
    }
}
