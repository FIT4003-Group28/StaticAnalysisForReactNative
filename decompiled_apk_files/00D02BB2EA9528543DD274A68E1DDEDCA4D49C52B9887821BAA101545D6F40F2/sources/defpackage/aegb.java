package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
/* compiled from: PG */
/* renamed from: aegb  reason: default package */
/* loaded from: classes.dex */
public final class aegb {
    public static void a(aegc aegcVar, float f, @dzsi cjqy cjqyVar, @dzsi cjtd cjtdVar) {
        aegcVar.setGestureDetector(new GestureDetector(aegcVar.o().getContext(), new aega(aegcVar, f, cjqyVar, cjtdVar), new Handler(Looper.getMainLooper())));
    }
}
