package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.protos.youtube.api.innertube.ShowMealbarActionOuterClass$ShowMealbarAction;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: fpt  reason: default package */
/* loaded from: classes3.dex */
public final class fpt implements fqc, afzf {
    public final acrr a;
    public final Handler b;
    public final abff c;
    public fpr d;
    private final fup f;
    private final akfd g;
    private final fpv h;
    private final adbe i;
    private akff l;
    private final adbb j = new adbb() { // from class: fpp
        @Override // defpackage.adbb
        public final void a(adid adidVar) {
            final fpt fptVar = fpt.this;
            Map m = adidVar.m();
            String str = null;
            String str2 = m != null ? (String) m.get("offerParams") : null;
            if (m != null) {
                str = (String) m.get("remoteTransactionSessionId");
            }
            fpr fprVar = new fpr(adidVar.a.e(), str2, str);
            if (fprVar.a != null && !fptVar.e.contains(fprVar.b)) {
                fpr fprVar2 = fptVar.d;
                if (fprVar2 != null && fprVar2.a.equals(fprVar.a) && TextUtils.equals(fptVar.d.b, fprVar.b)) {
                    return;
                }
                fpr fprVar3 = fptVar.d;
                if (fprVar3 != null && !fprVar3.a.equals(fprVar.a)) {
                    return;
                }
                fpr fprVar4 = fptVar.d;
                if (fprVar4 == null || TextUtils.isEmpty(fprVar4.b) || !fptVar.d.a.equals(fprVar.a) || !TextUtils.isEmpty(fprVar.b)) {
                    if (TextUtils.isEmpty(fprVar.b)) {
                        return;
                    }
                    String.valueOf(String.valueOf(fprVar)).length();
                    fptVar.d = fprVar;
                    abff abffVar = fptVar.c;
                    abfb abfbVar = new abfb(abffVar.e, abffVar.c.c());
                    abfbVar.a = abfb.g(fptVar.d.b);
                    abfbVar.i();
                    String valueOf = String.valueOf(fptVar.d.b);
                    if (valueOf.length() != 0) {
                        "YPCGetOfferDetailsRequest with offerParams: ".concat(valueOf);
                    }
                    fptVar.c.k.e(abfbVar, fptVar);
                    fptVar.e("deviceDetected");
                    aopa createBuilder = atbt.a.createBuilder();
                    createBuilder.copyOnWrite();
                    atbt atbtVar = (atbt) createBuilder.instance;
                    atbtVar.c = 8;
                    atbtVar.b |= 1;
                    String str3 = fptVar.d.c;
                    createBuilder.copyOnWrite();
                    atbt atbtVar2 = (atbt) createBuilder.instance;
                    str3.getClass();
                    atbtVar2.b |= 2;
                    atbtVar2.d = str3;
                    arrf a = arrh.a();
                    a.copyOnWrite();
                    ((arrh) a.instance).cX((atbt) createBuilder.mo39build());
                    fptVar.a.c((arrh) a.mo39build());
                    return;
                }
                fptVar.b.removeCallbacks(new Runnable() { // from class: fpq
                    @Override // java.lang.Runnable
                    public final void run() {
                        fpt.this.d();
                    }
                });
                fptVar.b.post(new Runnable() { // from class: fpq
                    @Override // java.lang.Runnable
                    public final void run() {
                        fpt.this.d();
                    }
                });
            }
        }

        @Override // defpackage.adbb
        public final /* synthetic */ void b() {
        }
    };
    private final fps k = new fps(this);
    public final Set e = new HashSet();

    public fpt(acrr acrrVar, fup fupVar, Handler handler, akfd akfdVar, fpv fpvVar, adbe adbeVar, abff abffVar) {
        this.a = acrrVar;
        this.f = fupVar;
        this.b = handler;
        this.g = akfdVar;
        this.h = fpvVar;
        this.i = adbeVar;
        this.c = abffVar;
    }

    @Override // defpackage.fqc
    public final void a() {
        ylr.c();
        this.i.f(this.j);
    }

    @Override // defpackage.fqc
    public final void b() {
        ylr.c();
        this.i.c(this.j, false);
    }

    public final void d() {
        akff akffVar = this.l;
        if (akffVar != null) {
            this.g.m(akffVar);
        }
    }

    public final void e(String str) {
        ScreenId screenId;
        fpr fprVar = this.d;
        if (fprVar == null || (screenId = fprVar.a) == null) {
            if (str.length() == 0) {
                return;
            }
            "Failed to update progress for event: ".concat(str);
            return;
        }
        fpv fpvVar = this.h;
        fpvVar.b.a(new fpu(((advz) fpvVar.c.get()).h, str, screenId.c));
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        String.valueOf(String.valueOf(cffVar)).length();
        e("offerDetailsError");
        aopa createBuilder = atbt.a.createBuilder();
        createBuilder.copyOnWrite();
        atbt atbtVar = (atbt) createBuilder.instance;
        atbtVar.c = 9;
        atbtVar.b |= 1;
        fpr fprVar = this.d;
        if (fprVar != null) {
            String str = fprVar.c;
            createBuilder.copyOnWrite();
            atbt atbtVar2 = (atbt) createBuilder.instance;
            str.getClass();
            atbtVar2.b |= 2;
            atbtVar2.d = str;
        }
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cX((atbt) createBuilder.mo39build());
        this.a.c((arrh) a.mo39build());
        this.d = null;
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asgz asgzVar = (asgz) obj;
        String.valueOf(String.valueOf(asgzVar)).length();
        for (apzg apzgVar : asgzVar.c) {
            if (apzgVar.qn(ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction)) {
                ShowMealbarActionOuterClass$ShowMealbarAction showMealbarActionOuterClass$ShowMealbarAction = (ShowMealbarActionOuterClass$ShowMealbarAction) apzgVar.qm(ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction);
                auvk auvkVar = showMealbarActionOuterClass$ShowMealbarAction.b;
                if (auvkVar == null) {
                    auvkVar = auvk.a;
                }
                if ((auvkVar.b & 1) != 0) {
                    auvk auvkVar2 = showMealbarActionOuterClass$ShowMealbarAction.b;
                    if (auvkVar2 == null) {
                        auvkVar2 = auvk.a;
                    }
                    atds atdsVar = auvkVar2.c;
                    if (atdsVar == null) {
                        atdsVar = atds.a;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("OnYpcTransactionListener", this.k);
                    akff e = this.f.b(atdsVar, hashMap).e();
                    this.l = e;
                    this.g.n(e);
                    return;
                }
                this.d = null;
            }
        }
    }
}
