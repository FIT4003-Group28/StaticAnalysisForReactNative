package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: zhw  reason: default package */
/* loaded from: classes7.dex */
public class zhw implements zcr {
    private final dcdc<zfq> a;

    public zhw(amub amubVar, Context context, cqat cqatVar, @dzsi zfc zfcVar, boolean z) {
        SpannableString spannableString;
        Spannable spannable;
        int i;
        dccx dccxVar = new dccx();
        int[] C = amubVar.C(dcyn.a);
        int[] aA = amubVar.aA();
        int i2 = 0;
        while (i2 < amubVar.ai()) {
            amvh amvhVar = amubVar.o[i2];
            SpannableString spannableString2 = new SpannableString("");
            boolean z2 = true;
            if (i2 <= 0 || i2 - 1 >= C.length) {
                spannableString = spannableString2;
                spannable = null;
            } else {
                dpej O = amubVar.O(i);
                int i3 = i2 > 1 ? C[i] - C[i2 - 2] : C[i];
                Resources resources = context.getResources();
                bvsx bvsxVar = new bvsx(resources);
                bvsw bvswVar = new bvsw();
                bvswVar.c();
                Spanned f = bvtb.f(resources, i3, bvsz.ABBREVIATED, bvswVar);
                int h = vyb.h(resources, O, z);
                bvsv a = bvsxVar.a(f);
                a.l(h);
                Spannable c = a.c();
                long seconds = aA[i] + TimeUnit.MILLISECONDS.toSeconds(cqatVar.b());
                doup doupVar = amubVar.d.a.e.get(i).d;
                doupVar = doupVar == null ? doup.e : doupVar;
                spannable = c;
                spannableString = new SpannableString(bvta.a(context, seconds, TimeZone.getTimeZone(doupVar.b), doupVar.c).a);
            }
            boolean z3 = i2 > 0 && (amvhVar.y || vyr.f(amubVar.o));
            if (i2 != amubVar.ai() - 1) {
                z2 = false;
            }
            dccxVar.g(new zsi(i2, context, z2, amvhVar.k(), z3, amvhVar.p(), spannable, spannableString, zfcVar, null, null));
            i2++;
        }
        this.a = dccxVar.f();
        amubVar.N();
    }

    @Override // defpackage.zcr
    public dcdc<zfq> a() {
        return this.a;
    }
}
