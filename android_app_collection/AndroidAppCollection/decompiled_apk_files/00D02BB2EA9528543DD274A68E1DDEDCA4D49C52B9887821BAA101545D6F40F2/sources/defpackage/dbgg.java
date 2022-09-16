package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgg  reason: default package */
/* loaded from: classes5.dex */
public final class dbgg extends dbgq {
    final boolean a;

    public dbgg(String str, boolean z) {
        this.e = str;
        this.a = z;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a);
    }
}
