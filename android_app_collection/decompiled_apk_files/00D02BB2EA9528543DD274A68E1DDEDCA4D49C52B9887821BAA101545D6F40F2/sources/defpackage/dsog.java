package defpackage;

import defpackage.dssj;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dsog  reason: default package */
/* loaded from: classes.dex */
public abstract class dsog<MessageType extends dssj> implements dssr<MessageType> {
    private static final dsqa a = dsqa.b();

    private static final void p(MessageType messagetype) {
        dstw bX;
        if (messagetype == null || messagetype.Qv()) {
            return;
        }
        if (messagetype instanceof dsoe) {
            dsoe dsoeVar = (dsoe) messagetype;
            bX = dsoe.bX();
        } else if (messagetype instanceof dsof) {
            dsof dsofVar = (dsof) messagetype;
            throw null;
        } else {
            bX = new dstw();
        }
        throw bX.a();
    }

    public MessageType a(byte[] bArr, int i, int i2, dsqa dsqaVar) {
        throw null;
    }

    @Override // defpackage.dssr
    /* renamed from: b */
    public final MessageType k(byte[] bArr, int i, int i2, dsqa dsqaVar) {
        MessageType a2 = a(bArr, i, i2, dsqaVar);
        p(a2);
        return a2;
    }

    @Override // defpackage.dssr
    /* renamed from: c */
    public final MessageType i(byte[] bArr, dsqa dsqaVar) {
        return k(bArr, 0, bArr.length, dsqaVar);
    }

    public final MessageType d(InputStream inputStream, dsqa dsqaVar) {
        dspj I = dspj.I(inputStream);
        MessageType messagetype = (MessageType) o(I, dsqaVar);
        try {
            I.b(0);
            return messagetype;
        } catch (dsrm e) {
            throw e;
        }
    }

    @Override // defpackage.dssr
    /* renamed from: e */
    public final MessageType g(InputStream inputStream, dsqa dsqaVar) {
        MessageType d = d(inputStream, dsqaVar);
        p(d);
        return d;
    }

    @Override // defpackage.dssr
    public final /* bridge */ /* synthetic */ Object f(InputStream inputStream) {
        dsqa dsqaVar = a;
        try {
            int read = inputStream.read();
            MessageType d = read == -1 ? null : d(new dsoc(inputStream, dspj.N(read, inputStream)), dsqaVar);
            p(d);
            return d;
        } catch (IOException e) {
            throw new dsrm(e);
        }
    }

    @Override // defpackage.dssr
    public final /* bridge */ /* synthetic */ Object h(InputStream inputStream) {
        return g(inputStream, a);
    }

    @Override // defpackage.dssr
    public final /* bridge */ /* synthetic */ Object j(byte[] bArr) {
        return i(bArr, a);
    }

    @Override // defpackage.dssr
    public final /* bridge */ /* synthetic */ Object l(dspd dspdVar) {
        dsqa dsqaVar = a;
        try {
            dspj s = dspdVar.s();
            dssj dssjVar = (dssj) o(s, dsqaVar);
            try {
                s.b(0);
                p(dssjVar);
                return dssjVar;
            } catch (dsrm e) {
                throw e;
            }
        } catch (dsrm e2) {
            throw e2;
        }
    }

    @Override // defpackage.dssr
    public final /* bridge */ /* synthetic */ Object m(ByteBuffer byteBuffer) {
        dsqa dsqaVar = a;
        try {
            dspj K = dspj.K(byteBuffer);
            dssj dssjVar = (dssj) o(K, dsqaVar);
            try {
                K.b(0);
                p(dssjVar);
                return dssjVar;
            } catch (dsrm e) {
                throw e;
            }
        } catch (dsrm e2) {
            throw e2;
        }
    }

    @Override // defpackage.dssr
    public final /* bridge */ /* synthetic */ Object n(dspj dspjVar, dsqa dsqaVar) {
        dssj dssjVar = (dssj) o(dspjVar, dsqaVar);
        p(dssjVar);
        return dssjVar;
    }
}
