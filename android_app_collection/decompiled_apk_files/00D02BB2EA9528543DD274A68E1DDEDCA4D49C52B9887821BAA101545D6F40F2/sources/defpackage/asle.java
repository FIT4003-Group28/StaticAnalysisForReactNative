package defpackage;

import defpackage.asle;
/* compiled from: PG */
/* renamed from: asle  reason: default package */
/* loaded from: classes2.dex */
public class asle<T extends asle<T>> {
    public asld a;
    @dzsi
    public Float b;
    public boolean c;
    public boolean d;

    public asle() {
        this.a = asld.FOLLOWING;
    }

    public aslf a() {
        b();
        return new aslf(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
    }

    public final void c() {
        this.b = null;
    }

    public asle(aslf aslfVar) {
        this.a = asld.FOLLOWING;
        dbsk.s(aslfVar);
        this.a = aslfVar.a;
        this.b = aslfVar.b;
        this.c = aslfVar.c;
        this.d = aslfVar.d;
    }
}
