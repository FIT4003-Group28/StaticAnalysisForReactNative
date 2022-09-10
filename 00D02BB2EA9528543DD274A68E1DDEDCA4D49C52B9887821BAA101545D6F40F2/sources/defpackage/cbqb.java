package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbqb  reason: default package */
/* loaded from: classes4.dex */
public final class cbqb {
    public static void a(ges gesVar, final Runnable runnable, cqkj cqkjVar, cjtd cjtdVar, cjtd cjtdVar2) {
        ff J = gesVar.J();
        if (J == null) {
            return;
        }
        iii iiiVar = new iii();
        iiiVar.a = J.getResources().getString(R.string.UGC_EVENTS_CANCEL_DIALOG_TITLE);
        iiiVar.b = J.getResources().getString(R.string.UGC_EVENTS_CANCEL_DIALOG_TEXT);
        iiiVar.d(J.getResources().getString(R.string.UGC_EVENTS_CANCEL_CONFIRM), new View.OnClickListener(runnable) { // from class: cbpz
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.run();
            }
        }, cjtdVar);
        iiiVar.c(J.getResources().getString(R.string.UGC_EVENTS_CANCEL_BACK), cbqa.a, cjtdVar2);
        iiiVar.a(J, cqkjVar).k();
    }
}
