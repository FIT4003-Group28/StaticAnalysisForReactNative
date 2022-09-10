package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cirj  reason: default package */
/* loaded from: classes4.dex */
public final class cirj implements cirh {
    public final chrx a;
    public final int b;
    public final boolean c;
    public final Runnable d;

    public cirj(chrx chrxVar, int i, boolean z, Runnable runnable) {
        this.a = chrxVar;
        this.b = i;
        this.c = z;
        this.d = runnable;
    }

    @Override // defpackage.cirh
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: ciri
            private final cirj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cirj cirjVar = this.a;
                cirjVar.d.run();
                boolean z = true;
                if (cirjVar.c) {
                    if (cirjVar.b <= 0) {
                        z = false;
                    }
                    dbsk.a(z);
                    cirjVar.a.Y(cirjVar.b - 1);
                    return;
                }
                cirjVar.a.Y(cirjVar.b + 1);
            }
        };
    }

    @Override // defpackage.cirh
    public cjtd b() {
        cjta b = cjtd.b();
        b.d = this.c ? dtxl.hZ : dtxl.hY;
        return b.a();
    }

    @Override // defpackage.cirh
    public int c() {
        return this.c ? R.string.WEEKLY_TODOLIST_FOLLOWING_WEEK : R.string.WEEKLY_TODOLIST_PREVIOUS_WEEK;
    }

    @Override // defpackage.cirh
    public int d() {
        return this.c ? R.string.WEEKLY_TODOLIST_NAVIGATE_FORWARD_A11Y : R.string.WEEKLY_TODOLIST_NAVIGATE_BACKWARD_A11Y;
    }

    @Override // defpackage.cirh
    @dzsi
    public cqtd e() {
        if (this.c) {
            return null;
        }
        return iut.a(iup.c(R.raw.ic_chevron_backward_chip, ibm.x()));
    }
}
