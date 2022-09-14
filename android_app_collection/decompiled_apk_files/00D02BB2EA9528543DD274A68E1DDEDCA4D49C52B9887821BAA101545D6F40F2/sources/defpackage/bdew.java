package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdew  reason: default package */
/* loaded from: classes3.dex */
public final class bdew implements bdal {
    public final gfw a;
    private final Activity b;

    public bdew(Activity activity, gfw gfwVar) {
        this.b = activity;
        this.a = gfwVar;
    }

    @Override // defpackage.bdal
    @dzsi
    public final jho a(bczw bczwVar) {
        jhm a = jhm.a();
        a.a = this.b.getResources().getString(R.string.DONE);
        a.d = ibl.b();
        a.h = 2;
        a.b = this.b.getResources().getString(R.string.DONE);
        a.d(new View.OnClickListener(this) { // from class: bdev
            private final bdew a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.Qn(new bbuv());
            }
        });
        a.f = cjtd.a(dtxy.cr);
        return a.c();
    }
}
