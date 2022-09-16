package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: efm  reason: default package */
/* loaded from: classes6.dex */
public final class efm {
    final dxio<cqkj> a;
    final dxio<Activity> b;

    public efm(dxio<cqkj> dxioVar, dxio<Activity> dxioVar2) {
        this.a = dxioVar;
        this.b = dxioVar2;
    }

    public final void a(int i, final Runnable runnable) {
        iii iiiVar = new iii();
        iiiVar.b = this.b.a().getString(i);
        iiiVar.d(this.b.a().getString(R.string.INCOGNITO_TRANSITION_DIALOG_DISMISS_TEXT), new View.OnClickListener(runnable) { // from class: efi
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.run();
            }
        }, null);
        iiiVar.c = new DialogInterface.OnCancelListener(runnable) { // from class: efj
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.run();
            }
        };
        iiiVar.a(this.b.a(), this.a.a()).k();
    }

    public final void b(final Runnable runnable) {
        iii iiiVar = new iii();
        iiiVar.b = this.b.a().getString(R.string.INCOGNITO_TRANSITION_DIALOG_FAILED_TO_EXIT_CLEAR_DATA_ATTEMPT_TEXT);
        iiiVar.d(this.b.a().getString(R.string.INCOGNITO_TRANSITION_DIALOG_DISMISS_TEXT), new View.OnClickListener(runnable) { // from class: efk
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.run();
            }
        }, null);
        iiiVar.c = new DialogInterface.OnCancelListener(runnable) { // from class: efl
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.run();
            }
        };
        iiiVar.a(this.b.a(), this.a.a()).k();
    }
}
