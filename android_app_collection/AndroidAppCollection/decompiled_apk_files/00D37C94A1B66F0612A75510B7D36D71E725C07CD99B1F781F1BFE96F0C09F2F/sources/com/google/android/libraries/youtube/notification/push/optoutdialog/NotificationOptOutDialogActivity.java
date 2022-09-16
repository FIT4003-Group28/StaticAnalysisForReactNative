package com.google.android.libraries.youtube.notification.push.optoutdialog;

import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class NotificationOptOutDialogActivity extends agde {
    public azqb b;
    public ampq c;
    private agdm d;
    private agdj e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ampq ampqVar;
        super.onCreate(bundle);
        this.d = new agdm((aafo) ((ampv) this.c).a, new agdh(this));
        agdm agdmVar = this.d;
        azqb azqbVar = ((agdk) this.b.get()).a;
        agdmVar.getClass();
        agdj agdjVar = new agdj(azqbVar, agdmVar);
        this.e = agdjVar;
        Intent intent = getIntent();
        agdjVar.c = false;
        agdl agdlVar = (agdl) agdjVar.a.get();
        if (intent.getExtras() == null || !intent.hasExtra("notification_opt_out_dialog_command")) {
            ampqVar = amon.a;
        } else {
            ampqVar = ampq.i(aafx.b(intent.getExtras().getByteArray("notification_opt_out_dialog_command")));
        }
        apzg apzgVar = (apzg) ampqVar.c();
        agdi agdiVar = new agdi(agdjVar);
        if (!apzgVar.qn(atot.b)) {
            return;
        }
        atot atotVar = (atot) apzgVar.qm(atot.b);
        if ((atotVar.c & 1) == 0) {
            return;
        }
        abab ababVar = (abab) agdlVar.a.get();
        aazy aazyVar = new aazy(ababVar.e, ababVar.a.c());
        String str = atotVar.d;
        zgh.m(str);
        aazyVar.a = str;
        aazyVar.j(apzgVar.c);
        ((abab) agdlVar.a.get()).i.e(aazyVar, agdiVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.e.c = true;
    }
}
