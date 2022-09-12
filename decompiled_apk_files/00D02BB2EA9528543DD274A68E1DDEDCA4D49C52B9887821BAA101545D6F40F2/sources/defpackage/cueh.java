package defpackage;
/* compiled from: PG */
/* renamed from: cueh  reason: default package */
/* loaded from: classes5.dex */
final class cueh extends ctys {
    private volatile transient boolean d;
    private volatile transient boolean e;

    public cueh(String str, dbsg<cuhp> dbsgVar, dbsg<dcdc<cuhl>> dbsgVar2, dbsg<dcdc<cuhi>> dbsgVar3, dbsg<Boolean> dbsgVar4) {
        super(str, dbsgVar, dbsgVar2, dbsgVar3, dbsgVar4);
    }

    @Override // defpackage.cuhg
    public final boolean f() {
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    boolean z = false;
                    if (!this.a.a() || !this.a.b().equals(cuhp.UNKNOWN)) {
                        if (this.b.a()) {
                            dcdc<cuhl> b = this.b.b();
                            int size = b.size();
                            int i = 0;
                            while (i < size) {
                                boolean equals = b.get(i).a().equals(cuhn.UNKNOWN);
                                i++;
                                if (equals) {
                                    break;
                                }
                            }
                        }
                        if (this.c.a()) {
                            dcdc<cuhi> b2 = this.c.b();
                            int size2 = b2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                boolean d = b2.get(i2).d();
                                i2++;
                                if (d) {
                                }
                            }
                        }
                        this.d = z;
                        this.e = true;
                    }
                    z = true;
                    this.d = z;
                    this.e = true;
                }
            }
        }
        return this.d;
    }
}
