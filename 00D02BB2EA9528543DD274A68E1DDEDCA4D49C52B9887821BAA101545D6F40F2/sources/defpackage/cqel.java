package defpackage;

import android.accounts.Account;
import android.app.Application;
/* compiled from: PG */
/* renamed from: cqel  reason: default package */
/* loaded from: classes5.dex */
final class cqel extends as {
    private final Application a;
    private final Account b;
    private final dgyd c;

    public cqel(Application application, Account account, dgyd dgydVar) {
        this.a = application;
        this.b = account;
        this.c = dgydVar;
    }

    @Override // defpackage.as, defpackage.aq
    public final <T extends an> T b(Class<T> cls) {
        cqdu cqduVar = new cqdu();
        cqbr cqbrVar = new cqbr();
        cqeu cqeuVar = new cqeu();
        cqdo cqdoVar = new cqdo();
        dbsk.a(cls.isAssignableFrom(cqen.class));
        cqen cqenVar = new cqen(this.a, this.b, this.c, cqduVar, cqbrVar, cqeuVar, cqdoVar);
        cqenVar.j.b(4);
        cqenVar.c(cqek.CONSENT_DATA_LOADING);
        return cqenVar;
    }
}
