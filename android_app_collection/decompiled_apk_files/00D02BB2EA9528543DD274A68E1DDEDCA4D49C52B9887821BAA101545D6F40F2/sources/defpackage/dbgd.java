package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgd  reason: default package */
/* loaded from: classes5.dex */
public final class dbgd extends dbgq {
    final boolean a;
    final boolean b;

    public dbgd(String str, boolean z, boolean z2) {
        this.e = str;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a, this.b);
    }
}
