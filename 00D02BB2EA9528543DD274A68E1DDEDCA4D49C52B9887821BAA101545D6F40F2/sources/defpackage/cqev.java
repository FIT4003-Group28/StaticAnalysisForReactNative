package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: cqev  reason: default package */
/* loaded from: classes5.dex */
public final class cqev {
    private static cqey a;

    public static final cqew a(Context context, Account account, Integer num, dgyd dgydVar) {
        cnjz cnjzVar = new cnjz(context, "LOCATION_CONSENT", account.name);
        if (a == null) {
            a = new cqey(Executors.newSingleThreadScheduledExecutor(), new czna(context, "STREAMZ_LOCATION_CONSENT_FLOWS"));
        }
        return new cqew(cnjzVar, a, num, dgydVar);
    }
}
