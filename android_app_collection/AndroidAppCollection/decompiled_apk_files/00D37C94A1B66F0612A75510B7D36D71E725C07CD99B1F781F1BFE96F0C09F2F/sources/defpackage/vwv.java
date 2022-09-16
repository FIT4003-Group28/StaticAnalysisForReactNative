package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
/* compiled from: PG */
/* renamed from: vwv  reason: default package */
/* loaded from: classes4.dex */
public final class vwv implements yjo {
    private final afvn a;
    private final vzs b;
    private final axxp c;

    public vwv(afvn afvnVar, vzs vzsVar, axxp axxpVar) {
        this.a = afvnVar;
        this.b = vzsVar;
        this.c = axxpVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        Boolean bool;
        aqxe aqxeVar = this.c.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        if (aqxeVar.a(45357991L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45357991L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45357991L);
            bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (!bool.booleanValue()) {
            return 0;
        }
        ylr.b();
        afvm c = this.a.c();
        if (!(c instanceof AccountIdentity)) {
            return 0;
        }
        AccountIdentity accountIdentity = (AccountIdentity) c;
        if (this.b.b(accountIdentity.d()) == null) {
            this.b.c(accountIdentity);
        }
        return 0;
    }
}
