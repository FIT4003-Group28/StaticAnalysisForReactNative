package defpackage;

import android.accounts.Account;
import android.content.Context;
/* compiled from: PG */
/* renamed from: rzf  reason: default package */
/* loaded from: classes4.dex */
public final class rzf implements axyh {
    public static final anay a = sbs.e();
    public final Context b;
    public final Account c;

    public rzf(Context context, Account account) {
        this.b = context;
        this.c = account;
    }

    @Override // defpackage.axyh
    public final axyg a(ayax ayaxVar, axyd axydVar, axye axyeVar) {
        return new rze(this, axyeVar.a(ayaxVar, axydVar));
    }
}
