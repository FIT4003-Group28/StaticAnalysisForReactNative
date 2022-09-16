package defpackage;

import android.graphics.Point;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.maps.R;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/* compiled from: PG */
/* renamed from: rcn  reason: default package */
/* loaded from: classes7.dex */
public final class rcn implements bzml {
    @dzsi
    final ilo a;
    @dzsi
    jdi b;
    protected final View.OnLayoutChangeListener c = new rcm(this);
    private final rfr d;
    private final cqkj e;
    private final cqat f;
    private final acyr g;
    private final bvjj h;
    @dzsi
    private final gga i;
    @dzsi
    private final View j;

    public rcn(ilo iloVar, View view, gga ggaVar, cqkj cqkjVar, bvjj bvjjVar, rfr rfrVar, cqat cqatVar, acyr acyrVar) {
        this.h = bvjjVar;
        this.a = iloVar;
        this.j = view;
        this.d = rfrVar;
        this.e = cqkjVar;
        this.i = ggaVar;
        this.f = cqatVar;
        this.g = acyrVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.INFERRED_COMMUTE_DESTINATION_LABELING_PROMO;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        List<String> F = this.h.F(bvjk.co, new ArrayList());
        if (this.h.s(bvjk.cn, 0) >= 3 && F.size() < 3) {
            if (F.isEmpty()) {
                return true;
            }
            Timestamp timestamp = new Timestamp(this.f.b());
            Timestamp timestamp2 = new Timestamp(Long.parseLong(F.get(F.size() - 1)));
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(timestamp2.getTime());
            calendar.add(5, 3);
            calendar.set(11, 0);
            calendar.set(12, 0);
            Timestamp timestamp3 = new Timestamp(calendar.getTimeInMillis());
            return timestamp.equals(timestamp3) || timestamp.after(timestamp3);
        }
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        View a;
        if (this.i == null || this.j == null) {
            return false;
        }
        if (this.g.f()) {
            View view = this.j;
            dbsk.s(view);
            a = cqhu.a(view, qvm.b);
        } else {
            View view2 = this.j;
            dbsk.s(view2);
            a = cqhu.a(view2, isf.b);
        }
        if (a == null) {
            return false;
        }
        gga ggaVar = this.i;
        final cqkf c = this.e.c(new ref(), null);
        View c2 = c.c();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        a.getLocationOnScreen(iArr2);
        if (this.g.f()) {
            iArr[0] = iArr2[0] + (a.getWidth() / 2);
        } else if (od.s(a) == 1) {
            iArr[0] = (iArr2[0] + a.getWidth()) - jmj.a(ggaVar, 6);
        } else {
            iArr[0] = iArr2[0] + jmj.a(ggaVar, 6);
        }
        int height = iArr2[1] + a.getHeight() + jmj.a(ggaVar, 6);
        iArr[1] = height;
        Point point = new Point(iArr[0], height);
        jdi a2 = jdj.a(ggaVar, jdo.TOP, new PopupWindow.OnDismissListener(this, c) { // from class: rcl
            private final rcn a;
            private final cqkf b;

            {
                this.a = this;
                this.b = c;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                rcn rcnVar = this.a;
                cqkf cqkfVar = this.b;
                rcnVar.b = null;
                cqkfVar.e(null);
            }
        });
        this.b = a2;
        dbsk.s(a2);
        rfr rfrVar = this.d;
        bwrs a3 = bwrs.a(this.a);
        cqvf l = cqrt.l(R.string.INFERRED_COMMUTE_DESTINATION_LABELING_PROMO_BODY);
        rfr.a(a3, 1);
        rfr.a(l, 3);
        dxio a4 = ((dxjh) rfrVar.a).a();
        rfr.a(a4, 4);
        c.e(new rfq(a3, a2, l, a4));
        jdi jdiVar = this.b;
        dbsk.s(jdiVar);
        jdiVar.c(c2);
        jdi jdiVar2 = this.b;
        dbsk.s(jdiVar2);
        jdiVar2.d(a, point.x, point.y);
        a.addOnLayoutChangeListener(this.c);
        return true;
    }
}
