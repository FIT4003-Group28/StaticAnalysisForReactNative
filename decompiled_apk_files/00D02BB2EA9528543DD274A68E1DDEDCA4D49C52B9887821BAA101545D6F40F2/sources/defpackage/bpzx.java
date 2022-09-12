package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpzx  reason: default package */
/* loaded from: classes4.dex */
public class bpzx implements bqik {
    public final bpyh a;
    public final ff b;
    public final eeu c;
    public final bqgw d;
    public final bomt e;
    public final bopt f;
    public final bnyc g;
    public final bptn h;
    private final bpzw m;
    @dzsi
    private final bpyr n;
    private final boqg o;

    public bpzx(dzsj<boxa> dzsjVar, bpyh bpyhVar, bnyd bnydVar, ff ffVar, cqhn cqhnVar, eeu eeuVar, bpto bptoVar, acwo acwoVar, bvrb bvrbVar, booa booaVar, bqgw bqgwVar, bomt bomtVar) {
        this.a = bpyhVar;
        this.b = ffVar;
        this.c = eeuVar;
        this.d = bqgwVar;
        this.e = bomtVar;
        this.m = new bpzw(this, ffVar);
        this.n = new bpyr(bqgwVar, ffVar, cqhnVar);
        bokk bokkVar = bqgwVar.b;
        String string = ffVar.getString(R.string.ROAD_NAME_OPTIONAL_HINT);
        this.f = new bopt(ffVar, bokkVar, ffVar.getString(R.string.RMI_NAME), string, string, string, 8193, 2131233030, dtya.co, null, true, false, true, bomtVar, bqik.j, false, null, false, 3);
        this.o = booaVar;
        this.g = bnydVar.a(ffVar.g(), dtya.cn, dtya.cF);
        bpzt bpztVar = new bpzt(this, dzsjVar.a(), acwoVar, bvrbVar);
        bptl d = bptm.d();
        d.c(R.string.MISSING_ROAD_DETAILS_TITLE);
        d.b(R.string.REPORT_MISSING_ROAD_NOT_AVAILABLE_OFFLINE);
        this.h = bptoVar.b(bpztVar, d.a());
    }

    @Override // defpackage.bqik
    /* renamed from: a */
    public bpzw j() {
        return this.m;
    }

    @Override // defpackage.bqik
    public boqs b() {
        return this.f;
    }

    @Override // defpackage.bqik
    @dzsi
    public bqig c() {
        return this.n;
    }

    @Override // defpackage.bqik
    public String d() {
        return this.d.e;
    }

    @Override // defpackage.bqik
    public CharSequence e() {
        return this.b.getString(R.string.ADD_OPTIONAL_NOTE_HINT);
    }

    @Override // defpackage.bqik
    public cqgl f() {
        return new cqgl(this) { // from class: bpzr
            private final bpzx a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.d.e = charSequence.toString().trim();
            }
        };
    }

    @Override // defpackage.bqik
    public View.OnFocusChangeListener g() {
        return new View.OnFocusChangeListener(this) { // from class: bpzs
            private final bpzx a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                bomt bomtVar = this.a.e;
                if (z) {
                    bomtVar.b = bqik.l;
                } else {
                    bomtVar.a();
                }
            }
        };
    }

    @Override // defpackage.bqik
    public boqg h() {
        return this.o;
    }

    public final boolean i() {
        return this.f.w().booleanValue() || !dbsj.d(this.d.e);
    }
}
