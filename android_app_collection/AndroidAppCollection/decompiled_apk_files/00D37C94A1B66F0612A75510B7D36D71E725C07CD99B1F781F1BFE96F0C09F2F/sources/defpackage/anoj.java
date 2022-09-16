package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anoj  reason: default package */
/* loaded from: classes.dex */
final class anoj extends anmp {
    public anoj(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anrl) aopi.parseFrom(anrl.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anrl anrlVar = (anrl) aoquVar;
        aopa createBuilder = anrk.a.createBuilder();
        createBuilder.copyOnWrite();
        anrlVar.getClass();
        ((anrk) createBuilder.instance).c = anrlVar;
        createBuilder.copyOnWrite();
        ((anrk) createBuilder.instance).b = 0;
        return (anrk) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anrl anrlVar = (anrl) aoquVar;
        if (anrlVar.b.isEmpty() || anrlVar.c == null) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
