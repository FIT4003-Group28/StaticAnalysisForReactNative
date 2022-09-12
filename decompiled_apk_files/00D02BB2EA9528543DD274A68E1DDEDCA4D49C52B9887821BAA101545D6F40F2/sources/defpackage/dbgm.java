package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgm  reason: default package */
/* loaded from: classes5.dex */
public final class dbgm extends dbgq {
    final int a;
    final int b;

    public dbgm(String str, int i, int i2) {
        this.e = str;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a, this.b);
    }
}
