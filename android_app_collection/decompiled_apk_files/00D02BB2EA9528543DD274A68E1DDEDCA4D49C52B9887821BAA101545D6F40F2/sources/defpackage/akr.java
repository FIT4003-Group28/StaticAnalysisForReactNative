package defpackage;

import android.content.res.Configuration;
import android.os.Build;
/* compiled from: PG */
/* renamed from: akr  reason: default package */
/* loaded from: classes2.dex */
public final class akr {
    public static akt a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? akt.a(configuration.getLocales()) : akt.b(configuration.locale);
    }
}
