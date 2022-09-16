package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import com.google.android.apps.maps.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: aumh  reason: default package */
/* loaded from: classes2.dex */
public final class aumh extends gen {
    public aunp a;
    public cqkj b;
    aumj c;
    private aumg d;

    @Override // defpackage.ges
    protected final void Nv() {
        ((aumi) btsx.b(aumi.class, this)).co(this);
    }

    @Override // defpackage.gen
    protected final void aX() {
        J().finish();
    }

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        gdf gdfVar = new gdf((Context) J(), true);
        if (this.d != null) {
            cqkf c = this.b.c(new aumf(), null);
            c.e(this.d);
            gdfVar.setContentView(c.c());
        }
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        String sb;
        super.l(bundle);
        if (this.c == null) {
            Bundle bundle2 = this.o;
            try {
                dbsgVar = dbsg.i((dkps) dsqw.cq(dkps.k, bundle2.getByteArray("survey")));
            } catch (dsrm e) {
                bvoo.f(new RuntimeException(e));
                dbsgVar = dbpy.a;
            }
            try {
                dbsgVar2 = dbsg.i((auni) dsqw.cq(auni.e, bundle2.getByteArray("notification_instance")));
            } catch (dsrm e2) {
                bvoo.f(new RuntimeException(e2));
                dbsgVar2 = dbpy.a;
            }
            if (!dbsgVar.a() || !dbsgVar2.a()) {
                J().finish();
                return;
            }
            aumj aumjVar = new aumj(this.a, J(), (dkps) dbsgVar.b(), (auni) dbsgVar2.b());
            this.c = aumjVar;
            if (aumjVar.e == null) {
                ff ffVar = aumjVar.b;
                csdj csdjVar = new csdj(aumjVar.c.e);
                csdjVar.b.put("app_version", ffVar.getString(R.string.ABOUT_VERSION_SUMMARY, bvoc.a(ffVar), Long.toString(bvoc.c(ffVar))));
                if (!dbsj.d(null)) {
                    csdjVar.b("survey_url", null);
                }
                csdjVar.b("locale", cjxr.y(Locale.getDefault()));
                csdi csdiVar = new csdi(aumjVar.b, aumjVar, csdjVar);
                aumjVar.e = csdiVar;
                WebSettings settings = csdiVar.g.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDatabaseEnabled(false);
                settings.setDomStorageEnabled(true);
                String a = csdiVar.b.a("user_agent");
                if (a != null) {
                    settings.setUserAgentString(a);
                }
                int i = (int) (csdiVar.c.getResources().getConfiguration().fontScale * 100.0f);
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Setting text zoom to: ");
                sb2.append(i);
                sb2.toString();
                settings.setTextZoom(i);
                csdiVar.g.addJavascriptInterface(csdiVar.a, "_402m_native");
                csdiVar.g.setOnLongClickListener(new csdf());
                csdiVar.g.setWebChromeClient(new csdg());
                csdiVar.g.setWebViewClient(new csdk());
                CookieSyncManager.createInstance(csdiVar.g.getContext());
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                cookieManager.removeAllCookie();
                csdl csdlVar = csdiVar.f;
                String a2 = csdlVar.a();
                if (a2.isEmpty()) {
                    sb = null;
                } else {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss zzz", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(1, 1);
                    String format = simpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
                    String str = csdlVar.b;
                    String str2 = csdlVar.a;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a2).length() + 26 + String.valueOf(format).length() + String.valueOf(str).length() + String.valueOf(str2).length());
                    sb3.append(a2);
                    sb3.append("; expires=");
                    sb3.append(format);
                    sb3.append("; path=");
                    sb3.append(str);
                    sb3.append("; domain=");
                    sb3.append(str2);
                    sb = sb3.toString();
                }
                if (sb != null) {
                    String str3 = csdiVar.f.c;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 30 + sb.length());
                    sb4.append("Setting cookie on URL=");
                    sb4.append(str3);
                    sb4.append(", value=");
                    sb4.append(sb);
                    sb4.toString();
                    cookieManager.setCookie(csdiVar.f.c, sb);
                }
                CookieSyncManager.getInstance().sync();
                csdiVar.g.onResume();
                String a3 = csdiVar.b.a("site_id");
                String a4 = csdi.a("onWindowError", null);
                String a5 = csdi.a("onSurveyComplete", new String[]{"justAnswered", "unused"});
                String a6 = csdi.a("onSurveyCanceled", null);
                csdj csdjVar2 = csdiVar.b;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("_402m['params'] = {};\n");
                sb5.append("_402m['logging_params'] = {};\n");
                for (Map.Entry<String, String> entry : csdjVar2.a.entrySet()) {
                    sb5.append(String.format("_402m['params']['%s'] = '%s';\n", entry.getKey(), entry.getValue()));
                }
                for (Map.Entry<String, String> entry2 : csdjVar2.b.entrySet()) {
                    sb5.append(String.format("_402m['logging_params']['%s'] = '%s'\n;", entry2.getKey(), entry2.getValue()));
                }
                String sb6 = sb5.toString();
                String format2 = String.format("<script src=\"%s?site=%s\"></script>", csdiVar.e, a3);
                int length = String.valueOf(a4).length();
                StringBuilder sb7 = new StringBuilder(length + 334 + String.valueOf(a5).length() + String.valueOf(a6).length() + 134 + String.valueOf(sb6).length() + String.valueOf(format2).length());
                sb7.append("<!doctype><html><head><meta name=\"viewport\" content=\"initial-scale=1.0,user-scalable=no\"><script>_402m = {};");
                sb7.append(a4);
                sb7.append("window.onerror=function(){_402m.onWindowError();};");
                sb7.append("_402m['onSurveyReady'] = function() { _402m_native.onParamsLoaded(_402.params.svyid, _402.params.srvsrsid); _402m_native.onSurveyReady(); }\n");
                sb7.append(a5);
                sb7.append(a6);
                sb7.append("_402m['onSurveyResponse'] = function(response) {var surveyId = _402.params.svyid;_402m_native.onSurveyResponse(response, surveyId);};\n");
                sb7.append(sb6);
                sb7.append("</script>");
                sb7.append(format2);
                sb7.append("</head><body></body></html>");
                csdiVar.g.loadDataWithBaseURL(String.valueOf(csdiVar.f.c).concat("/hats_shim"), sb7.toString(), "text/html", null, null);
            }
        }
        this.d = new aumg();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxw.dI;
    }
}
