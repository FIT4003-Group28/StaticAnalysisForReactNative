package defpackage;

import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: copx  reason: default package */
/* loaded from: classes5.dex */
public class copx extends cntp {
    public copx(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String j(String str, String str2) {
        return (!G(str) || M(str)) ? str2 : K(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] k(String str) {
        if (!G(str) || M(str)) {
            return null;
        }
        return L(str);
    }

    public final float l(String str) {
        if (!G(str) || M(str)) {
            return -1.0f;
        }
        DataHolder dataHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        dataHolder.b(str, i);
        return dataHolder.d[i2].getFloat(i, dataHolder.c.getInt(str));
    }
}
