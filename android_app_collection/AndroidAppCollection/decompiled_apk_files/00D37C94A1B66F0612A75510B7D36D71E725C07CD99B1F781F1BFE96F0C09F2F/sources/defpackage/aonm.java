package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aonm  reason: default package */
/* loaded from: classes.dex */
public abstract class aonm implements aorb {
    private static final aoos a = aoos.a();

    private static final void r(aoqu aoquVar) {
        if (aoquVar == null || aoquVar.isInitialized()) {
            return;
        }
        throw ((aonk) aoquVar).newUninitializedMessageException().a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, aoqu] */
    @Override // defpackage.aorb
    /* renamed from: a */
    public final aoqu k(aoob aoobVar, aoos aoosVar) {
        try {
            aoog l = aoobVar.l();
            ?? q = q(l, aoosVar);
            try {
                l.B(0);
                r(q);
                return q;
            } catch (aopx e) {
                throw e;
            }
        } catch (aopx e2) {
            throw e2;
        }
    }

    @Override // defpackage.aorb
    /* renamed from: b */
    public final aoqu m(InputStream inputStream, aoos aoosVar) {
        aoqu e = e(inputStream, aoosVar);
        r(e);
        return e;
    }

    @Override // defpackage.aorb
    /* renamed from: c */
    public final aoqu n(byte[] bArr, aoos aoosVar) {
        return p(bArr, 0, bArr.length, aoosVar);
    }

    @Override // defpackage.aorb
    /* renamed from: d */
    public final aoqu p(byte[] bArr, int i, int i2, aoos aoosVar) {
        aoqu f = f(bArr, i, i2, aoosVar);
        r(f);
        return f;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, aoqu] */
    public final aoqu e(InputStream inputStream, aoos aoosVar) {
        aoog M = aoog.M(inputStream);
        ?? q = q(M, aoosVar);
        try {
            M.B(0);
            return q;
        } catch (aopx e) {
            throw e;
        }
    }

    public aoqu f(byte[] bArr, int i, int i2, aoos aoosVar) {
        throw null;
    }

    @Override // defpackage.aorb
    public final /* bridge */ /* synthetic */ Object g(InputStream inputStream, aoos aoosVar) {
        try {
            int read = inputStream.read();
            aoqu e = read == -1 ? null : e(new aoni(inputStream, aoog.K(read, inputStream)), aoosVar);
            r(e);
            return e;
        } catch (IOException e2) {
            throw new aopx(e2);
        }
    }

    @Override // defpackage.aorb
    public final /* bridge */ /* synthetic */ Object h(aoob aoobVar) {
        return k(aoobVar, a);
    }

    @Override // defpackage.aorb
    public final /* bridge */ /* synthetic */ Object i(InputStream inputStream) {
        return m(inputStream, a);
    }

    @Override // defpackage.aorb
    public final /* bridge */ /* synthetic */ Object j(byte[] bArr) {
        return n(bArr, a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, aoqu] */
    @Override // defpackage.aorb
    public final /* bridge */ /* synthetic */ Object l(aoog aoogVar, aoos aoosVar) {
        ?? q = q(aoogVar, aoosVar);
        r(q);
        return q;
    }

    @Override // defpackage.aorb
    public final /* bridge */ /* synthetic */ Object o(byte[] bArr, int i, int i2) {
        return p(bArr, i, i2, a);
    }
}
