package defpackage;
/* compiled from: PG */
/* renamed from: aaqe  reason: default package */
/* loaded from: classes.dex */
public final class aaqe implements aaqw {
    private final afvn a;

    public aaqe(afvn afvnVar) {
        afvnVar.getClass();
        this.a = afvnVar;
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        arpd arpdVar = ((aroy) aopaVar.instance).e;
        if (arpdVar == null) {
            arpdVar = arpd.a;
        }
        aopa mo52toBuilder = arpdVar.mo52toBuilder();
        boolean g = this.a.c().g();
        mo52toBuilder.copyOnWrite();
        arpd arpdVar2 = (arpd) mo52toBuilder.instance;
        arpdVar2.b |= 4096;
        arpdVar2.e = g;
        aopaVar.copyOnWrite();
        aroy aroyVar = (aroy) aopaVar.instance;
        arpd arpdVar3 = (arpd) mo52toBuilder.mo39build();
        arpdVar3.getClass();
        aroyVar.e = arpdVar3;
        aroyVar.b |= 4;
    }
}
