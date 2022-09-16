package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
/* compiled from: PG */
/* renamed from: ywp  reason: default package */
/* loaded from: classes4.dex */
public final class ywp implements ywk {
    private volatile String X;
    private volatile String a;

    public ywp(Context context, long[][] jArr) {
        if (jArr != null) {
            ywo ywoVar = new ywo(jArr[0], jArr[1]);
            ywoVar.d();
            File o = ywg.o(context);
            if (o != null) {
                File p = ywg.p(o);
                File n = ywg.n(o);
                zgd.E(p);
                zgd.E(n);
            }
            String[] strArr = {ywoVar.a.a(), ywoVar.b.a()};
            this.a = strArr[0];
            this.X = strArr[1];
            f(context).edit().putString("com.google.android.libraries.youtube.innertube.request.startup_experiments", this.X).apply();
            return;
        }
        this.X = h(context);
        this.a = this.X;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(String str, ywj ywjVar) {
        try {
            String j = j(str, ywjVar.a);
            return j == null ? ((Long) ywjVar.b).longValue() : Long.parseLong(j);
        } catch (Throwable unused) {
            return ((Long) ywjVar.b).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SharedPreferences.Editor b(SharedPreferences.Editor editor) {
        return editor.remove("com.google.android.libraries.youtube.innertube.request.startup_experiments");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SharedPreferences f(Context context) {
        return context.getSharedPreferences("youtube", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(Context context) {
        return f(context).getString("com.google.android.libraries.youtube.innertube.request.startup_experiments", null);
    }

    static String j(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            int length = str.length() - 2;
            int i = 0;
            while (i <= length) {
                int indexOf = str.indexOf(44, i);
                if (indexOf < 0) {
                    indexOf = str.length();
                }
                int length2 = str2.length() + i;
                if (length2 < indexOf && str.charAt(length2) == '=' && str.regionMatches(i, str2, 0, str2.length())) {
                    return str.substring(length2 + 1, indexOf);
                }
                i = indexOf + 1;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(String str, ywj ywjVar) {
        try {
            String j = j(str, ywjVar.a);
            return j == null ? ((Boolean) ywjVar.b).booleanValue() : Boolean.parseBoolean(j);
        } catch (Throwable unused) {
            return ((Boolean) ywjVar.b).booleanValue();
        }
    }

    @Override // defpackage.ywk
    public final long c(ywj ywjVar) {
        return a(k(), ywjVar);
    }

    @Override // defpackage.ywk
    public final synchronized SharedPreferences.Editor d(SharedPreferences.Editor editor, apyy apyyVar, arhd arhdVar) {
        aveq aveqVar = apyyVar.u;
        if (aveqVar == null) {
            aveqVar = aveq.a;
        }
        apgx apgxVar = aveqVar.g;
        if (apgxVar == null) {
            apgxVar = apgx.a;
        }
        avfg avfgVar = arhdVar.y;
        if (avfgVar == null) {
            avfgVar = avfg.a;
        }
        atfw atfwVar = apyyVar.k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        avff avffVar = atfwVar.x;
        if (avffVar == null) {
            avffVar = avff.a;
        }
        asxj asxjVar = apyyVar.e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        atfw atfwVar2 = apyyVar.k;
        if (atfwVar2 == null) {
            atfwVar2 = atfw.a;
        }
        aqle aqleVar = atfwVar2.j;
        if (aqleVar == null) {
            aqleVar = aqle.a;
        }
        ywn ywnVar = new ywn();
        ywnVar.b(C, avfgVar.b);
        ywnVar.c(D, apgxVar.b);
        ywnVar.b(E, apgxVar.c);
        ywnVar.b(F, apgxVar.d);
        ywnVar.b(I, apgxVar.f);
        ywnVar.b(H, apgxVar.h);
        ywnVar.c(G, apgxVar.g);
        ywnVar.c(f272J, aveqVar.m);
        ywnVar.b(K, aveqVar.n);
        ywnVar.b(L, yxk.c(avffVar));
        ywj ywjVar = M;
        atcj atcjVar = apyyVar.n;
        if (atcjVar == null) {
            atcjVar = atcj.a;
        }
        int O = almu.O(atcjVar.ac);
        int i = 1;
        if (O == 0) {
            O = 1;
        }
        ywnVar.b(ywjVar, O - 1);
        ywj ywjVar2 = N;
        aovy aovyVar = apyyVar.i;
        if (aovyVar == null) {
            aovyVar = aovy.a;
        }
        ywnVar.c(ywjVar2, aovyVar.d);
        ywnVar.c(O, asxjVar.cH);
        ywnVar.c(P, asxjVar.E);
        ywj ywjVar3 = Q;
        aver averVar = avffVar.i;
        if (averVar == null) {
            averVar = aver.a;
        }
        ywnVar.b(ywjVar3, averVar.m);
        ywj ywjVar4 = R;
        int d = apfu.d(aveqVar.s);
        if (d != 0) {
            i = d;
        }
        ywnVar.b(ywjVar4, i - 1);
        ywnVar.b(S, aqleVar.i);
        ywj ywjVar5 = T;
        atjw atjwVar = apyyVar.g;
        if (atjwVar == null) {
            atjwVar = atjw.a;
        }
        atjx atjxVar = atjwVar.b;
        if (atjxVar == null) {
            atjxVar = atjx.a;
        }
        ywnVar.c(ywjVar5, atjxVar.b);
        ywnVar.b(U, aveqVar.u);
        ywj ywjVar6 = V;
        avez avezVar = avffVar.o;
        if (avezVar == null) {
            avezVar = avez.a;
        }
        aveu aveuVar = avezVar.b;
        if (aveuVar == null) {
            aveuVar = aveu.a;
        }
        ywnVar.b(ywjVar6, aveuVar.b);
        ywj ywjVar7 = W;
        avez avezVar2 = avffVar.o;
        if (avezVar2 == null) {
            avezVar2 = avez.a;
        }
        avfb avfbVar = avezVar2.c;
        if (avfbVar == null) {
            avfbVar = avfb.a;
        }
        ywnVar.b(ywjVar7, avfbVar.b);
        this.X = ywnVar.a();
        return editor.putString("com.google.android.libraries.youtube.innertube.request.startup_experiments", this.X);
    }

    @Override // defpackage.ywk
    public final synchronized SharedPreferences.Editor e(SharedPreferences.Editor editor) {
        this.a = null;
        this.X = null;
        return b(editor);
    }

    @Override // defpackage.ywk
    public final synchronized Object g() {
        return new String[]{this.a, this.X};
    }

    @Override // defpackage.ywk
    public final /* synthetic */ void i(int i) {
        int i2 = ywh.a;
    }

    final synchronized String k() {
        return this.a;
    }

    @Override // defpackage.ywk
    public final boolean l(ywj ywjVar) {
        return m(k(), ywjVar);
    }
}
