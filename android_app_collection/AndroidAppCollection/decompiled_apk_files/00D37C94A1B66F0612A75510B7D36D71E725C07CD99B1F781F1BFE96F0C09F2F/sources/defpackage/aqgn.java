package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqgn  reason: default package */
/* loaded from: classes2.dex */
public final class aqgn {
    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int g(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static void i(Spannable spannable, Object obj, Object... objArr) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        for (Object obj2 : objArr) {
            spannable.setSpan(obj2, spanStart, spanEnd, 0);
        }
    }

    public static boolean j(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return intent.getBooleanExtra("isSetupFlow", false);
        }
        return intent.getBooleanExtra("firstRun", false) || intent.getBooleanExtra("preDeferredSetup", false) || intent.getBooleanExtra("deferredSetup", false);
    }

    public static boolean k(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static int m(Context context) {
        return zhn.d(context, R.attr.ytTextDisabled);
    }

    public static int n(Context context) {
        return zhn.d(context, R.attr.yt10PercentLayer);
    }

    public static void o(sai saiVar, final akrt akrtVar) {
        Context context = saiVar.getContext();
        sfk sfkVar = new sfk() { // from class: akru
            @Override // defpackage.sfk
            public final View a(List list) {
                String sb;
                akrt akrtVar2 = akrt.this;
                akrtVar2.g.removeAllViews();
                for (int i = 0; i < list.size(); i++) {
                    TextView textView = (TextView) akrtVar2.h.inflate(R.layout.chart_touch_tooltip_value_item, (ViewGroup) akrtVar2.g, false);
                    textView.setVisibility(0);
                    sfj sfjVar = (sfj) list.get(i);
                    if (akrtVar2.i.size() <= i || ((List) akrtVar2.i.get(i)).size() <= sfjVar.b) {
                        String valueOf = String.valueOf(sfjVar.d);
                        String valueOf2 = String.valueOf(sfjVar.c);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
                        sb2.append(valueOf);
                        sb2.append("—");
                        sb2.append(valueOf2);
                        sb = sb2.toString();
                    } else {
                        sb = (String) ((List) akrtVar2.i.get(i)).get(sfjVar.b);
                    }
                    textView.setText(sb);
                    akrtVar2.g.addView(textView);
                }
                return akrtVar2;
            }
        };
        sfq sfqVar = new sfq(context);
        sfqVar.c = sfkVar;
        sfo sfoVar = new sfo();
        sfoVar.a = 1;
        sfqVar.e = sfoVar;
        sfr sfrVar = sfqVar.a;
        sfrVar.a = context.getResources().getDimensionPixelSize(R.dimen.touch_tooltip_corner_radius);
        sfrVar.b = context.getResources().getDimensionPixelSize(R.dimen.touch_tooltip_arrow_base_size);
        sfrVar.c = context.getResources().getDimensionPixelSize(R.dimen.touch_tooltip_arrow_height);
        sfrVar.e = zhn.d(context, R.attr.yt10PercentLayer);
        sfrVar.d = zhn.d(context, R.attr.ytBrandBackgroundSolid);
        sfqVar.g.a(sfqVar.a);
        saiVar.u(sfqVar, "touch_card_behavior");
        sex sexVar = new sex();
        saiVar.y = true;
        sfa sfaVar = saiVar.x;
        if (sfaVar != null) {
            sfaVar.d(saiVar.r());
        }
        saiVar.x = sexVar;
        saiVar.x.c(saiVar.r());
        if (saiVar.n) {
            return;
        }
        saiVar.n = true;
        saiVar.A(new sae(saiVar));
    }

    public static void p(sai saiVar) {
        scc sccVar = new scc(0);
        sbq sbqVar = saiVar.D;
        sbr.E(sccVar);
        sbqVar.h = sccVar;
        scc sccVar2 = new scc(0);
        sbq sbqVar2 = saiVar.D;
        sbr.E(sccVar2);
        sbqVar2.g = sccVar2;
        scc sccVar3 = new scc(0);
        sbq sbqVar3 = saiVar.D;
        sbr.E(sccVar3);
        sbqVar3.d = sccVar3;
        scc sccVar4 = new scc(0);
        sbq sbqVar4 = saiVar.D;
        sbr.E(sccVar4);
        sbqVar4.c = sccVar4;
    }

    public static List q(List list, List list2) {
        ArrayList o = amxp.o();
        for (int i = 0; i < list.size(); i++) {
            o.add(Double.valueOf(((Double) list.get(i)).doubleValue() - ((Double) list2.get(i)).doubleValue()));
        }
        return o;
    }
}
