package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bzyr  reason: default package */
/* loaded from: classes4.dex */
public class bzyr implements bzyx {
    dbsg<Integer> a = dbpy.a;
    int b = 0;
    private final float c;
    private final String d;
    private final String e;
    private final String f;
    private final int g;
    private final String h;

    public bzyr(float f, String str, int i, String str2, String str3, String str4, String str5) {
        this.c = f;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.h = str2;
        this.g = i;
    }

    public static bzyx l(Resources resources, dqvy dqvyVar, String str, int i, boolean z) {
        float f;
        String str2;
        int i2 = dqvyVar.a;
        if ((i2 & 64) != 0) {
            int i3 = dqvyVar.b;
            int i4 = dqvyVar.e;
            f = (i3 - i4) / (dqvyVar.f - i4);
        } else {
            f = 1.0f;
        }
        String format = (!z || (i2 & 32) == 0) ? "" : String.format(Locale.getDefault(), "%,d", Integer.valueOf(dqvyVar.e));
        String format2 = (!z || (dqvyVar.a & 64) == 0) ? "" : String.format(Locale.getDefault(), "%,d", Integer.valueOf(dqvyVar.f));
        String quantityString = i > 0 ? resources.getQuantityString(R.plurals.LOCAL_GUIDES_POINTS_DESCRIPTION, i, Integer.valueOf(i)) : "";
        if (!format2.isEmpty()) {
            int i5 = dqvyVar.f - i;
            str2 = resources.getQuantityString(R.plurals.LOCAL_GUIDES_POINTS_TO_NEXT_LEVEL_DESCRIPTION, i5, Integer.valueOf(i5), Integer.valueOf(dqvyVar.d + 1));
        } else {
            str2 = "";
        }
        return new bzyr(f, str, i, quantityString, format, format2, str2);
    }

    public static bzyr m() {
        return new bzyr(0.0f, "", 0, "", "", "", "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r5 != false) goto L10;
     */
    @Override // defpackage.bzyx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean a(int r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r5 <= 0) goto L18
            dbsg<java.lang.Integer> r2 = r3.a
            boolean r2 = r2.a()
            if (r2 != 0) goto L18
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            dbsg r5 = defpackage.dbsg.i(r5)
            r3.a = r5
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            if (r4 <= 0) goto L22
            int r2 = r3.b
            if (r4 == r2) goto L22
            r3.b = r4
            goto L24
        L22:
            if (r5 == 0) goto L5a
        L24:
            dbsg<java.lang.Integer> r4 = r3.a
            boolean r4 = r4.a()
            if (r4 == 0) goto L5a
            int r4 = r3.b
            float r4 = (float) r4
            float r5 = r3.c
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)
            dbsg<java.lang.Integer> r5 = r3.a
            java.lang.Object r5 = r5.b()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r5 / 2
            if (r4 > r5) goto L48
            goto L55
        L48:
            int r1 = r3.b
            int r1 = r1 - r5
            if (r4 < r1) goto L55
            dbsg<java.lang.Integer> r4 = r3.a
            java.lang.Object r4 = r4.b()
            java.lang.Integer r4 = (java.lang.Integer) r4
        L55:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L5a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzyr.a(int, int):java.lang.Boolean");
    }

    @Override // defpackage.bzyx
    public String b() {
        StringBuilder sb = new StringBuilder();
        if (this.g > 0) {
            sb.append(String.format(Locale.getDefault(), "%,d", Integer.valueOf(this.g)));
            if (!e().isEmpty()) {
                sb.append("/");
            }
        }
        return sb.toString();
    }

    @Override // defpackage.bzyx
    public String c() {
        return this.h;
    }

    @Override // defpackage.bzyx
    public String d() {
        return this.d;
    }

    @Override // defpackage.bzyx
    public String e() {
        return this.e;
    }

    @Override // defpackage.bzyx
    public String f() {
        return this.f;
    }

    @Override // defpackage.bzyx
    public Boolean g() {
        boolean z = true;
        if (this.d.isEmpty() && this.e.isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bzyx
    public Float h() {
        return Float.valueOf(this.c);
    }

    @Override // defpackage.bzyx
    public Float i() {
        return Float.valueOf(1.0f - this.c);
    }

    @Override // defpackage.bzyx
    public Integer j() {
        return 10000;
    }

    @Override // defpackage.bzyx
    public Integer k() {
        return Integer.valueOf(Math.round(this.c * 10000.0f));
    }
}
