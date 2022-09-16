package defpackage;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aknn  reason: default package */
/* loaded from: classes2.dex */
public final class aknn {
    public final Context a;
    public final auhi b;
    public final dxio<akfa> c;
    public final auhj d;

    public aknn(Application application, auhi auhiVar, dxio<akfa> dxioVar, auhj auhjVar) {
        this.a = application;
        this.b = auhiVar;
        this.c = dxioVar;
        this.d = auhjVar;
    }

    public static String a(dlfr dlfrVar) {
        String str;
        if ((dlfrVar.a & 1) != 0) {
            dlfq dlfqVar = dlfrVar.b;
            if (dlfqVar == null) {
                dlfqVar = dlfq.c;
            }
            str = dlfqVar.a;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return null;
    }

    public static String b(dlfr dlfrVar) {
        String str;
        if ((dlfrVar.a & 1) != 0) {
            dlfq dlfqVar = dlfrVar.b;
            if (dlfqVar == null) {
                dlfqVar = dlfq.c;
            }
            str = dlfqVar.b;
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str) ? str : cjrx.a(ddcu.Jn.a);
    }
}
