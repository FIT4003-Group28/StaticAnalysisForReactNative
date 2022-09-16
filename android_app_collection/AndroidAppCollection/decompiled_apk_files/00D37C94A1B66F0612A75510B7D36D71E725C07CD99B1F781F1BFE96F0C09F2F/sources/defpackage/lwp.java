package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lwp  reason: default package */
/* loaded from: classes3.dex */
public final class lwp implements akev {
    final /* synthetic */ lwq a;

    public lwp(lwq lwqVar) {
        this.a = lwqVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfq akfqVar = (akfq) obj;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfq akfqVar = (akfq) obj;
        lwq lwqVar = this.a;
        ylx.n(lwqVar.e, lwqVar.d.b(new ampg() { // from class: lwo
            @Override // defpackage.ampg
            public final Object apply(Object obj2) {
                lwp lwpVar = lwp.this;
                lxz lxzVar = (lxz) obj2;
                long j = lwq.a;
                int i = lxzVar.d;
                aopa mo52toBuilder = lxzVar.mo52toBuilder();
                long c = lwpVar.a.f.c();
                mo52toBuilder.copyOnWrite();
                lxz lxzVar2 = (lxz) mo52toBuilder.instance;
                lxzVar2.b |= 1;
                lxzVar2.c = c;
                mo52toBuilder.copyOnWrite();
                lxz lxzVar3 = (lxz) mo52toBuilder.instance;
                lxzVar3.b |= 2;
                lxzVar3.d = i + 1;
                return (lxz) mo52toBuilder.mo39build();
            }
        }), mbi.b, ylx.b);
    }
}
