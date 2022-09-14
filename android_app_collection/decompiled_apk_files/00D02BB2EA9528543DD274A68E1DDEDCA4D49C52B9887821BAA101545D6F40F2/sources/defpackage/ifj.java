package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: ifj  reason: default package */
/* loaded from: classes.dex */
public final class ifj extends iic {
    public cqix<?> a;
    public iif b;
    public igq c;
    public ihz d;
    public View.OnAttachStateChangeListener e;
    public cjtd f;
    public zc g;
    private List<cqix<? extends igw>> h;

    @Override // defpackage.iic
    @dzsi
    public final dbsg<zc> a() {
        zc zcVar = this.g;
        return zcVar == null ? dbpy.a : dbsg.i(zcVar);
    }

    @Override // defpackage.iic
    public final void c(@dzsi zc zcVar) {
        this.g = zcVar;
    }

    @Override // defpackage.iic
    public final void d(cqix<?> cqixVar) {
        this.a = cqixVar;
    }

    @Override // defpackage.iic
    public final void e(List<cqix<? extends igw>> list) {
        if (list != null) {
            this.h = list;
            return;
        }
        throw new NullPointerException("Null layoutItems");
    }

    @Override // defpackage.iic
    public final iid b() {
        String str = this.h == null ? " layoutItems" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new ifk(this.h, this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
