package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zhy  reason: default package */
/* loaded from: classes4.dex */
public class zhy extends Exception implements zeo {
    public zhy(String str) {
        super(str);
    }

    @Override // defpackage.zeo
    public zdy a(Context context) {
        return zdy.a(context, R.string.common_error_response, new Object[0]);
    }

    public zhy(Throwable th, byte[] bArr) {
        super("Failed to convert URI", th);
    }

    public zhy(Throwable th) {
        super(th);
    }
}
