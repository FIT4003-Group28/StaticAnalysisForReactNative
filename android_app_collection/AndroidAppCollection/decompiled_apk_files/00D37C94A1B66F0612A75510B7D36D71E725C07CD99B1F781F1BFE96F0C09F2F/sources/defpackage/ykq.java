package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
/* compiled from: PG */
/* renamed from: ykq  reason: default package */
/* loaded from: classes4.dex */
final class ykq extends ykr {
    private static ykq c;

    private ykq() {
    }

    public static ykr f() {
        if (c == null) {
            ykq ykqVar = new ykq();
            ykqVar.n(qrj.b);
            c = ykqVar;
        }
        return c;
    }

    @Override // defpackage.ykr
    protected final Object g(BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // defpackage.ykr
    protected final void h() {
    }

    @Override // defpackage.ykr
    protected final void i(Object obj, BufferedOutputStream bufferedOutputStream) {
    }
}
