package defpackage;
/* compiled from: PG */
/* renamed from: jlr  reason: default package */
/* loaded from: classes3.dex */
abstract class jlr extends jlq {
    private final azqb a;

    /* JADX INFO: Access modifiers changed from: protected */
    public jlr(azqb azqbVar, Class cls) {
        super(fcl.class, cls);
        this.a = azqbVar;
    }

    protected abstract Object a(agvx agvxVar, amup amupVar);

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        if (((fcl) obj).h()) {
            return a(((agrf) this.a.get()).a(), amupVar);
        }
        return f();
    }

    protected abstract Object f();
}
