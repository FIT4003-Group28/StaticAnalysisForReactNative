package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
/* compiled from: PG */
/* renamed from: cmrj  reason: default package */
/* loaded from: classes.dex */
public final class cmrj extends UserRecoverableAuthException {
    public final int a;

    public cmrj(int i, String str, Intent intent) {
        super(str, intent);
        this.a = i;
    }
}
