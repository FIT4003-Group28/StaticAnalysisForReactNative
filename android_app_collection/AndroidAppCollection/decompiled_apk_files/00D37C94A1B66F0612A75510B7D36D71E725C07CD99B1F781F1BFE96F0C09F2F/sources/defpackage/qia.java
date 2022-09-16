package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
/* compiled from: PG */
/* renamed from: qia  reason: default package */
/* loaded from: classes4.dex */
public final class qia extends UserRecoverableAuthException {
    public final int a;

    public qia(int i, String str, Intent intent) {
        super(str, intent);
        this.a = i;
    }
}
