package defpackage;
/* compiled from: PG */
/* renamed from: adrz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adrz implements ampg {
    private final /* synthetic */ int t;
    public static final /* synthetic */ adrz s = new adrz(20);
    public static final /* synthetic */ adrz r = new adrz(19);
    public static final /* synthetic */ adrz q = new adrz(18);
    public static final /* synthetic */ adrz p = new adrz(16);
    public static final /* synthetic */ adrz o = new adrz(15);
    public static final /* synthetic */ adrz n = new adrz(14);
    public static final /* synthetic */ adrz m = new adrz(13);
    public static final /* synthetic */ adrz l = new adrz(12);
    public static final /* synthetic */ adrz k = new adrz(11);
    public static final /* synthetic */ adrz j = new adrz(9);
    public static final /* synthetic */ adrz i = new adrz(8);
    public static final /* synthetic */ adrz h = new adrz(7);
    public static final /* synthetic */ adrz g = new adrz(6);
    public static final /* synthetic */ adrz f = new adrz(5);
    public static final /* synthetic */ adrz e = new adrz(4);
    public static final /* synthetic */ adrz d = new adrz(3);
    public static final /* synthetic */ adrz c = new adrz(2);
    public static final /* synthetic */ adrz b = new adrz(1);
    public static final /* synthetic */ adrz a = new adrz();

    private /* synthetic */ adrz() {
    }

    public /* synthetic */ adrz(int i2) {
        this.t = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.t) {
            case 0:
                Boolean bool = (Boolean) obj;
                int i2 = adsg.E;
                return bool;
            case 1:
                Boolean bool2 = (Boolean) obj;
                int i3 = adsg.E;
                return bool2;
            case 2:
                return Integer.valueOf(((adzs) obj).a.getType());
            case 3:
                aopa aopaVar = (aopa) obj;
                aopaVar.copyOnWrite();
                awuj awujVar = (awuj) aopaVar.instance;
                awuj awujVar2 = awuj.a;
                awujVar.b |= 4;
                awujVar.f = 3;
                return aopaVar;
            case 4:
                if (((awuj) obj).f >= 3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return (orh) ((aopa) obj).mo39build();
            case 6:
                return ((orh) obj).toByteArray();
            case 7:
                return Integer.valueOf(((afaj) obj).b);
            case 8:
                return Long.valueOf(((afaj) obj).c);
            case 9:
                return new afhz((byte[]) obj);
            case 10:
                aopa mo52toBuilder = ((awuj) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                awuj awujVar3 = (awuj) mo52toBuilder.instance;
                awujVar3.b |= 256;
                awujVar3.q = true;
                return (awuj) mo52toBuilder.mo39build();
            case 11:
                return ((awuk) obj).d;
            case 12:
                aopa aopaVar2 = (aopa) obj;
                aopaVar2.copyOnWrite();
                awus awusVar = (awus) aopaVar2.instance;
                awus awusVar2 = awus.a;
                awusVar.b |= 1;
                awusVar.j = 1;
                return aopaVar2;
            case 13:
                if (((awus) obj).j > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                return cfb.a((cff) obj);
            case 15:
                aopa mo52toBuilder2 = ((awut) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                awut awutVar = (awut) mo52toBuilder2.instance;
                awutVar.b &= -3;
                awutVar.d = awut.a.d;
                mo52toBuilder2.copyOnWrite();
                awut awutVar2 = (awut) mo52toBuilder2.instance;
                awutVar2.b &= -5;
                awutVar2.e = awut.a.e;
                mo52toBuilder2.copyOnWrite();
                awut awutVar3 = (awut) mo52toBuilder2.instance;
                awutVar3.b &= -2;
                awutVar3.c = awut.a.c;
                return (awut) mo52toBuilder2.mo39build();
            case 16:
                return (uhv) ((cfb) obj).a;
            case 17:
                return agec.e((uct) obj);
            case 18:
                aopa aopaVar3 = (aopa) obj;
                aopaVar3.copyOnWrite();
                awux awuxVar = (awux) aopaVar3.instance;
                awux awuxVar2 = awux.a;
                awuxVar.b |= 512;
                awuxVar.o = 1;
                return aopaVar3;
            case 19:
                if (((awux) obj).o > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return new Exception((Throwable) obj);
        }
    }
}
