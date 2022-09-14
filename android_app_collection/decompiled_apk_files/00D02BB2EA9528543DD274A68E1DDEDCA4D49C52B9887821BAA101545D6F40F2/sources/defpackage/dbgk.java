package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgk  reason: default package */
/* loaded from: classes5.dex */
public final class dbgk extends dbgq {
    final float a;
    final float b;
    final float c;
    final float d;

    public dbgk(String str, float f, float f2, float f3, float f4) {
        this.e = str;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a, this.b, this.c, this.d);
    }
}
