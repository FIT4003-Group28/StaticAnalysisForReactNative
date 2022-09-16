package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* compiled from: PG */
/* renamed from: vtj  reason: default package */
/* loaded from: classes4.dex */
public final class vtj implements vtg {
    public Date a;
    public Date b;
    public Integer c;
    public Long d;
    public int f = 1;
    public final List e = new ArrayList();

    @Override // defpackage.vtg
    public final /* bridge */ /* synthetic */ cvs a() {
        cwl cwlVar = new cwl();
        Date date = this.a;
        if (date != null) {
            cwlVar.k(date);
        }
        Date date2 = this.b;
        if (date2 != null) {
            cwlVar.m(date2);
        }
        Integer num = this.c;
        if (num != null) {
            cwlVar.c = num.intValue();
        }
        Long l = this.d;
        if (l != null) {
            cwlVar.l(l.longValue());
        }
        cwlVar.e = this.f;
        cwk cwkVar = new cwk();
        cwkVar.w(cwlVar);
        for (vtl vtlVar : this.e) {
            cwkVar.w(vtlVar.a());
        }
        return cwkVar;
    }
}
