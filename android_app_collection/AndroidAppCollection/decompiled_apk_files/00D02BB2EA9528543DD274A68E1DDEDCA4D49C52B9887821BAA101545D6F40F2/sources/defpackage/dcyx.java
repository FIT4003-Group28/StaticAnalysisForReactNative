package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcyx  reason: default package */
/* loaded from: classes.dex */
final class dcyx extends dcyz implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;

    public dcyx(int i) {
        this.a = i;
    }

    @Override // defpackage.dcyz
    public final int a() {
        return 32;
    }

    @Override // defpackage.dcyz
    public final byte[] b() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    @Override // defpackage.dcyz
    public final int c() {
        return this.a;
    }

    @Override // defpackage.dcyz
    public final long d() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // defpackage.dcyz
    public final boolean f(dcyz dcyzVar) {
        return this.a == dcyzVar.c();
    }
}
