package defpackage;
/* compiled from: PG */
/* renamed from: cwco  reason: default package */
/* loaded from: classes5.dex */
final class cwco extends cwcc {
    public final cwcm l;
    public final int m;
    public final int n;
    public final int o;
    public cwck p;
    private final cwcl v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cwco(defpackage.cwcl r5, android.content.Context r6) {
        /*
            r4 = this;
            cwcm r0 = r5.b()
            java.lang.String r1 = r0.a()
            android.graphics.drawable.Drawable r2 = r0.e()
            r4.<init>(r1, r2)
            r4.v = r5
            r4.l = r0
            int[] r5 = defpackage.cwcj.a
            r1 = 0
            r2 = 2130969567(0x7f0403df, float:1.754782E38)
            r3 = 2132017728(0x7f140240, float:1.9673743E38)
            android.content.res.TypedArray r5 = r6.obtainStyledAttributes(r1, r5, r2, r3)
            android.content.res.Resources r1 = r6.getResources()     // Catch: java.lang.Throwable -> L64
            r2 = 21
            r3 = 2131100172(0x7f06020c, float:1.7812718E38)
            int r1 = r1.getColor(r3)     // Catch: java.lang.Throwable -> L64
            int r1 = r5.getColor(r2, r1)     // Catch: java.lang.Throwable -> L64
            r4.m = r1     // Catch: java.lang.Throwable -> L64
            android.content.res.Resources r1 = r6.getResources()     // Catch: java.lang.Throwable -> L64
            r2 = 22
            r3 = 2131100316(0x7f06029c, float:1.781301E38)
            int r1 = r1.getColor(r3)     // Catch: java.lang.Throwable -> L64
            int r1 = r5.getColor(r2, r1)     // Catch: java.lang.Throwable -> L64
            r4.n = r1     // Catch: java.lang.Throwable -> L64
            android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> L64
            r1 = 20
            r2 = 2131100156(0x7f0601fc, float:1.7812685E38)
            int r6 = r6.getColor(r2)     // Catch: java.lang.Throwable -> L64
            int r6 = r5.getColor(r1, r6)     // Catch: java.lang.Throwable -> L64
            r4.o = r6     // Catch: java.lang.Throwable -> L64
            r5.recycle()
            dcdc r5 = r0.d()
            r4.j(r5)
            return
        L64:
            r6 = move-exception
            r5.recycle()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwco.<init>(cwcl, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwbn
    public final void e(m mVar) {
        z<cwck> zVar = this.v.a;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cwbn
    public final void l(m mVar) {
        z<cwck> zVar = this.v.a;
        new aa(this) { // from class: cwcn
            private final cwco a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cwco cwcoVar = this.a;
                cwck cwckVar = (cwck) obj;
                if (cwckVar != cwcoVar.p) {
                    cwcoVar.p = cwckVar;
                    cwck cwckVar2 = cwck.STORAGE_AVAILABLE;
                    int ordinal = cwckVar.ordinal();
                    if (ordinal == 0) {
                        cwcoVar.b(new int[]{cwcoVar.m});
                        cwcoVar.h(cwcoVar.l.a());
                        cwcoVar.g(cwcoVar.l.e());
                        cwcoVar.k(dbpy.a);
                    } else if (ordinal == 1) {
                        cwcoVar.b(new int[]{cwcoVar.n});
                        cwcoVar.h(cwcoVar.l.a());
                        cwcoVar.g(cwcoVar.l.e());
                        cwcoVar.k(dbpy.a);
                    } else if (ordinal == 2) {
                        cwcoVar.b(new int[]{cwcoVar.n});
                        cwcoVar.h(cwcoVar.l.c());
                        cwcoVar.g(cwcoVar.l.f());
                        cwcoVar.k(dbpy.a);
                    } else if (ordinal == 3) {
                        cwcoVar.b(new int[]{cwcoVar.o});
                        cwcoVar.h(cwcoVar.l.c());
                        cwcoVar.g(cwcoVar.l.g());
                        cwcoVar.k(dbpy.a);
                    } else if (ordinal == 4) {
                        cwcoVar.b(new int[]{cwcoVar.o});
                        cwcoVar.h(cwcoVar.l.b());
                        cwcoVar.g(cwcoVar.l.g());
                        cwcoVar.k(dbsg.i(Integer.valueOf(cwcoVar.o)));
                    }
                }
                throw null;
            }
        };
        throw null;
    }
}
