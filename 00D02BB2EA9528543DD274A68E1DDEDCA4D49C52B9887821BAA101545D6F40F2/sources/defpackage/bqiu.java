package defpackage;
/* compiled from: PG */
/* renamed from: bqiu  reason: default package */
/* loaded from: classes4.dex */
final class bqiu extends bqiq {
    private volatile transient bbtm d;
    private volatile transient dnwl e;

    public bqiu(String str, dbsg<bbtm> dbsgVar, dbsg<dnwl> dbsgVar2) {
        super(str, dbsgVar, dbsgVar2);
    }

    @Override // defpackage.bqkl
    public final bbtm d() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = this.b.e(new dbty(this) { // from class: bqkj
                        private final bqkl a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.dbty
                        public final Object a() {
                            return bqsf.b(this.a.e());
                        }
                    });
                    if (this.d == null) {
                        throw new NullPointerException("metadata() cannot return null");
                    }
                }
            }
        }
        return this.d;
    }

    @Override // defpackage.bqkl
    public final dnwl e() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = this.c.e(new dbty(this) { // from class: bqkk
                        private final bqkl a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.dbty
                        public final Object a() {
                            return bqsf.c(this.a.d());
                        }
                    });
                    if (this.e == null) {
                        throw new NullPointerException("description() cannot return null");
                    }
                }
            }
        }
        return this.e;
    }
}
