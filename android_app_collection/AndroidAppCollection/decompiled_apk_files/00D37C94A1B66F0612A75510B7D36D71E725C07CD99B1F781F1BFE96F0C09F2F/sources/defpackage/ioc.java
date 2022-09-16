package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import j$.util.Optional;
import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: ioc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ioc implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ioc u = new ioc(20);
    public static final /* synthetic */ ioc t = new ioc(19);
    public static final /* synthetic */ ioc s = new ioc(18);
    public static final /* synthetic */ ioc r = new ioc(17);
    public static final /* synthetic */ ioc q = new ioc(16);
    public static final /* synthetic */ ioc p = new ioc(15);
    public static final /* synthetic */ ioc o = new ioc(14);
    public static final /* synthetic */ ioc n = new ioc(13);
    public static final /* synthetic */ ioc m = new ioc(12);
    public static final /* synthetic */ ioc l = new ioc(11);
    public static final /* synthetic */ ioc k = new ioc(10);
    public static final /* synthetic */ ioc j = new ioc(9);
    public static final /* synthetic */ ioc i = new ioc(8);
    public static final /* synthetic */ ioc h = new ioc(7);
    public static final /* synthetic */ ioc g = new ioc(6);
    public static final /* synthetic */ ioc f = new ioc(5);
    public static final /* synthetic */ ioc e = new ioc(4);
    public static final /* synthetic */ ioc d = new ioc(3);
    public static final /* synthetic */ ioc c = new ioc(2);
    public static final /* synthetic */ ioc b = new ioc(1);
    public static final /* synthetic */ ioc a = new ioc();

    private /* synthetic */ ioc() {
    }

    private /* synthetic */ ioc(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            case 7:
                return function.getClass();
            case 8:
                return function.getClass();
            case 9:
                return function.getClass();
            case 10:
                return function.getClass();
            case 11:
                return function.getClass();
            case 12:
                return function.getClass();
            case 13:
                return function.getClass();
            case 14:
                return function.getClass();
            case 15:
                return function.getClass();
            case 16:
                return function.getClass();
            case 17:
                return function.getClass();
            case 18:
                return function.getClass();
            case 19:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            case 7:
                return function.getClass();
            case 8:
                return function.getClass();
            case 9:
                return function.getClass();
            case 10:
                return function.getClass();
            case 11:
                return function.getClass();
            case 12:
                return function.getClass();
            case 13:
                return function.getClass();
            case 14:
                return function.getClass();
            case 15:
                return function.getClass();
            case 16:
                return function.getClass();
            case 17:
                return function.getClass();
            case 18:
                return function.getClass();
            case 19:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((InteractionLoggingScreen) obj).a;
            case 1:
                return ampr.a((aaky) obj, Optional.empty());
            case 2:
                return (aaky) ((ampr) obj).a;
            case 3:
                apzg apzgVar = ((arlt) obj).p;
                return apzgVar == null ? apzg.a : apzgVar;
            case 4:
                return (Optional) ayos.D((atxn) obj).E(inl.a).h(ikb.p).w(inl.e).w(inl.b).W();
            case 5:
                return ((avjf) obj).d;
            case 6:
                return (aoob) ((Optional) obj).get();
            case 7:
                return new acte((aoob) obj);
            case 8:
                return Integer.valueOf(((Bundle) obj).getInt("active_panel_on_single_panel_mode_key", 0));
            case 9:
                return ((izc) obj).b().V(iyw.b);
            case 10:
                return ((izl) obj).a.k;
            case 11:
                return jbc.a((aajj) obj);
            case 12:
                return (jbc) ((Optional) obj).get();
            case 13:
                attj b2 = attj.b(((aqnl) obj).f);
                return b2 == null ? attj.OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN : b2;
            case 14:
                aqnu aqnuVar = (aqnu) obj;
                aopa createBuilder = aqnn.a.createBuilder();
                int i2 = aqnuVar.d;
                createBuilder.copyOnWrite();
                aqnn aqnnVar = (aqnn) createBuilder.instance;
                aqnnVar.b |= 2;
                aqnnVar.d = i2;
                int[] iArr = {1, 2, 3};
                int h2 = aqvb.h(aqnuVar.c);
                if (h2 == 0) {
                    h2 = 1;
                }
                int i3 = iArr[h2 - 1];
                createBuilder.copyOnWrite();
                aqnn aqnnVar2 = (aqnn) createBuilder.instance;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                aqnnVar2.c = i4;
                aqnnVar2.b |= 1;
                return (aqnn) createBuilder.mo39build();
            case 15:
                return ((jbc) obj).a;
            case 16:
                audg audgVar = (audg) obj;
                aopa createBuilder2 = asgj.a.createBuilder();
                createBuilder2.copyOnWrite();
                asgj asgjVar = (asgj) createBuilder2.instance;
                audgVar.getClass();
                asgjVar.c = audgVar;
                asgjVar.b = 50631000;
                return (asgj) createBuilder2.mo39build();
            case 17:
                auxn auxnVar = (auxn) obj;
                aopa createBuilder3 = auqk.a.createBuilder();
                createBuilder3.copyOnWrite();
                auqk auqkVar = (auqk) createBuilder3.instance;
                auxnVar.getClass();
                auqkVar.bk = auxnVar;
                auqkVar.e |= 8192;
                return amuk.r((auqk) createBuilder3.mo39build());
            case 18:
                atpx b3 = atpx.b(((atpy) obj).d);
                return b3 == null ? atpx.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN : b3;
            case 19:
                attl b4 = attl.b(((atpy) obj).c);
                return b4 == null ? attl.UNKNOWN_FORMAT_TYPE : b4;
            default:
                attl b5 = attl.b(((atpy) obj).c);
                return b5 == null ? attl.UNKNOWN_FORMAT_TYPE : b5;
        }
    }
}
