package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbge  reason: default package */
/* loaded from: classes5.dex */
public final class dbge extends dbgq {
    final boolean a;
    final boolean b;
    final boolean c;

    public dbge(String str, boolean z, boolean z2, boolean z3) {
        this.e = str;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a, this.b, this.c);
    }
}
