package defpackage;

import android.text.TextUtils;
/* renamed from: daqs  reason: default package */
/* loaded from: classes5.dex */
public final class daqs {
    public static void a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }
}
