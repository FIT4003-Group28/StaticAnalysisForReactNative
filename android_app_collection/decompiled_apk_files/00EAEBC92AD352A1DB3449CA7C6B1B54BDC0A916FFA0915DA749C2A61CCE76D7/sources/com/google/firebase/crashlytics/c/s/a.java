package com.google.firebase.crashlytics.c.s;

import android.content.Context;
import com.google.firebase.crashlytics.c.h.h;
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9163a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9164b = false;

    /* renamed from: c  reason: collision with root package name */
    private String f9165c;

    public a(Context context) {
        this.f9163a = context;
    }

    @Override // com.google.firebase.crashlytics.c.s.b
    public String a() {
        if (!this.f9164b) {
            this.f9165c = h.l(this.f9163a);
            this.f9164b = true;
        }
        String str = this.f9165c;
        if (str != null) {
            return str;
        }
        return null;
    }
}
