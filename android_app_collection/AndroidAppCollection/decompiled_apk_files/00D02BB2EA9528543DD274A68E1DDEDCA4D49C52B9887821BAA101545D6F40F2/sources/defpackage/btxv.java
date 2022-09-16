package defpackage;

import android.app.Application;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: btxv  reason: default package */
/* loaded from: classes.dex */
public class btxv {
    public static final int a = (int) TimeUnit.SECONDS.toMillis(3);
    @dzsi
    public ArrayList<btxt> b;
    private final btxs c;
    private final bvrb d;

    public btxv(Application application, btyh btyhVar, bvjj bvjjVar, bvrb bvrbVar) {
        this.c = new btxs(this, application, btyhVar, bvjjVar, b());
        this.d = bvrbVar;
    }

    private static URL b() {
        try {
            return new URL("https://www.gstatic.com/generate_204");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final synchronized void a(btxt btxtVar) {
        dbsk.s(btxtVar);
        ArrayList<btxt> arrayList = this.b;
        if (arrayList == null) {
            ArrayList<btxt> arrayList2 = new ArrayList<>();
            this.b = arrayList2;
            arrayList2.add(btxtVar);
            this.d.b(this.c, bvrj.BACKGROUND_THREADPOOL);
            return;
        }
        arrayList.add(btxtVar);
    }
}
