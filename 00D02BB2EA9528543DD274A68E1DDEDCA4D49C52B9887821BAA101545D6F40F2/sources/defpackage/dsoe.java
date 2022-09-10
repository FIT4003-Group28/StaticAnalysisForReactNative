package defpackage;

import defpackage.dsod;
import defpackage.dsoe;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: dsoe  reason: default package */
/* loaded from: classes.dex */
public abstract class dsoe<MessageType extends dsoe<MessageType, BuilderType>, BuilderType extends dsod<MessageType, BuilderType>> implements dssj {
    public int bC = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final dstw bX() {
        return new dstw();
    }

    @Override // defpackage.dssj
    public final dspd bR() {
        try {
            dsoy M = dspd.M(cb());
            Pv(M.a);
            return M.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // defpackage.dssj
    public final byte[] bS() {
        try {
            byte[] bArr = new byte[cb()];
            dspp D = dspp.D(bArr);
            Pv(D);
            D.an();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // defpackage.dssj
    public final void bT(OutputStream outputStream) {
        dspp C = dspp.C(outputStream, dspp.A(cb()));
        Pv(C);
        C.y();
    }

    @Override // defpackage.dssj
    public final void bU(OutputStream outputStream) {
        int cb = cb();
        dspp C = dspp.C(outputStream, dspp.A(dspp.aa(cb) + cb));
        C.s(cb);
        Pv(C);
        C.y();
    }

    public int bV() {
        throw null;
    }

    public void bW(int i) {
        throw null;
    }
}
