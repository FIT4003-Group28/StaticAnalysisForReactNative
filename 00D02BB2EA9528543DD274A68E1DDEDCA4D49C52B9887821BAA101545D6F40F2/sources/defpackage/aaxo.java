package defpackage;

import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.android.apps.gmm.base.views.util.UiHelper$URLSpanNoUnderline;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aaxo  reason: default package */
/* loaded from: classes2.dex */
public class aaxo implements aaws {
    public final gga a;
    public final dxio<afha> b;
    private final cbze c;
    private CharSequence f;
    private String d = "";
    private String e = "";
    private String i = "";
    private ccaq g = ccaq.b;
    private ccae h = ccae.a;

    public aaxo(gga ggaVar, cbze cbzeVar, dxio<afha> dxioVar) {
        this.a = ggaVar;
        this.c = cbzeVar;
        this.f = k(ggaVar);
        this.b = dxioVar;
    }

    private static CharSequence k(gga ggaVar) {
        String string = ggaVar.getString(R.string.EXPERIENCE_SHEET_OVERVIEW_MORE_TEXT);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(irg.r().b(ggaVar)), 0, string.length(), 17);
        return spannableString;
    }

    @Override // defpackage.aaws
    public String a() {
        return this.e;
    }

    @Override // defpackage.aaws
    public Boolean b() {
        return Boolean.valueOf(!dbsj.d(this.i));
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return Boolean.valueOf(!this.e.isEmpty());
    }

    @Override // defpackage.aaws
    public String d() {
        return this.i;
    }

    @Override // defpackage.aaws
    public CharSequence e() {
        return this.f;
    }

    @Override // defpackage.aaws
    public ccaq f() {
        return this.g;
    }

    @Override // defpackage.aaws
    public ccag g() {
        return this.c.a ? ccag.b : ccag.a;
    }

    @Override // defpackage.aaws
    public ccae h() {
        return this.h;
    }

    @Override // defpackage.aaws
    public cjtd i() {
        cjta b = cjtd.b();
        b.d = dtxo.bU;
        if (!dbsj.d(this.d)) {
            b.g(this.d);
        }
        return b.a();
    }

    public void j(diwb diwbVar) {
        String str;
        dbsg dbsgVar;
        String str2;
        final String str3;
        String str4;
        int i = diwbVar.a;
        if ((i & 256) != 0) {
            dium diumVar = diwbVar.k;
            if (diumVar == null) {
                diumVar = dium.d;
            }
            str = diumVar.a;
        } else if ((i & 128) != 0) {
            diuf diufVar = diwbVar.j;
            if (diufVar == null) {
                diufVar = diuf.c;
            }
            str = diufVar.a;
        } else {
            str = diwbVar.i;
        }
        this.e = str;
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        this.d = dittVar.b;
        int i2 = diwbVar.a;
        if ((i2 & 256) != 0) {
            dium diumVar2 = diwbVar.k;
            if (diumVar2 == null) {
                diumVar2 = dium.d;
            }
            if (diumVar2.b.isEmpty()) {
                dbsgVar = dbpy.a;
            } else {
                dium diumVar3 = diwbVar.k;
                if (diumVar3 == null) {
                    diumVar3 = dium.d;
                }
                str2 = diumVar3.b.get(0).b;
                dium diumVar4 = diwbVar.k;
                if (diumVar4 == null) {
                    diumVar4 = dium.d;
                }
                str3 = diumVar4.b.get(0).a;
                if (!dbsj.d(str2) || dbsj.d(str3)) {
                    dbsgVar = dbpy.a;
                } else {
                    SpannableString spannableString = new SpannableString(str2);
                    final int b = irg.r().b(this.a);
                    spannableString.setSpan(new UiHelper$URLSpanNoUnderline(str3, b) { // from class: com.google.android.apps.gmm.experiences.details.modules.info.viewmodelimpl.OverviewDescriptionViewModelImpl$1
                        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                        public final void onClick(View view) {
                            aaxo.this.b.a().l(aaxo.this.a, Uri.parse(str3), 1);
                        }
                    }, 0, str2.length(), 17);
                    dbsgVar = dbsg.i(spannableString);
                }
            }
        } else if ((i2 & 128) == 0) {
            dbsgVar = dbpy.a;
        } else {
            diuf diufVar2 = diwbVar.j;
            if (diufVar2 == null) {
                diufVar2 = diuf.c;
            }
            dnpq dnpqVar = diufVar2.b;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            str2 = dnpqVar.d;
            diuf diufVar3 = diwbVar.j;
            if (diufVar3 == null) {
                diufVar3 = diuf.c;
            }
            dnpq dnpqVar2 = diufVar3.b;
            if (dnpqVar2 == null) {
                dnpqVar2 = dnpq.g;
            }
            str3 = dnpqVar2.c;
            if (!dbsj.d(str2)) {
            }
            dbsgVar = dbpy.a;
        }
        if (dbsgVar.a()) {
            this.f = (CharSequence) dbsgVar.b();
            this.g = ccaq.c;
            this.h = ccae.c;
        } else {
            this.f = k(this.a);
            this.g = ccaq.b;
            this.h = ccae.a;
        }
        if ((diwbVar.a & 256) != 0) {
            dium diumVar5 = diwbVar.k;
            if (diumVar5 == null) {
                diumVar5 = dium.d;
            }
            if (!diumVar5.c.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                dium diumVar6 = diwbVar.k;
                if (diumVar6 == null) {
                    diumVar6 = dium.d;
                }
                for (divs divsVar : diumVar6.c) {
                    if (!divsVar.a.isEmpty()) {
                        arrayList.add(divsVar.a);
                    }
                }
                str4 = dbrz.e("\n").g(arrayList);
                this.i = str4;
            }
        }
        str4 = "";
        this.i = str4;
    }
}
