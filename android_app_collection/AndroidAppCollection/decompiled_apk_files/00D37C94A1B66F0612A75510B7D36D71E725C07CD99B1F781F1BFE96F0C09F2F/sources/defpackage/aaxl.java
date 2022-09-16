package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aaxl  reason: default package */
/* loaded from: classes.dex */
public final class aaxl extends aaqs {
    public String a;
    public Iterable b;
    public Iterable c;

    public aaxl(aaqf aaqfVar, afvm afvmVar) {
        super("kids/update_kids_allowlist", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = avsz.a.createBuilder();
        String str = this.a;
        createBuilder.copyOnWrite();
        avsz avszVar = (avsz) createBuilder.instance;
        str.getClass();
        avszVar.b |= 2;
        avszVar.d = str;
        Iterable iterable = this.b;
        createBuilder.copyOnWrite();
        avsz avszVar2 = (avsz) createBuilder.instance;
        aopu aopuVar = avszVar2.e;
        if (!aopuVar.c()) {
            avszVar2.e = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll(iterable, (List) avszVar2.e);
        Iterable iterable2 = this.c;
        createBuilder.copyOnWrite();
        avsz avszVar3 = (avsz) createBuilder.instance;
        aopu aopuVar2 = avszVar3.f;
        if (!aopuVar2.c()) {
            avszVar3.f = aopi.mutableCopy(aopuVar2);
        }
        aonk.addAll(iterable2, (List) avszVar3.f);
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean z = false;
        aqxo.p(this.a != null);
        if (this.b != null || this.c != null) {
            z = true;
        }
        aqxo.p(z);
    }
}
