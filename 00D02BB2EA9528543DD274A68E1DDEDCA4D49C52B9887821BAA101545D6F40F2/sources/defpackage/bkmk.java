package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkmk  reason: default package */
/* loaded from: classes3.dex */
public class bkmk implements bkmi {
    private final Resources a;
    private final String b;
    private final cjtd c;

    public bkmk(Resources resources, String str, bwrs<ilo> bwrsVar) {
        cjtd cjtdVar;
        this.a = resources;
        this.b = str;
        if (bwrsVar.c() != null) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            cjta c2 = cjtd.c(c.ca());
            c2.d = dtxv.az;
            cjtdVar = c2.a();
        } else {
            cjtdVar = cjtd.b;
        }
        this.c = cjtdVar;
    }

    @Override // defpackage.iao
    public cjtd b() {
        return this.c;
    }

    @Override // defpackage.iao
    public CharSequence c() {
        return this.a.getString(R.string.MENU_SUB_TAB_ON_TAB_BAR, this.b);
    }

    @Override // defpackage.iao
    public Boolean d() {
        return ian.c();
    }

    @Override // defpackage.iao
    public hxy e() {
        return null;
    }

    @Override // defpackage.iao
    public Integer f() {
        return ian.b();
    }

    @Override // defpackage.iao
    /* renamed from: g */
    public String a() {
        return this.b;
    }

    public void h(bkmj bkmjVar, int i) {
    }
}
