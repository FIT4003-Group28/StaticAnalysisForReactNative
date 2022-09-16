package defpackage;
/* compiled from: PG */
/* renamed from: aiov  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiov implements ampg {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiov(String str) {
        this.a = str;
    }

    public /* synthetic */ aiov(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            String str = this.a;
            str.getClass();
            aoqp aoqpVar = ((awvh) obj).d;
            return Boolean.valueOf(aoqpVar.containsKey(str) ? ((Boolean) aoqpVar.get(str)).booleanValue() : false);
        }
        String str2 = this.a;
        aopa mo52toBuilder = ((baqg) obj).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        ((baqg) mo52toBuilder.instance).a().remove(str2);
        return (baqg) mo52toBuilder.mo39build();
    }
}
