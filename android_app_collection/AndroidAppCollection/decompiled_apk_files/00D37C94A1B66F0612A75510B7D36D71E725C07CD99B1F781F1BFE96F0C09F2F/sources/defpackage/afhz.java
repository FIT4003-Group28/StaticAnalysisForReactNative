package defpackage;

import java.io.UnsupportedEncodingException;
/* compiled from: PG */
/* renamed from: afhz  reason: default package */
/* loaded from: classes.dex */
public final class afhz {
    public static final afhz a = new afhz(new byte[]{116, 101, 115, 116});
    public final byte[] b;

    public afhz(byte[] bArr) {
        this.b = bArr;
    }

    public final String toString() {
        try {
            return new String(this.b, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(this.b);
        }
    }
}
