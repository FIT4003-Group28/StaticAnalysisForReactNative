package defpackage;

import com.google.android.libraries.messaging.lighter.model.Notification;
/* compiled from: PG */
/* renamed from: aqaj  reason: default package */
/* loaded from: classes2.dex */
final class aqaj implements degu<dbsg<augc>> {
    final /* synthetic */ apyy a;
    final /* synthetic */ Notification b;
    final /* synthetic */ aqak c;

    public aqaj(aqak aqakVar, apyy apyyVar, Notification notification) {
        this.c = aqakVar;
        this.a = apyyVar;
        this.b = notification;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dbsg<augc> dbsgVar) {
        dbsg<augc> dbsgVar2 = dbsgVar;
        if (dbsgVar2 == null || !dbsgVar2.a()) {
            return;
        }
        final augc b = dbsgVar2.b();
        String str = b.a().e;
        if (str == null) {
            str = this.a.f(this.b.f().a());
        }
        if (!this.c.t.a(str).a()) {
            return;
        }
        b.s(true);
        b.O = true;
        this.c.c.j(b.a());
        this.c.n.execute(new Runnable(this, b) { // from class: aqai
            private final aqaj a;
            private final augc b;

            {
                this.a = this;
                this.b = b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aqaj aqajVar = this.a;
                augc augcVar = this.b;
                augcVar.O = false;
                aqajVar.c.k.a().b(augcVar.a());
            }
        });
    }
}
