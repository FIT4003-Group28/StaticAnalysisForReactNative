package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwdv  reason: default package */
/* loaded from: classes4.dex */
public final class bwdv extends bweo {
    private final int c;
    @dzsi
    private final String d;
    @dzsi
    private final List<String> e;

    public bwdv(@dzsi String str, @dzsi List<String> list, String str2, drrp drrpVar, int i) {
        super(h(drrpVar, str2));
        this.d = str;
        this.e = list;
        this.c = i;
    }

    @Override // defpackage.bweo
    @dzsi
    public final String a(Context context, @dzsi bwfq bwfqVar) {
        String f = dbsj.f(dbrz.e("\n").j().g(this.e));
        String b = l().b();
        dbsk.s(b);
        return k(this.d, f, dcdc.f(new bwen(g(context.getString(this.c, b)))), this.a);
    }

    @Override // defpackage.bweo
    @dzsi
    public final String b(Context context, @dzsi bwfq bwfqVar) {
        return this.d;
    }

    @Override // defpackage.bweo
    public final int d() {
        return 6;
    }

    @Override // defpackage.bweo
    public final int e() {
        return 3;
    }
}
