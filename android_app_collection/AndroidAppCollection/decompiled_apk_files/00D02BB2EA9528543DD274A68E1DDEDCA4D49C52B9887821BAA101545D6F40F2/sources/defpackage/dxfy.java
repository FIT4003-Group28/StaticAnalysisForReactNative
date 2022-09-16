package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dxfy  reason: default package */
/* loaded from: classes6.dex */
public final class dxfy {
    public dxfw a;
    public dxgz b;
    public dxfx c;
    public final Context d;
    public final dxew e;
    public final String f;

    public dxfy(Context context, dxew dxewVar, String str) {
        this.d = context;
        this.e = dxewVar;
        this.f = str;
    }

    public final void a() {
        dxfw dxfwVar = this.a;
        if (dxfwVar != null) {
            dxgt.a();
            try {
                dxfwVar.b.getApplicationContext().unbindService(dxfwVar);
            } catch (IllegalArgumentException unused) {
            }
            dxfwVar.f = 4;
            dxfwVar.d = null;
        }
    }
}
