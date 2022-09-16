package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: annd  reason: default package */
/* loaded from: classes.dex */
final class annd implements anng {
    final /* synthetic */ anmm a;

    public annd(anmm anmmVar) {
        this.a = anmmVar;
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
        return Collections.singleton(this.a.b());
    }

    @Override // defpackage.anng
    public final anmm d(Class cls) {
        if (this.a.b().equals(cls)) {
            return this.a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // defpackage.anng
    public final anmm e() {
        return this.a;
    }
}
