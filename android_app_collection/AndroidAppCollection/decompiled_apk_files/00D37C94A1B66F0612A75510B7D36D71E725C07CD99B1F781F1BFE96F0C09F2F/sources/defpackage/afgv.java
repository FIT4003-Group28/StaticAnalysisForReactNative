package defpackage;
/* compiled from: PG */
/* renamed from: afgv  reason: default package */
/* loaded from: classes.dex */
public final class afgv implements amqo {
    private final amqo a;
    private final axnm b;

    public afgv(amqo amqoVar, axnm axnmVar) {
        this.a = amqoVar;
        this.b = axnmVar;
    }

    @Override // defpackage.amqo
    /* renamed from: a */
    public final ork get() {
        aopa createBuilder = ork.a.createBuilder();
        Object obj = this.a.get();
        createBuilder.copyOnWrite();
        ork orkVar = (ork) createBuilder.instance;
        obj.getClass();
        orkVar.c = (arow) obj;
        orkVar.b |= 1;
        afhz a = ((afig) this.b.get()).a();
        if (a != null) {
            aoob x = aoob.x(a.b);
            createBuilder.copyOnWrite();
            ork orkVar2 = (ork) createBuilder.instance;
            orkVar2.b |= 2;
            orkVar2.d = x;
        }
        return (ork) createBuilder.mo39build();
    }
}
