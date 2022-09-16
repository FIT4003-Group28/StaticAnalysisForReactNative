package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: uel  reason: default package */
/* loaded from: classes4.dex */
public final class uel {
    private static volatile uem a;

    public static uem a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof axon) {
            return (uem) ((axon) applicationContext).lI();
        }
        if (applicationContext instanceof dvp) {
            return (uem) ((dvp) applicationContext).a();
        }
        throw new IllegalStateException("Unable to get ChimeComponent from host app. Did you mean for your application to extend GeneratedComponentManager or HasComponent or to use jcga.libraries.notifications.injection.Chime#set(ChimeComponent)?");
    }
}
