package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgor  reason: default package */
/* loaded from: classes3.dex */
public class bgor implements bgnp {
    @dzsi
    private final bgnq a;
    @dzsi
    private final bgqj b;
    private final bgnt c;
    private final boolean d;

    public bgor(Activity activity, bmdq bmdqVar, bgpa bgpaVar, dxio<bvvw> dxioVar, dxio<apyz> dxioVar2, dxio<afha> dxioVar3, btvo btvoVar, String str, dipk dipkVar, ilo iloVar, int i, bgnk bgnkVar, boolean z, @dzsi bgqj bgqjVar) {
        this.c = bgpaVar.a(dipkVar, dxioVar, dxioVar2, btvoVar, i, iloVar, bgnkVar);
        this.a = bgot.g(dipkVar, activity, i, iloVar, bmdqVar, bgnkVar, dxioVar3);
        this.b = bgqjVar;
        this.d = z;
    }

    @Override // defpackage.bgnp
    @dzsi
    public bgnq a() {
        return this.a;
    }

    @Override // defpackage.bgnp
    public bgnt c() {
        return this.c;
    }

    @Override // defpackage.bgnp
    public Boolean d() {
        boolean z = true;
        if (this.c.f().isEmpty() && !this.c.s().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgnp
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bgnp
    public void f(int i) {
        bgnq bgnqVar = this.a;
        if (bgnqVar != null) {
            bgnqVar.f(i);
        }
        bgqj bgqjVar = this.b;
        if (bgqjVar != null) {
            bgqjVar.a(i);
        }
        this.c.u(i);
    }

    @Override // defpackage.bgnp
    @dzsi
    /* renamed from: g */
    public bgqj b() {
        return this.b;
    }
}
