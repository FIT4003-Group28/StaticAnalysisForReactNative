package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class j extends b6 {

    /* renamed from: c  reason: collision with root package name */
    private long f7380c;

    /* renamed from: d  reason: collision with root package name */
    private String f7381d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f7382e;

    /* renamed from: f  reason: collision with root package name */
    private AccountManager f7383f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f7384g;

    /* renamed from: h  reason: collision with root package name */
    private long f7385h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(d5 d5Var) {
        super(d5Var);
    }

    public final boolean a(Context context) {
        if (this.f7382e == null) {
            w();
            this.f7382e = false;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f7382e = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f7382e.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean q() {
        Calendar calendar = Calendar.getInstance();
        this.f7380c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f7381d = sb.toString();
        return false;
    }

    public final long s() {
        n();
        return this.f7380c;
    }

    public final String t() {
        n();
        return this.f7381d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long u() {
        g();
        return this.f7385h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        g();
        this.f7384g = null;
        this.f7385h = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x() {
        g();
        long a2 = b().a();
        if (a2 - this.f7385h > 86400000) {
            this.f7384g = null;
        }
        Boolean bool = this.f7384g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.g.e.b.a(d(), "android.permission.GET_ACCOUNTS") != 0) {
            c().x().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f7383f == null) {
                this.f7383f = AccountManager.get(d());
            }
            try {
                Account[] result = this.f7383f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f7384g = true;
                    this.f7385h = a2;
                    return true;
                }
                Account[] result2 = this.f7383f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f7384g = true;
                    this.f7385h = a2;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                c().t().a("Exception checking account types", e2);
            }
        }
        this.f7385h = a2;
        this.f7384g = false;
        return false;
    }
}
