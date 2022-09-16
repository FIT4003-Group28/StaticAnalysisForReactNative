package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: rxd  reason: default package */
/* loaded from: classes4.dex */
public final class rxd extends qxb {
    public final Context a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;

    public rxd(Context context, Looper looper, qwu qwuVar, qsv qsvVar, qsw qswVar, int i) {
        super(context, looper, 4, qwuVar, qsvVar, qswVar);
        this.a = context;
        this.b = i;
        Account account = qwuVar.a;
        this.c = account != null ? account.name : null;
        this.d = 1;
        this.e = true;
    }

    public static Bundle k(int i, String str, String str2, int i2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString(qhz.b, str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str2, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    @Override // defpackage.qwr
    public final boolean L() {
        return true;
    }

    @Override // defpackage.qwr
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.qxb, defpackage.qwr, defpackage.qsn
    public final int a() {
        return 12600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final /* bridge */ /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof rxa) {
            return (rxa) queryLocalInterface;
        }
        return new rxa(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwr
    public final String c() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // defpackage.qwr
    protected final String d() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // defpackage.qwr
    public final Feature[] h() {
        return rwk.h;
    }
}
