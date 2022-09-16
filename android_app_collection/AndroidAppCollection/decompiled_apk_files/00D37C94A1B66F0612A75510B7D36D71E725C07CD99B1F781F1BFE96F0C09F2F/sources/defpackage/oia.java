package defpackage;

import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: oia  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oia implements Runnable {
    public final /* synthetic */ oie a;
    public final /* synthetic */ Bundle b;
    private final /* synthetic */ int c;

    public /* synthetic */ oia(oie oieVar, Bundle bundle) {
        this.a = oieVar;
        this.b = bundle;
    }

    public /* synthetic */ oia(oie oieVar, Bundle bundle, int i) {
        this.c = i;
        this.a = oieVar;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            oie oieVar = this.a;
            oieVar.t(this.b, oieVar.b);
        } else if (i == 1) {
            oie oieVar2 = this.a;
            oieVar2.aD.b(this.b);
        } else if (i == 2) {
            oie oieVar3 = this.a;
            oieVar3.ap.c(this.b);
        } else {
            oie oieVar4 = this.a;
            oieVar4.aq.s((View) oieVar4.B.get(), oieVar4.C, oieVar4.m, this.b);
        }
    }
}
