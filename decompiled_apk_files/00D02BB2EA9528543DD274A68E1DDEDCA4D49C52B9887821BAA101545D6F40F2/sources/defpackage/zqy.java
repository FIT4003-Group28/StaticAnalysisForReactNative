package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zqy  reason: default package */
/* loaded from: classes7.dex */
public class zqy implements zbh {
    private final Context a;
    private CharSequence b;
    private final int c;
    private final boolean e;
    private List<zcd> f;
    @dzsi
    private cqkp g;
    private boolean d = false;
    private boolean h = false;

    public zqy(Context context, CharSequence charSequence, int i, boolean z, List<zcd> list) {
        this.a = context;
        this.b = charSequence;
        this.c = i;
        this.e = z;
        this.f = list;
    }

    private final void m() {
        cqkp cqkpVar = this.g;
        if (cqkpVar != null) {
            cqkx.p(cqkpVar);
        }
    }

    @Override // defpackage.zbh
    public List<zcd> a() {
        return this.f;
    }

    @Override // defpackage.zbh
    public int b() {
        return this.c;
    }

    @Override // defpackage.zbh
    public CharSequence c() {
        return this.a.getString(R.string.DIRECTIONS_STEP_LIST_TO, this.b);
    }

    @Override // defpackage.zbh
    public cqkl d() {
        this.d = !this.d;
        m();
        return cqkl.a;
    }

    @Override // defpackage.zbh
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.zbh
    public CharSequence f() {
        return this.a.getString(R.string.ACCESSIBILITY_DIRECTIONS_STEP_LIST_TO, this.b);
    }

    @Override // defpackage.zbh
    public Boolean g() {
        return Boolean.valueOf(this.e);
    }

    public void h(cqkp cqkpVar) {
        this.g = cqkpVar;
    }

    public boolean i() {
        return this.h;
    }

    public void j(List<dwfl> list, dcdc<Integer> dcdcVar) {
        if (list.size() == dcdcVar.size()) {
            for (int i = 0; i < list.size(); i++) {
                dwfl dwflVar = list.get(i);
                if (!dwflVar.h.isEmpty()) {
                    this.f.get(dcdcVar.get(i).intValue()).m(dwflVar);
                }
            }
            m();
            this.h = true;
        }
    }

    public void k(CharSequence charSequence, List<zcd> list, boolean z) {
        this.b = charSequence;
        this.f = list;
        if (z) {
            l(false);
        }
        m();
    }

    public void l(boolean z) {
        this.d = false;
    }
}
