package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aavt  reason: default package */
/* loaded from: classes.dex */
public final class aavt extends aaqs {
    public List a;

    public aavt(aaqf aaqfVar, afvm afvmVar) {
        super("dismissal/dismiss", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arqu.a.createBuilder();
        List list = this.a;
        createBuilder.copyOnWrite();
        arqu arquVar = (arqu) createBuilder.instance;
        aopu aopuVar = arquVar.d;
        if (!aopuVar.c()) {
            arquVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list, (List) arquVar.d);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        this.a.getClass();
    }
}
