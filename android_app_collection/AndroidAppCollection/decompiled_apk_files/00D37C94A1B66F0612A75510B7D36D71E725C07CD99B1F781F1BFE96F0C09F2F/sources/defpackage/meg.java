package defpackage;

import com.google.protos.youtube.api.innertube.ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint;
import com.google.protos.youtube.api.innertube.PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint;
import com.google.protos.youtube.api.innertube.ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: meg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class meg implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ meg u = new meg(20);
    public static final /* synthetic */ meg t = new meg(19);
    public static final /* synthetic */ meg s = new meg(18);
    public static final /* synthetic */ meg r = new meg(17);
    public static final /* synthetic */ meg q = new meg(16);
    public static final /* synthetic */ meg p = new meg(15);
    public static final /* synthetic */ meg o = new meg(14);
    public static final /* synthetic */ meg n = new meg(13);
    public static final /* synthetic */ meg m = new meg(12);
    public static final /* synthetic */ meg l = new meg(11);
    public static final /* synthetic */ meg k = new meg(10);
    public static final /* synthetic */ meg j = new meg(9);
    public static final /* synthetic */ meg i = new meg(8);
    public static final /* synthetic */ meg h = new meg(7);
    public static final /* synthetic */ meg g = new meg(6);
    public static final /* synthetic */ meg f = new meg(5);
    public static final /* synthetic */ meg e = new meg(4);
    public static final /* synthetic */ meg d = new meg(3);
    public static final /* synthetic */ meg c = new meg(2);
    public static final /* synthetic */ meg b = new meg(1);
    public static final /* synthetic */ meg a = new meg();

    private /* synthetic */ meg() {
    }

    private /* synthetic */ meg(int i2) {
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
        boolean z = false;
        switch (this.v) {
            case 0:
                if (((Integer) obj).intValue() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                if (((Integer) obj).intValue() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                return Collection.EL.stream(((asln) obj).f);
            case 3:
                aslo asloVar = ((aslq) obj).d;
                if (asloVar == null) {
                    asloVar = aslo.a;
                }
                asln aslnVar = asloVar.c;
                return aslnVar == null ? asln.a : aslnVar;
            case 4:
                return (fry) ((Optional) obj).get();
            case 5:
                return ((aakq) obj).a;
            case 6:
                return Collection.EL.stream(((aaky) obj).a().a());
            case 7:
                apoj apojVar = ((apok) obj).c;
                return apojVar == null ? apoj.a : apojVar;
            case 8:
                return Boolean.valueOf(((apzg) obj).qn(ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.clearWatchHistoryEndpoint));
            case 9:
                apzg apzgVar = (apzg) obj;
                if (apzgVar.qn(PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.pauseWatchHistoryEndpoint) || apzgVar.qn(ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.resumeWatchHistoryEndpoint)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                return (fry) ((Optional) obj).get();
            case 11:
                return (aucd) obj;
            case 12:
                return (aucd) obj;
            case 13:
                return ((nii) obj).a;
            case 14:
                return ((nii) obj).c;
            case 15:
                return ((nii) obj).d;
            case 16:
                return (nlc) ((nmc) obj);
            case 17:
                return ((meq) obj).c;
            case 18:
                return ((meq) obj).d;
            case 19:
                return Integer.valueOf(((okw) obj).c);
            default:
                return Integer.valueOf(((okw) obj).b);
        }
    }
}
