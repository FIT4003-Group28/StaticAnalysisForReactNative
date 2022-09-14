package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: byvv  reason: default package */
/* loaded from: classes4.dex */
public final class byvv {
    public static Intent a(String str, Context context, Class<?> cls) {
        return new Intent(str, Uri.EMPTY, context, cls);
    }
}
