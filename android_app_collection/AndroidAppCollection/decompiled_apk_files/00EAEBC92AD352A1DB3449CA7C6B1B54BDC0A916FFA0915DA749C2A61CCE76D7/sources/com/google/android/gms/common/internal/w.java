package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f7061a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7062b;

    public w(Context context) {
        s.a(context);
        this.f7061a = context.getResources();
        this.f7062b = this.f7061a.getResourcePackageName(com.google.android.gms.common.k.common_google_play_services_unknown_issue);
    }

    public String a(String str) {
        int identifier = this.f7061a.getIdentifier(str, "string", this.f7062b);
        if (identifier == 0) {
            return null;
        }
        return this.f7061a.getString(identifier);
    }
}
