package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: qwf  reason: default package */
/* loaded from: classes4.dex */
public final class qwf {
    public final DataHolder a;
    public int b;
    public int c;

    public qwf(DataHolder dataHolder, int i) {
        int length;
        this.a = dataHolder;
        boolean z = true;
        int i2 = 0;
        qnm.j(i >= 0 && i < dataHolder.h);
        this.b = i;
        qnm.j((i < 0 || i >= dataHolder.h) ? false : z);
        while (true) {
            int[] iArr = dataHolder.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        this.c = i2 == length ? i2 - 1 : i2;
    }

    protected final String a(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.d[i2].getString(i, dataHolder.c.getInt(str));
    }

    public final String b() {
        return a("gaia_id");
    }

    public final String c() {
        return a("account_name");
    }

    public final String d() {
        return rta.a.a(a("avatar"));
    }

    public final String e() {
        return !TextUtils.isEmpty(a("display_name")) ? a("display_name") : c();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qwf) {
            qwf qwfVar = (qwf) obj;
            if (tnk.j(Integer.valueOf(qwfVar.b), Integer.valueOf(this.b)) && tnk.j(Integer.valueOf(qwfVar.c), Integer.valueOf(this.c)) && qwfVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return h() ? a("family_name") : "null";
    }

    public final String g() {
        return i() ? a("given_name") : "null";
    }

    public final boolean h() {
        return !TextUtils.isEmpty(a("family_name"));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }

    public final boolean i() {
        return !TextUtils.isEmpty(a("given_name"));
    }
}
