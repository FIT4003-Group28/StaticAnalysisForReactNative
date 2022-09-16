package defpackage;

import android.content.Context;
import android.graphics.Color;
/* compiled from: PG */
/* renamed from: sbl  reason: default package */
/* loaded from: classes4.dex */
public final class sbl {
    public boolean a;
    public final int b;
    public final boolean c;
    public final float d;
    public smx e;
    private boolean f;
    private final float g;

    public sbl(Context context) {
        this.g = 0.0f;
        this.a = false;
        this.b = Color.parseColor("#C0C0C0");
        this.c = true;
        this.d = scf.b(context, 1.0f);
    }

    public sbl(sbl sblVar) {
        this.g = 0.0f;
        this.a = sblVar.a;
        this.e = sblVar.e;
        this.b = sblVar.b;
        boolean z = sblVar.c;
        this.c = true;
        this.d = sblVar.d;
        boolean z2 = sblVar.f;
        this.f = false;
        float f = sblVar.g;
    }
}
