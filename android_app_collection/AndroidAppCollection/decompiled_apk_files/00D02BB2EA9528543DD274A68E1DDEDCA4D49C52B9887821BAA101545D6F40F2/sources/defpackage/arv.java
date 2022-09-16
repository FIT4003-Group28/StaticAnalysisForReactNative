package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: arv  reason: default package */
/* loaded from: classes2.dex */
public final class arv {
    public static arm a;
    public final Context b;
    public final ArrayList<are> c = new ArrayList<>();

    public arv(Context context) {
        this.b = context;
    }

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static final arq b() {
        a();
        return a.a();
    }

    public static final arq c() {
        a();
        return a.b();
    }

    public static final void d(arq arqVar) {
        a();
        a.c(arqVar, 3);
    }
}
