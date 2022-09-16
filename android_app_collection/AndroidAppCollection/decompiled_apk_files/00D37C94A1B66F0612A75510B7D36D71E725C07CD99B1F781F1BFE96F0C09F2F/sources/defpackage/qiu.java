package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: qiu  reason: default package */
/* loaded from: classes4.dex */
public final class qiu extends qxb {
    private final Bundle a;

    public qiu(Context context, Looper looper, qwu qwuVar, qit qitVar, qub qubVar, qvh qvhVar) {
        super(context, looper, 16, qwuVar, qubVar, qvhVar);
        Bundle bundle;
        if (qitVar == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(qitVar.b);
        }
        this.a = bundle;
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof qiw) {
            return (qiw) queryLocalInterface;
        }
        return new qiw(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // defpackage.qwr
    protected final Bundle i() {
        return this.a;
    }

    @Override // defpackage.qwr, defpackage.qsn
    public final boolean j() {
        qwu qwuVar = this.H;
        Account account = qwuVar.a;
        if (!TextUtils.isEmpty(account != null ? account.name : null)) {
            if (((qwt) qwuVar.d.get(qis.a)) != null) {
                throw null;
            }
            return !qwuVar.b.isEmpty();
        }
        return false;
    }
}
