package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mox  reason: default package */
/* loaded from: classes3.dex */
public final class mox extends ajsl implements ynl {
    public final Context a;
    public final dt b;
    public final yni c;
    public final RecyclerView d;
    public final ajsm e;
    public final ajqh f;
    public final Map g = new HashMap();
    public final List h = new ArrayList();
    public int i;
    public int j;
    private final ajxz k;
    private final ajyc l;
    private final gem m;
    private final gts n;
    private final gtb o;
    private final View p;
    private final View q;
    private final ImageButton r;
    private final View s;
    private final ajsf t;
    private final aadd u;
    private aulz v;
    private final xxg x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, ajsa] */
    public mox(Context context, dt dtVar, ajxz ajxzVar, ajyc ajycVar, gem gemVar, ajyi ajyiVar, ajsg ajsgVar, yni yniVar, xxg xxgVar, gts gtsVar, aadd aaddVar, byte[] bArr) {
        this.a = context;
        this.b = dtVar;
        this.k = ajxzVar;
        this.l = ajycVar;
        this.m = gemVar;
        this.c = yniVar;
        this.x = xxgVar;
        this.n = gtsVar;
        this.u = aaddVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_multiple_items_shelf, (ViewGroup) null);
        this.p = inflate;
        this.q = inflate.findViewById(R.id.reel_multiple_items_shelf_title_layout);
        this.s = inflate.findViewById(R.id.reel_shelf_contextual_menu_anchor);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.reel_multiple_items_view);
        this.d = recyclerView;
        recyclerView.ag(new LinearLayoutManager(0));
        recyclerView.v(new zaa(recyclerView));
        this.r = (ImageButton) inflate.findViewById(R.id.reel_shelf_expand_button);
        ajsm ajsmVar = new ajsm();
        this.e = ajsmVar;
        ajqh ajqhVar = new ajqh(ajsmVar);
        this.f = ajqhVar;
        ajsf a = ajsgVar.a(ajyiVar.get());
        this.t = a;
        a.h(ajqhVar);
        recyclerView.ad(a);
        gtb gtbVar = new gtb();
        this.o = gtbVar;
        a.rZ(gtbVar);
        gemVar.c(inflate);
    }

    public static int g(aulz aulzVar) {
        if (j(aulzVar)) {
            return 2;
        }
        return k(aulzVar) ? 3 : 4;
    }

    static boolean j(aulz aulzVar) {
        return aulzVar != null && (m(aulzVar, 10) || m(aulzVar, 11));
    }

    static boolean k(aulz aulzVar) {
        if (aulzVar == null) {
            return false;
        }
        if (m(aulzVar, 9)) {
            return true;
        }
        return (aulzVar.h.size() == 0 || !((aunb) aulzVar.h.get(0)).qn(ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.reelShelfCreationRenderer) || (((ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) ((aunb) aulzVar.h.get(0)).qm(ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.reelShelfCreationRenderer)).b & 8) == 0) ? false : true;
    }

    private static boolean m(aulz aulzVar, int i) {
        if (aulzVar.h.size() != 0) {
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = ((aunb) aulzVar.h.get(0)).qn(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) ? (ReelItemRendererOuterClass$ReelItemRenderer) ((aunb) aulzVar.h.get(0)).qm(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) : null;
            if (reelItemRendererOuterClass$ReelItemRenderer != null) {
                int bO = awwc.bO(reelItemRendererOuterClass$ReelItemRenderer.r);
                if (bO == 0) {
                    bO = 1;
                }
                if (bO == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.m.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(final defpackage.ajrs r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mox.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aulz) obj).j.I();
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        for (aunb aunbVar : this.v.h) {
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = aunbVar.qn(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) ? (ReelItemRendererOuterClass$ReelItemRenderer) aunbVar.qm(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) : null;
            if (reelItemRendererOuterClass$ReelItemRenderer != null) {
                List list = this.h;
                aule auleVar = reelItemRendererOuterClass$ReelItemRenderer.s;
                if (auleVar == null) {
                    auleVar = aule.a;
                }
                if (!list.contains(auleVar)) {
                    apzg apzgVar = reelItemRendererOuterClass$ReelItemRenderer.m;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    if (apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                        apzg apzgVar2 = reelItemRendererOuterClass$ReelItemRenderer.m;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        arrayList.add(apzgVar2);
                    }
                }
            }
        }
        this.o.a = new ReelToReelList(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.ajsl
    protected final boolean kB() {
        return eog.H(this.u);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        int i2;
        if (i != -1) {
            if (i == 0) {
                aabk aabkVar = (aabk) obj;
                if (!(aabkVar.b() instanceof ReelItemRendererOuterClass$ReelItemRenderer)) {
                    return null;
                }
                ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) aabkVar.b();
                if (!this.e.contains(reelItemRendererOuterClass$ReelItemRenderer)) {
                    return null;
                }
                this.i = this.e.indexOf(reelItemRendererOuterClass$ReelItemRenderer);
                this.e.remove(reelItemRendererOuterClass$ReelItemRenderer);
                this.e.l();
                List list = this.h;
                aule auleVar = reelItemRendererOuterClass$ReelItemRenderer.s;
                if (auleVar == null) {
                    auleVar = aule.a;
                }
                list.add(auleVar);
                h();
                return null;
            } else if (i == 1) {
                aawj aawjVar = (aawj) obj;
                if (!(aawjVar.c() instanceof ReelItemRendererOuterClass$ReelItemRenderer)) {
                    return null;
                }
                ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = (ReelItemRendererOuterClass$ReelItemRenderer) aawjVar.c();
                int size = this.e.size();
                if (this.e.contains(reelItemRendererOuterClass$ReelItemRenderer2) || (i2 = this.i) < 0 || i2 > size) {
                    return null;
                }
                this.e.add(i2, reelItemRendererOuterClass$ReelItemRenderer2);
                this.e.l();
                List list2 = this.h;
                aule auleVar2 = reelItemRendererOuterClass$ReelItemRenderer2.s;
                if (auleVar2 == null) {
                    auleVar2 = aule.a;
                }
                if (!list2.contains(auleVar2)) {
                    return null;
                }
                List list3 = this.h;
                aule auleVar3 = reelItemRendererOuterClass$ReelItemRenderer2.s;
                if (auleVar3 == null) {
                    auleVar3 = aule.a;
                }
                list3.remove(auleVar3);
                h();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{aabk.class, aawj.class};
    }

    @Override // defpackage.ajsl
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.clear();
        this.o.b();
        this.c.m(this);
        this.v = null;
    }
}
