package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import org.chromium.base.ApplicationStatus;
/* compiled from: PG */
/* renamed from: bacu  reason: default package */
/* loaded from: classes2.dex */
public final class bacu extends PhoneStateListener implements babs {
    private final TelephonyManager a;

    public bacu() {
        TelephonyManager telephonyManager = (TelephonyManager) babj.c.getSystemService("phone");
        this.a = telephonyManager;
        if (telephonyManager.getSimState() != 5) {
            return;
        }
        ApplicationStatus.a(this);
        ApplicationStatus.getStateForApplication();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        ApplicationStatus.getStateForApplication();
    }
}
