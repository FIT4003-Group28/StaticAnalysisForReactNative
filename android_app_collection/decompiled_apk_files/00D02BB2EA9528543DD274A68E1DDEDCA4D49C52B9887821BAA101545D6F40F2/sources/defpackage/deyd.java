package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: deyd  reason: default package */
/* loaded from: classes6.dex */
final class deyd {
    @dzsi
    final InputStream a = null;
    @dzsi
    final byte[] b;
    final int c;
    final boolean d;

    public deyd(byte[] bArr, int i, boolean z) {
        this.b = bArr;
        this.c = i;
        this.d = z;
    }

    public final String toString() {
        int i = this.c;
        String str = true != this.d ? "]" : "(last)]";
        StringBuilder sb = new StringBuilder(str.length() + 34);
        sb.append("TransactionData[");
        sb.append(i);
        sb.append("b ");
        sb.append("array");
        sb.append(str);
        return sb.toString();
    }
}
