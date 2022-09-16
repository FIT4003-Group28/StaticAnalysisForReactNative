package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;
/* compiled from: PG */
/* renamed from: anne  reason: default package */
/* loaded from: classes.dex */
final class anne implements anng {
    final /* synthetic */ anmr a;

    public anne(anmr anmrVar) {
        this.a = anmrVar;
    }

    @Override // defpackage.anng
    public final Class a() {
        return this.a.getClass();
    }

    @Override // defpackage.anng
    public final Class b() {
        return null;
    }

    @Override // defpackage.anng
    public final Set c() {
        return this.a.e();
    }

    @Override // defpackage.anng
    public final anmm d(Class cls) {
        try {
            return new anmm(this.a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // defpackage.anng
    public final anmm e() {
        anmr anmrVar = this.a;
        return new anmm(anmrVar, anmrVar.b);
    }
}
