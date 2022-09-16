package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: lis  reason: default package */
/* loaded from: classes3.dex */
public final class lis implements Runnable {
    final /* synthetic */ lit a;

    public lis(lit litVar) {
        this.a = litVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.c.a();
            lit litVar = this.a;
            Handler handler = litVar.d;
            final Activity activity = litVar.a;
            final lir lirVar = new lir(this);
            handler.post(new Runnable() { // from class: liu
                @Override // java.lang.Runnable
                public final void run() {
                    Context context = activity;
                    new AlertDialog.Builder(context).setMessage("Success. Please restart your app.").setPositiveButton("Restart", lirVar).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).show();
                }
            });
        } catch (aart e) {
            lit litVar2 = this.a;
            Handler handler2 = litVar2.d;
            Activity activity2 = litVar2.a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Refresh failed: ");
            sb.append(valueOf);
            llm.j(handler2, activity2, sb.toString(), true);
        }
    }
}
