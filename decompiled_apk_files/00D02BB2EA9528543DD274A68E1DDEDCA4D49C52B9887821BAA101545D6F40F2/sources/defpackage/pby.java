package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
/* compiled from: PG */
/* renamed from: pby  reason: default package */
/* loaded from: classes7.dex */
final class pby implements Runnable {
    final /* synthetic */ pbz a;

    public pby(pbz pbzVar) {
        this.a = pbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a.e.a() == null) {
                return;
            }
            FirebaseInstanceId.getInstance(this.a.e.a()).f().m(new cpcf(this) { // from class: pbw
                private final pby a;

                {
                    this.a = this;
                }

                @Override // defpackage.cpcf
                public final void a(cpcq cpcqVar) {
                    final pby pbyVar = this.a;
                    if (!cpcqVar.b()) {
                        pbz pbzVar = pbyVar.a;
                        if (cpcqVar.e() == null) {
                            return;
                        }
                        if (pbzVar.f == null) {
                            pbzVar.f = new bvny(30000L);
                        }
                        pbzVar.d.a(pbzVar.g, bvrj.BACKGROUND_THREADPOOL, pbzVar.f.a());
                        return;
                    }
                    final String str = ((derw) cpcqVar.d()).b;
                    pbz pbzVar2 = pbyVar.a;
                    pbzVar2.f = null;
                    pbzVar2.d.b(new Runnable(pbyVar, str) { // from class: pbx
                        private final pby a;
                        private final String b;

                        {
                            this.a = pbyVar;
                            this.b = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            pby pbyVar2 = this.a;
                            String str2 = this.b;
                            pbz pbzVar3 = pbyVar2.a;
                            dbsk.s(str2);
                            pbzVar3.c.Z(bvjk.gg, pbzVar3.a);
                            pbzVar3.c.ac(bvjk.gf, str2);
                            pbzVar3.b.b(new pah(str2));
                        }
                    }, bvrj.UI_THREAD);
                }
            });
        } catch (SecurityException unused) {
        }
    }
}
