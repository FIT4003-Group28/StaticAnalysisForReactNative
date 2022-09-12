package defpackage;

import android.content.Context;
import android.graphics.Color;
/* compiled from: PG */
/* renamed from: cppi  reason: default package */
/* loaded from: classes5.dex */
public final class cppi {
    public boolean a;
    public cppj b;
    public final int c;
    public boolean d;
    public final float e;
    public boolean f;
    private final float g;

    public cppi(Context context) {
        this.g = 0.0f;
        this.a = false;
        this.c = Color.parseColor("#C0C0C0");
        this.d = true;
        this.e = cpqk.a(context, 1.0f);
    }

    public final void a() {
        this.f = true;
    }

    public cppi(cppi cppiVar) {
        this.g = 0.0f;
        this.a = cppiVar.a;
        this.b = cppiVar.b;
        this.c = cppiVar.c;
        this.d = cppiVar.d;
        this.e = cppiVar.e;
        this.f = cppiVar.f;
        float f = cppiVar.g;
    }
}
