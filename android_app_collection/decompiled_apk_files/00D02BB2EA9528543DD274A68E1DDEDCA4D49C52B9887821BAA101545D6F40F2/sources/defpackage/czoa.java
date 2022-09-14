package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: czoa  reason: default package */
/* loaded from: classes5.dex */
public final class czoa {
    public final Context a;
    public final String b;
    public czob c;
    public String d;
    public Account e;
    public boolean f;

    public czoa(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Client context is not set.");
        }
        if (!TextUtils.isEmpty(str)) {
            this.a = context;
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
    }
}
