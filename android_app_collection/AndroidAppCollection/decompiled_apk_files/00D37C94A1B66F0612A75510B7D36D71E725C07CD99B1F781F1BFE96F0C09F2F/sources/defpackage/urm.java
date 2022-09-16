package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: urm  reason: default package */
/* loaded from: classes4.dex */
public final class urm implements uqe {
    public final uqe a;
    final /* synthetic */ urn b;
    private final uqe c;
    private anay d;

    public urm(urn urnVar, uqe uqeVar, uqe uqeVar2) {
        this.b = urnVar;
        this.c = uqeVar;
        this.a = uqeVar2;
    }

    private final ankt h(final ampg ampgVar) {
        return amnt.c((ankt) ampgVar.apply(this.c), urb.class, new anir() { // from class: url
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                urm urmVar = urm.this;
                ampg ampgVar2 = ampgVar;
                urmVar.g((urb) obj);
                return (ankt) ampgVar2.apply(urmVar.a);
            }
        }, anjk.a);
    }

    private final ankt i(final uri uriVar, final String str, final int i) {
        return amnt.c(uriVar.a(this.c, str, i), urb.class, new anir() { // from class: urk
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                urm urmVar = urm.this;
                uri uriVar2 = uriVar;
                String str2 = str;
                int i2 = i;
                urmVar.g((urb) obj);
                return uriVar2.a(urmVar.a, str2, i2);
            }
        }, anjk.a);
    }

    @Override // defpackage.uqe
    public final ankt a() {
        return h(uag.l);
    }

    @Override // defpackage.uqe
    public final ankt b() {
        return h(uag.m);
    }

    @Override // defpackage.uqe
    public final void c(ukz ukzVar) {
        synchronized (this.b.b) {
            this.b.b.add(ukzVar);
            this.c.c(ukzVar);
        }
    }

    @Override // defpackage.uqe
    public final void d(ukz ukzVar) {
        synchronized (this.b.b) {
            this.b.b.remove(ukzVar);
            this.c.d(ukzVar);
        }
    }

    @Override // defpackage.uqe
    public final ankt e(String str, int i) {
        return i(urj.b, str, i);
    }

    @Override // defpackage.uqe
    public final ankt f(String str, int i) {
        return i(urj.a, str, i);
    }

    public final void g(Exception exc) {
        synchronized (this.b.b) {
            if (this.d == null) {
                this.d = anay.m("OneGoogle");
            }
            ((anav) ((anav) ((anav) this.d.f()).h(exc)).i("com/google/android/libraries/onegoogle/owners/mdi/SafeMdiOwnersProvider$SafeDelegate", "enableSafeDelegate", 191, "SafeMdiOwnersProvider.java")).q("MDI Profile Sync not available on device. Reverting to backup implementation.");
            for (ukz ukzVar : this.b.b) {
                this.a.c(ukzVar);
            }
            urn urnVar = this.b;
            urnVar.a = this.a;
            for (ukz ukzVar2 : urnVar.b) {
                this.c.d(ukzVar2);
            }
            this.b.b.clear();
        }
    }
}
