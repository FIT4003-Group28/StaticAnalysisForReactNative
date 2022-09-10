package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: conp  reason: default package */
/* loaded from: classes5.dex */
public final class conp extends cona {
    private cnph<Status> a;

    public conp(cnph<Status> cnphVar) {
        this.a = cnphVar;
    }

    private final void e(int i) {
        if (this.a == null) {
            new Exception();
            return;
        }
        this.a.c(coll.b(coll.a(i)));
        this.a = null;
    }

    @Override // defpackage.conb
    public final void b(int i) {
        new Exception();
    }

    @Override // defpackage.conb
    public final void c(int i) {
        e(i);
    }

    @Override // defpackage.conb
    public final void d(int i) {
        e(i);
    }
}
