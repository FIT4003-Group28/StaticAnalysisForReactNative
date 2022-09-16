package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bfg  reason: default package */
/* loaded from: classes3.dex */
public final class bfg {
    private static bfg e;
    public final bew a;
    public final bex b;
    public final bfe c;
    public final bff d;

    private bfg(Context context, bif bifVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new bew(applicationContext, bifVar);
        this.b = new bex(applicationContext, bifVar);
        this.c = new bfe(applicationContext, bifVar);
        this.d = new bff(applicationContext, bifVar);
    }

    public static synchronized bfg a(Context context, bif bifVar) {
        bfg bfgVar;
        synchronized (bfg.class) {
            if (e == null) {
                e = new bfg(context, bifVar);
            }
            bfgVar = e;
        }
        return bfgVar;
    }
}
