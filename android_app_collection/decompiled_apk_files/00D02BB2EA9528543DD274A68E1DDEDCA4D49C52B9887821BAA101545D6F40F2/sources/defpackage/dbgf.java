package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgf  reason: default package */
/* loaded from: classes5.dex */
public final class dbgf extends dbgq {
    final boolean a;
    final boolean b;
    final boolean c;
    final boolean d;

    public dbgf(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = str;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a, this.b, this.c, this.d);
    }
}
