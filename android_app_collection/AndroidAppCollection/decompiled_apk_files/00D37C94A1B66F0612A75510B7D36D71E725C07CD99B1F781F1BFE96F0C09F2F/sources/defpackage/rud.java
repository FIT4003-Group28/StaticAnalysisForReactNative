package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: rud  reason: default package */
/* loaded from: classes4.dex */
public final class rud extends qxb implements rty {
    public final qwu a;
    public final Integer b;
    private final boolean c;
    private final Bundle d;

    public rud(Context context, Looper looper, qwu qwuVar, Bundle bundle, qsv qsvVar, qsw qswVar) {
        super(context, looper, 44, qwuVar, qsvVar, qswVar);
        this.c = true;
        this.a = qwuVar;
        this.d = bundle;
        this.b = qwuVar.h;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof rub) {
            return (rub) queryLocalInterface;
        }
        return new rub(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.qwr
    protected final Bundle i() {
        if (!this.q.getPackageName().equals(this.a.e)) {
            this.d.putString("com.google.android.gms.signin.internal.realClientPackageName", this.a.e);
        }
        return this.d;
    }

    @Override // defpackage.qwr, defpackage.qsn
    public final boolean j() {
        return this.c;
    }
}
