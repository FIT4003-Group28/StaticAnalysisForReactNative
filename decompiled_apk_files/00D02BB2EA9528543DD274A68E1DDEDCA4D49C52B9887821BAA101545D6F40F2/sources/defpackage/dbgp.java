package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgp  reason: default package */
/* loaded from: classes5.dex */
public final class dbgp extends dbgq {
    final int a;

    public dbgp(String str, int i) {
        this.e = str;
        this.a = i;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a);
    }
}
