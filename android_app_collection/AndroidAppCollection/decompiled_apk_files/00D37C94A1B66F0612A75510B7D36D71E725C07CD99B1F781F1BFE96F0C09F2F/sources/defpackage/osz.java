package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.b;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c;
import com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.j;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: osz  reason: default package */
/* loaded from: classes4.dex */
public final class osz {
    public static otb a(int i, int i2, int i3) {
        return new otd(i, i2, i3);
    }

    public static otb b() {
        return new otd(1, 2500, 5000);
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static c d(Context context, Handler handler, aafo aafoVar, final ViewGroup viewGroup) {
        final b bVar = new b(context);
        bVar.ns(new ahyg() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.d
            @Override // defpackage.ahyg
            public final void d(ahyh ahyhVar, View view) {
                viewGroup.addView(view, bVar.c());
            }
        });
        return new j(bVar, Optional.of(handler), aafoVar);
    }

    public static ayoi e(final Context context, final Handler handler, ayoi ayoiVar, final ViewGroup viewGroup) {
        return ayoi.m(com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.V(ona.e), ayoiVar, new aypx() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.e
            @Override // defpackage.aypx
            public final Object a(Object obj, Object obj2) {
                Context context2 = context;
                Handler handler2 = handler;
                ViewGroup viewGroup2 = viewGroup;
                aafo aafoVar = (aafo) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return Optional.of(osz.d(context2, handler2, aafoVar, viewGroup2));
                }
                return Optional.empty();
            }
        });
    }
}
