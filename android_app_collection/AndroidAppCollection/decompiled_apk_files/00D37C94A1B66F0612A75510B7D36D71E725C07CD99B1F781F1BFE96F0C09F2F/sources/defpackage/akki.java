package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEndpoint;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: PG */
@Deprecated
/* renamed from: akki  reason: default package */
/* loaded from: classes.dex */
public abstract class akki extends dh {
    private apgv ae;
    private Future af;
    private aafo ag;
    private View ah;
    public PackageManager ai;
    public acti aj;
    public RecyclerView ak;
    public yni al;
    public ExecutorService am;
    public aacz an;
    private TextView ao;
    private TextView ap;
    private View aq;
    private TopPeekingScrollView ar;
    private akpp as;

    private final int aE() {
        Resources rh = rh();
        if (rh.getConfiguration().orientation == 1) {
            return rh.getInteger(R.integer.share_panel_portrait_columns);
        }
        return rh.getInteger(R.integer.share_panel_landscape_columns);
    }

    private static List aF(List list, Map map, PackageManager packageManager, apzg apzgVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            autg autgVar = (autg) it.next();
            aute auteVar = autgVar.c;
            if (auteVar == null) {
                auteVar = aute.a;
            }
            apzg apzgVar2 = auteVar.b;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            Iterator it2 = zew.L(map, akpl.a(apzgVar2)).iterator();
            while (it2.hasNext()) {
                ResolveInfo resolveInfo = (ResolveInfo) it2.next();
                aute auteVar2 = autgVar.c;
                if (auteVar2 == null) {
                    auteVar2 = aute.a;
                }
                arrayList.add(new akpl(packageManager, resolveInfo, apzgVar, auteVar2.c.I()));
                it2.remove();
            }
        }
        return arrayList;
    }

    public static autk aJ(army armyVar) {
        aqhz aqhzVar = armyVar.c;
        if (aqhzVar == null) {
            aqhzVar = aqhz.a;
        }
        if ((aqhzVar.b & 1) != 0) {
            aqhz aqhzVar2 = armyVar.c;
            if (aqhzVar2 == null) {
                aqhzVar2 = aqhz.a;
            }
            autk autkVar = aqhzVar2.c;
            return autkVar == null ? autk.a : autkVar;
        }
        return null;
    }

    private final List aM() {
        try {
            return (List) this.af.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            zep.d("Error retrieving share-capable activities.", e);
            return new ArrayList();
        }
    }

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        this.ai = mJ().getPackageManager();
        atfw atfwVar = this.an.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        apgv apgvVar = atfwVar.m;
        if (apgvVar == null) {
            apgvVar = apgv.a;
        }
        this.ae = apgvVar;
        apzg b = aafr.b(this.m.getByteArray("navigation_endpoint"));
        acti aI = aI();
        this.aj = aI;
        autk autkVar = null;
        aI.d(acuo.a(10337), b, null);
        this.af = this.am.submit(new Callable() { // from class: akkb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                akki akkiVar = akki.this;
                ylr.b();
                return zgt.F(akkiVar.ai);
            }
        });
        aafo aG = aG();
        aG.getClass();
        this.ag = aG;
        this.as = new akpp(mJ(), this.ag, this.aj, this, aE(), this.al);
        this.ak.ag(new LinearLayoutManager());
        this.ak.ad(this.as.a);
        this.ak.aC(new akkh(mJ()));
        if (this.m.containsKey("share_panel")) {
            try {
                autkVar = (autk) aphq.i(this.m, "share_panel", autk.a, aoos.b());
            } catch (aopx e) {
                afus.c(1, 15, "Failed to parse old share panel from byte array", e);
            }
        }
        ShareEndpointOuterClass$ShareEndpoint shareEndpointOuterClass$ShareEndpoint = (ShareEndpointOuterClass$ShareEndpoint) b.qm(ShareEndpointOuterClass$ShareEndpoint.shareEndpoint);
        if (autkVar == null) {
            if (shareEndpointOuterClass$ShareEndpoint.c.isEmpty()) {
                if (!shareEndpointOuterClass$ShareEndpoint.b.isEmpty()) {
                    String str = shareEndpointOuterClass$ShareEndpoint.b;
                    this.al.d(new evu());
                    aaun aH = aH();
                    List r = apwt.r(aM(), this.ae);
                    akke akkeVar = new akke(this);
                    aaus aausVar = new aaus(aH.e, aH.a.c());
                    aausVar.a = str;
                    aausVar.b = r;
                    aH.c(army.a, aH.b, aass.s, aauh.c).e(aausVar, akkeVar);
                    return;
                }
                throw new IllegalArgumentException("Invalid share endpoint provided.");
            }
            army armyVar = (army) abgb.e(shareEndpointOuterClass$ShareEndpoint.c, army.a.getParserForType());
            if (armyVar == null) {
                armyVar = army.a;
            }
            aL(aJ(armyVar));
            return;
        }
        aL(autkVar);
    }

    protected abstract aafo aG();

    protected abstract aaun aH();

    protected abstract acti aI();

    public final void aK(String str) {
        dt mJ = mJ();
        ((ClipboardManager) mJ.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text/plain", str));
        zag.q(mJ, R.string.share_copy_url_success, 0);
    }

    public final void aL(autk autkVar) {
        arag aragVar;
        autc autcVar;
        arag aragVar2;
        arag aragVar3;
        yni yniVar = this.al;
        autkVar.d.size();
        autkVar.e.size();
        yniVar.d(new ewq());
        this.aj.D(new acte(autkVar.k));
        TextView textView = this.ao;
        if ((autkVar.b & 4) != 0) {
            aragVar = autkVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        if ((autkVar.b & 16) != 0) {
            autd autdVar = autkVar.h;
            if (autdVar == null) {
                autdVar = autd.a;
            }
            autcVar = autdVar.b;
            if (autcVar == null) {
                autcVar = autc.a;
            }
        } else {
            autcVar = null;
        }
        if (autcVar == null) {
            TextView textView2 = this.ap;
            if ((autkVar.b & 8) != 0) {
                aragVar3 = autkVar.g;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            textView2.setText(ajgl.b(aragVar3));
            this.ap.setOnClickListener(new akkf(this, autkVar));
        } else {
            TextView textView3 = this.ap;
            if ((autcVar.b & 1) != 0) {
                aragVar2 = autcVar.c;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView3.setText(ajgl.b(aragVar2));
            this.ap.setOnClickListener(new akkg(this, autcVar));
        }
        this.ap.setVisibility(0);
        HashMap hashMap = new HashMap();
        for (ResolveInfo resolveInfo : aM()) {
            zew.M(hashMap, resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo);
        }
        apzg apzgVar = autkVar.i;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        List aF = aF(autkVar.d, hashMap, this.ai, apzgVar);
        List aF2 = aF(autkVar.e, hashMap, this.ai, apzgVar);
        ArrayList arrayList = new ArrayList();
        for (Set<ResolveInfo> set : hashMap.values()) {
            for (ResolveInfo resolveInfo2 : set) {
                arrayList.add(new akpl(this.ai, resolveInfo2, apzgVar, autkVar.j.I()));
            }
        }
        final Collator collator = Collator.getInstance();
        Collections.sort(arrayList, new Comparator() { // from class: akka
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return collator.compare(((akpl) obj).b.toString(), ((akpl) obj2).b.toString());
            }
        });
        aF2.addAll(arrayList);
        akpp akppVar = this.as;
        akppVar.b.clear();
        akppVar.b.addAll(aF);
        akppVar.c.clear();
        akppVar.c.addAll(aF2);
        akppVar.a();
        this.aj.u(new acte(autkVar.k), null);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(2, 16973840);
    }

    @Override // defpackage.dh, defpackage.dp
    public void mS() {
        this.al.d(new ewm());
        super.mS();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.share_panel_fragment, viewGroup, false);
        this.ah = inflate;
        this.ao = (TextView) inflate.findViewById(R.id.title);
        this.ap = (TextView) this.ah.findViewById(R.id.copy_url_button);
        this.aq = this.ah.findViewById(R.id.overlay);
        this.ar = (TopPeekingScrollView) this.ah.findViewById(R.id.content_container);
        this.ak = (RecyclerView) this.ah.findViewById(R.id.share_target_container);
        lj.M(this.aq, new akkc(this));
        this.aq.setOnClickListener(new akkd(this));
        this.ar.f(rh().getDimensionPixelSize(R.dimen.share_panel_default_peek_amount));
        TopPeekingScrollView topPeekingScrollView = this.ar;
        topPeekingScrollView.l = this.aq;
        topPeekingScrollView.m = this.ak;
        return this.ah;
    }

    @Override // defpackage.dh, defpackage.dp
    public void my() {
        this.al.d(new ewd());
        super.my();
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        akpp akppVar = this.as;
        int aE = aE();
        aqxo.p(aE > 0);
        if (akppVar.d == aE) {
            return;
        }
        akppVar.d = aE;
        akppVar.a();
    }
}
