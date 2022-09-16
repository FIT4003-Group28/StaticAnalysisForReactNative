package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aavs  reason: default package */
/* loaded from: classes.dex */
public final class aavs extends aaqs {
    public List a;

    public aavs(aaqf aaqfVar, afvm afvmVar) {
        super("datasync/get", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arql.a.createBuilder();
        List list = this.a;
        if (list != null) {
            createBuilder.copyOnWrite();
            arql arqlVar = (arql) createBuilder.instance;
            aopu aopuVar = arqlVar.d;
            if (!aopuVar.c()) {
                arqlVar.d = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list, (List) arqlVar.d);
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        List list = this.a;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        aqxo.p(z);
    }
}
