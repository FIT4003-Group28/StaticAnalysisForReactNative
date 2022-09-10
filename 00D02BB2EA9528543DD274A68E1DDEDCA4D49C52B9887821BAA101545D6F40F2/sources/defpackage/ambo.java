package defpackage;

import java.io.IOException;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ambo  reason: default package */
/* loaded from: classes2.dex */
public final class ambo implements amck {
    private static final dcqe a = dcqe.c("ambo");
    private final ambp b;

    public ambo(ambp ambpVar) {
        this.b = ambpVar;
    }

    @Override // defpackage.amck
    public final alyo a(amze amzeVar, akry akryVar, alyh alyhVar, byte[] bArr, akrx akrxVar) {
        alyo c;
        try {
            try {
                c = alyo.d(this.b.a(amzeVar, akryVar, alyhVar, bArr, akrxVar, bArr.length), alyn.SUCCESS);
            } catch (IOException unused) {
                c = alyo.c(alyn.IO_ERROR);
            }
            alvv alvvVar = (alvv) c;
            a.d(((alvv) c).a == alyn.SUCCESS ? Level.FINE : Level.WARNING).t(2771).r("Network image tile unpack result for tile type %s and coords %s - %s", akryVar, alyhVar, c);
            return c;
        } catch (RuntimeException unused2) {
            return alyo.c(alyn.UNEXPECTED_EXCEPTION);
        }
    }

    @Override // defpackage.amck
    public final boolean b(byte[] bArr) {
        return true;
    }
}
