package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: cxtr  reason: default package */
/* loaded from: classes5.dex */
public final class cxtr {
    public final boolean a;
    public final View b;
    public final cxsq c;
    public final cxvt d;

    public cxtr(cxtq cxtqVar) {
        Context context = cxtqVar.a;
        this.a = cxtqVar.c;
        this.b = cxtqVar.e;
        this.c = cxtqVar.f;
        cxvs a = cxvt.a();
        a.a = context;
        a.b = null;
        a.c = null;
        a.d = cxtqVar.b;
        a.e = cxtqVar.c;
        a.f = cxtqVar.d;
        this.d = a.a();
    }

    public static cxtq b() {
        return new cxtq();
    }

    public final boolean a() {
        return this.d.c;
    }
}
