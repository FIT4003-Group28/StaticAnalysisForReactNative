package defpackage;
/* compiled from: PG */
/* renamed from: advq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class advq implements ampg {
    public final /* synthetic */ ampq a;
    private final /* synthetic */ int b;

    public /* synthetic */ advq(ampq ampqVar) {
        this.a = ampqVar;
    }

    public /* synthetic */ advq(ampq ampqVar, int i) {
        this.b = i;
        this.a = ampqVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            ampq ampqVar = this.a;
            String str = advr.a;
            aopa mo52toBuilder = ((awub) obj).mo52toBuilder();
            long longValue = ((Long) ampqVar.c()).longValue();
            mo52toBuilder.copyOnWrite();
            awub awubVar = (awub) mo52toBuilder.instance;
            awubVar.b |= 2;
            awubVar.d = longValue;
            return (awub) mo52toBuilder.mo39build();
        }
        ampq ampqVar2 = this.a;
        int i = gks.e;
        return gkr.a(ampqVar2, ((Boolean) obj).booleanValue());
    }
}
