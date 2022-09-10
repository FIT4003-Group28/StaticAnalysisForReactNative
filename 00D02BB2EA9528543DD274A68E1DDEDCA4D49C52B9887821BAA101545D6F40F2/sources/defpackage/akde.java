package defpackage;

import android.accounts.Account;
import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: akde  reason: default package */
/* loaded from: classes2.dex */
final class akde implements DialogInterface.OnCancelListener {
    final /* synthetic */ Account a;
    final /* synthetic */ akey b;
    final /* synthetic */ akdv c;

    public akde(akdv akdvVar, Account account, akey akeyVar) {
        this.c = akdvVar;
        this.a = account;
        this.b = akeyVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.a != null) {
            this.c.b.w(this.b, false, false);
        }
    }
}
