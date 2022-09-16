package defpackage;

import android.accounts.Account;
import android.content.Context;
/* compiled from: PG */
/* renamed from: rwv  reason: default package */
/* loaded from: classes4.dex */
public final class rwv extends qst {
    public final Context a;
    public final String b;
    public final int c;
    public final int d;

    public rwv(Context context, rwp rwpVar) {
        super(context, rwq.a, rwpVar, new anwi(1));
        this.a = context;
        this.c = rwpVar.a;
        Account account = rwpVar.c;
        this.b = account != null ? account.name : null;
        this.d = 1;
    }
}
