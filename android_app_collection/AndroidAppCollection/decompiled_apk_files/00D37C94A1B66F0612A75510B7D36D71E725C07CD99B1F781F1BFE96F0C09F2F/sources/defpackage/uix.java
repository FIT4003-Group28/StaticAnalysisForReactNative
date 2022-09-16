package defpackage;

import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: uix  reason: default package */
/* loaded from: classes4.dex */
public final class uix implements uiw {
    private final ucs a;
    private final uiz b;
    private final ujc c;

    public uix(ucs ucsVar, uiz uizVar, ujc ujcVar) {
        this.a = ucsVar;
        this.b = uizVar;
        this.c = ujcVar;
    }

    @Override // defpackage.uiw
    public final synchronized void a(List list) {
        for (ucp ucpVar : this.a.c()) {
            if (!list.contains(ucpVar.b)) {
                ujc ujcVar = this.c;
                String str = ucpVar.b;
                aqxo.q(!TextUtils.isEmpty(str), "Account name must not be empty.");
                try {
                    ucp b = ujcVar.b.b(str);
                    ubx ubxVar = b.f;
                    if (ubxVar != ubx.UNREGISTERED && ubxVar != ubx.PENDING_UNREGISTRATION) {
                        ujcVar.d.a(str, ubx.PENDING_UNREGISTRATION);
                        ujcVar.a.d(b);
                    }
                    ((agax) ((ampv) ujcVar.c).a).d();
                    uby ubyVar = uby.a;
                } catch (ucr e) {
                    ampq ampqVar = ujcVar.c;
                    ucl a = ucp.a();
                    a.b(str);
                    a.a();
                    ((agax) ((ampv) ujcVar.c).a).c(e);
                    uby.a(e);
                }
            }
        }
        amzt listIterator = ((amuk) list).listIterator();
        while (listIterator.hasNext()) {
            b((String) listIterator.next(), aomi.COLLABORATOR_API_CALL);
        }
    }

    public final synchronized void b(String str, aomi aomiVar) {
        uwp.e();
        this.b.a(str, false, aomiVar);
    }
}
