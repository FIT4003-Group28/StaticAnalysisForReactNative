package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: zsp  reason: default package */
/* loaded from: classes7.dex */
public final class zsp extends ams {
    private final View f;
    private final zbe g;

    public zsp(View view, zbe zbeVar) {
        super(view);
        this.f = view;
        this.g = zbeVar;
    }

    @dzsi
    private final zso B(int i) {
        for (zso zsoVar : this.g.a()) {
            if (zsoVar.a() == i) {
                return zsoVar;
            }
        }
        return null;
    }

    @Override // defpackage.ams
    protected final int u(float f, float f2) {
        for (int i = 0; i < this.g.a().size(); i++) {
            if (this.g.a().get(i).f(this.f).contains((int) f, (int) f2)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ams
    protected final void v(List<Integer> list) {
        for (zso zsoVar : this.g.a()) {
            list.add(Integer.valueOf(zsoVar.a()));
        }
    }

    @Override // defpackage.ams
    protected final void x(int i, pc pcVar) {
        zso B = B(i);
        if (B == null) {
            pcVar.D("");
            pcVar.k(new Rect());
            return;
        }
        pcVar.D(B.b());
        pcVar.G(B.c());
        pcVar.k(B.f(this.f));
        pcVar.h(oy.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ams
    public final boolean z(int i, int i2) {
        zso B = B(i);
        zsn b = this.g.b();
        if (oy.c.a() != i2 || b == null || B == null) {
            return false;
        }
        b.a(B.a());
        return true;
    }
}
