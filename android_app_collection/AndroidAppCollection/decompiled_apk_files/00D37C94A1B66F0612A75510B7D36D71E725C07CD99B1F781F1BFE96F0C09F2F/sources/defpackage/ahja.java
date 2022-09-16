package defpackage;
/* compiled from: PG */
/* renamed from: ahja  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahja implements ampg {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ahja u = new ahja(20);
    public static final /* synthetic */ ahja t = new ahja(19);
    public static final /* synthetic */ ahja s = new ahja(18);
    public static final /* synthetic */ ahja r = new ahja(17);
    public static final /* synthetic */ ahja q = new ahja(16);
    public static final /* synthetic */ ahja p = new ahja(15);
    public static final /* synthetic */ ahja o = new ahja(14);
    public static final /* synthetic */ ahja n = new ahja(13);
    public static final /* synthetic */ ahja m = new ahja(12);
    public static final /* synthetic */ ahja l = new ahja(11);
    public static final /* synthetic */ ahja k = new ahja(10);
    public static final /* synthetic */ ahja j = new ahja(9);
    public static final /* synthetic */ ahja i = new ahja(8);
    public static final /* synthetic */ ahja h = new ahja(7);
    public static final /* synthetic */ ahja g = new ahja(6);
    public static final /* synthetic */ ahja f = new ahja(5);
    public static final /* synthetic */ ahja e = new ahja(4);
    public static final /* synthetic */ ahja d = new ahja(3);
    public static final /* synthetic */ ahja c = new ahja(2);
    public static final /* synthetic */ ahja b = new ahja(1);
    public static final /* synthetic */ ahja a = new ahja();

    private /* synthetic */ ahja() {
    }

    private /* synthetic */ ahja(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((ajff) obj).I();
            case 1:
                return ((ajff) obj).H();
            case 2:
                int i2 = ahsp.a;
                aopa mo52toBuilder = ((awvd) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                awvd awvdVar = (awvd) mo52toBuilder.instance;
                awvdVar.c = 2;
                awvdVar.b |= 1;
                return (awvd) mo52toBuilder.mo39build();
            case 3:
                int i3 = ahsp.a;
                aopa mo52toBuilder2 = ((awvd) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                awvd awvdVar2 = (awvd) mo52toBuilder2.instance;
                awvdVar2.c = 1;
                awvdVar2.b |= 1;
                return (awvd) mo52toBuilder2.mo39build();
            case 4:
                aopa mo52toBuilder3 = ((awvd) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                awvd awvdVar3 = (awvd) mo52toBuilder3.instance;
                awvdVar3.b = 2 | awvdVar3.b;
                awvdVar3.d = false;
                return (awvd) mo52toBuilder3.mo39build();
            case 5:
                return ((ajff) obj).G();
            case 6:
                return ((ajff) obj).G();
            case 7:
                return ((airw) obj).V();
            case 8:
                return ((ajff) obj).C();
            case 9:
                return ((airw) obj).V();
            case 10:
                return ((airw) obj).ab();
            case 11:
                return ((ajff) obj).R();
            case 12:
                return ((ajff) obj).W();
            case 13:
                return ((airw) obj).V();
            case 14:
                return ((ajff) obj).R();
            case 15:
                return ((ajff) obj).S();
            case 16:
                return ((ajff) obj).s();
            case 17:
                return ((ajff) obj).F();
            case 18:
                return ((ajff) obj).s();
            case 19:
                return Boolean.valueOf(((awvc) obj).d);
            default:
                aooo aoooVar = ((awvc) obj).c;
                if (aoooVar == null) {
                    aoooVar = aooo.a;
                }
                return String.valueOf(aoooVar.b);
        }
    }
}
