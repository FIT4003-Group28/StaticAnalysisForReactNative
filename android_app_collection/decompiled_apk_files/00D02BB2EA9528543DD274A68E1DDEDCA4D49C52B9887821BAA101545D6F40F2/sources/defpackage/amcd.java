package defpackage;

import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amcd  reason: default package */
/* loaded from: classes.dex */
public final class amcd implements amcj {
    private static final dcqe a = dcqe.c("amcd");
    private final ckcw b;

    public amcd(ckcw ckcwVar) {
        this.b = ckcwVar;
    }

    @Override // defpackage.amcj
    public final alyo a(amze amzeVar, akry akryVar, alyh alyhVar, byte[] bArr, boolean z, akrx akrxVar) {
        try {
            alyo h = alyt.h(amzeVar, akryVar, alyhVar, bArr, z, this.b, akrxVar);
            a.d(((alvv) h).a == alyn.SUCCESS ? Level.FINE : Level.WARNING).t(2786).r("Disk vector tile unpack result for tile type %s and coords %s - %s", akryVar, alyhVar, ((alvv) h).a);
            return h;
        } catch (RuntimeException e) {
            bvoo.j(e);
            return alyo.c(alyn.UNEXPECTED_EXCEPTION);
        }
    }
}
