package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cono  reason: default package */
/* loaded from: classes5.dex */
final class cono extends cona {
    private cnph<Status> a;

    public cono(cnph<Status> cnphVar) {
        this.a = cnphVar;
    }

    @Override // defpackage.conb
    public final void b(int i) {
        if (this.a == null) {
            new Exception();
            return;
        }
        this.a.c(coll.b(coll.a(i)));
        this.a = null;
    }

    @Override // defpackage.conb
    public final void c(int i) {
        new Exception();
    }

    @Override // defpackage.conb
    public final void d(int i) {
        new Exception();
    }
}
