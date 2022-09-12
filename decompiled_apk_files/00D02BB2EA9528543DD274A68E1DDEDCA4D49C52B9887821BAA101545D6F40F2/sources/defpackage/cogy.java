package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cogy  reason: default package */
/* loaded from: classes5.dex */
public final class cogy {
    public final Context a;
    public final cohd b;
    public final ExecutorService c;
    public final Class<? extends cogo> d;

    public cogy(Context context, cohd cohdVar, ExecutorService executorService, Class<? extends cogo> cls) {
        this.a = context;
        this.b = cohdVar;
        this.c = executorService;
        this.d = cls;
    }

    public static void a(String str) {
        dbsk.g(str.startsWith("/"), "collection must start with \"/\" but is \"%s\"", str);
    }
}
