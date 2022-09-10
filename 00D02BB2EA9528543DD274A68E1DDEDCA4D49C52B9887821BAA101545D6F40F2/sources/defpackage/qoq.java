package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: qoq  reason: default package */
/* loaded from: classes7.dex */
public final class qoq {
    private final dzsj<Application> a;
    private final dzsj<qok> b;
    private final dzsj<cqhn> c;
    private final dzsj<xlu> d;
    private final dzsj<vox> e;
    private final dzsj<xmg> f;
    private final dzsj<akpm> g;
    private final dzsj<qkc> h;
    private final dzsj<cjqy> i;

    public qoq(dzsj<Application> dzsjVar, dzsj<qok> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<xlu> dzsjVar4, dzsj<vox> dzsjVar5, dzsj<xmg> dzsjVar6, dzsj<akpm> dzsjVar7, dzsj<qkc> dzsjVar8, dzsj<cjqy> dzsjVar9) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final qop a(qpe qpeVar, qcl qclVar, qcl qclVar2, qcz qczVar, qoh qohVar, @dzsi dspd dspdVar, @dzsi List<dpce> list, @dzsi amte amteVar, @dzsi Integer num, @dzsi Bundle bundle, @dzsi rjz rjzVar, qnm qnmVar, qnl qnlVar) {
        Application a = this.a.a();
        b(a, 1);
        qok a2 = this.b.a();
        b(a2, 2);
        b(this.c.a(), 3);
        xlu a3 = this.d.a();
        b(a3, 4);
        vox a4 = this.e.a();
        b(a4, 5);
        xmg a5 = this.f.a();
        b(a5, 6);
        akpm a6 = this.g.a();
        b(a6, 7);
        qkc a7 = this.h.a();
        b(a7, 8);
        cjqy a8 = this.i.a();
        b(a8, 9);
        b(qpeVar, 10);
        b(qclVar, 11);
        b(qclVar2, 12);
        b(qczVar, 13);
        b(qohVar, 14);
        b(qnmVar, 21);
        b(qnlVar, 22);
        return new qop(a, a2, a3, a4, a5, a6, a7, a8, qpeVar, qclVar, qclVar2, qczVar, qohVar, dspdVar, list, amteVar, num, bundle, rjzVar, qnmVar, qnlVar);
    }
}
