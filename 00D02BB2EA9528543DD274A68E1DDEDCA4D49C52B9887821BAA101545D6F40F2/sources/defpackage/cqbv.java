package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: cqbv  reason: default package */
/* loaded from: classes5.dex */
public final class cqbv {
    private static cqby a;

    public static final cqbw a(Context context, Integer num, dsmh dsmhVar, Account account, dskf dskfVar) {
        cnjz cnjzVar = new cnjz(context, "FPOP_CLIENT", account.name);
        if (a == null) {
            a = new cqby(Executors.newSingleThreadScheduledExecutor(), new czna(context, "STREAMZ_FOOTPRINTS_CONSENT_FLOWS"));
        }
        return new cqbw(a, num, dsmhVar, cnjzVar, dskfVar);
    }
}
