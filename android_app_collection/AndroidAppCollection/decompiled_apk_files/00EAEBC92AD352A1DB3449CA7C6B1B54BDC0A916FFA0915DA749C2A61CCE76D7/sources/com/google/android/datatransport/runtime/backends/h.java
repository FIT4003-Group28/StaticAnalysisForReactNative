package com.google.android.datatransport.runtime.backends;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class h {
    public static h a(Context context, c.e.a.a.i.y.a aVar, c.e.a.a.i.y.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context a();

    public abstract String b();

    public abstract c.e.a.a.i.y.a c();

    public abstract c.e.a.a.i.y.a d();
}
