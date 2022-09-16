package defpackage;

import android.media.MediaRouter;
import android.view.Display;
/* compiled from: PG */
/* renamed from: asi  reason: default package */
/* loaded from: classes2.dex */
public final class asi {
    public static Display a(Object obj) {
        try {
            return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }
}
