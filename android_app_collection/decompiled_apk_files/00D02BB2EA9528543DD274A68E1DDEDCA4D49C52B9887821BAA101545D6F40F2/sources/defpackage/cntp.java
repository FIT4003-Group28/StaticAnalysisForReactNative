package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cntp  reason: default package */
/* loaded from: classes5.dex */
public class cntp {
    public final DataHolder a;
    public final int b;
    public final int c;

    public cntp(DataHolder dataHolder, int i) {
        cnwc.a(dataHolder);
        this.a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.h) {
            z = true;
        }
        cnwc.b(z);
        this.b = i;
        this.c = dataHolder.e(i);
    }

    public boolean F() {
        throw null;
    }

    public final boolean G(String str) {
        return this.a.c.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long H(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.b(str, i);
        return dataHolder.d[i2].getLong(i, dataHolder.c.getInt(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int I(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.b(str, i);
        return dataHolder.d[i2].getInt(i, dataHolder.c.getInt(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean J(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.b(str, i);
        return Long.valueOf(dataHolder.d[i2].getLong(i, dataHolder.c.getInt(str))).longValue() == 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String K(String str) {
        return this.a.c(str, this.b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] L(String str) {
        return this.a.d(str, this.b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean M(String str) {
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.b(str, i);
        return dataHolder.d[i2].isNull(i, dataHolder.c.getInt(str));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cntp) {
            cntp cntpVar = (cntp) obj;
            if (cnvv.a(Integer.valueOf(cntpVar.b), Integer.valueOf(this.b)) && cnvv.a(Integer.valueOf(cntpVar.c), Integer.valueOf(this.c)) && cntpVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
