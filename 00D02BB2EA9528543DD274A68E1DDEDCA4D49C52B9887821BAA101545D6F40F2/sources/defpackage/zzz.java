package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zzz  reason: default package */
/* loaded from: classes7.dex */
public class zzz implements jbk {
    public final Activity a;
    public final zzk b;
    private final zzj c = new zzy(this);
    private final cjtd d = cjtd.a(dtxn.eJ);
    private final cjtd e = cjtd.a(dtxn.eK);

    public zzz(Activity activity, zzk zzkVar) {
        this.a = activity;
        this.b = zzkVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        cqtd f;
        String string;
        final boolean z = this.b.k() > 1;
        if (z) {
            f = iut.a(cqrt.f(2131232960));
        } else {
            f = cqrt.f(2131231591);
        }
        jhz a = jhz.a();
        a.A = false;
        a.a = this.a.getString(R.string.DISTANCE_TOOL);
        a.E = 1;
        Activity activity = this.a;
        a.b = activity.getString(R.string.DISTANCE_TOOL_SUBTITLE, new Object[]{activity.getString(R.string.DISTANCE_TOOL_ADD_POINT)});
        a.f(new View.OnClickListener(this) { // from class: zzv
            private final zzz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.onBackPressed();
            }
        });
        a.x = true;
        jhm jhmVar = new jhm();
        jhmVar.c = f;
        jhmVar.h = 2;
        if (this.b.k() > 1) {
            string = this.a.getString(R.string.DISTANCE_TOOL_UNDO_CONTENT_DESCRIPTION);
        } else {
            string = this.a.getString(R.string.NAVIGATE_UP);
        }
        jhmVar.b = string;
        jhmVar.f = z ? this.d : this.e;
        jhmVar.d(new View.OnClickListener(this, z) { // from class: zzw
            private final zzz a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzz zzzVar = this.a;
                if (this.b) {
                    zzzVar.b.f();
                } else {
                    zzzVar.a.onBackPressed();
                }
            }
        });
        a.c(jhmVar.c());
        jhm jhmVar2 = new jhm();
        jhmVar2.a = this.a.getString(R.string.DISTANCE_TOOL_CLEAR);
        jhmVar2.d(new View.OnClickListener(this) { // from class: zzx
            private final zzz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.e();
            }
        });
        jhmVar2.h = 0;
        a.c(jhmVar2.c());
        return a.b();
    }

    public zzj b() {
        return this.c;
    }
}
