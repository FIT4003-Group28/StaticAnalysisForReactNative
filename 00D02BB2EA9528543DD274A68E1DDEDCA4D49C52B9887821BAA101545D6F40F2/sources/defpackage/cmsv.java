package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cmsv  reason: default package */
/* loaded from: classes5.dex */
public final class cmsv extends cnuw<cmsy> {
    private final Bundle a;

    public cmsv(Context context, Looper looper, cnum cnumVar, cmsr cmsrVar, cnpv cnpvVar, cnsi cnsiVar) {
        super(context, looper, 16, cnumVar, cnpvVar, cnsiVar);
        if (cmsrVar != null) {
            throw null;
        }
        this.a = new Bundle();
    }

    @Override // defpackage.cnui
    public final boolean So() {
        return true;
    }

    @Override // defpackage.cnui
    protected final String a() {
        return "com.google.android.gms.auth.service.START";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final String b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final int c() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnui
    public final /* bridge */ /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof cmsy ? (cmsy) queryLocalInterface : new cmsy(iBinder);
    }

    @Override // defpackage.cnui
    protected final Bundle i() {
        return this.a;
    }

    @Override // defpackage.cnui, defpackage.cnnz
    public final boolean j() {
        Set set;
        cnum cnumVar = ((cnuw) this).s;
        Account account = cnumVar.a;
        if (!TextUtils.isEmpty(account != null ? account.name : null)) {
            cnul cnulVar = cnumVar.d.get(cmsq.b);
            if (cnulVar == null || cnulVar.a.isEmpty()) {
                set = cnumVar.b;
            } else {
                set = new HashSet(cnumVar.b);
                set.addAll(cnulVar.a);
            }
            return !set.isEmpty();
        }
        return false;
    }
}
