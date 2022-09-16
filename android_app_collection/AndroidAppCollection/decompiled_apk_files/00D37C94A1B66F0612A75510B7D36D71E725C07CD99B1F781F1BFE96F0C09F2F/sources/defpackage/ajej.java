package defpackage;
/* compiled from: PG */
/* renamed from: ajej  reason: default package */
/* loaded from: classes.dex */
final class ajej implements ajea {
    final /* synthetic */ ajek a;

    public ajej(ajek ajekVar) {
        this.a = ajekVar;
    }

    @Override // defpackage.ajea
    public final void a(aaww aawwVar, aopa aopaVar) {
        int i;
        if (this.a.a != 0) {
            aopa createBuilder = arzd.a.createBuilder();
            switch (this.a.a) {
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 10;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                    i = 5;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
                case 9:
                case 10:
                    i = 6;
                    break;
                default:
                    i = 1;
                    break;
            }
            createBuilder.copyOnWrite();
            arzd arzdVar = (arzd) createBuilder.instance;
            arzdVar.c = i - 1;
            arzdVar.b |= 1;
            arzd arzdVar2 = (arzd) createBuilder.mo39build();
            aopaVar.copyOnWrite();
            arze arzeVar = (arze) aopaVar.instance;
            arze arzeVar2 = arze.a;
            arzdVar2.getClass();
            arzeVar.i = arzdVar2;
            arzeVar.b |= 128;
        }
    }
}
