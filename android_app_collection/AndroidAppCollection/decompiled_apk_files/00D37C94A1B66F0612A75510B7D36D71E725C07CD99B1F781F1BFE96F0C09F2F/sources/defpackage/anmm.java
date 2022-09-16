package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anmm  reason: default package */
/* loaded from: classes.dex */
public final class anmm {
    private final anmr a;
    private final Class b;

    public anmm(anmr anmrVar, Class cls) {
        if (anmrVar.e().contains(cls) || Void.class.equals(cls)) {
            this.a = anmrVar;
            this.b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", anmrVar.toString(), cls.getName()));
    }

    private final anml g() {
        return new anml(this.a.a());
    }

    private final Object h(aoqu aoquVar) {
        if (Void.class.equals(this.b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.a.f(aoquVar);
        return this.a.c(aoquVar, this.b);
    }

    public final aoqu a(aoob aoobVar) {
        try {
            return g().a(aoobVar);
        } catch (aopx e) {
            String valueOf = String.valueOf(this.a.a().a.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    public final Class b() {
        return this.b;
    }

    public final Object c(aoob aoobVar) {
        try {
            return h(this.a.b(aoobVar));
        } catch (aopx e) {
            String valueOf = String.valueOf(this.a.a.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    public final Object d(aoqu aoquVar) {
        String valueOf = String.valueOf(this.a.a.getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.a.a.isInstance(aoquVar)) {
            return h(aoquVar);
        }
        throw new GeneralSecurityException(concat);
    }

    public final String e() {
        return this.a.d();
    }

    public final void f(aoob aoobVar) {
        try {
            aoqu a = g().a(aoobVar);
            aopa createBuilder = anrb.a.createBuilder();
            String e = e();
            createBuilder.copyOnWrite();
            ((anrb) createBuilder.instance).b = e;
            aoob byteString = a.toByteString();
            createBuilder.copyOnWrite();
            byteString.getClass();
            ((anrb) createBuilder.instance).c = byteString;
            int h = this.a.h();
            createBuilder.copyOnWrite();
            ((anrb) createBuilder.instance).d = h - 2;
            anrb anrbVar = (anrb) createBuilder.mo39build();
        } catch (aopx e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }
}
