package defpackage;

import com.google.android.filament.MaterialInstance;
/* compiled from: PG */
/* renamed from: dbgn  reason: default package */
/* loaded from: classes5.dex */
public final class dbgn extends dbgq {
    final int a;
    final int b;
    final int c;

    public dbgn(String str, int i, int i2, int i3) {
        this.e = str;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.dbgq
    public final void a(MaterialInstance materialInstance) {
        materialInstance.setParameter(this.e, this.a, this.b, this.c);
    }
}
