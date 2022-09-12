package defpackage;

import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: cnjc  reason: default package */
/* loaded from: classes.dex */
public final class cnjc {
    public static final /* synthetic */ int a = 0;

    static {
        new ConcurrentHashMap();
    }

    public static boolean a(String str, int i) {
        return Log.isLoggable(str, i);
    }
}
