package defpackage;

import com.google.android.apps.auto.sdk.nav.ClientMode;
/* compiled from: PG */
/* renamed from: ktv  reason: default package */
/* loaded from: classes7.dex */
final class ktv implements ckcx {
    final /* synthetic */ ClientMode a;

    public ktv(ClientMode clientMode) {
        this.a = clientMode;
    }

    @Override // defpackage.ckcx
    public final void a(ddyf ddyfVar) {
        ClientMode clientMode = this.a;
        if (clientMode == null) {
            if (ddyfVar.c) {
                ddyfVar.bF();
                ddyfVar.c = false;
            }
            ddyq ddyqVar = (ddyq) ddyfVar.b;
            ddyq ddyqVar2 = ddyq.K;
            ddyqVar.a &= -536870913;
            ddyqVar.x = 0;
            return;
        }
        int i = clientMode.a;
        if (i == 1) {
            if (ddyfVar.c) {
                ddyfVar.bF();
                ddyfVar.c = false;
            }
            ddyq ddyqVar3 = (ddyq) ddyfVar.b;
            ddyq ddyqVar4 = ddyq.K;
            ddyqVar3.x = 2;
            ddyqVar3.a |= 536870912;
        } else if (i != 2) {
        } else {
            if (ddyfVar.c) {
                ddyfVar.bF();
                ddyfVar.c = false;
            }
            ddyq ddyqVar5 = (ddyq) ddyfVar.b;
            ddyq ddyqVar6 = ddyq.K;
            ddyqVar5.x = 1;
            ddyqVar5.a |= 536870912;
        }
    }
}
