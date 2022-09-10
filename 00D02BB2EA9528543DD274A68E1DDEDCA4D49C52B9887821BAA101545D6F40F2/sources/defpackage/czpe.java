package defpackage;

import android.app.Activity;
import android.text.style.ClickableSpan;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czpe  reason: default package */
/* loaded from: classes5.dex */
public final class czpe extends ClickableSpan {
    final /* synthetic */ Activity a;
    final /* synthetic */ String b;

    public czpe(Activity activity, String str) {
        this.a = activity;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        czpb a = czpb.a();
        try {
            cxnc.b(this.a, this.b);
        } catch (cxnb e) {
            if (String.valueOf(e.a).length() == 0) {
                new String("No app found to open URL: ");
            }
        }
        Activity activity = this.a;
        String str = this.b;
        if (!czov.a(dydo.b(czov.a))) {
            return;
        }
        czoz a2 = czoz.a();
        dtws bZ = dtwv.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dtwv) bZ.b).a = dtwt.a(2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dtwv) bZ.b).b = dtwu.a(4);
        a2.c(bZ.bK(), a.b(), a.c(), activity, str);
    }
}
