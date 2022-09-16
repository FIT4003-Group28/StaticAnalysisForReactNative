package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eyg  reason: default package */
/* loaded from: classes3.dex */
public final class eyg implements aafl {
    private static final amvn a = amvn.v("com.android.chrome", "com.google.android.apps.chrome", "com.chrome.beta", "com.chrome.dev", "com.sec.android.app.sbrowser");
    private final wxc b;
    private final enc c;
    private final Activity d;
    private final eyf e;
    private final ajgr f;
    private final acth g;
    private final Executor h;
    private final axwt i;
    private final yxz j;

    public eyg(Activity activity, wxc wxcVar, enc encVar, eyf eyfVar, ajgr ajgrVar, acth acthVar, Executor executor, axwt axwtVar, yxz yxzVar) {
        this.d = activity;
        this.b = wxcVar;
        this.c = encVar;
        eyfVar.getClass();
        this.e = eyfVar;
        this.f = ajgrVar;
        this.g = acthVar;
        this.h = executor;
        this.i = axwtVar;
        this.j = yxzVar;
    }

    private static String c(String str) {
        try {
            int indexOf = str.indexOf("adurl=") + 6;
            int indexOf2 = str.indexOf("&", indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.length();
            }
            String decode = Uri.decode(str.substring(indexOf, indexOf2));
            String substring = decode.substring(decode.indexOf("S.browser_fallback_url=") + 23);
            String substring2 = substring.substring(0, substring.indexOf(59));
            String substring3 = str.substring(0, indexOf);
            String substring4 = str.substring(indexOf2);
            StringBuilder sb = new StringBuilder(String.valueOf(substring3).length() + String.valueOf(substring2).length() + String.valueOf(substring4).length());
            sb.append(substring3);
            sb.append(substring2);
            sb.append(substring4);
            return sb.toString();
        } catch (StringIndexOutOfBoundsException unused) {
            return str;
        }
    }

