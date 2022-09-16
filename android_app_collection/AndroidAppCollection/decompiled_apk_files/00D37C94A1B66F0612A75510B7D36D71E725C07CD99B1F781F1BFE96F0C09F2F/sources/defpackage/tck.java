package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tck  reason: default package */
/* loaded from: classes4.dex */
public final class tck {
    public static Drawable a(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static ampq b(awny awnyVar) {
        for (int i = 0; i < awnyVar.c.size(); i++) {
            awoa awoaVar = (awoa) awnyVar.c.get(i);
            if (awoaVar.c == 2) {
                return ampq.j(((aoob) awoaVar.d).I());
            }
        }
        return amon.a;
    }

    public static ampq c(aodt aodtVar) {
        for (int i = 0; i < aodtVar.aa(); i++) {
            axnb ab = aodtVar.ab(i);
            int b = ab.b(6);
            if (b != 0 && ab.d(b) != 0) {
                ByteBuffer i2 = ab.i(6);
                byte[] bArr = new byte[i2.remaining()];
                i2.get(bArr);
                return ampq.j(bArr);
            }
        }
        return amon.a;
    }

    public static ayoi d(tag tagVar, int i, amup amupVar, tdb tdbVar, ayoi ayoiVar) {
        if (!amupVar.isEmpty()) {
            try {
                amum h = amup.h();
                HashMap hashMap = new HashMap();
                aoog O = aoog.O(tagVar.a);
                while (!O.E()) {
                    int n = O.n();
                    int a = aosl.a(n);
                    if (aosl.b(n) == 2) {
                        hashMap.put(Integer.valueOf(a), O.H());
                    } else {
                        O.G(n);
                    }
                }
                amzs it = amupVar.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    byte[] bArr = (byte[]) hashMap.get(Integer.valueOf(((Integer) entry.getValue()).intValue()));
                    if (bArr == null) {
                        bArr = tea.a;
                    }
                    h.f(str, bArr);
                }
                amup b = h.b();
                amvn<String> keySet = amupVar.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                for (String str2 : keySet) {
                    fcr fcrVar = new fcr(str2, 10);
                    if (ayoiVar == null || !"/environment".equals(str2)) {
                        arrayList.add(tdbVar.a(str2).V(fcrVar));
                    } else {
                        arrayList.add(ayoiVar.V(ona.f).V(fcrVar));
                    }
                }
                return ayoi.l(arrayList, new tan(b, 1)).V(new taf(i, amupVar, tagVar));
            } catch (IOException e) {
                throw new ted("Failed to process default model", e);
            }
        }
        return azpm.aI(tagVar.b(i));
    }

    public static int e(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    public static void f(tda tdaVar) {
        awoc c = tdaVar.c();
        tee b = tdaVar.b();
        if (b == null || c == null) {
            return;
        }
        b.a(c, 3);
    }

    public static void g(View view, tcu tcuVar, awmt awmtVar, tdz tdzVar, tdq tdqVar, awoj awojVar) {
        tcq a = tcs.a();
        a.a = view;
        a.h = tdzVar;
        a.f = tdqVar;
        if (awojVar != null) {
            aopa createBuilder = awom.a.createBuilder();
            createBuilder.copyOnWrite();
            awom awomVar = (awom) createBuilder.instance;
            awomVar.d = awojVar;
            awomVar.c |= 1;
            aopc aopcVar = (aopc) awon.a.createBuilder();
            aopcVar.e(awom.b, (awom) createBuilder.mo39build());
            a.e = (awon) aopcVar.mo39build();
        }
        tcuVar.b(awmtVar, a.a()).Q();
    }
}
