package defpackage;
/* compiled from: PG */
/* renamed from: wng  reason: default package */
/* loaded from: classes7.dex */
public final class wng {
    public static <T extends cqkp> wnf<T> a(cqmj<T> cqmjVar, cqlc<T, Boolean> cqlcVar) {
        return new wkh(cqmjVar, cqlcVar);
    }

    public static <T extends cqkp> cqmj<T>[] b(final wnf<T>... wnfVarArr) {
        cqmj<T> m;
        final cqlc<T, Boolean> cqlcVar;
        int length = wnfVarArr.length;
        cqmj<T>[] cqmjVarArr = new cqmj[Math.max(0, (length + length) - 1)];
        int i = 0;
        int i2 = 0;
        while (i < wnfVarArr.length) {
            if (i > 0) {
                final int i3 = i - 1;
                cqmj<T> a = wnfVarArr[i3].a();
                cqmj<T> a2 = wnfVarArr[i].a();
                if (!wmb.o(a) || !wmb.o(a2)) {
                    m = wmb.m(cqgr.eI(" "), cqgr.az(false), cqgr.aC(false), cqgr.aW(2));
                } else {
                    m = wmb.m(cqgr.eI(" · "), cqgr.az(false), cqgr.aC(false), cqgr.aW(2));
                }
                final cqlc<T, Boolean> b = wnfVarArr[i].b();
                if (i3 == 0) {
                    cqlcVar = wnfVarArr[0].b();
                } else {
                    cqlcVar = new cqlc(i3, wnfVarArr) { // from class: wnd
                        private final int a;
                        private final wnf[] b;

                        {
                            this.a = i3;
                            this.b = wnfVarArr;
                        }

                        @Override // defpackage.cqlc
                        public final Object a(cqkp cqkpVar) {
                            int i4 = this.a;
                            wnf[] wnfVarArr2 = this.b;
                            int i5 = i4 + 1;
                            Boolean[] boolArr = new Boolean[i5];
                            for (int i6 = 0; i6 < i5; i6++) {
                                if (((Boolean) wnfVarArr2[i6].b().a(cqkpVar)).booleanValue()) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        @Override // defpackage.cqlc
                        public final boolean b() {
                            return false;
                        }
                    };
                }
                m.g(cqgr.aI(new cqlc(b, cqlcVar) { // from class: wne
                    private final cqlc a;
                    private final cqlc b;

                    {
                        this.a = b;
                        this.b = cqlcVar;
                    }

                    @Override // defpackage.cqlc
                    public final Object a(cqkp cqkpVar) {
                        cqlc cqlcVar2 = this.a;
                        cqlc cqlcVar3 = this.b;
                        boolean z = false;
                        if (((Boolean) cqlcVar2.a(cqkpVar)).booleanValue() && ((Boolean) cqlcVar3.a(cqkpVar)).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }

                    @Override // defpackage.cqlc
                    public final boolean b() {
                        return false;
                    }
                }));
                cqmjVarArr[i2] = m;
                i2++;
            }
            cqmjVarArr[i2] = wnfVarArr[i].a();
            i++;
            i2++;
        }
        return cqmjVarArr;
    }
}
