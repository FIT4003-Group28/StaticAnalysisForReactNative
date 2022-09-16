package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: psi  reason: default package */
/* loaded from: classes4.dex */
public abstract class psi extends pnb implements psl {
    private final String a;

    /* JADX INFO: Access modifiers changed from: protected */
    public psi(String str) {
        super(new psn[2], new pso[2]);
        this.a = str;
        p(1024);
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmt a(Throwable th) {
        return new psm("Unexpected decode error", th);
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmt b(pmv pmvVar, pmz pmzVar, boolean z) {
        psn psnVar = (psn) pmvVar;
        pso psoVar = (pso) pmzVar;
        try {
            ByteBuffer byteBuffer = psnVar.d;
            ptx.a(byteBuffer);
            psoVar.e(psnVar.f, g(byteBuffer.array(), byteBuffer.limit(), z), psnVar.a);
            psoVar.clearFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            return null;
        } catch (psm e) {
            return e;
        }
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmv c() {
        return new psn();
    }

    @Override // defpackage.pnb
    protected final /* bridge */ /* synthetic */ pmz d() {
        return new psj(new pmy() { // from class: psh
            @Override // defpackage.pmy
            public final void a(pmz pmzVar) {
                psi.this.o((pso) pmzVar);
            }
        });
    }

    @Override // defpackage.pmr
    public final String e() {
        return this.a;
    }

    protected abstract psk g(byte[] bArr, int i, boolean z);

    @Override // defpackage.psl
    public final void r(long j) {
    }
}
