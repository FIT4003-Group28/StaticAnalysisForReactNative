package defpackage;
/* compiled from: PG */
/* renamed from: uuy  reason: default package */
/* loaded from: classes4.dex */
final class uuy extends uvb {
    public static final uuy a = new uuy();

    private uuy() {
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ aoqu a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        if (intValue == 0) {
            return null;
        }
        aopa createBuilder = azzc.a.createBuilder();
        createBuilder.copyOnWrite();
        azzc azzcVar = (azzc) createBuilder.instance;
        azzcVar.b |= 1;
        azzcVar.c = intValue;
        if (str != null) {
            azzd h = uut.h(str);
            createBuilder.copyOnWrite();
            azzc azzcVar2 = (azzc) createBuilder.instance;
            h.getClass();
            azzcVar2.d = h;
            azzcVar2.b |= 2;
        }
        return (azzc) createBuilder.mo39build();
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ aoqu b(aoqu aoquVar, aoqu aoquVar2) {
        azzc azzcVar = (azzc) aoquVar;
        azzc azzcVar2 = (azzc) aoquVar2;
        if (azzcVar == null || azzcVar2 == null) {
            return azzcVar;
        }
        if ((azzcVar.b & 1) != 0) {
            aopa createBuilder = azzc.a.createBuilder();
            azzd azzdVar = azzcVar.d;
            if (azzdVar == null) {
                azzdVar = azzd.a;
            }
            createBuilder.copyOnWrite();
            azzc azzcVar3 = (azzc) createBuilder.instance;
            azzdVar.getClass();
            azzcVar3.d = azzdVar;
            azzcVar3.b |= 2;
            int i = azzcVar.c - azzcVar2.c;
            if (i != 0) {
                createBuilder.copyOnWrite();
                azzc azzcVar4 = (azzc) createBuilder.instance;
                azzcVar4.b |= 1;
                azzcVar4.c = i;
                return (azzc) createBuilder.mo39build();
            }
        }
        return null;
    }

    @Override // defpackage.uvb
    public final /* bridge */ /* synthetic */ String c(aoqu aoquVar) {
        azzd azzdVar = ((azzc) aoquVar).d;
        if (azzdVar == null) {
            azzdVar = azzd.a;
        }
        return azzdVar.d;
    }
}
