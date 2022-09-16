package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqbh  reason: default package */
/* loaded from: classes2.dex */
public final class aqbh implements defg<dbsg<ctyy>, dbsg<ctyy>> {
    public final ckcw a;
    private final ContactId b;
    private final WeakReference<aqbo> c;
    private final dxio<aqav> d;

    public aqbh(ckcw ckcwVar, ContactId contactId, aqbo aqboVar, dxio<aqav> dxioVar) {
        this.a = ckcwVar;
        this.b = contactId;
        this.c = new WeakReference<>(aqboVar);
        this.d = dxioVar;
    }

    @Override // defpackage.defg
    public final /* bridge */ /* synthetic */ dehn<dbsg<ctyy>> a(dbsg<ctyy> dbsgVar) {
        dbsg<ctyy> dbsgVar2 = dbsgVar;
        aqbo aqboVar = this.c.get();
        if (aqboVar != null) {
            if (dbsgVar2 != null && dbsgVar2.a() && dbsgVar2.b().d() != ctyx.INVALID) {
                dbsgVar2.b();
                aqboVar.l(this.b, dbsgVar2);
                return deha.a(dbsgVar2);
            }
            final ContactId contactId = this.b;
            final aqbo aqboVar2 = this.c.get();
            if (aqboVar2 != null) {
                return deee.g(deew.g(degp.q(this.d.a().b().a(contactId)), new defg(this, contactId, aqboVar2) { // from class: aqbf
                    private final aqbh a;
                    private final ContactId b;
                    private final aqbo c;

                    {
                        this.a = this;
                        this.b = contactId;
                        this.c = aqboVar2;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj) {
                        aqbh aqbhVar = this.a;
                        ContactId contactId2 = this.b;
                        aqbo aqboVar3 = this.c;
                        csur csurVar = (csur) obj;
                        if (csurVar == null || csurVar.a() != 2) {
                            aqbhVar.b();
                            return deha.a(dbpy.a);
                        }
                        ((ckcm) aqbhVar.a.a(ckgs.i)).a(true);
                        return aqboVar3.k(contactId2);
                    }
                }, dege.a), Throwable.class, new dbrn(this, contactId) { // from class: aqbg
                    private final aqbh a;
                    private final ContactId b;

                    {
                        this.a = this;
                        this.b = contactId;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        Throwable th = (Throwable) obj;
                        this.a.b();
                        return dbpy.a;
                    }
                }, dege.a);
            }
        }
        return deha.c();
    }

    public final void b() {
        ((ckcm) this.a.a(ckgs.i)).a(false);
    }
}
