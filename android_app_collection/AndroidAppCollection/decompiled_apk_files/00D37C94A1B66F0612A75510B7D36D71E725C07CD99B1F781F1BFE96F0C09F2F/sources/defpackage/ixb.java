package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ixb  reason: default package */
/* loaded from: classes3.dex */
final class ixb implements adnx, adny {
    private final adoa a;
    private final ofu b;

    public ixb(adoa adoaVar, ofu ofuVar) {
        this.a = adoaVar;
        this.b = ofuVar;
    }

    @Override // defpackage.adnx
    public final void a() {
    }

    @Override // defpackage.adnx
    public final void b(aalv aalvVar) {
    }

    @Override // defpackage.adnx
    public final void c(List list) {
    }

    @Override // defpackage.adnx
    public final void f(String str) {
        String str2 = ixc.a;
        String.format("Autoconnect nowPlaying: videoId=%s", str);
        if (amps.e(str)) {
            return;
        }
        this.b.l(true);
    }

    @Override // defpackage.adnx
    public final void g(int i) {
    }

    @Override // defpackage.adnx
    public final void h() {
    }

    @Override // defpackage.adnx
    public final void i() {
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        adntVar.N(this);
        this.a.i(this);
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        adntVar.z(this);
    }

    @Override // defpackage.adnx
    public final void m() {
    }

    @Override // defpackage.adnx
    public final void rm() {
    }

    @Override // defpackage.adnx
    public final void rn(String str) {
    }
}
