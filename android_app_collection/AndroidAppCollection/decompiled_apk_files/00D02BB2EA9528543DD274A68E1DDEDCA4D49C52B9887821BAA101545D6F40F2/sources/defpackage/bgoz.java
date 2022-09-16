package defpackage;

import android.app.Activity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.google.android.apps.gmm.place.action.webview.ChattyPostWebViewCallbacks;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bgoz  reason: default package */
/* loaded from: classes3.dex */
public class bgoz implements bgnt {
    private final Activity a;
    private final dipk b;
    private final cjtd c;
    private final cjtd d;
    private final cjtd e;
    private final bgnk f;
    private final ilo g;
    @dzsi
    private final bgnq h;
    private final bgni i;
    private final cjtd j;
    @dzsi
    private final dxio<bvvw> k;
    @dzsi
    private final dxio<apyz> l;
    private final btvo m;
    private int o;
    private Boolean n = false;
    private final cqfc p = new cqfc(this) { // from class: bgox
        private final bgoz a;

        {
            this.a = this;
        }

        @Override // defpackage.cqfc
        public final void a(View view, boolean z) {
            bgoz bgozVar = this.a;
            jla jlaVar = (jla) view;
            boolean contentEquals = jlaVar.getText().toString().contentEquals(bgozVar.g());
            bgozVar.b(contentEquals);
            if (!contentEquals || !bgozVar.v().booleanValue()) {
                return;
            }
            jlaVar.setMovementMethod(LinkMovementMethod.getInstance());
        }
    };

    public bgoz(Activity activity, cqhn cqhnVar, bmdq bmdqVar, bgnj bgnjVar, dxio<afha> dxioVar, dipk dipkVar, boolean z, dxio<bvvw> dxioVar2, dxio<apyz> dxioVar3, btvo btvoVar, int i, ilo iloVar, bgnk bgnkVar) {
        this.b = dipkVar;
        this.a = activity;
        this.k = dxioVar2;
        this.l = dxioVar3;
        this.m = btvoVar;
        this.o = i;
        this.f = bgnkVar;
        this.g = iloVar;
        this.j = w(dipkVar, bgnkVar, dtxy.jz, dtxu.aC, null);
        cjtd w = w(dipkVar, bgnkVar, dtxy.jD, dtxu.aF, dtxu.bb);
        this.c = w;
        cjtd w2 = w(dipkVar, bgnkVar, dtxy.jA, dtxr.b, dtxu.aT);
        this.d = w2;
        this.e = w(dipkVar, bgnkVar, dtxy.jB, dtxu.aD, dtxu.aU);
        this.h = bgot.g(dipkVar, activity, i, iloVar, bmdqVar, bgnkVar, dxioVar);
        this.i = bgnjVar.a(dipkVar, w, w2);
    }

