package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.libraries.social.sendkit.api.SendKitPickerResult;
/* compiled from: PG */
/* renamed from: ajya  reason: default package */
/* loaded from: classes2.dex */
public final class ajya extends LinearLayout {
    public static final cqkv a = new ajyc();
    @dzsi
    public cxsx b;
    @dzsi
    public ajxw c;
    @dzsi
    public dbsz<SendKitPickerResult> d;
    @dzsi
    public dbsz<cxsx> e;
    @dzsi
    public ajxz f;
    @dzsi
    public String g;
    @dzsi
    public dbsl<String> h;
    @dzsi
    public ajxx i;
    private boolean j;
    private final ajup k;

    public ajya(Context context) {
        this(context, null);
    }

    public final void a() {
        String str;
        if (this.j || (str = this.g) == null || this.f == null || this.h == null || this.i == null || this.e == null) {
            return;
        }
        Context context = getContext();
        if (this.b == null) {
            cxsw cxswVar = new cxsw();
            cxswVar.a = context;
            cxswVar.b = this;
            cxswVar.c = this.k.b();
            cxswVar.d = this.k.c();
            cxswVar.e = this.k.d();
            ajup ajupVar = this.k;
            ajxz ajxzVar = this.f;
            dbsk.s(ajxzVar);
            PeopleKitConfig a2 = ajupVar.a(context, ajxzVar.a(), str);
            dbsk.a(a2 instanceof PeopleKitConfigImpl);
            cxswVar.f = a2;
            ajxz ajxzVar2 = this.f;
            dbsk.s(ajxzVar2);
            cxswVar.i = ajxzVar2.b();
            cxswVar.g = new ajxv(this);
            cxswVar.j = new ajxu(this);
            cxswVar.h = new ajxt(this);
            cxsx cxsxVar = new cxsx(cxswVar);
            this.b = cxsxVar;
            Stopwatch a3 = cxsxVar.d.a("InitToBindView");
            a3.d();
            cxqo cxqoVar = cxsxVar.d;
            eazd bZ = eaze.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar = (eaze) bZ.b;
            eazeVar.b = 4;
            eazeVar.a |= 1;
            eazh bZ2 = eazi.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar = (eazi) bZ2.b;
            eaziVar.b = 11;
            eaziVar.a |= 1;
            long a4 = a3.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar2 = (eazi) bZ2.b;
            eaziVar2.a |= 2;
            eaziVar2.c = a4;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar2 = (eaze) bZ.b;
            eazi bK = bZ2.bK();
            bK.getClass();
            eazeVar2.e = bK;
            eazeVar2.a |= 8;
            eazk bZ3 = eazl.e.bZ();
            int g = cxsxVar.d.g();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            eazl eazlVar = (eazl) bZ3.b;
            int i = g - 1;
            if (g != 0) {
                eazlVar.b = i;
                eazlVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaze eazeVar3 = (eaze) bZ.b;
                eazl bK2 = bZ3.bK();
                bK2.getClass();
                eazeVar3.c = bK2;
                eazeVar3.a |= 2;
                cxqoVar.b(bZ.bK());
                cxsxVar.d.d(-1, cxsxVar.e);
                cxsxVar.c.p = cxsxVar.b.g();
                cxsxVar.a.removeAllViews();
                cxsxVar.a.addView(cxsxVar.c.b);
                dbsz<cxsx> dbszVar = this.e;
                if (dbszVar != null) {
                    dbszVar.NU(this.b);
                }
            } else {
                throw null;
            }
        }
        this.j = true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ajxz ajxzVar;
        super.onLayout(z, i, i2, i3, i4);
        cxsx cxsxVar = this.b;
        if (cxsxVar == null || (ajxzVar = this.f) == null) {
            return;
        }
        cxsxVar.c.h(ajxzVar.c());
    }

    public ajya(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = false;
        ((bvrk) btsr.a(bvrk.class)).sU();
        this.k = ((ajuo) btsr.a(ajuo.class)).sM();
    }
}
