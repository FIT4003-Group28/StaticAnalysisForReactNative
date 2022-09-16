package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: cnjz  reason: default package */
/* loaded from: classes.dex */
public final class cnjz {
    public static final cnoa<cnky> a;
    public static final cnnp<cnky, cnnv> b;
    @Deprecated
    public static final Api<cnnv> c;
    public static final String[] d;
    public static final List<cnju> e;
    public static volatile int f;
    public final Context g;
    public final String h;
    public final boolean i;
    public final cnjw j;
    public final List<cnju> k;
    public String l;
    public int m;
    public String n;
    public final cnxn o;
    public int p;
    public final cnkx q;

    static {
        cnoa<cnky> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cnjs cnjsVar = new cnjs();
        b = cnjsVar;
        c = new Api<>("ClearcutLogger.API", cnjsVar, cnoaVar);
        d = new String[0];
        e = new CopyOnWriteArrayList();
        f = -1;
    }

    public cnjz(Context context, String str, String str2, boolean z, cnkx cnkxVar, cnxn cnxnVar, cnjy cnjyVar, cnjw cnjwVar) {
        this.k = new CopyOnWriteArrayList();
        boolean z2 = true;
        this.p = 1;
        this.g = context.getApplicationContext();
        this.h = context.getPackageName();
        this.m = -1;
        this.l = str;
        this.n = str2;
        this.i = z;
        this.q = cnkxVar;
        this.o = cnxnVar;
        this.p = 1;
        this.j = cnjwVar;
        if (z) {
            cnwc.e(str2 != null ? false : z2, "can't be deidentified with an upload account");
        }
    }

    @Deprecated
    public static cnjz a(Context context, String str) {
        return new cnjz(context, str, null, true, cnkx.b(context), cnxn.a, null, new cnlh(context));
    }

    public static int[] b(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = arrayList.get(i).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    public static String c(Iterable<?> iterable) {
        return dbrz.e(", ").g(iterable);
    }

    public final cnjv d(byte[] bArr) {
        return new cnjv(this, bArr != null ? dspd.x(bArr) : null, null);
    }

    public final cnjv e(cnjx cnjxVar) {
        return new cnjv(this, cnjxVar);
    }

    public cnjz(Context context, String str, String str2) {
        this(context, str, str2, false, cnkx.b(context), cnxn.a, null, new cnlh(context));
    }
}
