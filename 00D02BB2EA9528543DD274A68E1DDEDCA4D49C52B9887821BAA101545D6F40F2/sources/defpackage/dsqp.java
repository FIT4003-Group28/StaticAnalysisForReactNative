package defpackage;

import defpackage.dsqp;
import defpackage.dsqw;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: dsqp  reason: default package */
/* loaded from: classes.dex */
public class dsqp<MessageType extends dsqw<MessageType, BuilderType>, BuilderType extends dsqp<MessageType, BuilderType>> extends dsod<MessageType, BuilderType> {
    public final MessageType a;
    public MessageType b;
    public boolean c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public dsqp(MessageType messagetype) {
        this.a = messagetype;
        this.b = (MessageType) messagetype.cu(4);
    }

    private static final void a(MessageType messagetype, MessageType messagetype2) {
        dsst.a.b(messagetype).d(messagetype, messagetype2);
    }

    @Override // defpackage.dssk
    public final boolean Qv() {
        throw null;
    }

    @Override // defpackage.dssk
    public final /* bridge */ /* synthetic */ dssj Qw() {
        return this.a;
    }

    @Override // defpackage.dsod
    public final /* bridge */ /* synthetic */ dsod bB(byte[] bArr, int i) {
        bO(bArr, 0, i);
        return this;
    }

    @Override // defpackage.dsod
    public final /* bridge */ /* synthetic */ void bE(byte[] bArr, int i, dsqa dsqaVar) {
        bN(bArr, 0, i, dsqaVar);
    }

    public void bF() {
        MessageType messagetype = (MessageType) this.b.cu(4);
        a(messagetype, this.b);
        this.b = messagetype;
    }

    @Override // defpackage.dsod
    /* renamed from: bG */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.a.cu(5);
        buildertype.bC(bJ());
        return buildertype;
    }

    @Override // defpackage.dssi
    /* renamed from: bH */
    public MessageType bJ() {
        if (this.c) {
            return this.b;
        }
        MessageType messagetype = this.b;
        dsst.a.b(messagetype).j(messagetype);
        this.c = true;
        return this.b;
    }

    @Override // defpackage.dssi
    /* renamed from: bI */
    public final MessageType bK() {
        MessageType bJ = bJ();
        if (bJ.Qv()) {
            return bJ;
        }
        throw new dstw();
    }

    @Override // defpackage.dsod
    /* renamed from: bL */
    public final void bA(dspj dspjVar, dsqa dsqaVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        try {
            dsst.a.b(this.b).f(this.b, dspk.n(dspjVar), dsqaVar);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    @Override // defpackage.dsod
    /* renamed from: bM */
    public final void bC(MessageType messagetype) {
        if (this.c) {
            bF();
            this.c = false;
        }
        a(this.b, messagetype);
    }

    public final void bN(byte[] bArr, int i, int i2, dsqa dsqaVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        try {
            dsst.a.b(this.b).i(this.b, bArr, i, i + i2, new dsol(dsqaVar));
        } catch (dsrm e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw dsrm.a();
        }
    }

    public final void bO(byte[] bArr, int i, int i2) {
        bN(bArr, i, i2, dsqa.b());
    }
}
