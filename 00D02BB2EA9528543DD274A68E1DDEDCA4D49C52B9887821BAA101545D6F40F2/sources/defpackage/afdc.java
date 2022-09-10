package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afdc  reason: default package */
/* loaded from: classes2.dex */
final class afdc implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ afdd b;

    public afdc(afdd afddVar, String str) {
        this.b = afddVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (gcu.a(this.b.o)) {
            iii iiiVar = new iii();
            iiiVar.b = this.a;
            iiiVar.d(this.b.o.getString(R.string.INCOGNITO_TRANSITION_DIALOG_DISMISS_TEXT), new View.OnClickListener(this) { // from class: afda
                private final afdc a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b.o.g().f();
                }
            }, null);
            iiiVar.c = new DialogInterface.OnCancelListener(this) { // from class: afdb
                private final afdc a;

                {
                    this.a = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.a.b.o.g().f();
                }
            };
            afdd afddVar = this.b;
            iiiVar.a(afddVar.o, afddVar.v.a()).k();
        }
    }
}
