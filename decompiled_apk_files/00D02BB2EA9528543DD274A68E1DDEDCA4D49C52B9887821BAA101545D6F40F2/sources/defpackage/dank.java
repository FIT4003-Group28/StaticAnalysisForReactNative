package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dank  reason: default package */
/* loaded from: classes5.dex */
public final class dank {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
