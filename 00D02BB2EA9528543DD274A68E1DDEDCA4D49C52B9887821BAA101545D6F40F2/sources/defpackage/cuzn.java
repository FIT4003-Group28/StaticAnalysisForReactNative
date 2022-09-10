package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuzn  reason: default package */
/* loaded from: classes5.dex */
public final class cuzn implements degu<Boolean> {
    final /* synthetic */ cuzo a;

    public cuzn(cuzo cuzoVar) {
        this.a = cuzoVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cstl.a("ConvPresenter");
        this.a.p(false, true);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 == null || !bool2.booleanValue()) {
            this.a.p(false, true);
        } else {
            this.a.o().k(new cusr(this) { // from class: cuzm
                private final cuzn a;

                {
                    this.a = this;
                }

                @Override // defpackage.cusr
                public final void a(Object obj) {
                    this.a.a.p(true, ((Boolean) obj).booleanValue());
                }
            });
        }
    }
}
