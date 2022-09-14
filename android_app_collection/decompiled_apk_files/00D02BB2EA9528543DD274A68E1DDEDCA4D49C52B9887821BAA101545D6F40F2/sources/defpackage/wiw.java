package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: wiw  reason: default package */
/* loaded from: classes7.dex */
public class wiw implements wiu {
    private final jib a;
    private final acrp b;

    public wiw(final Activity activity, acrq acrqVar, CharSequence charSequence, dvvo dvvoVar, dpol dpolVar, @dzsi Integer num) {
        jhz a = jhz.a();
        a.f(new View.OnClickListener(activity) { // from class: wiv
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.onBackPressed();
            }
        });
        a.a = charSequence;
        a.x = false;
        this.a = a.b();
        acrp a2 = acrqVar.a();
        this.b = a2;
        a2.i(dvvoVar, dpolVar, num);
    }

    @Override // defpackage.wiu
    public jib a() {
        return this.a;
    }

    @Override // defpackage.wiu
    public acqy b() {
        return this.b;
    }
}
