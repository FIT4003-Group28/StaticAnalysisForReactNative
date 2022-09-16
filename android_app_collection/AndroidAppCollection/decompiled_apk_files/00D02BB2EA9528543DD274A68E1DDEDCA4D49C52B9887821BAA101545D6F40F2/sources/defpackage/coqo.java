package defpackage;

import android.accounts.Account;
import com.google.android.gms.location.reporting.UploadRequest;
/* compiled from: PG */
/* renamed from: coqo  reason: default package */
/* loaded from: classes5.dex */
public final class coqo {
    public final Account a;
    public final String b;
    public final long c;
    public long d = Long.MAX_VALUE;
    public long e = Long.MAX_VALUE;
    public String f;

    public coqo(Account account, String str, long j) {
        this.a = account;
        cnwc.n(str, "reason");
        this.b = str;
        this.c = j;
    }

    public final UploadRequest a() {
        return new UploadRequest(this);
    }

    public final void b(long j) {
        this.d = j;
        this.e = j;
    }
}
