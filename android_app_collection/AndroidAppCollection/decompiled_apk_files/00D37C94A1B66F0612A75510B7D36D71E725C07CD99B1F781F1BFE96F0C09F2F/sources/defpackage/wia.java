package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: wia  reason: default package */
/* loaded from: classes4.dex */
public final class wia extends aars {
    public final aarl a;
    private final afvn b;

    public wia(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.b = afvnVar;
        this.a = c(aryw.a, aaqjVar, lto.g, iho.e);
    }

    public final why a(Optional optional, int i) {
        aopa createBuilder = aryv.a.createBuilder();
        createBuilder.copyOnWrite();
        aryv aryvVar = (aryv) createBuilder.instance;
        aryvVar.e = i - 1;
        aryvVar.b |= 4;
        optional.ifPresent(new whz(createBuilder));
        why whyVar = new why(this.e, this.b.c(), (aryv) createBuilder.mo39build());
        whyVar.k(aadi.b);
        return whyVar;
    }
}
