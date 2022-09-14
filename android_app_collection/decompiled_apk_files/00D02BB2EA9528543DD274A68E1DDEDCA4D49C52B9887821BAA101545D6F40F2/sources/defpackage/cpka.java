package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: cpka  reason: default package */
/* loaded from: classes.dex */
public final class cpka {
    static {
        new Intent().setPackage("com.google.android.gsf.login").setAction("com.google.android.gsf.action.GET_GLS").addCategory("android.intent.category.DEFAULT");
    }

    public static String a(String str) {
        return "service_" + str;
    }
}
