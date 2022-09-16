package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.BelowPlayerImmersiveAdLayoutRendererOuterClass;
/* compiled from: PG */
/* renamed from: wdp  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wdp implements ampg {
    private final /* synthetic */ int v;
    public static final /* synthetic */ wdp u = new wdp(20);
    public static final /* synthetic */ wdp t = new wdp(19);
    public static final /* synthetic */ wdp s = new wdp(18);
    public static final /* synthetic */ wdp r = new wdp(17);
    public static final /* synthetic */ wdp q = new wdp(16);
    public static final /* synthetic */ wdp p = new wdp(15);
    public static final /* synthetic */ wdp o = new wdp(14);
    public static final /* synthetic */ wdp n = new wdp(13);
    public static final /* synthetic */ wdp m = new wdp(12);
    public static final /* synthetic */ wdp l = new wdp(11);
    public static final /* synthetic */ wdp k = new wdp(10);
    public static final /* synthetic */ wdp j = new wdp(9);
    public static final /* synthetic */ wdp i = new wdp(8);
    public static final /* synthetic */ wdp h = new wdp(7);
    public static final /* synthetic */ wdp g = new wdp(6);
    public static final /* synthetic */ wdp f = new wdp(5);
    public static final /* synthetic */ wdp e = new wdp(4);
    public static final /* synthetic */ wdp d = new wdp(3);
    public static final /* synthetic */ wdp c = new wdp(2);
    public static final /* synthetic */ wdp b = new wdp(1);
    public static final /* synthetic */ wdp a = new wdp();

    private /* synthetic */ wdp() {
    }

    private /* synthetic */ wdp(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = true;
        switch (this.v) {
            case 0:
                aurp aurpVar = (aurp) obj;
                if (aurpVar.b == 64166933) {
                    return (auro) aurpVar.c;
                }
                return auro.a;
            case 1:
                return Integer.valueOf(((vwh) obj).b);
            case 2:
                return ((awtd) obj).c;
            case 3:
                aopa mo52toBuilder = ((awtd) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                awtd awtdVar = (awtd) mo52toBuilder.instance;
                awtdVar.b &= -5;
                awtdVar.f = awtd.a.f;
                return (awtd) mo52toBuilder.mo39build();
            case 4:
                return ((awtd) obj).f;
            case 5:
                aopa aopaVar = (aopa) obj;
                aopaVar.copyOnWrite();
                awtd awtdVar2 = (awtd) aopaVar.instance;
                awtd awtdVar3 = awtd.a;
                awtdVar2.b |= 2;
                awtdVar2.e = 1;
                return aopaVar;
            case 6:
                if (((awtd) obj).e <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                return (xci) ((xdu) obj).d(xbm.class);
            case 8:
                xdu xduVar = (xdu) obj;
                return null;
            case 9:
                WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) obj;
                if (watchNextResponseModel == null) {
                    return null;
                }
                aunb aunbVar = watchNextResponseModel.a.s;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (!aunbVar.qn(BelowPlayerImmersiveAdLayoutRendererOuterClass.belowPlayerImmersiveAdLayoutRenderer)) {
                    return null;
                }
                aunb aunbVar2 = watchNextResponseModel.a.s;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                return (apnh) aunbVar2.qm(BelowPlayerImmersiveAdLayoutRendererOuterClass.belowPlayerImmersiveAdLayoutRenderer);
            case 10:
                WatchNextResponseModel watchNextResponseModel2 = (WatchNextResponseModel) obj;
                if (watchNextResponseModel2 == null) {
                    return null;
                }
                return watchNextResponseModel2.a.r;
            case 11:
                WatchNextResponseModel watchNextResponseModel3 = (WatchNextResponseModel) obj;
                if (watchNextResponseModel3 == null) {
                    return null;
                }
                apzg apzgVar = watchNextResponseModel3.a.v;
                return apzgVar == null ? apzg.a : apzgVar;
            case 12:
                WatchNextResponseModel watchNextResponseModel4 = (WatchNextResponseModel) obj;
                if (watchNextResponseModel4 == null) {
                    return null;
                }
                return amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", watchNextResponseModel4.a);
            case 13:
                WatchNextResponseModel watchNextResponseModel5 = (WatchNextResponseModel) obj;
                if (watchNextResponseModel5 == null) {
                    return null;
                }
                aqfd aqfdVar = watchNextResponseModel5.a.g;
                return aqfdVar == null ? aqfd.a : aqfdVar;
            case 14:
                awtg awtgVar = (awtg) obj;
                return (awtgVar.b & 1) != 0 ? ampq.j(Long.valueOf(awtgVar.c)) : amon.a;
            case 15:
                return Boolean.valueOf(((kud) obj).h);
            case 16:
                return Boolean.valueOf(((kud) obj).j);
            case 17:
                return Boolean.valueOf(((kud) obj).g);
            case 18:
                return Boolean.valueOf(((kud) obj).d);
            case 19:
                return Boolean.valueOf(((kud) obj).e);
            default:
                return Boolean.valueOf(((kud) obj).f);
        }
    }
}