    private static cjtd w(dipk dipkVar, bgnk bgnkVar, ddho ddhoVar, ddho ddhoVar2, @dzsi ddho ddhoVar3) {
        int ordinal = bgnkVar.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                ddhoVar = ddhoVar2;
            } else if (ordinal != 3) {
                return cjtd.b;
            } else {
                ddhoVar = ddhoVar3;
            }
        }
        if (ddhoVar == null) {
            return cjtd.b;
        }
        cjta cjtaVar = new cjta();
        cjtaVar.d = ddhoVar;
        cjtaVar.g(dipkVar.q);
        bgnf.a(cjtaVar, dipkVar);
        return cjtaVar.a();
    }

    private final boolean x() {
        return this.a.getResources().getConfiguration().fontScale > 1.0f;
    }

    @Override // defpackage.bgnt
    public cqfc a() {
        return this.p;
    }

    @Override // defpackage.bgnt
    public void b(boolean z) {
        this.n = Boolean.valueOf(z);
        cqkx.p(this);
    }

    @Override // defpackage.bgnt
    public Boolean c() {
        return this.n;
    }

    @Override // defpackage.bgnt
    public cqkl d() {
        b(true);
        return cqkl.a;
    }

    @Override // defpackage.bgnt
    public cjtd e() {
        return this.j;
    }

    @Override // defpackage.bgnt
    public String f() {
        return this.b.g;
    }

    @Override // defpackage.bgnt
    public CharSequence g() {
        return this.i.a(true);
    }

    @Override // defpackage.bgnt
    public CharSequence h() {
        return this.i.a(false);
    }

    @Override // defpackage.bgnt
    @dzsi
    public String i() {
        dipk dipkVar = this.b;
        if ((dipkVar.a & 128) != 0) {
            diph diphVar = dipkVar.k;
            if (diphVar == null) {
                diphVar = diph.d;
            }
            return diphVar.c;
        }
        return null;
    }

    @Override // defpackage.bgnt
    public String j() {
        return this.b.j;
    }

    @Override // defpackage.bgnt
    @dzsi
    public bgnq k() {
        return this.h;
    }

    @Override // defpackage.bgnt
    public Integer l() {
        int i = 4;
        if (!dbsj.d(f()) && this.f != bgnk.PLACESHEET_CAROUSEL) {
            i = 3;
        }
        if (!dbsj.d(i())) {
            i--;
        }
        bgnq bgnqVar = this.h;
        if (bgnqVar != null && !dbsj.d(bgnqVar.a())) {
            i--;
        }
        if (x()) {
            i--;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.bgnt
    public CharSequence m() {
        String lowerCase = this.a.getString(R.string.EXPAND_MORE).toLowerCase(Locale.getDefault());
        SpannableString spannableString = new SpannableString(lowerCase);
        spannableString.setSpan(new bgoy(ibm.x().b(this.a)), 0, lowerCase.length(), 17);
        return spannableString;
    }

    @Override // defpackage.bgnt
    public cqkl n() {
        dxio<bvvw> dxioVar = this.k;
        if (dxioVar != null) {
            bvvw a = dxioVar.a();
            bvxn bZ = bvxu.A.bZ();
            String str = this.b.v;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar = (bvxu) bZ.b;
            str.getClass();
            int i = bvxuVar.a | 1;
            bvxuVar.a = i;
            bvxuVar.b = str;
            int i2 = i | 4;
            bvxuVar.a = i2;
            bvxuVar.d = false;
            bvxuVar.a = i2 | 32;
            bvxuVar.g = true;
            bvxu.b(bvxuVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar2 = (bvxu) bZ.b;
            bvxuVar2.a |= 8;
            bvxuVar2.e = true;
            bvxp f = bvoa.f(ibm.b(), this.a);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar3 = (bvxu) bZ.b;
            f.getClass();
            bvxuVar3.x = f;
            bvxuVar3.a |= 4194304;
            bvxu.d(bvxuVar3);
            dkyw bZ2 = dkyx.f.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkyx.b((dkyx) bZ2.b);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkyx.c((dkyx) bZ2.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar4 = (bvxu) bZ.b;
            dkyx bK = bZ2.bK();
            bK.getClass();
            bvxuVar4.j = bK;
            bvxuVar4.a |= 256;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar5 = (bvxu) bZ.b;
            bvxuVar5.a |= 512;
            bvxuVar5.k = true;
            bvxu.c(bvxuVar5);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar6 = (bvxu) bZ.b;
            bvxuVar6.a |= 2048;
            bvxuVar6.m = true;
            bvxu bK2 = bZ.bK();
            ChattyPostWebViewCallbacks chattyPostWebViewCallbacks = new ChattyPostWebViewCallbacks();
            ddho ddhoVar = this.e.g;
            if (ddhoVar == null) {
                ddhoVar = dtxu.aD;
            }
            a.k(bK2, chattyPostWebViewCallbacks, ddhoVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.bgnt
    public Boolean o() {
        boolean z = false;
        if (this.k != null && this.l != null && this.m.getBusinessMessagingParameters().t && this.l.a().o() && !this.b.v.isEmpty() && this.g.cI()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgnt
    public cjtd p() {
        return this.e;
    }

    @Override // defpackage.bgnt
    public String q() {
        int i = this.o;
        if (i == -1) {
            return this.a.getString(R.string.MESSAGE_ON_POST_CONTENT_DESCRIPTION);
        }
        return this.a.getString(R.string.MESSAGE_ON_POST_CONTENT_DESCRIPTION_WITH_INDEX, new Object[]{Integer.valueOf(i + 1)});
    }

    @Override // defpackage.bgnt
    public CharSequence r() {
        return this.a.getString(R.string.LOCAL_CLICK_TO_CHAT_ACTION_MESSAGE);
    }

    @Override // defpackage.bgnt
    public Boolean s() {
        boolean d = dbsj.d(i());
        boolean z = false;
        if (dbsj.d(h().toString())) {
            return false;
        }
        if (d || !x()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgnt
    public Boolean t() {
        return Boolean.valueOf(this.b.m.size() > 0);
    }

    @Override // defpackage.bgnt
    public void u(int i) {
        this.o = i;
        bgnq bgnqVar = this.h;
        if (bgnqVar != null) {
            bgnqVar.f(i);
        }
    }

    public Boolean v() {
        dipf dipfVar = this.b.h;
        if (dipfVar == null) {
            dipfVar = dipf.b;
        }
        for (dipe dipeVar : dipfVar.a) {
            int a = dipd.a(dipeVar.c);
            if (a != 0 && a == 3 && (dipeVar.a & 4) != 0) {
                return true;
            }
        }
        return false;
    }
}
