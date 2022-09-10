package defpackage;
/* compiled from: PG */
/* renamed from: bcro  reason: default package */
/* loaded from: classes3.dex */
public final class bcro implements bcrn {
    private final ckng a = new ckng();
    private final afxv b;
    private final btvo c;

    public bcro(afxv afxvVar, btvo btvoVar) {
        this.b = afxvVar;
        this.c = btvoVar;
    }

    @Override // defpackage.bcrn
    public final void a(dwfl dwflVar, int i, int i2, dbsg<ilo> dbsgVar) {
        Runnable runnable;
        afxv afxvVar = this.b;
        boolean i3 = afxvVar.i(dwflVar);
        dknr lensParameters = this.c.getLensParameters();
        dknk dknkVar = lensParameters.h;
        if (dknkVar == null) {
            dknkVar = dknk.c;
        }
        int i4 = dknkVar.b;
        dknk dknkVar2 = lensParameters.h;
        if (dknkVar2 == null) {
            dknkVar2 = dknk.c;
        }
        int i5 = dknkVar2.a;
        if (!i3) {
            this.a.b(4032, 4032);
            dwflVar = this.a.a(dwflVar);
        } else if (i4 > 0 && i5 > 0) {
            this.a.b(i4, i5);
            dwflVar = this.a.a(dwflVar);
        }
        dpsn dpsnVar = dwflVar.t;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        akqi j = akqi.j(dpsnVar);
        final afwu afwuVar = new afwu();
        afwuVar.a(2);
        afwuVar.f = 1;
        afwuVar.a(i);
        afwuVar.f = i2;
        afwuVar.a = dbsg.i(dwflVar.h);
        afwuVar.c = dbsg.i(dwflVar);
        bvor.a(dbsgVar, new mw(afwuVar) { // from class: afxb
            private final afxc a;

            {
                this.a = afwuVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                ((afwu) this.a).d = dbsg.i((ilo) obj);
            }
        });
        if (j != null && !j.equals(akqi.a)) {
            afwuVar.b = dbsg.i(j);
        }
        String str = afwuVar.e == 0 ? " lensFilter" : "";
        if (afwuVar.f == 0) {
            str = str.concat(" lensIntentType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        afwv afwvVar = new afwv(afwuVar.e, afwuVar.f, afwuVar.a, afwuVar.b, afwuVar.c, afwuVar.d);
        if (!afwvVar.a().a()) {
            bvoo.h("No image url specified.", new Object[0]);
        } else if (!afxvVar.q.compareAndSet(false, true)) {
        } else {
            if (afxvVar.g.b() && afxvVar.p.compareAndSet(false, true) && (runnable = afxvVar.t) != null) {
                runnable.run();
            }
            ckhe ckheVar = (ckhe) afxvVar.j.a(ckfs.a);
            ckheVar.a();
            afxvVar.d.d(afwvVar.a().b(), new afxu(afxvVar, ckheVar, afwvVar), null);
        }
    }
}
