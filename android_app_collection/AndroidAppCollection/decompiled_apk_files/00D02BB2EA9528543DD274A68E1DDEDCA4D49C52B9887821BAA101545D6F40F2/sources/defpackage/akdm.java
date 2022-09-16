package defpackage;

import android.accounts.Account;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akdm  reason: default package */
/* loaded from: classes2.dex */
public final class akdm implements dbty<btlu> {
    final /* synthetic */ String a;
    final /* synthetic */ akdv b;

    public akdm(akdv akdvVar, String str) {
        this.b = akdvVar;
        this.a = str;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ btlu a() {
        Account e = akby.e(this.b.b.u(), this.a);
        btlu q = btlu.q(e == null ? null : this.b.d.b(e));
        q.e = btls.PICKED_BY_USER_OR_TASK;
        return q;
    }
}
