package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: tag  reason: default package */
/* loaded from: classes4.dex */
public final class tag {
    private static final tag b = new tag(tea.a);
    public final byte[] a;

    public tag(byte[] bArr) {
        this.a = bArr;
    }

    public static tag a(tet tetVar) {
        try {
            aoog N = aoog.N(tetVar.e());
            if (N.E()) {
                return b;
            }
            N.n();
            return new tag(N.H());
        } catch (IOException e) {
            throw new ted("Error reading extension from model", e);
        }
    }

    public final tet b(int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            aool aj = aool.aj(byteArrayOutputStream);
            aj.m(i, this.a);
            aj.i();
            return tet.b(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new ted("Error adding extension to model", e);
        }
    }
}
