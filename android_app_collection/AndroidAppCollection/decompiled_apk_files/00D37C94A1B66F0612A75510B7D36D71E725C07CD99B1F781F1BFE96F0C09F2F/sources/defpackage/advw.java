package defpackage;

import android.content.SharedPreferences;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: advw  reason: default package */
/* loaded from: classes.dex */
public final class advw {
    public static final String a = zep.a("MDX.UserProfile");
    public final ankt b;
    public final int[] c;
    public final int[] d;
    public final advr e;
    public final azpm f = azpm.e();
    public final snc g;
    public final SharedPreferences h;

    public advw(advr advrVar, snc sncVar, SharedPreferences sharedPreferences) {
        ankt anktVar;
        int[] iArr = new int[28];
        this.c = iArr;
        int[] iArr2 = new int[28];
        this.d = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.e = advrVar;
        this.g = sncVar;
        this.h = sharedPreferences;
        awub awubVar = (awub) ((yve) advrVar.c.get()).c();
        if (awubVar == null) {
            anktVar = ankq.a;
        } else {
            ampq j = (awubVar.b & 2) != 0 ? amon.a : ampq.j(Long.valueOf(advrVar.d.c()));
            if ((awubVar.b & 4) != 0) {
                advrVar.g = awubVar.g;
                if (awubVar.e.size() > 0) {
                    advr.d(awubVar.e, advrVar.e);
                } else {
                    zep.c(advr.a, "No connection count stats in the preferences");
                }
                if (awubVar.f.size() > 0) {
                    advr.d(awubVar.f, advrVar.f);
                } else {
                    zep.c(advr.a, "No cast available session count stats in the preferences");
                }
                if (advrVar.g()) {
                    advrVar.f(advrVar.e, advrVar.f, 0, j);
                    anktVar = ankq.a;
                }
            } else if (j.h()) {
                ylx.m(((yve) advrVar.c.get()).b(new advq(j)), adkd.n);
            }
            anktVar = ankq.a;
        }
        this.b = anktVar;
        System.arraycopy(advrVar.e, 0, iArr, 0, 28);
        System.arraycopy(advrVar.f, 0, iArr2, 0, 28);
        b();
    }

    public static final int d(int[] iArr, int i) {
        int i2 = 1;
        if (i != 0) {
            i2 = i != 1 ? 28 : 7;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final ankt a(final adii adiiVar) {
        return anii.i(this.b, new anir() { // from class: advv
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
                r2 = r8.intValue();
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
            @Override // defpackage.anir
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final defpackage.ankt a(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 226
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.advv.a(java.lang.Object):ankt");
            }
        }, anjk.a);
    }

    public final void b() {
        this.f.c(this);
    }

    public final void c() {
        ylx.i(this.b, new advu(this, 1));
    }
}
