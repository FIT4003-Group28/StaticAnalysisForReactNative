package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import com.google.protos.youtube.api.innertube.PhoneDialerEndpointOuterClass$PhoneDialerEndpoint;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WebviewEndpointOuterClass$WebviewEndpoint;
import com.google.protos.youtube.api.innertube.YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: actk  reason: default package */
/* loaded from: classes.dex */
public final class actk implements aafo {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static final String e = "actk";
    private final aafo f;
    private final acth g;
    private final Set h;
    private final Set i;

    static {
        String name = actk.class.getName();
        a = String.valueOf(name).concat(".flags");
        b = String.valueOf(name).concat(".log_click");
        c = String.valueOf(name).concat(".click_client_data");
        d = String.valueOf(name).concat(".csn");
    }

    public actk(aafo aafoVar, acth acthVar) {
        this(aafoVar, acthVar, Collections.emptySet(), Collections.emptySet());
    }

    public static Map f(Object obj) {
        return h(obj, true);
    }

    public static Map g(Object obj, asjj asjjVar) {
        Map h = h(obj, true);
        h.put(c, asjjVar);
        return h;
    }

    public static Map h(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        if (z) {
            hashMap.put(b, Boolean.TRUE);
        }
        return hashMap;
    }

    public static Map i(Map map) {
        return j(map, true);
    }

    public static Map j(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (z) {
            hashMap.put(b, Boolean.TRUE);
        }
        return hashMap;
    }

    private static apzg k(apzg apzgVar, String str) {
        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
        if (TextUtils.isEmpty(str)) {
            aopcVar.d(auqs.b);
            return (apzg) aopcVar.mo39build();
        }
        if (!aopcVar.qn(auqs.b)) {
            aopcVar.e(auqs.b, auqr.a);
        }
        aopa mo52toBuilder = ((auqr) aopcVar.qm(auqs.b)).mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        auqr auqrVar = (auqr) mo52toBuilder.instance;
        str.getClass();
        auqrVar.b |= 1;
        auqrVar.c = str;
        aopcVar.e(auqs.b, (auqr) mo52toBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void a(apzg apzgVar) {
        aafn.a(this, apzgVar);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        Object a2;
        Object a3;
        acti actiVar;
        acti oi = this.g.oi();
        if (oi == null) {
            oi = acti.l;
        }
        if (map != null && (actiVar = (acti) map.get("com.google.android.libraries.youtube.logging.interaction_logger")) != null) {
            oi = actiVar;
        }
        String str = null;
        if (apzgVar != null && ((apzgVar.qn(UrlEndpointOuterClass.urlEndpoint) || apzgVar.qn(WebviewEndpointOuterClass$WebviewEndpoint.webviewEndpoint) || apzgVar.qn(AppStoreEndpointOuterClass.appStoreEndpoint) || apzgVar.qn(AndroidApplicationEndpointOuterClass.androidAppEndpoint) || apzgVar.qn(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint) || apzgVar.qn(PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.phoneDialerEndpoint) || apzgVar.qn(YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.ypcFixInstrumentEndpoint) || (((a3 = aafp.a(apzgVar)) != null && this.i.contains(a3.getClass())) || ((Boolean) zew.J(map, b, false)).booleanValue())) && (apzgVar.b & 1) != 0)) {
            acte acteVar = new acte(apzgVar.c);
            aopa createBuilder = asjj.a.createBuilder();
            apzh apzhVar = apzgVar.e;
            if (apzhVar == null) {
                apzhVar = apzh.a;
            }
            if (apzhVar.qn(askh.a)) {
                apzh apzhVar2 = apzgVar.e;
                if (apzhVar2 == null) {
                    apzhVar2 = apzh.a;
                }
                createBuilder.mergeFrom((aopi) ((asjj) apzhVar2.qm(askh.a)));
            }
            Object I = zew.I(map, c);
            if (I instanceof asjj) {
                createBuilder.mergeFrom((aopi) ((asjj) I));
            }
            if (apzgVar.qn(WebviewEndpointOuterClass$WebviewEndpoint.webviewEndpoint)) {
                aopa createBuilder2 = asjf.a.createBuilder();
                String str2 = ((WebviewEndpointOuterClass$WebviewEndpoint) apzgVar.qm(WebviewEndpointOuterClass$WebviewEndpoint.webviewEndpoint)).b;
                createBuilder2.copyOnWrite();
                asjf asjfVar = (asjf) createBuilder2.instance;
                str2.getClass();
                asjfVar.b |= 1;
                asjfVar.c = str2;
                createBuilder.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder.instance;
                asjf asjfVar2 = (asjf) createBuilder2.mo39build();
                asjfVar2.getClass();
                asjjVar.d = asjfVar2;
                asjjVar.b |= 1;
            } else if (apzgVar.qn(UrlEndpointOuterClass.urlEndpoint)) {
                aopa createBuilder3 = asjf.a.createBuilder();
                String str3 = ((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).c;
                createBuilder3.copyOnWrite();
                asjf asjfVar3 = (asjf) createBuilder3.instance;
                str3.getClass();
                asjfVar3.b |= 1;
                asjfVar3.c = str3;
                createBuilder.copyOnWrite();
                asjj asjjVar2 = (asjj) createBuilder.instance;
                asjf asjfVar4 = (asjf) createBuilder3.mo39build();
                asjfVar4.getClass();
                asjjVar2.d = asjfVar4;
                asjjVar2.b |= 1;
            }
            asjj asjjVar3 = (asjj) createBuilder.mo39build();
            if (true == asjj.a.equals(asjjVar3)) {
                asjjVar3 = null;
            }
            oi.H(3, acteVar, asjjVar3);
        }
        if (apzgVar != null && (a2 = aafp.a(apzgVar)) != null && this.h.contains(a2.getClass())) {
            if (map != null) {
                str = (String) map.get(d);
            }
            if (TextUtils.isEmpty(str)) {
                apzgVar = k(apzgVar, oi.k());
            } else {
                apzgVar = k(apzgVar, str);
            }
        }
        if ((((Integer) zew.J(map, a, 0)).intValue() & 1) == 0) {
            apzgVar = oi.f(apzgVar);
        }
        if (map != null && !map.containsKey("com.google.android.libraries.youtube.logging.interaction_logger")) {
            try {
                amum amumVar = new amum();
                amumVar.h(map);
                amumVar.f("com.google.android.libraries.youtube.logging.interaction_logger", oi);
                map = amumVar.b();
            } catch (NullPointerException unused) {
            }
        }
        if (map == null) {
            map = amup.k("com.google.android.libraries.youtube.logging.interaction_logger", oi);
        }
        this.f.c(apzgVar, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }

    public actk(aafo aafoVar, acth acthVar, Set set, Set set2) {
        if (aafoVar instanceof actk) {
            this.f = ((actk) aafoVar).f;
        } else {
            aafoVar.getClass();
            this.f = aafoVar;
        }
        acthVar.getClass();
        this.g = acthVar;
        set.getClass();
        this.h = set;
        set2.getClass();
        this.i = set2;
    }
}
