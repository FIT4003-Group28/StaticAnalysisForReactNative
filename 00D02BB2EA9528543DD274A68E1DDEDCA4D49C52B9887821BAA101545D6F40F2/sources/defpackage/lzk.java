package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lzk  reason: default package */
/* loaded from: classes7.dex */
public final class lzk extends BroadcastReceiver {
    final /* synthetic */ lzl a;

    public lzk(lzl lzlVar) {
        this.a = lzlVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        dbsk.l(false);
        Uri data = intent.getData();
        dbsk.t(data, "Invalid intent.");
        dbsk.m("prompt".equals(data.getScheme()) && data.getPathSegments().size() == 1, "Invalid intent.");
        String str = data.getPathSegments().get(0);
        int hashCode = str.hashCode();
        if (hashCode != -578053929) {
            if (hashCode == -189958431 && str.equals("SPEED_LIMIT_MODERATION_PROMPT")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("BORDER_PROMPT")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return;
            }
            this.a.a.b(new cria(new crra(new aryv((Integer) 50, dowa.KILOMETERS, false), new akqq(-33.7492487d, 151.0407393d), 1000L)));
            return;
        }
        btrm btrmVar = this.a.a;
        dpcy bZ = dpdf.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpdf dpdfVar = (dpdf) bZ.b;
        dpdfVar.a |= 2;
        dpdfVar.e = "Cargo";
        dpdf dpdfVar2 = (dpdf) bZ.b;
        dpdfVar2.d = 1;
        dpdfVar2.a |= 1;
        dpcz bZ2 = dpda.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpda dpdaVar = (dpda) bZ2.b;
        dpdaVar.a = 1 | dpdaVar.a;
        dpdaVar.b = "//www.brent.ca/walther.svg";
        dpda bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpdf dpdfVar3 = (dpdf) bZ.b;
        bK.getClass();
        dpdfVar3.c = bK;
        dpdfVar3.b = 6;
        btrmVar.b(new crmb(bZ.bK()));
    }
}
