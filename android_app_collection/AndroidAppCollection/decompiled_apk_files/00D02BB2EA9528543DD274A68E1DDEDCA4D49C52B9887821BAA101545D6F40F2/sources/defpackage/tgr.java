package defpackage;
/* compiled from: PG */
/* renamed from: tgr  reason: default package */
/* loaded from: classes7.dex */
final class tgr extends tgq {
    private volatile transient boolean b;
    private volatile transient boolean c;

    public tgr(int i, btlu btluVar, dbsg dbsgVar, dbsg dbsgVar2, dbsg dbsgVar3, tgu tguVar, thc thcVar) {
        super(i, btluVar, dbsgVar, dbsgVar2, dbsgVar3, tguVar, thcVar);
    }

    @Override // defpackage.tgv
    public final boolean h() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    this.b = true;
                    this.c = true;
                }
            }
        }
        return this.b;
    }
}
