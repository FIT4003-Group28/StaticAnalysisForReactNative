package com.google.android.apps.youtube.app.common.util;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NfcHelper implements f {
    private final Activity a;
    private final NfcAdapter b;
    private final Executor c;
    private final azqb d;

    public NfcHelper(Activity activity, Executor executor, azqb azqbVar) {
        this.a = activity;
        this.c = executor;
        this.d = azqbVar;
        this.b = NfcAdapter.getDefaultAdapter(activity);
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        intentFilter.addAction("android.nfc.action.TECH_DISCOVERED");
        intentFilter.addAction("android.nfc.action.TAG_DISCOVERED");
        Intent intent = new Intent("android.nfc.action.NDEF_DISCOVERED");
        intent.setPackage(activity.getPackageName());
        PendingIntent.getActivity(activity, 0, intent, zgd.M());
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        if (this.b != null) {
            ghf ghfVar = new ghf(this.d, this.c);
            this.b.setNdefPushMessageCallback(ghfVar, this.a, new Activity[0]);
            this.b.setOnNdefPushCompleteCallback(ghfVar, this.a, new Activity[0]);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
