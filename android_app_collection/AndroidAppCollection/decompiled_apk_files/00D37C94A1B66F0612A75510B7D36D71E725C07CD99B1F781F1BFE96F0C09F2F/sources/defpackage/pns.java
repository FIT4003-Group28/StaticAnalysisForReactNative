package defpackage;

import android.content.Context;
import android.media.MediaDrmResetException;
import android.media.MediaFormat;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: pns  reason: default package */
/* loaded from: classes4.dex */
public final class pns {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrmResetException;
    }

    public static final prk b(prk... prkVarArr) {
        return new ppm(prkVarArr);
    }

    public static void c(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void d(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void e(String str, String str2, Throwable th) {
        Log.e(str, m(str2, th));
    }

    public static void f(String str, String str2, Throwable th) {
        Log.w(str, m(str2, th));
    }

    public static argv g(argv argvVar, int i) {
        aopc aopcVar = (aopc) argv.a.createBuilder(argvVar);
        aopcVar.copyOnWrite();
        argv argvVar2 = (argv) aopcVar.instance;
        argvVar2.c = null;
        argvVar2.b &= -2;
        aopcVar.e(argr.b, true);
        if (i != -1) {
            aopcVar.e(argr.c, Integer.valueOf(i));
        }
        return (argv) aopcVar.mo39build();
    }

    public static String h(aupl auplVar) {
        if ((auplVar.b & 2) != 0) {
            arag aragVar = auplVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar).toString();
        }
        return null;
    }

    public static boolean i(argv argvVar) {
        return ((Boolean) argvVar.qm(argr.b)).booleanValue();
    }

    public static void j(Context context, ViewGroup viewGroup, ajxz ajxzVar, List list, boolean z) {
        atfh atfhVar;
        apmi apmiVar;
        apmk apmkVar;
        viewGroup.removeAllViews();
        if (list == null) {
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.watch_card_badge_margin_end);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            awdf awdfVar = (awdf) it.next();
            View view = null;
            if (awdfVar != null && awdfVar.b == 91394106) {
                view = View.inflate(context, R.layout.standalone_ypc_badge, null);
                int i = 1;
                if (true == z) {
                    i = 2;
                }
                ftc ftcVar = new ftc(view, i);
                if (awdfVar.b == 91394106) {
                    apmkVar = (apmk) awdfVar.c;
                } else {
                    apmkVar = apmk.a;
                }
                ftcVar.a(apmkVar);
            } else if (awdfVar == null || awdfVar.b != 104364901) {
                if (awdfVar != null && awdfVar.b == 128361622) {
                    view = View.inflate(context, R.layout.metadata_badge, null);
                    fta ftaVar = new fta(ajxzVar, context, view);
                    if (awdfVar.b == 128361622) {
                        atfhVar = (atfh) awdfVar.c;
                    } else {
                        atfhVar = atfh.a;
                    }
                    ftaVar.f(atfhVar);
                }
            } else {
                if (z) {
                    view = View.inflate(context, R.layout.watch_card_standalone_red_badge, null);
                } else {
                    view = View.inflate(context, R.layout.standalone_red_badge, null);
                }
                view.setId(R.id.standalone_red_badge);
                ktz ktzVar = new ktz(ajxzVar, context, view);
                if (awdfVar.b == 104364901) {
                    apmiVar = (apmi) awdfVar.c;
                } else {
                    apmiVar = apmi.a;
                }
                ktzVar.a(apmiVar);
            }
            if (view != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMarginEnd(dimensionPixelSize);
                viewGroup.addView(view, marginLayoutParams);
            }
        }
    }

    public static void k(laq laqVar, auyy auyyVar) {
        if (auyyVar == null) {
            return;
        }
        if (auyyVar.i()) {
            q(laqVar.j(), laqVar.k(), auyyVar);
            p(laqVar.g(), laqVar.h(), auyyVar);
        } else {
            q(laqVar.g(), laqVar.h(), auyyVar);
            p(laqVar.j(), laqVar.k(), auyyVar);
        }
        arag aragVar = null;
        zag.m(laqVar.i(), ajgl.b(auyyVar.m() ? auyyVar.d() : null));
        TextView f = laqVar.f();
        if (auyyVar.j()) {
            aragVar = auyyVar.a();
        }
        zag.m(f, ajgl.b(aragVar));
    }

    public static jsc l() {
        return new jsc(jsi.class);
    }

    private static String m(String str, Throwable th) {
        String replace;
        if (th != null) {
            Throwable th2 = th;
            while (true) {
                if (th2 != null) {
                    if (th2 instanceof UnknownHostException) {
                        replace = "UnknownHostException (no network)";
                        break;
                    }
                    th2 = th2.getCause();
                } else {
                    replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                    break;
                }
            }
        } else {
            replace = null;
        }
        if (!TextUtils.isEmpty(replace)) {
            String valueOf = String.valueOf(str);
            String replace2 = replace.replace("\n", "\n  ");
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(replace2).length());
            sb.append(valueOf);
            sb.append("\n  ");
            sb.append(replace2);
            sb.append('\n');
            return sb.toString();
        }
        return str;
    }

    private static CharSequence n(CharSequence charSequence, CharSequence charSequence2) {
        return ampm.b(", ").c().e(etk.j(charSequence), etk.j(charSequence2), new Object[0]);
    }

    private static CharSequence o(arag aragVar, CharSequence charSequence) {
        CharSequence i = ajgl.i(aragVar);
        return i != null ? i : charSequence;
    }

    private static void p(TextView textView, TextView textView2, auyy auyyVar) {
        arag aragVar = null;
        Spanned b = ajgl.b(auyyVar.k() ? auyyVar.b() : null);
        if (auyyVar.l()) {
            aragVar = auyyVar.c();
        }
        Spanned b2 = ajgl.b(aragVar);
        textView.setText(b);
        textView.setContentDescription(n(o(auyyVar.b(), b), o(auyyVar.c(), b2)));
        textView2.setText(b2);
    }

    private static void q(TextView textView, TextView textView2, auyy auyyVar) {
        arag aragVar = null;
        Spanned b = ajgl.b(auyyVar.n() ? auyyVar.e() : null);
        if (auyyVar.o()) {
            aragVar = auyyVar.f();
        }
        Spanned b2 = ajgl.b(aragVar);
        textView.setText(b);
        textView.setContentDescription(n(o(auyyVar.e(), b), o(auyyVar.f(), b2)));
        textView2.setText(b2);
    }
}
