package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgod  reason: default package */
/* loaded from: classes3.dex */
public class bgod implements bgnl {
    @dzsi
    private final bgoj a;
    @dzsi
    private final Runnable b;
    private final bgnt c;
    private final boolean d;
    private final int e;
    private final dipk f;

    public bgod(Activity activity, bmdq bmdqVar, bgpa bgpaVar, dxio<afha> dxioVar, dxio<bvvw> dxioVar2, dxio<apyz> dxioVar3, btvo btvoVar, dipk dipkVar, String str, @dzsi Runnable runnable, @dzsi Runnable runnable2, boolean z, int i, ilo iloVar) {
        this.b = runnable;
        this.d = z;
        this.e = i;
        this.f = dipkVar;
        bgot.g(dipkVar, activity, i, iloVar, bmdqVar, bgnk.PLACESHEET_CAROUSEL, dxioVar);
        this.a = dipkVar.m.size() > 0 ? new bgoj(dipkVar, z, runnable2, i) : null;
        this.c = bgpaVar.a(dipkVar, dxioVar2, dxioVar3, btvoVar, i, iloVar, bgnk.PLACESHEET_CAROUSEL);
    }

    @Override // defpackage.bgnl
    @dzsi
    public bgnn a() {
        return this.a;
    }

    @Override // defpackage.bgnl
    public cqkl b() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.bgnl
    public bgnt c() {
        return this.c;
    }

    @Override // defpackage.bgnl
    public cjtd d() {
        cjta cjtaVar = new cjta();
        cjtaVar.g(this.f.q);
        if (this.d) {
            cjtaVar.d = dtxy.ju;
            cjtaVar.i(this.e);
        } else {
            cjtaVar.d = dtxy.jq;
        }
        bgnf.a(cjtaVar, this.f);
        return cjtaVar.a();
    }

    @Override // defpackage.bgnl
    public Boolean e() {
        boolean z = true;
        if (this.c.f().isEmpty() && !this.c.s().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
