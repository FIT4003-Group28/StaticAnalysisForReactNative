package defpackage;
/* compiled from: PG */
/* renamed from: dwr  reason: default package */
/* loaded from: classes6.dex */
public final class dwr extends dnf<dwo, dws> implements czt {
    public dwr(final dzsj<dwo> dzsjVar, dol dolVar) {
        super(new dng(dzsjVar) { // from class: dwp
            private final dzsj a;

            {
                this.a = dzsjVar;
            }

            @Override // defpackage.dng
            public final dnh a(czh czhVar) {
                dwo dwoVar = (dwo) this.a.a();
                synchronized (dwoVar.a) {
                    dwoVar.e = czhVar;
                }
                return dwoVar;
            }
        }, dwq.a, dolVar);
    }

    public final /* bridge */ /* synthetic */ dws d(czh czhVar, czs czsVar) {
        return (dws) super.a(czhVar, czsVar);
    }
}
