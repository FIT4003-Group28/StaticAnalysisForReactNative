package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cspk  reason: default package */
/* loaded from: classes5.dex */
public abstract class cspk {
    public static cspk d(Context context, String str) {
        return new cspl(context.getPackageName(), str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();
}
