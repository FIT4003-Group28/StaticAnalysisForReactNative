package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
/* compiled from: PG */
/* renamed from: anzw  reason: default package */
/* loaded from: classes.dex */
public final class anzw implements aoae {
    final FirebaseInstanceId a;

    public anzw(FirebaseInstanceId firebaseInstanceId) {
        this.a = firebaseInstanceId;
    }

    @Override // defpackage.aoae
    public final rve a() {
        String e = this.a.e();
        if (e != null) {
            return rwd.c(e);
        }
        FirebaseInstanceId firebaseInstanceId = this.a;
        FirebaseInstanceId.g(firebaseInstanceId.d);
        return firebaseInstanceId.a(anzv.e(firebaseInstanceId.d), "*").a(rcb.d);
    }

    @Override // defpackage.aoae
    public final void b(aobu aobuVar) {
        this.a.i.add(aobuVar);
    }

    @Override // defpackage.aoae
    public final void c() {
        this.a.e();
    }
}
