package defpackage;
/* compiled from: PG */
/* renamed from: zio  reason: default package */
/* loaded from: classes4.dex */
public final class zio implements aaqw {
    private final zin a;

    public zio(zin zinVar) {
        this.a = zinVar;
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        zii a = this.a.a();
        if (a != null) {
            arow arowVar = ((aroy) aopaVar.instance).c;
            if (arowVar == null) {
                arowVar = arow.a;
            }
            aopa mo52toBuilder = arowVar.mo52toBuilder();
            aopa createBuilder = atic.a.createBuilder();
            String str = a.b;
            createBuilder.copyOnWrite();
            atic aticVar = (atic) createBuilder.instance;
            aticVar.b |= 1;
            aticVar.c = str;
            long j = a.a;
            createBuilder.copyOnWrite();
            atic aticVar2 = (atic) createBuilder.instance;
            aticVar2.b |= 2;
            aticVar2.d = j;
            mo52toBuilder.copyOnWrite();
            arow arowVar2 = (arow) mo52toBuilder.instance;
            atic aticVar3 = (atic) createBuilder.mo39build();
            aticVar3.getClass();
            arowVar2.f103J = aticVar3;
            arowVar2.d |= 1;
            aopaVar.copyOnWrite();
            aroy aroyVar = (aroy) aopaVar.instance;
            arow arowVar3 = (arow) mo52toBuilder.mo39build();
            arowVar3.getClass();
            aroyVar.c = arowVar3;
            aroyVar.b |= 1;
        }
    }
}
