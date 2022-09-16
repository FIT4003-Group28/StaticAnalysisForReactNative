package defpackage;

import android.content.ContentResolver;
import android.content.Context;
/* compiled from: PG */
/* renamed from: cpkh  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpkh<T> {
    public static ContentResolver a;
    protected final String b;
    protected final T c;

    /* JADX INFO: Access modifiers changed from: protected */
    public cpkh(String str, T t) {
        this.b = str;
        this.c = t;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static cpkh<Boolean> c(String str) {
        return new cpkf(str, false);
    }

    public abstract T a();
}
