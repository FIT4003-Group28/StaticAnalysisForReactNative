package defpackage;
/* compiled from: PG */
/* renamed from: lhh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lhh implements ampg {
    private final /* synthetic */ int u;
    public static final /* synthetic */ lhh t = new lhh(20);
    public static final /* synthetic */ lhh s = new lhh(19);
    public static final /* synthetic */ lhh r = new lhh(18);
    public static final /* synthetic */ lhh q = new lhh(17);
    public static final /* synthetic */ lhh p = new lhh(16);
    public static final /* synthetic */ lhh o = new lhh(15);
    public static final /* synthetic */ lhh n = new lhh(14);
    public static final /* synthetic */ lhh m = new lhh(13);
    public static final /* synthetic */ lhh l = new lhh(12);
    public static final /* synthetic */ lhh k = new lhh(11);
    public static final /* synthetic */ lhh j = new lhh(10);
    public static final /* synthetic */ lhh i = new lhh(9);
    public static final /* synthetic */ lhh h = new lhh(8);
    public static final /* synthetic */ lhh g = new lhh(7);
    public static final /* synthetic */ lhh f = new lhh(6);
    public static final /* synthetic */ lhh e = new lhh(5);
    public static final /* synthetic */ lhh d = new lhh(4);
    public static final /* synthetic */ lhh c = new lhh(2);
    public static final /* synthetic */ lhh b = new lhh(1);
    public static final /* synthetic */ lhh a = new lhh();

    private /* synthetic */ lhh() {
    }

    public /* synthetic */ lhh(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.u) {
            case 0:
                if (1 == (((atpl) obj).b & 1)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                arag aragVar = ((atoo) obj).c;
                return aragVar == null ? arag.a : aragVar;
            case 2:
                return Boolean.valueOf(((fgu) obj).c);
            case 3:
                return String.valueOf(kjo.d((kkb) obj));
            case 4:
                return Boolean.valueOf(((ljp) obj).f);
            case 5:
                return Boolean.valueOf(((ljp) obj).l);
            case 6:
                aopa mo52toBuilder = ((fgu) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                fgu fguVar = (fgu) mo52toBuilder.instance;
                fguVar.b |= 4;
                fguVar.e = 1;
                return (fgu) mo52toBuilder.mo39build();
            case 7:
                aopa mo52toBuilder2 = ((fgu) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                fgu fguVar2 = (fgu) mo52toBuilder2.instance;
                fguVar2.b &= -5;
                fguVar2.e = 0;
                return (fgu) mo52toBuilder2.mo39build();
            case 8:
                awan b2 = awan.b(((awuj) obj).m);
                return b2 == null ? awan.VIDEO_QUALITY_SETTING_UNKNOWN : b2;
            case 9:
                awan b3 = awan.b(((awuj) obj).n);
                return b3 == null ? awan.VIDEO_QUALITY_SETTING_UNKNOWN : b3;
            case 10:
                awan awanVar = awan.VIDEO_QUALITY_SETTING_DATA_SAVER;
                awan b4 = awan.b(((awuj) obj).m);
                if (b4 == null) {
                    b4 = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
                }
                return Boolean.valueOf(awanVar.equals(b4));
            case 11:
                aopa mo52toBuilder3 = ((gft) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                gft gftVar = (gft) mo52toBuilder3.instance;
                gftVar.b |= 1;
                gftVar.c = true;
                return (gft) mo52toBuilder3.mo39build();
            case 12:
                aopa mo52toBuilder4 = ((gft) obj).mo52toBuilder();
                mo52toBuilder4.copyOnWrite();
                gft gftVar2 = (gft) mo52toBuilder4.instance;
                gftVar2.b |= 2;
                gftVar2.d = true;
                return (gft) mo52toBuilder4.mo39build();
            case 13:
                return obj;
            case 14:
                aopa mo52toBuilder5 = ((gft) obj).mo52toBuilder();
                mo52toBuilder5.copyOnWrite();
                gft gftVar3 = (gft) mo52toBuilder5.instance;
                gftVar3.b |= 32;
                gftVar3.h = false;
                return (gft) mo52toBuilder5.mo39build();
            case 15:
                aopa mo52toBuilder6 = ((gft) obj).mo52toBuilder();
                mo52toBuilder6.copyOnWrite();
                gft gftVar4 = (gft) mo52toBuilder6.instance;
                gftVar4.b |= 32;
                gftVar4.h = true;
                return (gft) mo52toBuilder6.mo39build();
            case 16:
                aopa mo52toBuilder7 = ((ltq) obj).mo52toBuilder();
                mo52toBuilder7.copyOnWrite();
                ltq ltqVar = (ltq) mo52toBuilder7.instance;
                ltqVar.b |= 1;
                ltqVar.c = true;
                return (ltq) mo52toBuilder7.mo39build();
            case 17:
                apzg apzgVar = ((apvg) obj).g;
                return apzgVar == null ? apzg.a : apzgVar;
            case 18:
                return ((atxk) obj).j;
            case 19:
                atxi atxiVar = ((atxk) obj).i;
                if (atxiVar == null) {
                    atxiVar = atxi.a;
                }
                if (atxiVar.b == 102716411) {
                    return (argj) atxiVar.c;
                }
                return argj.a;
            default:
                apzg apzgVar2 = ((atxh) obj).e;
                return apzgVar2 == null ? apzg.a : apzgVar2;
        }
    }
}
