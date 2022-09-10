package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdce  reason: default package */
/* loaded from: classes3.dex */
public final class bdce implements bdal {
    public final bcrn a;
    public final afyb b;
    @dzsi
    public final ilo c;
    private final Context d;
    private final afxy e;

    public bdce(Context context, afxz afxzVar, bcro bcroVar, afyb afybVar, @dzsi ilo iloVar) {
        this.d = context;
        this.e = afxzVar.a(afybVar.e());
        this.a = bcroVar;
        this.b = afybVar;
        this.c = iloVar;
    }

    @Override // defpackage.bdal
    @dzsi
    public final jho a(final bczw bczwVar) {
        if (!this.e.a()) {
            return null;
        }
        cjta d = this.e.d(this.c);
        d.d = dtxy.cu;
        cjtd a = d.a();
        jhm jhmVar = new jhm();
        jhmVar.h = 2;
        jhmVar.c = cqrt.f(2131231861);
        jhmVar.d = ibl.b();
        jhmVar.a = this.d.getString(R.string.LENS_ICON_CONTENT_DESCRIPTION);
        jhmVar.b = this.d.getString(R.string.LENS_ICON_CONTENT_DESCRIPTION);
        jhmVar.f = a;
        jhmVar.d(new View.OnClickListener(this, bczwVar) { // from class: bdcd
            private final bdce a;
            private final bczw b;

            {
                this.a = this;
                this.b = bczwVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bdce bdceVar = this.a;
                bdceVar.a.a(this.b.a(), bdceVar.b.f(), 2, dbsg.j(bdceVar.c));
            }
        });
        return jhmVar.c();
    }
}
