package defpackage;

import java.io.IOException;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ambn  reason: default package */
/* loaded from: classes2.dex */
public final class ambn implements amcj {
    private static final dcqe a = dcqe.c("ambn");
    private final ambp b;

    public ambn(ambp ambpVar) {
        this.b = ambpVar;
    }

    @Override // defpackage.amcj
    public final alyo a(amze amzeVar, akry akryVar, alyh alyhVar, byte[] bArr, boolean z, akrx akrxVar) {
        alyo c;
        try {
            if (!z) {
                bvoo.h("unpacking uncompressed tiles not supported for %s tile type", akryVar);
                return alyo.c(alyn.UNSUPPORTED_FORMAT);
            }
            try {
                c = alyo.d(this.b.a(amzeVar, akryVar, alyhVar, bArr, akrxVar, bArr.length), alyn.SUCCESS);
            } catch (IOException unused) {
                c = alyo.c(alyn.IO_ERROR);
            }
            alvv alvvVar = (alvv) c;
            alvv alvvVar2 = (alvv) c;
            a.d(((alvv) c).a == alyn.SUCCESS ? Level.FINE : Level.WARNING).t(2768).r("Disk vector tile unpack result for tile type %s and coords %s - %s", akryVar, alyhVar, ((alvv) c).a);
            return c;
        } catch (RuntimeException unused2) {
            return alyo.c(alyn.UNEXPECTED_EXCEPTION);
        }
    }
}
