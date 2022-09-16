package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgj  reason: default package */
/* loaded from: classes5.dex */
public final class dbgj extends dbgq {
    final float a;
    final float b;
    final float c;

    public dbgj(String str, float f, float f2, float f3) {
        this.e = str;
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a, this.b, this.c);
    }
}
