package defpackage;

import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdrq  reason: default package */
/* loaded from: classes4.dex */
public final class cdrq implements cdjc {
    final /* synthetic */ cdrr a;

    public cdrq(cdrr cdrrVar) {
        this.a = cdrrVar;
    }

    @Override // defpackage.cdjc
    public final int a() {
        return this.a.p().D;
    }

    @Override // defpackage.cdjc
    public final dqjh b() {
        dqjh b = dqjh.b(this.a.p().C);
        return b == null ? dqjh.UNKNOWN_VOTE_TYPE : b;
    }

    @Override // defpackage.cdjc
    public final dbsg<String> c() {
        return dbsg.j((this.a.p().a & 262144) != 0 ? this.a.p().y : null);
    }

    @Override // defpackage.cdjc
    public final dbsg<dnpq> d() {
        dnpq dnpqVar;
        if ((this.a.p().a & ImageMetadata.LENS_APERTURE) != 0) {
            dnpqVar = this.a.p().z;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
        } else {
            dnpqVar = null;
        }
        return dbsg.j(dnpqVar);
    }

    @Override // defpackage.cdjc
    public final long e() {
        return this.a.p().F;
    }
}
