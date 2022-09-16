package defpackage;
/* compiled from: PG */
/* renamed from: isj  reason: default package */
/* loaded from: classes3.dex */
public final class isj implements aaqw {
    private final gfu a;

    public isj(gfu gfuVar) {
        this.a = gfuVar;
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        arow arowVar = ((aroy) aopaVar.instance).c;
        if (arowVar == null) {
            arowVar = arow.a;
        }
        aopa mo52toBuilder = arowVar.mo52toBuilder();
        gfs gfsVar = gfs.LIGHT;
        int ordinal = this.a.a().ordinal();
        if (ordinal == 0) {
            mo52toBuilder.copyOnWrite();
            arow arowVar2 = (arow) mo52toBuilder.instance;
            arowVar2.O = 1;
            arowVar2.d |= 8192;
        } else if (ordinal == 1) {
            mo52toBuilder.copyOnWrite();
            arow arowVar3 = (arow) mo52toBuilder.instance;
            arowVar3.O = 2;
            arowVar3.d |= 8192;
        }
        aopaVar.copyOnWrite();
        aroy aroyVar = (aroy) aopaVar.instance;
        arow arowVar4 = (arow) mo52toBuilder.mo39build();
        arowVar4.getClass();
        aroyVar.c = arowVar4;
        aroyVar.b |= 1;
    }
}
