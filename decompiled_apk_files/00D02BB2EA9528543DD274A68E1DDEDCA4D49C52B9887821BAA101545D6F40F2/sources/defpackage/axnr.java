package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: axnr  reason: default package */
/* loaded from: classes3.dex */
public class axnr implements axnm {
    private final List<dwfl> a;

    public axnr(List<dwfl> list) {
        this.a = list;
    }

    @Override // defpackage.axnm
    public Integer a() {
        return Integer.valueOf(this.a.size());
    }

    @Override // defpackage.axnm
    @dzsi
    public axnl b(int i) {
        if (i < this.a.size()) {
            final dwfl dwflVar = this.a.get(i);
            return new axnl(dwflVar) { // from class: axnq
                private final dwfl a;

                {
                    this.a = dwflVar;
                }

                @Override // defpackage.axnl
                public jic a() {
                    dwfl dwflVar2 = this.a;
                    return new jic(dwflVar2.h, jfv.b(dwflVar2), ibm.i(), 250, true, null, new ckql());
                }
            };
        }
        return null;
    }
}
