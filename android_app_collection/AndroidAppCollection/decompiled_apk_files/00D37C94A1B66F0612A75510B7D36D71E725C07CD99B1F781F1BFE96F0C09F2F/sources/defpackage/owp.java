package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: owp  reason: default package */
/* loaded from: classes4.dex */
public final class owp extends own {
    final owt d;
    final owt e;

    public owp(owj owjVar, long j, long j2, int i, long j3, List list, owt owtVar, owt owtVar2) {
        super(owjVar, j, j2, i, j3, list);
        this.d = owtVar;
        this.e = owtVar2;
    }

    @Override // defpackage.own
    public final int a(long j) {
        List list = this.c;
        if (list != null) {
            return (list.size() + this.a) - 1;
        }
        if (j == -1) {
            return -1;
        }
        return (this.a + ((int) pcx.f(j, (this.b * 1000000) / this.g))) - 1;
    }

    @Override // defpackage.own
    public final owj c(owm owmVar, int i) {
        long j;
        List list = this.c;
        if (list != null) {
            j = ((owq) list.get(i - this.a)).a;
        } else {
            j = (i - this.a) * this.b;
        }
        long j2 = j;
        owt owtVar = this.e;
        ovm ovmVar = owmVar.e;
        return new owj(owtVar.a(ovmVar.a, i, ovmVar.c, j2), 0L, -1L);
    }

    @Override // defpackage.ows
    public final owj e(owm owmVar) {
        owt owtVar = this.d;
        if (owtVar != null) {
            ovm ovmVar = owmVar.e;
            return new owj(owtVar.a(ovmVar.a, 0, ovmVar.c, 0L), 0L, -1L);
        }
        return this.f;
    }
}
