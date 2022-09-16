package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vth  reason: default package */
/* loaded from: classes4.dex */
public final class vth implements vtg {
    public String a;
    public long b;
    private final List c = new ArrayList();

    @Override // defpackage.vtg
    public final /* bridge */ /* synthetic */ cvs a() {
        return new cwc(this.a, this.b, this.c);
    }

    public final void b(String str) {
        List list = this.c;
        vtm.c(str);
        list.add(str);
    }
}
