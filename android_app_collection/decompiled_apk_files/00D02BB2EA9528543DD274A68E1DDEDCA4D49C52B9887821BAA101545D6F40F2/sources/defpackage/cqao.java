package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: cqao  reason: default package */
/* loaded from: classes5.dex */
public abstract class cqao {
    public abstract cqap a();

    public final Intent b() {
        cqap a = a();
        return new Intent().setPackage(a.d()).setAction("com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS").putExtra("account_name", a.c()).putExtra("assistant_settings_feature", a.a()).putExtras(a.b());
    }
}
