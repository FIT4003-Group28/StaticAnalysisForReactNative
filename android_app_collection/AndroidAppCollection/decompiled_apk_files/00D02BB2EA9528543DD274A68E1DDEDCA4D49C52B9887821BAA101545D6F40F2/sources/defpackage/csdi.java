package defpackage;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: csdi  reason: default package */
/* loaded from: classes5.dex */
public final class csdi {
    public final csdd a;
    public final csdj b;
    public final Context c;
    public csde d;
    public final String e;
    public final csdl f;
    public final WebView g;
    private final Handler h;

    public csdi(Context context, cscx cscxVar, csdj csdjVar) {
        dbsk.s(context);
        this.c = context;
        this.g = new WebView(context);
        Handler handler = new Handler(context.getMainLooper());
        this.h = handler;
        this.b = csdjVar;
        String a = csdjVar.a("survey_url");
        this.e = a;
        csdl csdlVar = new csdl(context, a);
        this.f = csdlVar;
        this.a = new csdd(cscxVar, handler, csdlVar);
    }

    public static final String a(String str, String[] strArr) {
        String h = strArr == null ? "" : dbrz.e(", ").h(strArr);
        return String.format("_402m['%s'] = function(%s) { _402m_native.%s(%s); };\n", str, h, str, h);
    }
}
