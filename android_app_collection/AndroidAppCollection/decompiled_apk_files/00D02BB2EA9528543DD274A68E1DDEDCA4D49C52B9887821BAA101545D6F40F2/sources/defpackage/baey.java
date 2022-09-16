package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: baey  reason: default package */
/* loaded from: classes3.dex */
public class baey extends bbal implements bayk {
    public final dxio<axwy> a;
    private final aymh c;
    private final List<azva> d;
    private final List<azvo> e;
    private final long f;

    public baey(gga ggaVar, bwqv bwqvVar, aymh aymhVar, dxio<axwy> dxioVar, ania aniaVar, batz batzVar, List<azva> list, List<azvo> list2) {
        super(ggaVar, bwqvVar, aniaVar, batzVar);
        this.a = dxioVar;
        this.c = aymhVar;
        this.d = list;
        this.e = list2;
        long j = 0;
        for (azva azvaVar : list) {
            if (j < azvaVar.q()) {
                j = azvaVar.q();
            }
        }
        for (azvo azvoVar : list2) {
            if (j < azvoVar.q()) {
                j = azvoVar.q();
            }
        }
        this.f = j;
    }

    @Override // defpackage.bayj
    public String a() {
        return this.t.getString(R.string.SAVED_TAB_YOUR_LISTS_MODULE_LABELLED_PLACES_TITLE);
    }

    @Override // defpackage.bayj
    public CharSequence b() {
        return this.c.d(drcs.PRIVATE, this.d.size() + this.e.size());
    }

    @Override // defpackage.bayj
    public jic c() {
        return new jic((String) null, ckqc.FULLY_QUALIFIED, bael.c(), 0);
    }

    @Override // defpackage.bayj
    public String d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bbal, defpackage.bayj
    public cqkl e() {
        this.a.a().o();
        return cqkl.a;
    }

    @Override // defpackage.bayj
    public ilo f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bayj
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtxy.ap;
        b.i(this.x);
        return b.a();
    }

    @Override // defpackage.bayj
    public jht h() {
        jhu h = jhv.h();
        ((jhi) h).e = this.t.getString(R.string.SAVED_TAB_YOUR_LISTS_MODULE_ALIAS_ENTRY_POINT_OVERFLOW_MENU_CONTENT_DESCRIPTION);
        cjta b = cjtd.b();
        b.d = dtxy.aE;
        b.i(this.x);
        h.c(b.a());
        jhm a = jhm.a();
        a.a = this.t.getString(R.string.SAVED_TAB_YOUR_LISTS_MODULE_ALIAS_ENTRY_POINT_ADD_LABEL);
        a.d(new View.OnClickListener(this) { // from class: baex
            private final baey a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                axwv n = axww.n();
                n.b(dndr.NICKNAME);
                this.a.a.a().L(n.h());
            }
        });
        a.f = cjtd.b;
        h.d(a.c());
        return h.b();
    }

    @Override // defpackage.bayk
    public long i() {
        return this.f;
    }
}
