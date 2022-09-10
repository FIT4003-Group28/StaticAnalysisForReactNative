package defpackage;
/* compiled from: PG */
/* renamed from: kpe  reason: default package */
/* loaded from: classes7.dex */
public final class kpe implements baap {
    private final axwq a;
    private final btrm b;
    private final dndr c;
    private final azvb d;
    @dzsi
    private final String e;
    @dzsi
    private final String f;
    @dzsi
    private final akqq g;

    public kpe(axwq axwqVar, btrm btrmVar, dndr dndrVar, @dzsi String str, @dzsi String str2, @dzsi akqq akqqVar, azvb azvbVar) {
        boolean z = false;
        dbsk.m(dndrVar == dndr.HOME || dndrVar == dndr.WORK, "aliasType should be AliasType.HOME or AliasType.WORK!");
        dbsk.m((azvbVar == azvb.UPDATE || azvbVar == azvb.DELETE) ? true : z, "operation should be AliasOperation.UPDATE or AliasOperation.DELETE!");
        dbsk.s(axwqVar);
        this.a = axwqVar;
        dbsk.s(btrmVar);
        this.b = btrmVar;
        this.c = dndrVar;
        this.e = str;
        this.f = str2;
        this.g = akqqVar;
        this.d = azvbVar;
    }

    @Override // defpackage.baap
    public final void a(boolean z, @dzsi Long l, @dzsi decq decqVar, @dzsi String str, @dzsi dniu dniuVar, @dzsi String str2) {
        bvrj.UI_THREAD.c();
        if (!z) {
            dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
            return;
        }
        if (str != null) {
            this.a.c(str);
        }
        this.a.r();
        azqu azquVar = new azqu(this.d, this.c);
        azquVar.a = l;
        azquVar.e = decqVar;
        azquVar.f = str2;
        if (dniuVar == null || (dniuVar.a & 4) == 0) {
            azquVar.b = this.e;
        } else {
            azquVar.b = dniuVar.d;
        }
        if (dniuVar == null || (dniuVar.a & 1) == 0) {
            azquVar.c = this.f;
        } else {
            azquVar.c = dniuVar.b;
        }
        if (dniuVar == null || (dniuVar.a & 64) == 0) {
            azquVar.d = this.g;
        } else {
            dnoh dnohVar = dniuVar.g;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            azquVar.d = akqq.e(dnohVar);
        }
        this.b.b(azquVar.a());
    }
}
