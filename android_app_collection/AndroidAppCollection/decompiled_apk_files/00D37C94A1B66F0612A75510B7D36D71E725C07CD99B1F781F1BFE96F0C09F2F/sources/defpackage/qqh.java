package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: qqh  reason: default package */
/* loaded from: classes4.dex */
public final class qqh {
    @Deprecated
    public static final qso a;
    public static final String[] b;
    public static final List c;
    public static volatile int d;
    public static final twx n;
    public static final tzc o;
    public final Context e;
    public final String f;
    public final EnumSet g;
    public final qqf h;
    public final List i;
    public String j;
    public String k;
    public int l;
    final qql m;

    static {
        twx twxVar = new twx();
        n = twxVar;
        qqd qqdVar = new qqd();
        o = qqdVar;
        a = new qso("ClearcutLogger.API", qqdVar, twxVar, null, null, null);
        b = new String[0];
        c = new CopyOnWriteArrayList();
        d = -1;
    }

    public qqh(Context context, String str, String str2) {
        this(context, str, str2, qqg.e, qql.b(context), new qqp(context));
    }

    public static qqh b(Context context, String str) {
        return new qqh(context, str, null, qqg.f, qql.b(context), new qqp(context));
    }

    public static String c(Iterable iterable) {
        return ampm.b(", ").d(iterable);
    }

    public static int[] e(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    public final qqe a(byte[] bArr) {
        return new qqe(this, bArr != null ? aoob.x(bArr) : null, null);
    }

    public final boolean d() {
        return this.g.equals(qqg.f);
    }

    public qqh(Context context, String str, String str2, EnumSet enumSet, qql qqlVar, qqf qqfVar) {
        this.i = new CopyOnWriteArrayList();
        this.l = 1;
        if (!enumSet.contains(qqg.ACCOUNT_NAME)) {
            qnm.d(str2 == null, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        if (enumSet.equals(qqg.g) || enumSet.equals(qqg.e) || enumSet.equals(qqg.f)) {
            this.e = context.getApplicationContext();
            this.f = context.getPackageName();
            this.j = str;
            this.k = str2;
            this.g = enumSet;
            this.m = qqlVar;
            this.l = 1;
            this.h = qqfVar;
            return;
        }
        throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or PIILevel.DEIDENTIFIED");
    }
}
