package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.f;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: pce  reason: default package */
/* loaded from: classes4.dex */
public final class pce {
    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void d(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void e(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    public static void f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static paw g(oxn oxnVar) {
        pct pctVar = new pct(16);
        if (aeuq.b(oxnVar, pctVar).b != pcx.c("RIFF")) {
            return null;
        }
        oxnVar.g(pctVar.a, 0, 4);
        pctVar.z(0);
        int c = pctVar.c();
        if (c != pcx.c("WAVE")) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(c);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        aeuq b = aeuq.b(oxnVar, pctVar);
        while (b.b != pcx.c("fmt ")) {
            oxnVar.e((int) b.a);
            b = aeuq.b(oxnVar, pctVar);
        }
        d(b.a >= 16);
        oxnVar.g(pctVar.a, 0, 16);
        pctVar.z(0);
        int f = pctVar.f();
        int f2 = pctVar.f();
        int e = pctVar.e();
        int e2 = pctVar.e();
        int f3 = pctVar.f();
        int f4 = pctVar.f();
        int i = (f2 * f4) / 8;
        if (f3 == i) {
            int d = pcx.d(f4);
            if (d == 0) {
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Unsupported WAV bit depth: ");
                sb2.append(f4);
                Log.e("WavHeaderReader", sb2.toString());
                return null;
            } else if (f == 1 || f == 65534) {
                oxnVar.e(((int) b.a) - 16);
                return new paw(f2, e, e2, f3, f4, d);
            } else {
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("Unsupported WAV format type: ");
                sb3.append(f);
                Log.e("WavHeaderReader", sb3.toString());
                return null;
            }
        }
        StringBuilder sb4 = new StringBuilder(55);
        sb4.append("Expected block alignment: ");
        sb4.append(i);
        sb4.append("; got: ");
        sb4.append(f3);
        throw new ouf(sb4.toString());
    }

    public static aqtp h(aadd aaddVar) {
        if (aaddVar == null || aaddVar.a() == null) {
            return aqtp.a;
        }
        aqtp aqtpVar = aaddVar.a().v;
        return aqtpVar == null ? aqtp.a : aqtpVar;
    }

    public static aqto i(aacz aaczVar) {
        if (aaczVar == null || aaczVar.b() == null || (aaczVar.b().b & 524288) == 0) {
            return null;
        }
        aqto aqtoVar = aaczVar.b().p;
        return aqtoVar == null ? aqto.a : aqtoVar;
    }

    public static final e j(int i, List list, AdapterView.OnItemClickListener onItemClickListener, Context context, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.embed_bottom_sheet_list, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.bottom_sheet_title);
        if (i == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(i);
        }
        ListView listView = (ListView) inflate.findViewById(R.id.bottom_sheet_list_view);
        f fVar = new f(context);
        fVar.addAll(list);
        listView.setAdapter((ListAdapter) fVar);
        listView.setOnItemClickListener(onItemClickListener);
        listView.setOnTouchListener(new gia(3));
        e eVar = new e(context);
        eVar.e();
        eVar.a = new b(eVar);
        eVar.setOnShowListener(onShowListener);
        eVar.setOnDismissListener(onDismissListener);
        eVar.setContentView(inflate);
        return eVar;
    }
}
