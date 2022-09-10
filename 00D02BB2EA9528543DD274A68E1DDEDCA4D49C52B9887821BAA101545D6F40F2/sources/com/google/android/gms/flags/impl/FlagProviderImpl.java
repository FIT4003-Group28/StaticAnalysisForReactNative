package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FlagProviderImpl extends codh {
    private boolean a = false;
    private SharedPreferences b;

    @Override // defpackage.codi
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) codp.a(new codj(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            if (String.valueOf(e.getMessage()).length() == 0) {
                new String("Flag value not available, returning default: ");
            }
        }
        return valueOf.booleanValue();
    }

    @Override // defpackage.codi
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) codp.a(new codk(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            if (String.valueOf(e.getMessage()).length() == 0) {
                new String("Flag value not available, returning default: ");
            }
        }
        return valueOf.intValue();
    }

    @Override // defpackage.codi
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) codp.a(new codl(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            if (String.valueOf(e.getMessage()).length() == 0) {
                new String("Flag value not available, returning default: ");
            }
        }
        return valueOf.longValue();
    }

    @Override // defpackage.codi
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.a) {
            return str2;
        }
        try {
            return (String) codp.a(new codm(this.b, str, str2));
        } catch (Exception e) {
            if (String.valueOf(e.getMessage()).length() != 0) {
                return str2;
            }
            new String("Flag value not available, returning default: ");
            return str2;
        }
    }

    @Override // defpackage.codi
    public void init(coba cobaVar) {
        SharedPreferences sharedPreferences;
        Context context = (Context) cobb.c(cobaVar);
        if (this.a) {
            return;
        }
        try {
            Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
            synchronized (SharedPreferences.class) {
                if (codo.a == null) {
                    codo.a = (SharedPreferences) codp.a(new codn(createPackageContext));
                }
                sharedPreferences = codo.a;
            }
            this.b = sharedPreferences;
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            if (String.valueOf(e.getMessage()).length() != 0) {
                return;
            }
            new String("Could not retrieve sdk flags, continuing with defaults: ");
        }
    }
}
