package defpackage;

import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: kiq  reason: default package */
/* loaded from: classes3.dex */
public final class kiq implements View.OnClickListener {
    final /* synthetic */ kiv a;
    private final /* synthetic */ int b;

    public kiq(kiv kivVar) {
        this.a = kivVar;
    }

    public /* synthetic */ kiq(kiv kivVar, int i) {
        this.b = i;
        this.a = kivVar;
    }

    public kiq(kiv kivVar, int i, byte[] bArr) {
        this.b = i;
        this.a = kivVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            kiv kivVar = this.a;
            xgd xgdVar = kivVar.d;
            if (xgdVar == null) {
                return;
            }
            xgdVar.c(kivVar.g, kivVar.h);
        } else if (i == 1) {
            kiv kivVar2 = this.a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("menu_as_bottom_sheet", true);
            kivVar2.d.a(bundle);
        } else {
            this.a.e();
        }
    }
}
