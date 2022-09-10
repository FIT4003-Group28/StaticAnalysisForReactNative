package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqbm  reason: default package */
/* loaded from: classes4.dex */
public class bqbm implements bqim {
    public final bpyk a;
    public final ff b;
    public final eeu c;
    public final bqhg d;
    public final dnqe e;
    public final bnyc f;
    public final bptn g;
    public final boxs h;
    private final bqbl i;
    private final boqg j;

    public bqbm(bpyk bpykVar, bnyd bnydVar, ff ffVar, eeu eeuVar, bptg bptgVar, bpto bptoVar, booa booaVar, bokk bokkVar, bqhg bqhgVar, dnqe dnqeVar) {
        this.a = bpykVar;
        this.b = ffVar;
        this.c = eeuVar;
        this.d = bqhgVar;
        this.e = dnqeVar;
        this.i = new bqbl(this, ffVar);
        this.f = bnydVar.a(ffVar.g(), dtya.cn, dtya.cF);
        bptl d = bptm.d();
        d.c(R.string.REPORT_MISSING_ROAD);
        d.b(R.string.REPORT_MISSING_ROAD_NOT_AVAILABLE_OFFLINE);
        this.g = bptoVar.b(bptgVar, d.a());
        this.h = new boxs(bokkVar, ffVar.getString(R.string.ADD_OPTIONAL_NOTE_HINT), bqbi.a, null);
        this.j = booaVar;
    }

    @Override // defpackage.bqim
    /* renamed from: a */
    public bqbl e() {
        return this.i;
    }

    @Override // defpackage.bqim
    public bpvn b() {
        return this.h;
    }

    @Override // defpackage.bqim
    public boqg c() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        if (!this.c.b()) {
            return false;
        }
        jmw.d(this.b, new Runnable(this) { // from class: bqbj
            private final bqbm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bqbm bqbmVar = this.a;
                bqbmVar.f.b(bqbmVar.h.d());
            }
        });
        return true;
    }
}
