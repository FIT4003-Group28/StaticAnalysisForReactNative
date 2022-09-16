package defpackage;
/* compiled from: PG */
/* renamed from: aabh  reason: default package */
/* loaded from: classes.dex */
public final class aabh implements aaqw {
    private final aakt a;

    public aabh(aakt aaktVar) {
        this.a = aaktVar;
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        arpd arpdVar = ((aroy) aopaVar.instance).e;
        if (arpdVar == null) {
            arpdVar = arpd.a;
        }
        aopa mo52toBuilder = arpdVar.mo52toBuilder();
        boolean a = this.a.a();
        mo52toBuilder.copyOnWrite();
        arpd arpdVar2 = (arpd) mo52toBuilder.instance;
        arpdVar2.b |= 32;
        arpdVar2.d = a;
        aopaVar.copyOnWrite();
        aroy aroyVar = (aroy) aopaVar.instance;
        arpd arpdVar3 = (arpd) mo52toBuilder.mo39build();
        arpdVar3.getClass();
        aroyVar.e = arpdVar3;
        aroyVar.b |= 4;
    }
}
