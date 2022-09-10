package defpackage;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dfa  reason: default package */
/* loaded from: classes6.dex */
public final class dfa implements czj {
    public final Executor a;
    public final dfq b;
    private final dehq c;
    private final cqat d;
    private final dfk e;
    private final btvo f;
    private final acwo g;
    @dzsi
    private dehn<?> h;

    public dfa(dehq dehqVar, cqat cqatVar, Executor executor, dfk dfkVar, dfq dfqVar, btvo btvoVar, acwo acwoVar) {
        this.c = dehqVar;
        this.d = cqatVar;
        this.a = executor;
        this.e = dfkVar;
        this.b = dfqVar;
        this.f = btvoVar;
        this.g = acwoVar;
    }

    @Override // defpackage.czj
    public final void a(czh czhVar, @dzsi dehn<Bitmap> dehnVar, boolean z, @dzsi String str, Runnable runnable) {
        dfk dfkVar = this.e;
        if (dehnVar == null) {
            dfkVar.a(czhVar, null, z, str, dbpy.a, runnable);
        } else {
            deha.q(degp.q(dehnVar), new dfi(dfkVar, czhVar, z, str, runnable), dfkVar.b);
        }
    }

    @Override // defpackage.czj
    public final void b(czh czhVar, boolean z, @dzsi String str, czi cziVar) {
        czh czhVar2 = czh.WALKING_NAVIGATION;
        int ordinal = czhVar.ordinal();
        if (ordinal == 0) {
            dhlz dhlzVar = this.f.getNavigationParametersProto().aJ;
            if (dhlzVar == null) {
                dhlzVar = dhlz.n;
            }
            if (dhlzVar.m) {
                this.g.i(dvum.AUGMENTED_REALITY_WALKING_NAV_SESSION, null);
                return;
            }
        } else if (ordinal == 1) {
            dknv dknvVar = this.f.getAugmentedRealityParameters().a;
            if (dknvVar == null) {
                dknvVar = dknv.v;
            }
            if (dknvVar.o) {
                this.g.i(dvum.AUGMENTED_REALITY_LIGHTHOUSE_SESSION, null);
                return;
            }
        }
        dstv a = dsvb.a(this.d.b());
        deha.q(cziVar.a(a), new dey(this, czhVar, z, str, cziVar, a), this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(final czh czhVar, final boolean z, @dzsi final String str) {
        dehn<?> dehnVar = this.h;
        if (dehnVar != null) {
            dehnVar.cancel(true);
        }
        dehu d = this.c.d(new Runnable(this, czhVar, z, str) { // from class: dew
            private final dfa a;
            private final czh b;
            private final boolean c;
            private final String d;

            {
                this.a = this;
                this.b = czhVar;
                this.c = z;
                this.d = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ggc ggcVar;
                Spanned fromHtml;
                ddho ddhoVar;
                ddho ddhoVar2;
                dfa dfaVar = this.a;
                final czh czhVar2 = this.b;
                final boolean z2 = this.c;
                final String str2 = this.d;
                final dfq dfqVar = dfaVar.b;
                if (!dfqVar.a.aZ) {
                    return;
                }
                dfqVar.a();
                final czwe czweVar = new czwe(dfqVar.a);
                czweVar.setContentView(R.layout.feedback_bottomsheet);
                czweVar.a().m = true;
                czweVar.a().y(3);
                Iterator<fd> it = dfqVar.a.g().q().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ggcVar = null;
                        break;
                    }
                    fd next = it.next();
                    if (next instanceof ggc) {
                        ggcVar = (ggc) next;
                        break;
                    }
                }
                if (ggcVar != null && ggcVar.bd().a()) {
                    cjqp b = ggcVar.bd().b();
                    czh czhVar3 = czh.WALKING_NAVIGATION;
                    int ordinal = czhVar2.ordinal();
                    if (ordinal == 0) {
                        ddhoVar = dtxw.q;
                    } else if (ordinal != 1) {
                        ddhoVar = ordinal != 3 ? dtxw.q : dtxj.bh;
                    } else {
                        ddhoVar = dtxj.bB;
                    }
                    final ddho ddhoVar3 = ddhoVar;
                    int ordinal2 = czhVar2.ordinal();
                    if (ordinal2 == 0) {
                        ddhoVar2 = dtxw.p;
                    } else if (ordinal2 != 1) {
                        ddhoVar2 = ordinal2 != 3 ? dtxw.p : dtxj.bg;
                    } else {
                        ddhoVar2 = dtxj.bA;
                    }
                    final ddho ddhoVar4 = ddhoVar2;
                    final cjta b2 = cjtd.b();
                    if (str2 != null) {
                        ddje bZ = ddjf.e.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ddjf ddjfVar = (ddjf) bZ.b;
                        str2.getClass();
                        ddjfVar.a = 1 | ddjfVar.a;
                        ddjfVar.b = str2;
                        ddjf bK = bZ.bK();
                        ddeu ddeuVar = b2.e;
                        if (ddeuVar.c) {
                            ddeuVar.bF();
                            ddeuVar.c = false;
                        }
                        ddev ddevVar = (ddev) ddeuVar.b;
                        ddev ddevVar2 = ddev.u;
                        bK.getClass();
                        ddevVar.k = bK;
                        ddevVar.a |= 8192;
                    }
                    b2.d = ddhoVar3;
                    final cjql d2 = b.d(b2.a());
                    b2.d = ddhoVar4;
                    final cjql d3 = b.d(b2.a());
                    final RadioGroup radioGroup = (RadioGroup) czweVar.findViewById(R.id.thumbs_radio_group);
                    dbsk.s(radioGroup);
                    czweVar.setOnDismissListener(new DialogInterface.OnDismissListener(dfqVar, radioGroup, d2, b2, ddhoVar3, d3, ddhoVar4) { // from class: dfm
                        private final dfq a;
                        private final RadioGroup b;
                        private final cjql c;
                        private final cjta d;
                        private final ddho e;
                        private final cjql f;
                        private final ddho g;

                        {
                            this.a = dfqVar;
                            this.b = radioGroup;
                            this.c = d2;
                            this.d = b2;
                            this.e = ddhoVar3;
                            this.f = d3;
                            this.g = ddhoVar4;
                        }

                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            dfq dfqVar2 = this.a;
                            RadioGroup radioGroup2 = this.b;
                            cjql cjqlVar = this.c;
                            cjta cjtaVar = this.d;
                            ddho ddhoVar5 = this.e;
                            cjql cjqlVar2 = this.f;
                            ddho ddhoVar6 = this.g;
                            dfqVar2.a();
                            dfqVar2.c.g();
                            int checkedRadioButtonId = radioGroup2.getCheckedRadioButtonId();
                            if (checkedRadioButtonId == R.id.feedback_thumbs_up_button) {
                                cjqy cjqyVar = dfqVar2.c;
                                cjtaVar.d = ddhoVar5;
                                cjqyVar.j(cjqlVar, cjtaVar.a());
                            } else if (checkedRadioButtonId != R.id.feedback_thumbs_down_button) {
                            } else {
                                cjqy cjqyVar2 = dfqVar2.c;
                                cjtaVar.d = ddhoVar6;
                                cjqyVar2.j(cjqlVar2, cjtaVar.a());
                            }
                        }
                    });
                }
                TextView textView = (TextView) czweVar.findViewById(R.id.feedback_description);
                dbsk.s(textView);
                dfp dfpVar = new dfp(new View.OnClickListener(dfqVar, czhVar2, z2, str2) { // from class: dfn
                    private final dfq a;
                    private final czh b;
                    private final boolean c;
                    private final String d;

                    {
                        this.a = dfqVar;
                        this.b = czhVar2;
                        this.c = z2;
                        this.d = str2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dfq dfqVar2 = this.a;
                        dfqVar2.d.a(this.b, null, this.c, this.d, dbpy.a, dfo.a);
                    }
                }, czweVar);
                if (Build.VERSION.SDK_INT >= 24) {
                    fromHtml = Html.fromHtml(dfqVar.a.getString(R.string.ARWN_FEEDBACK_BAR_DESCRIPTION), 63);
                } else {
                    fromHtml = Html.fromHtml(dfqVar.a.getString(R.string.ARWN_FEEDBACK_BAR_DESCRIPTION));
                }
                URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
                SpannableString spannableString = fromHtml;
                if (uRLSpanArr.length > 0) {
                    URLSpan uRLSpan = uRLSpanArr[0];
                    int spanStart = fromHtml.getSpanStart(uRLSpan);
                    int spanEnd = fromHtml.getSpanEnd(uRLSpan);
                    SpannableString spannableString2 = new SpannableString(fromHtml);
                    spannableString2.removeSpan(uRLSpan);
                    spannableString2.setSpan(dfpVar, spanStart, spanEnd, 33);
                    spannableString = spannableString2;
                }
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(spannableString, TextView.BufferType.SPANNABLE);
                czweVar.show();
                dfqVar.e = dfqVar.b.d(new Runnable(dfqVar, czweVar) { // from class: dfl
                    private final dfq a;
                    private final czwe b;

                    {
                        this.a = dfqVar;
                        this.b = czweVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dfq dfqVar2 = this.a;
                        czwe czweVar2 = this.b;
                        if (!dfqVar2.a.aZ || !czweVar2.isShowing()) {
                            return;
                        }
                        czweVar2.dismiss();
                    }
                }, 5L, TimeUnit.SECONDS);
            }
        }, 3L, TimeUnit.SECONDS);
        this.h = d;
        deha.q(d, new dez(), dege.a);
    }
}
