package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lzx  reason: default package */
/* loaded from: classes3.dex */
public final class lzx implements wkd, wkg {
    private final axnm a;
    private final ajhl b;
    private final aaar c;
    private asit d;
    private ViewGroup e;
    private awnn f;
    private boolean g;
    private ajhh h;

    public lzx(ajhl ajhlVar, axnm axnmVar, aaar aaarVar) {
        this.a = axnmVar;
        this.b = ajhlVar;
        this.c = aaarVar;
    }

    private final void b(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) zag.g(view, R.id.element_companion_card_stub, R.id.element_companion_card);
            viewGroup.setVisibility(8);
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            this.e.setVisibility(8);
            this.b.qZ(null);
            this.b.a().setVisibility(8);
        }
    }

    private final void c() {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            int i = 8;
            viewGroup.setVisibility(true != this.g ? 8 : 0);
            View a = this.b.a();
            if (true == this.g) {
                i = 0;
            }
            a.setVisibility(i);
        }
    }

    private final boolean j(aqtb aqtbVar) {
        if (aqtbVar == null) {
            return false;
        }
        ajin ajinVar = (ajin) this.a.get();
        ajhh a = ajhh.a(aqtbVar);
        byte[] bArr = a.b;
        if (bArr != null) {
            try {
                this.f = (awnn) aopi.parseFrom(awnn.a, bArr, aoos.b());
                this.h = a;
                return true;
            } catch (aopx unused) {
            }
        }
        return false;
    }

    @Override // defpackage.wke
    public final void a() {
        c();
    }

    @Override // defpackage.wke
    public final void d(View view, ajrs ajrsVar) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null || viewGroup.getParent() != view) {
            b(view);
            ViewGroup viewGroup2 = (ViewGroup) zag.g(view, R.id.element_companion_card_stub, R.id.element_companion_card);
            this.e = viewGroup2;
            viewGroup2.addView(this.b.a());
        }
        c();
        if (this.d != null) {
            aopa createBuilder = asjj.a.createBuilder();
            asit asitVar = this.d;
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asitVar.getClass();
            asjjVar.t = asitVar;
            asjjVar.c |= 1024;
            ajrsVar.c = (asjj) createBuilder.mo39build();
        }
        this.b.oK(ajrsVar, this.h);
    }

    @Override // defpackage.wke
    public final void e(View view) {
        b(view);
        this.d = null;
        this.e = null;
        this.h = null;
        this.g = false;
    }

    @Override // defpackage.wke
    public final void f() {
        this.g = true;
        c();
    }

    @Override // defpackage.wkd
    public final boolean g(String str, PlayerResponseModel playerResponseModel, asit asitVar) {
        this.d = asitVar;
        aqtb aqtbVar = null;
        asaj asajVar = playerResponseModel != null ? playerResponseModel.a : null;
        if (asajVar != null) {
            atzu atzuVar = asajVar.A;
            if (atzuVar == null) {
                atzuVar = atzu.a;
            }
            if (atzuVar.b == 153515154) {
                atzu atzuVar2 = asajVar.A;
                if (atzuVar2 == null) {
                    atzuVar2 = atzu.a;
                }
                if (atzuVar2.b == 153515154) {
                    aqtbVar = (aqtb) atzuVar2.c;
                } else {
                    aqtbVar = aqtb.a;
                }
            }
        }
        return j(aqtbVar);
    }

    @Override // defpackage.wke
    public final void h(wxo wxoVar) {
        awnn awnnVar;
        aaar aaarVar;
        if (wxoVar.a() != wzq.USER_SKIPPED || (awnnVar = this.f) == null) {
            return;
        }
        awow awowVar = awnnVar.c;
        if (awowVar == null) {
            awowVar = awow.a;
        }
        awnc awncVar = ((awmx) awowVar.qm(awmx.b)).e;
        if (awncVar == null) {
            awncVar = awnc.a;
        }
        if (!awncVar.qn(awpp.b) || (aaarVar = this.c) == null) {
            return;
        }
        aaarVar.b();
    }

    @Override // defpackage.wkg
    public final boolean i(String str, aqfd aqfdVar, asit asitVar) {
        aqtb aqtbVar;
        this.d = asitVar;
        if ((aqfdVar.b & 32) != 0) {
            aqtbVar = aqfdVar.h;
            if (aqtbVar == null) {
                aqtbVar = aqtb.a;
            }
        } else {
            aqtbVar = null;
        }
        return j(aqtbVar);
    }
}
