package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgi  reason: default package */
/* loaded from: classes5.dex */
public final class dbgi extends dbgq {
    final float a;
    final float b;

    public dbgi(String str, float f, float f2) {
        this.e = str;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a, this.b);
    }
}
