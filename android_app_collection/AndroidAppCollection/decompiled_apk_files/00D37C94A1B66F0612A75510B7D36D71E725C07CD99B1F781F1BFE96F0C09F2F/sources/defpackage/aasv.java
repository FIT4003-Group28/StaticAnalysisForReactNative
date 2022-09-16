package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aasv  reason: default package */
/* loaded from: classes.dex */
public final class aasv extends aaqs {
    public final List a;
    public int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public aasv(aaqf aaqfVar, afvm afvmVar, String str, boolean z) {
        super("att/get", aaqfVar, afvmVar, 1, false, str, Boolean.valueOf(z));
        this.a = new ArrayList();
        this.b = 1;
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arla.a.createBuilder();
        List list = this.a;
        createBuilder.copyOnWrite();
        arla arlaVar = (arla) createBuilder.instance;
        aopu aopuVar = arlaVar.e;
        if (!aopuVar.c()) {
            arlaVar.e = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list, (List) arlaVar.e);
        int i = this.b;
        createBuilder.copyOnWrite();
        arla arlaVar2 = (arla) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            arlaVar2.d = i2;
            arlaVar2.b |= 2;
            return createBuilder;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.p(!t());
    }

    public final boolean t() {
        return this.a.isEmpty() || this.b == 1;
    }
}
