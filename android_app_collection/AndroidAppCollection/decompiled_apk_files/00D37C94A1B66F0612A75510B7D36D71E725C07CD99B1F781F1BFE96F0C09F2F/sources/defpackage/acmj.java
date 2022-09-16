package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: acmj  reason: default package */
/* loaded from: classes.dex */
public final class acmj implements ajyi {
    private final Activity a;
    private final aafo b;
    private final ajxz c;
    private final ajsa d;
    private acmh e;

    public acmj(dt dtVar, aafo aafoVar, ache acheVar) {
        dtVar.getClass();
        this.a = dtVar;
        aafoVar.getClass();
        this.b = aafoVar;
        acheVar.getClass();
        this.c = acheVar;
        this.d = new ajqw();
    }

    @Override // defpackage.ajyi
    public final void a(Class cls) {
        if (aten.class.isAssignableFrom(cls)) {
            this.d.f(aten.class, b());
        }
    }

    public final acmh b() {
        if (this.e == null) {
            this.e = new acmh(this.a, this.b, this.c);
        }
        return this.e;
    }

    @Override // defpackage.amqo
    public final /* bridge */ /* synthetic */ Object get() {
        return this.d;
    }
}
