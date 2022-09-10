package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: myg  reason: default package */
/* loaded from: classes7.dex */
public class myg {
    private final Context a;
    private final bvsl b;
    private final cqat c;

    public myg(Context context, bvsl bvslVar, cqat cqatVar) {
        this.a = context;
        this.b = bvslVar;
        this.c = cqatVar;
    }

    public final mzl a(amub amubVar) {
        amua amuaVar;
        String str;
        bvsz bvszVar;
        dpej O = amubVar.O(0);
        int B = amubVar.B(dcyn.a);
        int G = amubVar.G();
        dowa dowaVar = amubVar.I;
        if (!dbsj.d(amubVar.p)) {
            str = amubVar.p;
        } else {
            Context context = this.a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            float f = 0.0f;
            String str2 = null;
            String str3 = null;
            for (int i = 0; i < amubVar.h() - 1; i++) {
                amup b = amubVar.o(i).b();
                if (b != null && b.c() != null) {
                    float f2 = amubVar.o(i + 1).k;
                    if (f2 > f) {
                        str2 = b.c();
                        str3 = b.d();
                        f = f2;
                    }
                    if (f2 > G * 0.25f && !arrayList.contains(b.c())) {
                        arrayList.add(b.c());
                        arrayList2.add(b.d());
                    }
                }
            }
            if (arrayList.size() > 1) {
                String string = context.getString(R.string.DA_VIA_NAME_SEPARATOR);
                String string2 = context.getString(R.string.DA_SPEECH_VIA_NAME_SEPARATOR);
                String join = TextUtils.join(string, arrayList);
                TextUtils.join(string2, arrayList2);
                amuaVar = new amua(join);
            } else if (str2 != null) {
                dbsk.s(str3);
                amuaVar = new amua(str2);
            } else {
                amuaVar = new amua(context.getString(R.string.DA_UNNAMED_ROAD));
            }
            str = amuaVar.a;
        }
        bvsl bvslVar = this.b;
        Resources resources = this.a.getResources();
        int max = Math.max(B, 60);
        if (B < TimeUnit.HOURS.toSeconds(1L)) {
            bvszVar = bvsz.ABBREVIATED;
        } else {
            bvszVar = bvsz.ABBREVIATED_SHORT;
        }
        return mzl.b(new mzh(bvtb.f(resources, max, bvszVar, new bvsw()).toString(), bvslVar.c(G, dowaVar, true, true).toString(), !dbsj.d(str) ? resources.getString(R.string.VIA_ROADS, str) : "", O));
    }

    public final dcdc<mzj> b(amub amubVar) {
        eaou i;
        dccx F = dcdc.F();
        int[] C = amubVar.C(dcyn.a);
        amvh[] amvhVarArr = amubVar.o;
        int i2 = 1;
        while (true) {
            int length = amvhVarArr.length;
            if (i2 < length) {
                amvh amvhVar = amvhVarArr[i2];
                int i3 = i2 - 1;
                doup doupVar = amubVar.d.a.e.get(i3).d;
                if (doupVar == null) {
                    doupVar = doup.e;
                }
                long b = C[i3] + (this.c.b() / 1000);
                if (eaou.c.contains(doupVar.b)) {
                    i = eaou.j(doupVar.b);
                } else {
                    i = eaou.i();
                }
                F.g(mzj.g(i3, amvhVar.p(), null, bvta.a(this.a, b, i.s(), doupVar.c).a.toString(), kob.a, i2 == length + (-1)));
                i2++;
            } else {
                return F.f();
            }
        }
    }
}
