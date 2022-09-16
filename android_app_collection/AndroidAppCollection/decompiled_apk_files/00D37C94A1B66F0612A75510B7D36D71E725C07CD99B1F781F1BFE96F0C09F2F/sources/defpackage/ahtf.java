package defpackage;

import j$.util.Optional;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahtf  reason: default package */
/* loaded from: classes.dex */
public final class ahtf implements ahtg {
    final /* synthetic */ ahti a;
    private final apzg b;

    public ahtf(ahti ahtiVar, apzg apzgVar) {
        this.a = ahtiVar;
        this.b = apzgVar;
    }

    @Override // defpackage.ahtg
    public final ahth a(apzg apzgVar) {
        return new ahth(this.a, apzgVar, true);
    }

    @Override // defpackage.ahtg
    public final ahty b() {
        return ahty.LOGGED_NEW_SCREEN;
    }

    @Override // defpackage.ahtg
    public final apzg c() {
        return this.b;
    }

    @Override // defpackage.ahtg
    public final Optional d(ahhm ahhmVar) {
        return Optional.of(new ahtd(this.a, ahhmVar.b(), ahhmVar.d()));
    }

    @Override // defpackage.ahtg
    public final void e() {
        apzg apzgVar;
        ahta ahtaVar = this.a.b;
        apzg apzgVar2 = this.b;
        if (ahtaVar.e == ahty.NEW || (apzgVar = ahtaVar.d) == null || !apzgVar.equals(apzgVar2)) {
            this.a.b.p(this.b);
        }
    }
}
