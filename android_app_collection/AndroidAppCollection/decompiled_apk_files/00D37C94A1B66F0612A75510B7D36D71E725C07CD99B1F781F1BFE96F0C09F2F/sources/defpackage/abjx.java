package defpackage;
/* compiled from: PG */
/* renamed from: abjx  reason: default package */
/* loaded from: classes.dex */
public final class abjx {
    private final acrr a;

    public abjx(acrr acrrVar) {
        this.a = acrrVar;
    }

    public final void a(int i, int i2) {
        arrf a = arrh.a();
        aopa createBuilder = asqq.a.createBuilder();
        createBuilder.copyOnWrite();
        asqq asqqVar = (asqq) createBuilder.instance;
        asqqVar.c = i - 1;
        asqqVar.b |= 1;
        createBuilder.copyOnWrite();
        asqq asqqVar2 = (asqq) createBuilder.instance;
        asqqVar2.d = i2 - 1;
        asqqVar2.b |= 2;
        a.copyOnWrite();
        ((arrh) a.instance).cI((asqq) createBuilder.mo39build());
        this.a.c((arrh) a.mo39build());
    }
}
