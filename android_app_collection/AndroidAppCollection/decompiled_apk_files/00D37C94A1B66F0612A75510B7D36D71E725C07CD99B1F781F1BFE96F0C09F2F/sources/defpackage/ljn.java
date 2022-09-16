package defpackage;
/* compiled from: PG */
/* renamed from: ljn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ljn implements aypx {
    public final /* synthetic */ ljo a;
    private final /* synthetic */ int b;

    public /* synthetic */ ljn(ljo ljoVar, int i) {
        this.b = i;
        this.a = ljoVar;
    }

    @Override // defpackage.aypx
    public final Object a(Object obj, Object obj2) {
        if (this.b == 0) {
            ljo ljoVar = this.a;
            final Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            ljoVar.a();
            ljoVar.a.b(new ampg() { // from class: ljm
                @Override // defpackage.ampg
                public final Object apply(Object obj3) {
                    Integer num3 = num;
                    aopa mo52toBuilder = ((ljp) obj3).mo52toBuilder();
                    int intValue = num3.intValue();
                    mo52toBuilder.copyOnWrite();
                    ljp ljpVar = (ljp) mo52toBuilder.instance;
                    ljpVar.b |= 4;
                    ljpVar.e = intValue;
                    return (ljp) mo52toBuilder.mo39build();
                }
            });
            return num2;
        }
        ljo ljoVar2 = this.a;
        awan awanVar = (awan) obj2;
        ljoVar2.a();
        ljoVar2.a.b(new lly((awan) obj, 1));
        return awanVar;
    }
}
