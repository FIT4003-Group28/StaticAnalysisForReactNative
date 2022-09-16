package defpackage;

import java.security.GeneralSecurityException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: annf  reason: default package */
/* loaded from: classes.dex */
public final class annf implements anng {
    final /* synthetic */ anna a;
    final /* synthetic */ anmr b;

    public annf(anna annaVar, anmr anmrVar) {
        this.a = annaVar;
        this.b = anmrVar;
    }

    @Override // defpackage.anng
    public final Class a() {
        return this.a.getClass();
    }

    @Override // defpackage.anng
    public final Class b() {
        return this.b.getClass();
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
        anna annaVar = this.a;
        return new anmm(annaVar, annaVar.b);
    }
}
