package defpackage;
/* compiled from: PG */
/* renamed from: avkm  reason: default package */
/* loaded from: classes3.dex */
public final class avkm extends avkj {
    private volatile transient dcdn<dspd, avlg> b;
    private volatile transient dcdn<dspd, dltm> c;

    public avkm(avky avkyVar) {
        super(avkyVar);
    }

    @Override // defpackage.avkr
    public final dcdn<dspd, avlg> b() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    dcdg p = dcdn.p();
                    for (avlg avlgVar : this.a.c) {
                        dltm dltmVar = avlgVar.c;
                        if (dltmVar == null) {
                            dltmVar = dltm.t;
                        }
                        p.f(dltmVar.b, avlgVar);
                    }
                    this.b = p.b();
                    if (this.b == null) {
                        throw new NullPointerException("getVersionedRegions() cannot return null");
                    }
                }
            }
        }
        return this.b;
    }

    @Override // defpackage.avkr
    public final dcdn<dspd, dltm> c() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    dcdg p = dcdn.p();
                    for (avlg avlgVar : this.a.c) {
                        dltm dltmVar = avlgVar.c;
                        if (dltmVar == null) {
                            dltmVar = dltm.t;
                        }
                        p.f(dltmVar.b, dltmVar);
                    }
                    this.c = p.b();
                    if (this.c == null) {
                        throw new NullPointerException("getAllRegions() cannot return null");
                    }
                }
            }
        }
        return this.c;
    }
}
