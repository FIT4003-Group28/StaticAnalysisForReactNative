package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: andu  reason: default package */
/* loaded from: classes.dex */
public final class andu extends andv implements Serializable {
    private static final long serialVersionUID = 0;
    public final int a;

    public andu(int i) {
        this.a = i;
    }

    @Override // defpackage.andv
    public final int a() {
        return this.a;
    }

    @Override // defpackage.andv
    public final boolean b(andv andvVar) {
        return this.a == andvVar.a();
    }

    @Override // defpackage.andv
    public final byte[] c() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    @Override // defpackage.andv
    public final void d() {
    }
}
