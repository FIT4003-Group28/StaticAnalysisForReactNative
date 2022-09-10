package defpackage;

import com.google.android.gms.signin.internal.SignInResponse;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cnqm  reason: default package */
/* loaded from: classes5.dex */
final class cnqm extends cozd {
    private final WeakReference<cnqp> a;

    public cnqm(cnqp cnqpVar) {
        this.a = new WeakReference<>(cnqpVar);
    }

    @Override // defpackage.cozd, defpackage.cozf
    public final void b(SignInResponse signInResponse) {
        cnqp cnqpVar = this.a.get();
        if (cnqpVar == null) {
            return;
        }
        cnqpVar.a.o(new cnql(cnqpVar, cnqpVar, signInResponse));
    }
}
