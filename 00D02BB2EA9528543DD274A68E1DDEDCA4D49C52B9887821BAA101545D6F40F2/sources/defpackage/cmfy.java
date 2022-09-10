package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cmfy  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmfy extends cltk<cmgd, cmge, cmgc> implements cmgb {
    /* JADX INFO: Access modifiers changed from: protected */
    public cmfy() {
        super(new cmgd[2], new cmge[2]);
        cmmn.c(this.d == 2);
        cltg[] cltgVarArr = this.b;
        for (int i = 0; i < 2; i++) {
            cltgVarArr[i].a(1024);
        }
    }

    @Override // defpackage.cltk
    protected final /* bridge */ /* synthetic */ cmgd h() {
        return new cmgd();
    }

    @Override // defpackage.cltk
    protected final /* bridge */ /* synthetic */ cmge i() {
        return new cmfz(new clth(this) { // from class: cmfx
            private final cmfy a;

            {
                this.a = this;
            }

            @Override // defpackage.clth
            public final void a(clti cltiVar) {
                cmfy cmfyVar = this.a;
                cmge cmgeVar = (cmge) cltiVar;
                synchronized (cmfyVar.a) {
                    cmgeVar.clear();
                    O[] oArr = cmfyVar.c;
                    int i = cmfyVar.e;
                    cmfyVar.e = i + 1;
                    oArr[i] = cmgeVar;
                    cmfyVar.f();
                }
            }
        });
    }

    @Override // defpackage.cltk
    protected final /* bridge */ /* synthetic */ cmgc j(Throwable th) {
        return new cmgc("Unexpected decode error", th);
    }

    @Override // defpackage.cltk
    protected final /* bridge */ /* synthetic */ cmgc k(cmgd cmgdVar, cmge cmgeVar, boolean z) {
        cmgd cmgdVar2 = cmgdVar;
        try {
            ByteBuffer byteBuffer = cmgdVar2.b;
            cmmn.f(byteBuffer);
            cmge cmgeVar2 = cmgeVar;
            cmgeVar2.e(cmgdVar2.d, m(byteBuffer.array(), byteBuffer.limit(), z), cmgdVar2.f);
            cmgeVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (cmgc e) {
            return e;
        }
    }

    @Override // defpackage.cmgb
    public final void l(long j) {
    }

    protected abstract cmga m(byte[] bArr, int i, boolean z);
}
