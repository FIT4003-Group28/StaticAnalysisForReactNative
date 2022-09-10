package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bphe  reason: default package */
/* loaded from: classes3.dex */
public class bphe implements bpwo {
    public final bpsr a;
    public final bnyc b;
    private final ff c;
    private final boxs d;
    private final boqg e;
    private final bpvm f;

    public bphe(bokk bokkVar, bpsr bpsrVar, booa booaVar, bnyd bnydVar, ff ffVar) {
        bphd bphdVar = new bphd(this);
        this.f = bphdVar;
        this.a = bpsrVar;
        this.c = ffVar;
        this.b = bnydVar.a(ffVar.g(), dtya.V, dtya.bH);
        this.d = new boxs(bokkVar, ffVar.getString(R.string.RAP_ROAD_OTHER_NOTE_HINT), bphdVar, dtya.bs);
        this.e = booaVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz aS = bpdz.aS(this.c.getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_OTHER_TITLE));
        aS.o = cjtd.a(dtya.br);
        aS.f(new View.OnClickListener(this) { // from class: bphb
            private final bphe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.b();
            }
        });
        String string = this.c.getString(R.string.REPORT_MAP_ISSUE_SUBMIT);
        jhm a = jhm.a();
        a.a = string;
        a.f = cjtd.a(dtya.bu);
        a.b = string;
        a.h = 2;
        a.d(new View.OnClickListener(this) { // from class: bphc
            private final bphe a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a();
            }
        });
        a.n = b();
        aS.c(a.c());
        return aS.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.d.d();
    }

    @Override // defpackage.bpwo
    public CharSequence c() {
        return this.c.getString(R.string.RAP_ROAD_OTHER_HELP_TEXT);
    }

    @Override // defpackage.bpwo
    public bpvn d() {
        return this.d;
    }

    @Override // defpackage.bpwo
    public boqg e() {
        return this.e;
    }
}
