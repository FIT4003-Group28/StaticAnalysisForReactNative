package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FeedFilterChipBarRendererOuterClass;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: lxh  reason: default package */
/* loaded from: classes3.dex */
public final class lxh {
    public static fsg a(lwm lwmVar, ajzq ajzqVar, fhg fhgVar) {
        RecyclerView recyclerView = ajzqVar.f60J;
        fsg a = fsh.a();
        a.b = lwmVar.d();
        a.c(lwmVar.m());
        a.c = lwmVar;
        a.d = fhgVar;
        a.d(recyclerView);
        a.b(zdg.e(recyclerView.getContext()));
        return a;
    }

    public static void b(frv frvVar, final lwm lwmVar, ajzq ajzqVar, fhg fhgVar, acti actiVar, String str) {
        if (!f(str)) {
            fhgVar.c.as(new ayqb() { // from class: lxe
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    lwm lwmVar2 = lwm.this;
                    if (((fhf) obj).a()) {
                        lwmVar2.j();
                    }
                }
            });
        }
        ajzqVar.x(new lxg(lwmVar, ajzqVar, fhgVar, str, frvVar, actiVar));
    }

    public static void c(boolean z, frv frvVar, fsh fshVar) {
        if (z) {
            frvVar.m(fshVar);
        } else {
            frvVar.i();
        }
    }

    public static boolean d(aakw aakwVar) {
        atnk atnkVar;
        atnk atnkVar2;
        auqg auqgVar = aakwVar.a.g;
        if (auqgVar == null) {
            auqgVar = auqg.a;
        }
        if (auqgVar.b == 256220752) {
            auqg auqgVar2 = aakwVar.a.g;
            if (auqgVar2 == null) {
                auqgVar2 = auqg.a;
            }
            if (auqgVar2.b == 256220752) {
                atnkVar = (atnk) auqgVar2.c;
            } else {
                atnkVar = atnk.a;
            }
            if ((atnkVar.b & 2) == 0) {
                return false;
            }
            auqg auqgVar3 = aakwVar.a.g;
            if (auqgVar3 == null) {
                auqgVar3 = auqg.a;
            }
            if (auqgVar3.b == 256220752) {
                atnkVar2 = (atnk) auqgVar3.c;
            } else {
                atnkVar2 = atnk.a;
            }
            aunb aunbVar = atnkVar2.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            return aunbVar.qn(FeedFilterChipBarRendererOuterClass.feedFilterChipBarRenderer);
        }
        return false;
    }

    public static boolean e(String str) {
        return "FEwhat_to_watch".equals(str);
    }

    public static boolean f(String str) {
        return "FEsubscriptions".equals(str);
    }

    public static CharSequence g(Context context, snc sncVar, avss avssVar) {
        if (avssVar == null) {
            return "";
        }
        arag aragVar = avssVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b = ajgl.b(aragVar);
        return TextUtils.isEmpty(b) ? avssVar.b * 1000 < sncVar.c() ? "" : context.getString(R.string.live_upcoming_scheduled_datetime, DateFormat.format(DateFormat.getBestDateTimePattern(Locale.getDefault(), "M d yy h mm a"), avssVar.b * 1000)) : b;
    }

    public static final lbx h(Context context) {
        return new lbx(context);
    }
}
