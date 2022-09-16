package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: llm  reason: default package */
/* loaded from: classes3.dex */
public final class llm {
    public static int a(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((aurn) list.get(i)).d) {
                return i;
            }
        }
        return 0;
    }

    public static TextView b(Context context, aurt aurtVar) {
        arag aragVar;
        YouTubeTextView youTubeTextView = new YouTubeTextView(context);
        if ((aurtVar.b & 2) != 0) {
            aragVar = aurtVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        youTubeTextView.setText(ajgl.b(aragVar));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        youTubeTextView.setPadding(zew.i(displayMetrics, 20), zew.i(displayMetrics, 18), zew.i(displayMetrics, 20), zew.i(displayMetrics, 8));
        youTubeTextView.setTextSize(0, context.getResources().getDimension(R.dimen.extra_large_font_size));
        youTubeTextView.setTypeface(ajgo.ROBOTO_MEDIUM.c(context));
        youTubeTextView.setTextColor(zhn.f(context, 16842806));
        return youTubeTextView;
    }

    public static String c(Context context, List list, int i) {
        aqkm aqkmVar = ((aurn) list.get(i)).c;
        if (aqkmVar == null) {
            aqkmVar = aqkm.a;
        }
        return r(context, s(aqkmVar));
    }

    public static String d(Context context, List list) {
        for (int i = 0; i < list.size(); i++) {
            aurn aurnVar = (aurn) list.get(i);
            if (aurnVar.d) {
                aqkm aqkmVar = aurnVar.c;
                if (aqkmVar == null) {
                    aqkmVar = aqkm.a;
                }
                return r(context, s(aqkmVar));
            }
        }
        aqkm aqkmVar2 = ((aurn) list.get(0)).c;
        if (aqkmVar2 == null) {
            aqkmVar2 = aqkm.a;
        }
        return r(context, s(aqkmVar2));
    }

    public static List e(aurt aurtVar) {
        ArrayList arrayList = new ArrayList();
        for (aurp aurpVar : aurtVar.f) {
            if (aurpVar.b == 190692730) {
                arrayList.add((aurn) aurpVar.c);
            }
        }
        return arrayList;
    }

    public static List f(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqkm aqkmVar = ((aurn) it.next()).c;
            if (aqkmVar == null) {
                aqkmVar = aqkm.a;
            }
            arrayList.add(r(context, s(aqkmVar)));
        }
        return arrayList;
    }

    public static List g(aurm aurmVar) {
        ArrayList arrayList = new ArrayList();
        for (aunb aunbVar : aurmVar.d) {
            if (aunbVar.qn(SettingRenderer.settingSingleOptionMenuRenderer)) {
                arrayList.add((aurt) aunbVar.qm(SettingRenderer.settingSingleOptionMenuRenderer));
            }
        }
        return arrayList;
    }

    public static List h(aurm aurmVar, int i) {
        List g = g(aurmVar);
        if (g.size() == 2) {
            return ((aurt) g.get(i)).f;
        }
        return new ArrayList();
    }

    public static aurm i(aurm aurmVar, int i, int i2) {
        aurn aurnVar;
        List g = g(aurmVar);
        if (g.size() == 2) {
            aurt aurtVar = (aurt) g.get(i);
            aopu aopuVar = aurtVar.f;
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < aopuVar.size()) {
                aurp aurpVar = (aurp) aopuVar.get(i3);
                aopa mo52toBuilder = aurpVar.mo52toBuilder();
                if (aurpVar.b == 190692730) {
                    aurnVar = (aurn) aurpVar.c;
                } else {
                    aurnVar = aurn.a;
                }
                aopa mo52toBuilder2 = aurnVar.mo52toBuilder();
                boolean z = i3 == i2 % aopuVar.size();
                mo52toBuilder2.copyOnWrite();
                aurn aurnVar2 = (aurn) mo52toBuilder2.instance;
                aurnVar2.b |= 4;
                aurnVar2.d = z;
                mo52toBuilder.copyOnWrite();
                aurp aurpVar2 = (aurp) mo52toBuilder.instance;
                aurn aurnVar3 = (aurn) mo52toBuilder2.mo39build();
                aurnVar3.getClass();
                aurpVar2.c = aurnVar3;
                aurpVar2.b = 190692730;
                arrayList.add((aurp) mo52toBuilder.mo39build());
                i3++;
            }
            aopa mo52toBuilder3 = aurtVar.mo52toBuilder();
            mo52toBuilder3.copyOnWrite();
            ((aurt) mo52toBuilder3.instance).f = aurt.emptyProtobufList();
            mo52toBuilder3.copyOnWrite();
            aurt aurtVar2 = (aurt) mo52toBuilder3.instance;
            aurtVar2.a();
            aonk.addAll((Iterable) arrayList, (List) aurtVar2.f);
            g.set(i, (aurt) mo52toBuilder3.mo39build());
            aopa mo52toBuilder4 = aurmVar.mo52toBuilder();
            int i4 = 0;
            for (int i5 = 0; i5 < aurmVar.d.size() && i4 < g.size(); i5++) {
                if (((aunb) aurmVar.d.get(i5)).qn(SettingRenderer.settingSingleOptionMenuRenderer)) {
                    aopc aopcVar = (aopc) aunb.a.createBuilder();
                    aopcVar.e(SettingRenderer.settingSingleOptionMenuRenderer, (aurt) g.get(i4));
                    mo52toBuilder4.copyOnWrite();
                    aurm aurmVar2 = (aurm) mo52toBuilder4.instance;
                    aunb aunbVar = (aunb) aopcVar.mo39build();
                    aunbVar.getClass();
                    aurmVar2.a();
                    aurmVar2.d.set(i5, aunbVar);
                    i4++;
                }
            }
            return (aurm) mo52toBuilder4.mo39build();
        }
        return aurmVar;
    }

    public static void j(Handler handler, final Context context, final String str, final boolean z) {
        handler.post(new Runnable() { // from class: liv
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(context, str, z ? 1 : 0).show();
            }
        });
    }

    public static ampq k(ajfz ajfzVar) {
        try {
            return ampq.j((aqoy) aopi.parseFrom(aqoy.a, Base64.decode(ajfzVar.b(), 8), aoos.b()));
        } catch (aopx unused) {
            return amon.a;
        }
    }

    public static aqpa l(ajfz ajfzVar) {
        return (aqpa) p(ajfzVar, jgl.t, aqpa.FILTER_TYPE_UNSPECIFIED);
    }

    public static aumx m(aqos aqosVar, aqpa aqpaVar, int i) {
        aopa createBuilder = aqoy.a.createBuilder();
        aopa createBuilder2 = aqot.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqot aqotVar = (aqot) createBuilder2.instance;
        aqotVar.c = aqosVar.d;
        aqotVar.b |= 1;
        createBuilder2.copyOnWrite();
        aqot aqotVar2 = (aqot) createBuilder2.instance;
        aqotVar2.d = aqpaVar.e;
        aqotVar2.b |= 2;
        createBuilder2.copyOnWrite();
        aqot aqotVar3 = (aqot) createBuilder2.instance;
        aqotVar3.b |= 4;
        aqotVar3.e = i;
        aqot aqotVar4 = (aqot) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aqoy aqoyVar = (aqoy) createBuilder.instance;
        aqotVar4.getClass();
        aqoyVar.c = aqotVar4;
        aqoyVar.b = 2;
        return o((aqoy) createBuilder.mo39build());
    }

    public static aumx n(aqow aqowVar) {
        aopa createBuilder = aqoy.a.createBuilder();
        aopa createBuilder2 = aqox.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqox aqoxVar = (aqox) createBuilder2.instance;
        aqoxVar.c = aqowVar.c;
        aqoxVar.b |= 1;
        aqox aqoxVar2 = (aqox) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aqoy aqoyVar = (aqoy) createBuilder.instance;
        aqoxVar2.getClass();
        aqoyVar.c = aqoxVar2;
        aqoyVar.b = 4;
        return o((aqoy) createBuilder.mo39build());
    }

    public static aumx o(aqoy aqoyVar) {
        aopa createBuilder = aumx.a.createBuilder();
        String encodeToString = Base64.encodeToString(aqoyVar.toByteArray(), 8);
        createBuilder.copyOnWrite();
        aumx aumxVar = (aumx) createBuilder.instance;
        encodeToString.getClass();
        aumxVar.c |= 1;
        aumxVar.d = encodeToString;
        return (aumx) createBuilder.mo39build();
    }

    public static Object p(ajfz ajfzVar, ampg ampgVar, Object obj) {
        ampq k = k(ajfzVar);
        return k.h() ? ampgVar.apply((aqoy) k.c()) : obj;
    }

    public static final jva q(int i, boolean z) {
        return new jva(i, z);
    }

    private static String r(Context context, Date date) {
        return new SimpleDateFormat(true != DateFormat.is24HourFormat(context) ? "h:mm a" : "HH:mm", Locale.getDefault()).format(date);
    }

    private static Date s(aqkm aqkmVar) {
        if (aqkmVar == null) {
            return new Date(0, 0, 0, 0, 0);
        }
        return new Date(0, 0, 0, aqkmVar.c, aqkmVar.d);
    }
}
