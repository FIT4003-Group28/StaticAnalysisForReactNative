package defpackage;

import defpackage.cqkp;
import defpackage.zfp;
/* compiled from: PG */
/* renamed from: uzr  reason: default package */
/* loaded from: classes7.dex */
public abstract class uzr<T extends zfp, U extends cqkp> extends cqiw<T> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<T> a() {
        final cqmj gd = cqgr.gd(cqgr.bp(-2), e());
        final cqmj fY = cqgr.fY(new cqmp[0]);
        return cqgr.fY(cqgr.bw(8388629), cqgr.aF(uzp.a), cqgr.gv(cqgr.cd(-1), cqgr.bp(-2), cqgr.cF(true), cqgr.o(false), cqgr.aY(vld.a(0.0f, 1.0f)), cqgr.du(vld.a(1.0f, 0.0f)), cqgr.ad(new cqlc(fY, gd) { // from class: uzq
            private final cqmj a;
            private final cqmj b;

            {
                this.a = fY;
                this.b = gd;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqmj cqmjVar = this.a;
                cqmj cqmjVar2 = this.b;
                zfp zfpVar = (zfp) cqkpVar;
                int i = uzr.a;
                if (!cqjv.v(zfpVar.aa()).booleanValue()) {
                    izl aa = zfpVar.aa();
                    dbsk.s(aa);
                    if (aa.b().booleanValue()) {
                        return cqmjVar2.c();
                    }
                }
                return cqmjVar.c();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), gd, fY));
    }

    protected abstract cqmm<T, U> e();
}
