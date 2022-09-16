package defpackage;
/* compiled from: PG */
/* renamed from: ugh  reason: default package */
/* loaded from: classes4.dex */
public final class ugh {
    private final ucj a;
    private final ufl b;
    private final ufu c;
    private final ufv d;
    private final ues e;

    public ugh(ucj ucjVar, ufl uflVar, ufu ufuVar, ufv ufvVar, ues uesVar) {
        this.a = ucjVar;
        this.b = uflVar;
        this.c = ufuVar;
        this.d = ufvVar;
        this.e = uesVar;
    }

    public final aolb a(String str, aomi aomiVar, aomk aomkVar) {
        aopa createBuilder = aolh.a.createBuilder();
        try {
            aopa createBuilder2 = aolg.a.createBuilder();
            long parseLong = Long.parseLong(this.a.b);
            createBuilder2.copyOnWrite();
            aolg aolgVar = (aolg) createBuilder2.instance;
            aolgVar.b |= 1;
            aolgVar.c = parseLong;
            String b = this.b.b();
            createBuilder2.copyOnWrite();
            aolg aolgVar2 = (aolg) createBuilder2.instance;
            b.getClass();
            aolgVar2.b |= 2;
            aolgVar2.d = b;
            aolg aolgVar3 = (aolg) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            aolh aolhVar = (aolh) createBuilder.instance;
            aolgVar3.getClass();
            aolhVar.c = aolgVar3;
            aolhVar.b |= 1;
            aopa createBuilder3 = aolb.a.createBuilder();
            String str2 = this.a.a;
            createBuilder3.copyOnWrite();
            aolb aolbVar = (aolb) createBuilder3.instance;
            str2.getClass();
            aolbVar.b |= 2;
            aolbVar.d = str2;
            aolo b2 = this.d.b();
            createBuilder3.copyOnWrite();
            aolb aolbVar2 = (aolb) createBuilder3.instance;
            b2.getClass();
            aolbVar2.e = b2;
            aolbVar2.b |= 4;
            aolm b3 = this.c.b();
            createBuilder3.copyOnWrite();
            aolb aolbVar3 = (aolb) createBuilder3.instance;
            b3.getClass();
            aolbVar3.f = b3;
            aolbVar3.b |= 8;
            createBuilder3.copyOnWrite();
            aolb aolbVar4 = (aolb) createBuilder3.instance;
            aolbVar4.c = aomiVar.l;
            aolbVar4.b |= 1;
            aolh aolhVar2 = (aolh) createBuilder.mo39build();
            createBuilder3.copyOnWrite();
            aolb aolbVar5 = (aolb) createBuilder3.instance;
            aolhVar2.getClass();
            aolbVar5.g = aolhVar2;
            aolbVar5.b |= 16;
            createBuilder3.copyOnWrite();
            aolb aolbVar6 = (aolb) createBuilder3.instance;
            aomkVar.getClass();
            aolbVar6.h = aomkVar;
            aolbVar6.b |= 32;
            return (aolb) createBuilder3.mo39build();
        } catch (ufm e) {
            uep c = this.e.c(24);
            ((ueu) c).l = str;
            c.i();
            throw e;
        }
    }
}