    private final void d(apzg apzgVar, boolean z, boolean z2, String str) {
        if ((apzgVar.b & 1) == 0 || !apzgVar.qn(UrlEndpointOuterClass.urlEndpoint)) {
            return;
        }
        avvj avvjVar = ((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).f;
        if (avvjVar == null) {
            avvjVar = avvj.a;
        }
        if (!avvjVar.b) {
            return;
        }
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asit.a.createBuilder();
        aopa createBuilder3 = asio.a.createBuilder();
        createBuilder3.copyOnWrite();
        asio asioVar = (asio) createBuilder3.instance;
        asioVar.b |= 1;
        asioVar.c = z;
        createBuilder3.copyOnWrite();
        asio asioVar2 = (asio) createBuilder3.instance;
        asioVar2.b |= 2;
        asioVar2.d = z2;
        if (str == null) {
            str = "EXTERNAL";
        }
        createBuilder3.copyOnWrite();
        asio asioVar3 = (asio) createBuilder3.instance;
        asioVar3.b |= 4;
        asioVar3.e = str;
        createBuilder2.copyOnWrite();
        asit asitVar = (asit) createBuilder2.instance;
        asio asioVar4 = (asio) createBuilder3.mo39build();
        asioVar4.getClass();
        asitVar.d = asioVar4;
        asitVar.c = 9;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asit asitVar2 = (asit) createBuilder2.mo39build();
        asitVar2.getClass();
        asjjVar.t = asitVar2;
        asjjVar.c |= 1024;
        this.g.oi().w(new acte(apzgVar.c), (asjj) createBuilder.mo39build());
    }

    private final void e(apzg apzgVar, Map map) {
        if (this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"));
            this.c.a(ena.a, ((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).e, hashMap);
        }
    }

    private final void f(Intent intent, Uri uri, apzg apzgVar, Map map) {
        yja.c(this.d, intent, uri);
        d(apzgVar, false, false, null);
        e(apzgVar, map);
        this.d.startActivity(intent.setFlags(268435456));
    }

    private final boolean g(Uri uri, apzg apzgVar, Map map) {
        ajgr ajgrVar = this.f;
        if (ajgrVar == null || !ajgrVar.c(this.d, uri)) {
            return false;
        }
        d(apzgVar, true, false, this.f.b());
        e(apzgVar, map);
        return true;
    }

    public final void b(Intent intent, Uri uri, apzg apzgVar, Map map, boolean z) {
        if (z) {
            d(apzgVar, true, true, this.f.b());
            e(apzgVar, map);
        } else if (g(uri, apzgVar, map)) {
        } else {
            f(intent, uri, apzgVar, map);
        }
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, final Map map) {
        boolean z;
        ajgr ajgrVar;
        Boolean bool;
        wxc wxcVar = this.b;
        if (wxcVar != null) {
            wxcVar.c(zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), apel.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_URL);
        }
        Uri a2 = this.e.a(((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).c, map);
        String uri = a2.toString();
        if (uri.contains("ep://")) {
            uri = uri.replace("ep://", "");
            a2 = Uri.parse(uri);
            z = true;
        } else {
            z = false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", a2);
        List<ResolveInfo> queryIntentActivities = this.d.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities.isEmpty()) {
            zag.q(this.d, R.string.error_link_cannot_be_opened, 0);
            e(apzgVar, map);
            return;
        }
        ajgl.q(this.d, intent);
        ajgr ajgrVar2 = this.f;
        String str = null;
        String b = ajgrVar2 == null ? null : ajgrVar2.b();
        if (queryIntentActivities.get(0).activityInfo != null) {
            str = queryIntentActivities.get(0).activityInfo.packageName;
        }
        String uri2 = a2.toString();
        axwt axwtVar = this.i;
        if (axwtVar != null) {
            aqxe aqxeVar = axwtVar.a.b().C;
            if (aqxeVar == null) {
                aqxeVar = aqxe.a;
            }
            if (aqxeVar.a(45354956L)) {
                aoqp aoqpVar = aqxeVar.b;
                if (!aoqpVar.containsKey(45354956L)) {
                    throw new IllegalArgumentException();
                }
                aqxf aqxfVar = (aqxf) aoqpVar.get(45354956L);
                bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
            } else {
                bool = false;
            }
            if (bool.booleanValue() && uri2.matches(".+adurl=intent.+S.browser_fallback_url.+") && ((b != null && !a.contains(b)) || (str != null && !a.contains(str)))) {
                a2 = Uri.parse(c(uri2));
            }
        }
        final Intent data = intent.setData(a2);
        if (data.getPackage() == null) {
            if (!data.toUri(0).isEmpty()) {
                Activity activity = this.d;
                if ((activity instanceof oa) && z) {
                    eo supportFragmentManager = ((oa) activity).getSupportFragmentManager();
                    gic gicVar = new gic();
                    Bundle bundle = new Bundle();
                    bundle.putString("URL_KEY", uri);
                    bundle.putParcelable("navigation_endpoint", new ParcelableMessageLite(apzgVar));
                    gicVar.ae(bundle);
                    gicVar.qv(supportFragmentManager, "WEB_VIEW_BOTTOM_SHEET_TAG");
                    yxz yxzVar = this.j;
                    if (yxzVar == null) {
                        return;
                    }
                    yxzVar.b();
                    return;
                }
            }
            if (this.f == null || !((avvk) apzgVar.qm(UrlEndpointOuterClass.urlEndpoint)).g || (ajgrVar = this.f) == null || !ajgrVar.f()) {
                if (g(a2, apzgVar, map)) {
                    return;
                }
            } else {
                final Uri uri3 = a2;
                ylx.k(this.f.a(this.d, a2), this.h, new ylv() { // from class: eyd
                    @Override // defpackage.zdt
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        eyg.this.b(data, uri3, apzgVar, map, false);
                    }
                }, new ylw() { // from class: eye
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        eyg.this.b(data, uri3, apzgVar, map, ((Boolean) obj).booleanValue());
                    }
                });
                return;
            }
        }
        f(data, a2, apzgVar, map);
    }
}
