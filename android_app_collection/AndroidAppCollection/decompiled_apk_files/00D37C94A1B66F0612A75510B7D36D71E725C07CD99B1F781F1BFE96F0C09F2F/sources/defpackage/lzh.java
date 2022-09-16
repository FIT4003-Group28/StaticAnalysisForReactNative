package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: lzh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lzh implements fjp {
    public final /* synthetic */ lzj a;
    private final /* synthetic */ int b;

    public /* synthetic */ lzh(lzj lzjVar, int i) {
        this.b = i;
        this.a = lzjVar;
    }

    @Override // defpackage.fjp
    public final void a(Object obj, List list) {
        if (this.b == 0) {
            this.a.c(obj, list);
            return;
        }
        lzj lzjVar = this.a;
        if (obj == null || lzjVar.b.d(obj)) {
            return;
        }
        aafx.d(lzjVar.a, list, lzjVar.b(obj));
    }
}
