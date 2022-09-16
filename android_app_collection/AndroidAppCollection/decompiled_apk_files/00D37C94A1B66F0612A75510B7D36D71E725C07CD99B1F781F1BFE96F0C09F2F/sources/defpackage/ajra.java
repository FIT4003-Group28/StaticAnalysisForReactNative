package defpackage;
/* compiled from: PG */
/* renamed from: ajra  reason: default package */
/* loaded from: classes.dex */
public abstract class ajra implements ajru {
    public static awbs d(ajrs ajrsVar) {
        byte[] bArr = ajrsVar.b;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        aopa createBuilder = awbs.a.createBuilder();
        aoob x = aoob.x(ajrsVar.b);
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        awbsVar.b |= 1;
        awbsVar.c = x;
        return (awbs) createBuilder.mo39build();
    }

    @Override // defpackage.ajru
    public final void oK(ajrs ajrsVar, Object obj) {
        throw null;
    }
}
