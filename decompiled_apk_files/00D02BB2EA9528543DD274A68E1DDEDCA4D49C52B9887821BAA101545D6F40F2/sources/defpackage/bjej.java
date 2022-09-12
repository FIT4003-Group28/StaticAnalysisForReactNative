package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjej  reason: default package */
/* loaded from: classes3.dex */
public class bjej implements jbk {
    public final gga a;
    private final String b;
    private final jhn c;
    private final cjtd d;
    private final Boolean e;
    private Boolean f;
    private CharSequence g;

    public bjej(gga ggaVar, int i, jhn jhnVar, cjtd cjtdVar) {
        boolean z = true;
        dbsk.a(i >= 0 && i <= 2);
        this.a = ggaVar;
        this.b = ggaVar.getString(R.string.DONE);
        this.c = jhnVar;
        this.d = cjtdVar;
        this.e = true;
        this.f = Boolean.valueOf(i == 0 ? false : z);
        this.g = c(ggaVar, i);
    }

    static CharSequence c(gga ggaVar, int i) {
        return ggaVar.getString(i == 2 ? R.string.PLACE_QA_ADD_TAGS_PAGE_SUBTITLE_TWO_TAGS_SELECTED : R.string.PLACE_QA_ADD_TAGS_PAGE_SUBTITLE_DEFAULT);
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhm a = jhm.a();
        a.g = this.c;
        String str = this.b;
        a.a = str;
        a.b = str;
        a.h = 1;
        a.n = this.f.booleanValue();
        a.f = this.d;
        jhz a2 = jhz.a();
        a2.a = this.a.getString(R.string.PLACE_QA_ADD_TAGS_PAGE_TITLE);
        a2.C = 1;
        a2.b = this.g;
        a2.D = 1;
        a2.f(new View.OnClickListener(this) { // from class: bjei
            private final bjej a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.s();
            }
        });
        a2.o = cjtd.b;
        a2.d = ibq.E();
        a2.x = this.e.booleanValue();
        a2.c(a.c());
        return a2.b();
    }

    public final void b(int i) {
        boolean z = true;
        dbsk.a(i >= 0 && i <= 2);
        if (i == 0) {
            z = false;
        }
        this.f = Boolean.valueOf(z);
        this.g = c(this.a, i);
        cqkx.p(this);
    }
}
