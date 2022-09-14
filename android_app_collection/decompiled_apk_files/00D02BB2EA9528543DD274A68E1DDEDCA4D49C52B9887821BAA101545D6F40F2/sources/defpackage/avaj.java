package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: avaj  reason: default package */
/* loaded from: classes2.dex */
final class avaj {
    public static final void a(byte[] bArr, OutputStream outputStream) {
        dluz bZ = dlva.d.bZ();
        bZ.b(dspd.x(bArr));
        outputStream.write(bZ.bK().bS());
    }

    public static final void b(OutputStream outputStream) {
        outputStream.close();
    }
}
