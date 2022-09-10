package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vmy  reason: default package */
/* loaded from: classes7.dex */
public final class vmy {
    private final buow a;
    private final vly b;
    private final Executor c;

    public vmy(buow buowVar, vly vlyVar, Executor executor) {
        this.a = buowVar;
        this.b = vlyVar;
        this.c = executor;
    }

    public final btzc a(vmd vmdVar) {
        return this.b.a(this.a.c()).b(vmdVar.a(), vmdVar.f(), this.c);
    }
}
