package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aggv  reason: default package */
/* loaded from: classes.dex */
public final class aggv {
    static final int a;
    public static final yjn b;

    static {
        int seconds = (int) TimeUnit.MINUTES.toSeconds(10L);
        a = seconds;
        TimeUnit.HOURS.toSeconds(3L);
        b = new yjn(0, seconds);
    }

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("identityId", str);
        return bundle;
    }
}
