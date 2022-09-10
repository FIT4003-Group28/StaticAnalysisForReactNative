package defpackage;

import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amce  reason: default package */
/* loaded from: classes.dex */
public final class amce implements amck {
    private static final dcqe a = dcqe.c("amce");
    private final ckcw b;
    private final dzsj<akwu> c;

    public amce(ckcw ckcwVar, dzsj<akwu> dzsjVar) {
        this.b = ckcwVar;
        this.c = dzsjVar;
    }

    @Override // defpackage.amck
    public final alyo a(amze amzeVar, akry akryVar, alyh alyhVar, byte[] bArr, akrx akrxVar) {
        try {
            alyo h = alyt.h(amzeVar, akryVar, alyhVar, bArr, true, this.b, akrxVar);
            a.d(((alvv) h).a == alyn.SUCCESS ? Level.FINE : Level.WARNING).t(2787).r("Network vector tile unpack result for tile type %s and coords %s - %s", akryVar, alyhVar, h);
            return h;
        } catch (RuntimeException e) {
            bvoo.j(e);
            return alyo.c(alyn.UNEXPECTED_EXCEPTION);
        }
    }

    @Override // defpackage.amck
    public final boolean b(byte[] bArr) {
        return alym.d(alyt.l(bArr).l, this.c.a().c().d());
    }
}
