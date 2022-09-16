package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: ylr  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ylr {
    public static ankx a(int i, int i2, String str, Collection collection) {
        yli yliVar = new yli(i2, str.length() != 0 ? "yt-".concat(str) : new String("yt-"));
        if (collection == null || collection.isEmpty()) {
            return anlz.f(new ylk(i, yliVar));
        }
        ylq ylqVar = new ylq(i, yliVar);
        ArrayList arrayList = new ArrayList(collection);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ylo yloVar = (ylo) arrayList.get(i3);
            ykz ykzVar = ylqVar.b;
            if (!ykzVar.a.contains(yloVar)) {
                ykzVar.a.add(yloVar);
            }
        }
        return anlz.f(ylqVar);
    }

    public static void b() {
        if (!e()) {
            return;
        }
        throw new IllegalStateException("In application's main thread");
    }

    public static void c() {
        if (!d()) {
            return;
        }
        throw new IllegalStateException("Not in application's main thread");
    }

    public static boolean d() {
        return !e();
    }

    public static boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
