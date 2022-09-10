package defpackage;

import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bphz  reason: default package */
/* loaded from: classes3.dex */
public class bphz implements bpwr {
    public final bpsr a;
    public final bnyc b;
    public final boxs c;
    private final ff d;
    private final boqg e;
    private final bphu f;
    private final CharSequence g;

    public bphz(bokk bokkVar, dbsg<String> dbsgVar, bphu bphuVar, bpsr bpsrVar, booa booaVar, bnyd bnydVar, ff ffVar) {
        CharSequence string;
        this.f = bphuVar;
        this.a = bpsrVar;
        this.d = ffVar;
        this.b = bnydVar.a(ffVar.g(), dtya.V, dtya.bH);
        if (dbsgVar.a()) {
            Resources resources = ffVar.getResources();
            String b = dbsgVar.b();
            int ordinal = bphuVar.ordinal();
            if (ordinal == 0) {
                string = Html.fromHtml(resources.getString(R.string.RAP_ROAD_DOES_NOT_EXIST_SUMMARY_TEXT, Html.escapeHtml(b)));
            } else if (ordinal == 1) {
                string = Html.fromHtml(resources.getString(R.string.RAP_ROAD_DRAWN_INCORRECTLY_SUMMARY_TEXT, Html.escapeHtml(b)));
            } else if (ordinal == 2) {
                string = Html.fromHtml(resources.getString(R.string.RAP_ROAD_PRIVATE_SUMMARY_TEXT, Html.escapeHtml(b)));
            } else if (ordinal == 3) {
                string = Html.fromHtml(resources.getString(R.string.RAP_ROAD_PERMANENTLY_CLOSED_SUMMARY_TEXT, Html.escapeHtml(b)));
            } else if (ordinal == 4) {
                string = Html.fromHtml(resources.getString(R.string.RAP_ROAD_OTHER_SUMMARY_TEXT, Html.escapeHtml(b)));
            } else {
                throw null;
            }
        } else {
            Resources resources2 = ffVar.getResources();
            int ordinal2 = bphuVar.ordinal();
            if (ordinal2 == 0) {
                string = resources2.getString(R.string.RAP_ROAD_DOES_NOT_EXIST_SUMMARY_TEXT_UNNAMED_ROAD);
            } else if (ordinal2 == 1) {
                string = resources2.getString(R.string.RAP_ROAD_DRAWN_INCORRECTLY_SUMMARY_TEXT_UNNAMED_ROAD);
            } else if (ordinal2 == 2) {
                string = resources2.getString(R.string.RAP_ROAD_PRIVATE_SUMMARY_TEXT_UNNAMED_ROAD);
            } else if (ordinal2 == 3) {
                string = resources2.getString(R.string.RAP_ROAD_PERMANENTLY_CLOSED_SUMMARY_TEXT_UNNAMED_ROAD);
            } else if (ordinal2 == 4) {
                string = resources2.getString(R.string.RAP_ROAD_OTHER_HELP_TEXT);
            } else {
                throw null;
            }
        }
        this.g = string;
        this.c = new boxs(bokkVar, ffVar.getString(R.string.ADD_OPTIONAL_NOTE_HINT), bphw.a, null);
        this.e = booaVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        int i;
        ddho ddhoVar;
        ddho ddhoVar2;
        jhz a = jhz.a();
        ff ffVar = this.d;
        int ordinal = this.f.ordinal();
        if (ordinal == 0) {
            i = R.string.RAP_ROAD_ATTRIBUTE_SELECTION_DOES_NOT_EXIST_TITLE;
        } else if (ordinal == 1) {
            i = R.string.RAP_ROAD_ATTRIBUTE_SELECTION_DRAWN_INCORRECTLY_TITLE;
        } else if (ordinal == 2) {
            i = R.string.RAP_ROAD_ATTRIBUTE_SELECTION_PRIVATE_TITLE;
        } else if (ordinal == 3) {
            i = R.string.RAP_ROAD_PERMANENTLY_CLOSED_TITLE;
        } else if (ordinal != 4) {
            throw null;
        } else {
            i = R.string.RAP_ROAD_ATTRIBUTE_SELECTION_OTHER_TITLE;
        }
        a.a = ffVar.getString(i);
        a.C = 2;
        a.x = true;
        a.f(new View.OnClickListener(this) { // from class: bphx
            private final bphz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.b();
            }
        });
        int ordinal2 = this.f.ordinal();
        if (ordinal2 == 0) {
            ddhoVar = dtya.aR;
        } else if (ordinal2 == 1) {
            ddhoVar = dtya.aU;
        } else if (ordinal2 == 2) {
            ddhoVar = dtya.by;
        } else if (ordinal2 == 3) {
            ddhoVar = dtya.bv;
        } else if (ordinal2 != 4) {
            throw null;
        } else {
            ddhoVar = dtya.br;
        }
        a.o = cjtd.a(ddhoVar);
        String string = this.d.getString(R.string.REPORT_MAP_ISSUE_SUBMIT);
        jhm a2 = jhm.a();
        a2.a = string;
        int ordinal3 = this.f.ordinal();
        if (ordinal3 == 0) {
            ddhoVar2 = dtya.aT;
        } else if (ordinal3 == 1) {
            ddhoVar2 = dtya.aW;
        } else if (ordinal3 == 2) {
            ddhoVar2 = dtya.bA;
        } else if (ordinal3 == 3) {
            ddhoVar2 = dtya.bx;
        } else if (ordinal3 != 4) {
            throw null;
        } else {
            ddhoVar2 = dtya.bu;
        }
        a2.f = cjtd.a(ddhoVar2);
        a2.b = string;
        a2.h = 2;
        a2.d(new View.OnClickListener(this) { // from class: bphy
            private final bphz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.a();
            }
        });
        a2.n = true;
        a.c(a2.c());
        return a.b();
    }

    @Override // defpackage.bpwr
    public CharSequence b() {
        return this.g;
    }

    @Override // defpackage.bpwr
    public bpvn c() {
        return this.c;
    }

    @Override // defpackage.bpwr
    public boqg d() {
        return this.e;
    }
}
