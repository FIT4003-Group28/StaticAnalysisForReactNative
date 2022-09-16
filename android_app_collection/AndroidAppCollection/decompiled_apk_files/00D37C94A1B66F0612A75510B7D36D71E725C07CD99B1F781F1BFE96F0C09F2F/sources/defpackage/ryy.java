package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ryy  reason: default package */
/* loaded from: classes4.dex */
public final class ryy {
    public static final /* synthetic */ int a = 0;
    private static final Intent b = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));

    public static ampq a(Context context) {
        ampq ampqVar;
        amtf d = amtf.d(context.getPackageManager().queryIntentActivities(b, Build.VERSION.SDK_INT >= 23 ? 131136 : 64));
        mem memVar = mem.r;
        Iterator it = d.h().iterator();
        it.getClass();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (memVar.a(next)) {
                    ampqVar = ampq.j(next);
                    break;
                }
            } else {
                ampqVar = amon.a;
                break;
            }
        }
        return ampqVar.b(ryj.e);
    }
}
