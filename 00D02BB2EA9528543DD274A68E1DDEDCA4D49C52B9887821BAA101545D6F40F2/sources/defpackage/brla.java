package defpackage;

import android.content.Context;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* compiled from: PG */
/* renamed from: brla  reason: default package */
/* loaded from: classes4.dex */
public final class brla {
    public static void a(@dzsi ExtendedFloatingActionButton extendedFloatingActionButton, Context context) {
        if (c(extendedFloatingActionButton)) {
            return;
        }
        int a = jmj.a(context, 16);
        int a2 = jmj.a(context, 20);
        dbsk.s(extendedFloatingActionButton);
        extendedFloatingActionButton.setPaddingRelative(a2, a, a2, a);
        dbsk.s(extendedFloatingActionButton);
        extendedFloatingActionButton.e();
    }

    public static void b(@dzsi ExtendedFloatingActionButton extendedFloatingActionButton, Context context) {
        if (c(extendedFloatingActionButton)) {
            return;
        }
        int a = jmj.a(context, 16);
        dbsk.s(extendedFloatingActionButton);
        extendedFloatingActionButton.setPaddingRelative(a, a, a, a);
        dbsk.s(extendedFloatingActionButton);
        extendedFloatingActionButton.f();
    }

    public static boolean c(@dzsi ExtendedFloatingActionButton extendedFloatingActionButton) {
        return extendedFloatingActionButton == null || extendedFloatingActionButton.getVisibility() != 0;
    }
}
