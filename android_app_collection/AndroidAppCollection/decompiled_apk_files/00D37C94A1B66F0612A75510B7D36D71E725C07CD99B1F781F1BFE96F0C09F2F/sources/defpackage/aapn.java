package defpackage;
/* compiled from: PG */
/* renamed from: aapn  reason: default package */
/* loaded from: classes.dex */
public final class aapn implements aaqw {
    public static final aapm a = new aapl();
    private final amqo b;

    public aapn(amqo amqoVar) {
        this.b = amqoVar;
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        arow arowVar = ((aroy) aopaVar.instance).c;
        if (arowVar == null) {
            arowVar = arow.a;
        }
        aopa mo52toBuilder = arowVar.mo52toBuilder();
        mo52toBuilder.mergeFrom((aopi) this.b.get());
        aopaVar.copyOnWrite();
        aroy aroyVar = (aroy) aopaVar.instance;
        arow arowVar2 = (arow) mo52toBuilder.mo39build();
        arowVar2.getClass();
        aroyVar.c = arowVar2;
        aroyVar.b |= 1;
    }
}
