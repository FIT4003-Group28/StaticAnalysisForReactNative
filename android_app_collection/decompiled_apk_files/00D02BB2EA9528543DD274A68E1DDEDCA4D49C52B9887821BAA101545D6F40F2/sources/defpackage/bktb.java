package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bktb  reason: default package */
/* loaded from: classes3.dex */
public class bktb implements bksb {
    private final djck b;
    private final Activity c;
    private final String d;
    private final int e;
    private final cjtd f;
    private final dbsg<bkta> g;
    @dzsi
    private final cjtd h;
    private final bksg i;
    private boolean j = false;

    public bktb(Activity activity, bljv bljvVar, btvo btvoVar, final ilo iloVar, final djck djckVar, bksg bksgVar, boolean z, ddho ddhoVar) {
        this.c = activity;
        this.f = j(iloVar, djckVar, ddhoVar);
        this.b = djckVar;
        this.i = bksgVar;
        this.d = djckVar.d;
        djcm djcmVar = djckVar.e;
        this.e = (int) (djcmVar == null ? djcm.b : djcmVar).a;
        for (djvn djvnVar : djckVar.h) {
            int[] iArr = bksz.a;
            drdo b = drdo.b(djvnVar.a);
            if (b == null) {
                b = drdo.UNKNOWN_TOPIC_TRAIT_TYPE;
            }
            int i = iArr[b.ordinal()];
        }
        dbpy<Object> dbpyVar = dbpy.a;
        this.g = dbpyVar;
        this.h = (cjtd) dbpyVar.h(bksx.a).h(new dbrn(iloVar, djckVar) { // from class: bksy
            private final ilo a;
            private final djck b;

            {
                this.a = iloVar;
                this.b = djckVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return bktb.j(this.a, this.b, (ddho) obj);
            }
        }).f();
    }

    public static cjtd j(ilo iloVar, djck djckVar, ddho ddhoVar) {
        cjta b = cjtd.b();
        b.g = decs.a(iloVar.ai().c);
        b.g(djckVar.c);
        b.d = ddhoVar;
        return b.a();
    }

    @Override // defpackage.bkrw
    @dzsi
    public cqtd a() {
        return null;
    }

    @Override // defpackage.bkrw
    @dzsi
    public cjtd b() {
        return this.h;
    }

    @Override // defpackage.bkrw
    public int c() {
        return 0;
    }

    @Override // defpackage.bkrw
    public CharSequence d() {
        return this.d;
    }

    @Override // defpackage.bkrw
    public CharSequence e() {
        return Integer.toString(this.e);
    }

    @Override // defpackage.bkrw
    public cqkl f() {
        if (this.j) {
            this.i.a(null);
        } else {
            this.i.a(this.b);
        }
        return cqkl.a;
    }

    @Override // defpackage.bkrw
    public Boolean g() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.bkrw
    public cjtd h() {
        return this.f;
    }

    @Override // defpackage.bkrw
    public CharSequence i() {
        String string = this.c.getResources().getString(true != this.j ? R.string.REVIEW_FILTER_NOT_SELECTED_STATE : R.string.REVIEW_FILTER_SELECTED_STATE);
        Resources resources = this.c.getResources();
        int i = this.e;
        return resources.getQuantityString(R.plurals.TOPIC_LABEL_DESCRIPTION_SELECTION_STATE, i, this.d, Integer.valueOf(i), string);
    }

    public djck k() {
        return this.b;
    }

    public void l(boolean z) {
        this.j = z;
    }
}
