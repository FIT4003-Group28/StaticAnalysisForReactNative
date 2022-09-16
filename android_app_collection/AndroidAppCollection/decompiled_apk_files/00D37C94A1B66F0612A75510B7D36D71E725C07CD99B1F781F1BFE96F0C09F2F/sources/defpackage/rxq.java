package defpackage;

import android.content.ContentResolver;
import android.content.Context;
/* compiled from: PG */
/* renamed from: rxq  reason: default package */
/* loaded from: classes4.dex */
public abstract class rxq {
    public static ContentResolver a;
    protected final String b;
    protected final Object c;

    /* JADX INFO: Access modifiers changed from: protected */
    public rxq(String str, Object obj) {
        this.b = str;
        this.c = obj;
    }

    public static void b(Context context) {
        a = context.getContentResolver();
    }

    public static rxq c(String str) {
        return new rxo(str, false);
    }

    public abstract Object a();
}
