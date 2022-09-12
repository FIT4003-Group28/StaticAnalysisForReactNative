package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdey  reason: default package */
/* loaded from: classes3.dex */
public final class bdey implements bdal {
    public final gfw a;
    private final Activity b;
    private final bbuq c;

    public bdey(Activity activity, bbuq bbuqVar, gfw gfwVar) {
        this.b = activity;
        this.c = bbuqVar;
        this.a = gfwVar;
    }

    @Override // defpackage.bdal
    @dzsi
    public final jho a(bczw bczwVar) {
        final dwfl a = bczwVar.a();
        final Boolean o = this.c.o(a.d);
        if (o == null) {
            return null;
        }
        String string = this.b.getString(true != o.booleanValue() ? R.string.TODO_PHOTO_ACCESSIBILITY_SELECT_PHOTO : R.string.TODO_PHOTO_ACCESSIBILITY_UNSELECT_PHOTO, new Object[]{Integer.valueOf(this.c.f(a))});
        jhm a2 = jhm.a();
        a2.c = cqrt.f(o.booleanValue() ? 2131231571 : 2131231573);
        a2.d = o.booleanValue() ? ibl.a() : ibl.b();
        a2.h = 2;
        a2.a = string;
        a2.b = string;
        a2.d(new View.OnClickListener(this, a, o) { // from class: bdex
            private final bdey a;
            private final dwfl b;
            private final Boolean c;

            {
                this.a = this;
                this.b = a;
                this.c = o;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bdey bdeyVar = this.a;
                dwfl dwflVar = this.b;
                Boolean bool = this.c;
                bdeyVar.a.Qn(new bbta(dwflVar.d, Boolean.valueOf(!bool.booleanValue())));
            }
        });
        a2.f = cjtd.a(dtxy.cH);
        return a2.c();
    }
}
