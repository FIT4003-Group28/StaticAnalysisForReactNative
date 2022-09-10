package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: czhg  reason: default package */
/* loaded from: classes.dex */
public final class czhg {
    private volatile czhd a;
    private final Object b = new Object();
    private final boolean c;
    private final czhj d;

    public czhg(boolean z, czhj czhjVar) {
        this.c = z;
        this.d = czhjVar;
    }

    public final czhd a(Context context) {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    czhd czhdVar = new czhd(context);
                    if (this.c) {
                        czhdVar.b = czhd.i(context);
                    }
                    if (this.d != null) {
                        czhj.a(czhdVar);
                    }
                    this.a = czhdVar;
                }
            }
        }
        return this.a;
    }
}
