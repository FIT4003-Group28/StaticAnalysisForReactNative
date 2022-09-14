package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.m;
/* loaded from: classes.dex */
public class a extends m.a {
    public static Account a(m mVar) {
        if (mVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return mVar.b();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
