package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aaxn  reason: default package */
/* loaded from: classes.dex */
public final class aaxn extends aaqs {
    public List a;
    public String b;

    public aaxn(aaqf aaqfVar, afvm afvmVar) {
        super("kids/update_blacklist", aaqfVar, afvmVar);
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arvd.a.createBuilder();
        List list = this.a;
        createBuilder.copyOnWrite();
        arvd arvdVar = (arvd) createBuilder.instance;
        aopu aopuVar = arvdVar.d;
        if (!aopuVar.c()) {
            arvdVar.d = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list, (List) arvdVar.d);
        String str = this.b;
        if (str != null) {
            createBuilder.copyOnWrite();
            arvd arvdVar2 = (arvd) createBuilder.instance;
            arvdVar2.b |= 2;
            arvdVar2.e = str;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        List list = this.a;
        list.getClass();
        aqxo.p(!list.isEmpty());
    }
}
