package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aklc  reason: default package */
/* loaded from: classes.dex */
public final class aklc {
    public final int[] a;
    public aafo b;
    public final aklb c;
    public final aklb d;
    private final SharedPreferences e;
    private final Set f;
    private final Handler g;
    private final Rect h;
    private akfl i;

    public aklc(SharedPreferences sharedPreferences, Handler handler, Context context) {
        sharedPreferences.getClass();
        this.e = sharedPreferences;
        handler.getClass();
        this.g = handler;
        this.f = new HashSet();
        this.h = new Rect();
        this.a = new int[2];
        this.c = new aklb(zhn.j(context, R.attr.ytThemedBlue).orElse(R.color.yt_dark_blue), R.drawable.tooltip_button_background);
        this.d = new aklb(zhn.j(context, R.attr.ytTextPrimaryInverse).orElse(R.color.yt_white1), 0);
    }

    private final View.OnClickListener c(final argd argdVar) {
        return new View.OnClickListener() { // from class: akkw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aklc aklcVar = aklc.this;
                argd argdVar2 = argdVar;
                if ((argdVar2.b & 16) != 0) {
                    Map f = actk.f(argdVar2);
                    aafo aafoVar = aklcVar.b;
                    apzg apzgVar = argdVar2.g;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, f);
                }
                if ((argdVar2.b & 32) != 0) {
                    Map h = actk.h(argdVar2, false);
                    aafo aafoVar2 = aklcVar.b;
                    apzg apzgVar2 = argdVar2.h;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar2.c(apzgVar2, h);
                }
            }
        };
    }

    private final void d(argj argjVar, Object obj) {
        this.f.add(new Pair(argjVar, obj));
        String f = f(argjVar);
        this.e.edit().putLong(f, this.e.getLong(f, 0L) + 1).apply();
        if (this.b == null || argjVar.j.size() == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", argjVar);
        for (apzg apzgVar : argjVar.j) {
            this.b.c(apzgVar, hashMap);
        }
    }

    private final aklb e(arge argeVar) {
        if (argeVar == null) {
            return null;
        }
        int ac = akel.ac(argeVar.b);
        if (ac == 0) {
            ac = 1;
        }
        int i = ac - 1;
        if (i == 1) {
            return this.c;
        }
        if (i == 2) {
            return this.d;
        }
        return null;
    }

    private static final String f(argj argjVar) {
        String valueOf = String.valueOf(argjVar.c);
        return valueOf.length() != 0 ? etk.HINT_ID_PREFIX.concat(valueOf) : new String(etk.HINT_ID_PREFIX);
    }

    public final boolean a(View view) {
        return view.getGlobalVisibleRect(this.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.argj r13, android.view.View r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklc.b(argj, android.view.View, java.lang.Object):void");
    }
}
