package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afeo  reason: default package */
/* loaded from: classes.dex */
public final class afeo extends aesu {
    public final aetv a;
    final /* synthetic */ afep b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afeo(afep afepVar, aetv aetvVar) {
        super(aetvVar);
        this.b = afepVar;
        this.a = aetvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r1.n != false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x029f, code lost:
        if (r4.e.contains(r32.i()) != false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0588, code lost:
        if (r4.f.contains(r32.i()) != false) goto L288;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // defpackage.aesu, defpackage.aeuo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(final defpackage.afkn r32) {
        /*
            Method dump skipped, instructions count: 1772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afeo.g(afkn):void");
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void h(aesr aesrVar) {
        afep afepVar = this.b;
        if (afepVar.h != null && this.a == afepVar.f) {
            afepVar.A = aesrVar;
        }
        this.a.h(aesrVar);
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void j(afte afteVar) {
        afep afepVar = this.b;
        if (afepVar.h == null || this.a != afepVar.f || afepVar.Q()) {
            this.a.j(afteVar);
        }
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void r() {
        afep afepVar = this.b;
        if (afepVar.h == null || this.a != afepVar.f || afepVar.Q()) {
            this.a.r();
        }
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void v() {
        afep afepVar = this.b;
        aetw aetwVar = afepVar.h;
        if (aetwVar == null || this.a != afepVar.f || aetwVar.e.aM() || !afepVar.w || afepVar.x) {
            this.a.v();
        } else {
            afepVar.x = true;
        }
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void x(final int i) {
        this.b.d.post(new Runnable() { // from class: afen
            @Override // java.lang.Runnable
            public final void run() {
                afeo afeoVar = afeo.this;
                afeoVar.a.x(i);
            }
        });
    }

    @Override // defpackage.aesu, defpackage.aeuo
    public final void y(long j) {
        afep afepVar = this.b;
        afgf afgfVar = afepVar.C;
        if (afgfVar != null && afepVar.h != null) {
            aetw aetwVar = new aetw(afgfVar.b);
            aetwVar.f = afepVar.h.b();
            afepVar.h = aetwVar;
            afepVar.h.g = afgfVar.b.a();
        }
        afepVar.f = afepVar.g;
        afepVar.g = aetv.c;
        afepVar.C = null;
        this.a.i("gts", new afem(this.b.e.d()));
        this.a.y(j);
    }
}
