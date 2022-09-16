package defpackage;
/* compiled from: PG */
/* renamed from: vas  reason: default package */
/* loaded from: classes4.dex */
final class vas implements vat {
    private final /* synthetic */ int a;

    public vas() {
    }

    public vas(int i) {
        this.a = i;
    }

    @Override // defpackage.vat
    public final /* bridge */ /* synthetic */ String a(aoqt aoqtVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return ((baax) ((aopa) aoqtVar).instance).o;
            }
            return ((baab) ((aopa) aoqtVar).instance).c;
        }
        return ((azza) ((aopa) aoqtVar).instance).f;
    }

    @Override // defpackage.vat
    public final /* bridge */ /* synthetic */ String b(aoqt aoqtVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return ((baax) ((aopa) aoqtVar).instance).e;
            }
            return ((baab) ((aopa) aoqtVar).instance).e;
        }
        return ((azza) ((aopa) aoqtVar).instance).e;
    }

    @Override // defpackage.vat
    public final /* bridge */ /* synthetic */ void d(aoqt aoqtVar) {
        int i = this.a;
        if (i == 0) {
            aopa aopaVar = (aopa) aoqtVar;
            aopaVar.copyOnWrite();
            azza azzaVar = (azza) aopaVar.instance;
            azza azzaVar2 = azza.a;
            azzaVar.b &= -5;
            azzaVar.e = azza.a.e;
        } else if (i == 1) {
            aopa aopaVar2 = (aopa) aoqtVar;
            aopaVar2.copyOnWrite();
            baax baaxVar = (baax) aopaVar2.instance;
            baax baaxVar2 = baax.a;
            baaxVar.b &= -5;
            baaxVar.e = baax.a.e;
        } else {
            aopa aopaVar3 = (aopa) aoqtVar;
            aopaVar3.copyOnWrite();
            baab baabVar = (baab) aopaVar3.instance;
            baab baabVar2 = baab.a;
            baabVar.b &= -5;
            baabVar.e = baab.a.e;
        }
    }

    @Override // defpackage.vat
    public final /* bridge */ /* synthetic */ void c(aoqt aoqtVar, Long l) {
        int i = this.a;
        if (i == 0) {
            if (l == null) {
                aopa aopaVar = (aopa) aoqtVar;
                aopaVar.copyOnWrite();
                azza azzaVar = (azza) aopaVar.instance;
                azza azzaVar2 = azza.a;
                azzaVar.b &= -3;
                azzaVar.d = 0L;
                return;
            }
            long longValue = l.longValue();
            aopa aopaVar2 = (aopa) aoqtVar;
            aopaVar2.copyOnWrite();
            azza azzaVar3 = (azza) aopaVar2.instance;
            azza azzaVar4 = azza.a;
            azzaVar3.b |= 2;
            azzaVar3.d = longValue;
        } else if (i != 1) {
            if (l == null) {
                aopa aopaVar3 = (aopa) aoqtVar;
                aopaVar3.copyOnWrite();
                baab baabVar = (baab) aopaVar3.instance;
                baab baabVar2 = baab.a;
                baabVar.b &= -3;
                baabVar.d = 0L;
                return;
            }
            long longValue2 = l.longValue();
            aopa aopaVar4 = (aopa) aoqtVar;
            aopaVar4.copyOnWrite();
            baab baabVar3 = (baab) aopaVar4.instance;
            baab baabVar4 = baab.a;
            baabVar3.b |= 2;
            baabVar3.d = longValue2;
        } else if (l == null) {
            aopa aopaVar5 = (aopa) aoqtVar;
            aopaVar5.copyOnWrite();
            baax baaxVar = (baax) aopaVar5.instance;
            baax baaxVar2 = baax.a;
            baaxVar.b &= -3;
            baaxVar.d = 0L;
        } else {
            long longValue3 = l.longValue();
            aopa aopaVar6 = (aopa) aoqtVar;
            aopaVar6.copyOnWrite();
            baax baaxVar3 = (baax) aopaVar6.instance;
            baax baaxVar4 = baax.a;
            baaxVar3.b |= 2;
            baaxVar3.d = longValue3;
        }
    }
}
