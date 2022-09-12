package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgl  reason: default package */
/* loaded from: classes5.dex */
public final class dbgl extends dbgq {
    final float a;

    public dbgl(String str, float f) {
        this.e = str;
        this.a = f;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a);
    }
}
