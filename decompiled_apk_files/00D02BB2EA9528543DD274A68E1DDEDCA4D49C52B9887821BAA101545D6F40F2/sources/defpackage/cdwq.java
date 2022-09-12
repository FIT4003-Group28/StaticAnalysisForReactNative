package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cdwq  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdwq {
    public static final cdwq b = cduf.a;

    public static cdwq d(Uri uri, String str) {
        return new cdug(new cdum(uri, str));
    }

    public static cdwq e(Uri uri) {
        return new cduh(new cdun(uri));
    }

    public abstract int a();

    public abstract cdwm b();

    public abstract cdwp c();
}
