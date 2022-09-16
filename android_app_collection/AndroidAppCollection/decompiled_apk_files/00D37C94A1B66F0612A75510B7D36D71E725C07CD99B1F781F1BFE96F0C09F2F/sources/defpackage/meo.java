package defpackage;

import android.view.View;
import com.google.android.libraries.accountlinking.LinkResponse;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: meo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class meo implements ampg {
    private final /* synthetic */ int v;
    public static final /* synthetic */ meo u = new meo(20);
    public static final /* synthetic */ meo t = new meo(19);
    public static final /* synthetic */ meo s = new meo(18);
    public static final /* synthetic */ meo r = new meo(17);
    public static final /* synthetic */ meo q = new meo(16);
    public static final /* synthetic */ meo p = new meo(15);
    public static final /* synthetic */ meo o = new meo(14);
    public static final /* synthetic */ meo n = new meo(13);
    public static final /* synthetic */ meo m = new meo(12);
    public static final /* synthetic */ meo l = new meo(11);
    public static final /* synthetic */ meo k = new meo(10);
    public static final /* synthetic */ meo j = new meo(9);
    public static final /* synthetic */ meo i = new meo(8);
    public static final /* synthetic */ meo h = new meo(7);
    public static final /* synthetic */ meo g = new meo(6);
    public static final /* synthetic */ meo f = new meo(5);
    public static final /* synthetic */ meo e = new meo(4);
    public static final /* synthetic */ meo d = new meo(3);
    public static final /* synthetic */ meo c = new meo(2);
    public static final /* synthetic */ meo b = new meo(1);
    public static final /* synthetic */ meo a = new meo();

    private /* synthetic */ meo() {
    }

    private /* synthetic */ meo(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return ((atxh) obj).c;
            case 1:
                atxl b2 = atxl.b(((atxh) obj).h);
                return b2 == null ? atxl.PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN : b2;
            case 2:
                return ((atxh) obj).d;
            case 3:
                apzg apzgVar = ((atxk) obj).e;
                return apzgVar == null ? apzg.a : apzgVar;
            case 4:
                atxl b3 = atxl.b(((atxk) obj).k);
                return b3 == null ? atxl.PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN : b3;
            case 5:
                return ((atxk) obj).c;
            case 6:
                return ((atxk) obj).d;
            case 7:
                aunb aunbVar = (aunb) obj;
                if (!aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                    return null;
                }
                return (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
            case 8:
                return ((nmx) obj).d;
            case 9:
                return ((nmx) obj).a;
            case 10:
                return ((nmx) obj).b;
            case 11:
                return ((nnf) obj).b();
            case 12:
                return aafr.a((String) obj);
            case 13:
                aopa mo52toBuilder = ((okz) obj).mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                okz okzVar = (okz) mo52toBuilder.instance;
                okzVar.b |= 1;
                okzVar.c = true;
                return (okz) mo52toBuilder.mo39build();
            case 14:
                aopa mo52toBuilder2 = ((okz) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                okz okzVar2 = (okz) mo52toBuilder2.instance;
                okzVar2.b |= 2;
                okzVar2.d = true;
                return (okz) mo52toBuilder2.mo39build();
            case 15:
                return amuk.r((View) obj);
            case 16:
                return ((omf) obj).a;
            case 17:
                aoet aoetVar = (aoet) rxs.a.get((rxx) obj);
                aoetVar.getClass();
                return aoetVar;
            case 18:
                ampq ampqVar = (ampq) obj;
                amup amupVar = rxs.a;
                if (ampqVar.h()) {
                    return new LinkResponse(true, ((rzc) ampqVar.c()).a);
                }
                return new LinkResponse(false, "PLACEHOLDER_CONSISTENCY_KEY");
            case 19:
                return ((aofm) obj).c;
            default:
                return ((rxw) obj).toString();
        }
    }
}
