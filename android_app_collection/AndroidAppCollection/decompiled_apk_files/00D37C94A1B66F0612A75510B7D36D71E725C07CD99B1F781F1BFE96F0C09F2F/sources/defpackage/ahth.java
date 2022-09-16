package defpackage;

import j$.util.Optional;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahth  reason: default package */
/* loaded from: classes.dex */
public final class ahth implements ahtg {
    final /* synthetic */ ahti a;
    private final apzg b;
    private final boolean c;

    public ahth(ahti ahtiVar, apzg apzgVar, boolean z) {
        this.a = ahtiVar;
        this.b = apzgVar;
        this.c = z;
    }

    @Override // defpackage.ahtg
    public final ahth a(apzg apzgVar) {
        return new ahth(this.a, apzgVar, true);
    }

    @Override // defpackage.ahtg
    public final ahty b() {
        return ahty.NEW;
    }

    @Override // defpackage.ahtg
    public final apzg c() {
        return this.b;
    }

    @Override // defpackage.ahtg
    public final Optional d(ahhm ahhmVar) {
        return Optional.of(new ahtf(this.a, ahhmVar.d()));
    }

    @Override // defpackage.ahtg
    public final void e() {
        if (this.c) {
            this.a.b.j(this.b);
        }
        ahta ahtaVar = this.a.b;
        apzg apzgVar = this.b;
        apzg apzgVar2 = ahtaVar.d;
        boolean z = false;
        if (apzgVar2 != null && apzgVar != null) {
            ampq a = ahta.a(apzgVar2);
            ampq a2 = ahta.a(apzgVar);
            if (a.h() && a2.h() && ((String) a.c()).equals(a2.c())) {
                z = true;
            }
        }
        ahtaVar.n(z);
    }
}
