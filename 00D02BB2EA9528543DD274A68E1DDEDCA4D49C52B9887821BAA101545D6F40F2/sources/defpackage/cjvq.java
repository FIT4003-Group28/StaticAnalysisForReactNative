package defpackage;
/* compiled from: PG */
/* renamed from: cjvq  reason: default package */
/* loaded from: classes.dex */
public final class cjvq extends cjwa {
    private final dzsj<duxm> a;
    private final dxio<ckcw> d;
    private final dxio<bvjj> e;

    public cjvq(akfa akfaVar, dxio<ckcw> dxioVar, dzsj<duxm> dzsjVar, dxio<bvjj> dxioVar2) {
        super(akfaVar);
        this.d = dxioVar;
        this.a = dzsjVar;
        this.e = dxioVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjwa
    public final boolean a(cjtk cjtkVar) {
        int a = duxl.a(this.a.a().k);
        if (a != 0) {
            if (a != 2 && a != 3) {
                if (a == 4) {
                    return !cjtkVar.f();
                } else if (a != 5) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjwa
    public final void b(@dzsi btlu btluVar, cjtk cjtkVar, cjwj cjwjVar) {
        if (!this.e.a().i(bvjk.br)) {
            d(btluVar, cjtkVar, cjwjVar);
        } else {
            c(cjvz.d(btluVar, dcdc.f(cjtkVar), cjwjVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c3, code lost:
        if (r7 != 10) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d4, code lost:
        if ((r5.a & 32768) == 0) goto L73;
     */
    @Override // defpackage.cjwa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.cjvz r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjvq.c(cjvz):void");
    }
}
