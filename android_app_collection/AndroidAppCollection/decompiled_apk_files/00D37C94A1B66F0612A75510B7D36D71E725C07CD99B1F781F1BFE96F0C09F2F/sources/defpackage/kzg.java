package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kzg  reason: default package */
/* loaded from: classes3.dex */
public final class kzg extends mfs {
    private final ajyc C;
    private final ajrp D;
    private final View E;
    private final jkv F;
    private final ViewStub G;
    private kuc H;
    private final kzf I;

    /* renamed from: J  reason: collision with root package name */
    private int f222J;
    private jku K;
    private avxc L;
    protected final ajrx a;
    protected final LinearLayout b;
    protected int c;
    public final kzf d;
    public final kzf e;
    public boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kzg(android.content.Context r13, defpackage.ajmy r14, defpackage.aafo r15, defpackage.ajyc r16, defpackage.jkv r17, defpackage.ftb r18, defpackage.kua r19, defpackage.amqo r20, android.view.ViewGroup r21) {
        /*
            r12 = this;
            r10 = r12
            java.lang.Object r0 = r20.get()
            r11 = r0
            ajrx r11 = (defpackage.ajrx) r11
            r5 = 2131625562(0x7f0e065a, float:1.8878335E38)
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r11
            r6 = r21
            r7 = r17
            r8 = r18
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.getClass()
            r10.a = r11
            r0 = r16
            r10.C = r0
            ajrp r0 = new ajrp
            r1 = r15
            r0.<init>(r15, r11)
            r10.D = r0
            r0 = r17
            r10.F = r0
            android.view.View r0 = r10.i
            android.content.res.Resources r1 = r13.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r0.setLayoutDirection(r1)
            r1 = 2131431870(0x7f0b11be, float:1.8485481E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r10.b = r1
            r2 = 2131431590(0x7f0b10a6, float:1.8484914E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            kzb r1 = new kzb
            r1.<init>()
            r2 = 2131429923(0x7f0b0a23, float:1.8481532E38)
            r0.setTag(r2, r1)
            kzc r1 = new kzc
            r1.<init>()
            defpackage.lj.M(r0, r1)
            r1 = 2131428567(0x7f0b04d7, float:1.8478782E38)
            android.view.View r1 = r0.findViewById(r1)
            r10.E = r1
            kzf r1 = new kzf
            r2 = 2131431995(0x7f0b123b, float:1.8485735E38)
            r1.<init>(r2, r0)
            r10.I = r1
            kzf r1 = new kzf
            r2 = 2131427684(0x7f0b0164, float:1.8476991E38)
            r1.<init>(r2, r0)
            r10.d = r1
            kzf r1 = new kzf
            r2 = 2131428565(0x7f0b04d5, float:1.8478778E38)
            r1.<init>(r2, r0)
            r10.e = r1
            r1 = 2131429910(0x7f0b0a16, float:1.8481506E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r10.G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzg.<init>(android.content.Context, ajmy, aafo, ajyc, jkv, ftb, kua, amqo, android.view.ViewGroup):void");
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a.a();
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, avxc avxcVar) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        atep atepVar;
        apmk apmkVar;
        apmi apmiVar;
        atfh atfhVar;
        apmh apmhVar;
        int ac;
        this.L = avxcVar;
        ajrp ajrpVar = this.D;
        acti actiVar = ajrsVar.a;
        if ((avxcVar.b & 64) != 0) {
            apzgVar = avxcVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), this);
        ajrsVar.a.u(new acte(avxcVar.s), null);
        ajrs ajrsVar2 = new ajrs(ajrsVar);
        ajrsVar2.b = avxcVar.s.I();
        if ((avxcVar.b & 4) != 0) {
            aragVar = avxcVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        B(ajgl.b(aragVar));
        arag aragVar3 = avxcVar.e;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        Spanned b = ajgl.b(aragVar3);
        if (!TextUtils.isEmpty(b)) {
            this.f = true;
            this.d.a(b, R.id.author);
        } else {
            this.f = false;
            this.d.b();
        }
        arag aragVar4 = avxcVar.f;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar4);
        apmg apmgVar = avxcVar.k;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        int i = apmgVar.b & 2;
        avxd avxdVar = avxcVar.q;
        if (avxdVar == null) {
            avxdVar = avxd.a;
        }
        if (i != 0 || TextUtils.isEmpty(b2)) {
            this.e.b();
        } else {
            if (avxdVar != null && (ac = awwc.ac(avxdVar.b)) != 0 && ac == 3) {
                TextView textView = (TextView) a().findViewById(R.id.title);
                textView.getViewTreeObserver().addOnPreDrawListener(new kze(this, textView));
            }
            this.e.a(b2, R.id.details);
        }
        arag aragVar5 = avxcVar.g;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        Spanned b3 = ajgl.b(aragVar5);
        if ((avxcVar.b & 32) != 0) {
            aragVar2 = avxcVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        CharSequence i2 = ajgl.i(aragVar2);
        aopu aopuVar = avxcVar.o;
        avss avssVar = avxcVar.m;
        if (avssVar == null) {
            avssVar = avss.a;
        }
        p(b3, i2, aopuVar, avssVar);
        avhn avhnVar = avxcVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        z(avhnVar);
        avhc[] avhcVarArr = (avhc[]) avxcVar.o.toArray(new avhc[0]);
        avha avhaVar = (avha) ohn.h(avhcVarArr, kue.c);
        avgr avgrVar = (avgr) ohn.h(avhcVarArr, kue.b);
        String str = null;
        for (avhc avhcVar : avhcVarArr) {
            if ((avhcVar.b & 8) != 0) {
                avhd avhdVar = avhcVar.e;
                if (avhdVar == null) {
                    avhdVar = avhd.a;
                }
                str = avhdVar.b;
            }
        }
        View view = this.E;
        if (view != null) {
            if (avgrVar == null || avgrVar.b != 1) {
                view.setVisibility(8);
            } else {
                if (this.H == null) {
                    this.H = new kuc((ViewStub) view);
                }
                kuc kucVar = this.H;
                Spanned b4 = ajgl.b(avgrVar.b == 1 ? (arag) avgrVar.c : arag.a);
                if (TextUtils.isEmpty(b4)) {
                    kucVar.a.setVisibility(8);
                } else {
                    if (!kucVar.b) {
                        kucVar.c = (TextView) kucVar.a.inflate().findViewById(R.id.text);
                        kucVar.b = true;
                    }
                    kucVar.c.setText(b4);
                    kucVar.a.setVisibility(0);
                    kucVar.c.setVisibility(0);
                }
            }
        }
        t(avhaVar);
        if (str != null) {
            this.I.a(str, R.id.watched);
        } else {
            this.I.b();
        }
        acti actiVar2 = ajrsVar2.a;
        ajyc ajycVar = this.C;
        View a = this.a.a();
        View view2 = this.y;
        ates atesVar = avxcVar.p;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) != 0) {
            ates atesVar2 = avxcVar.p;
            if (atesVar2 == null) {
                atesVar2 = ates.a;
            }
            atepVar = atesVar2.c;
            if (atepVar == null) {
                atepVar = atep.a;
            }
        } else {
            atepVar = null;
        }
        ajycVar.e(a, view2, atepVar, avxcVar, actiVar2);
        if ((avxcVar.b & 1024) != 0) {
            apmg apmgVar2 = avxcVar.j;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmkVar = apmgVar2.c;
            if (apmkVar == null) {
                apmkVar = apmk.a;
            }
        } else {
            apmkVar = null;
        }
        w(apmkVar);
        if ((avxcVar.b & 2048) != 0) {
            apmg apmgVar3 = avxcVar.k;
            if (apmgVar3 == null) {
                apmgVar3 = apmg.a;
            }
            apmiVar = apmgVar3.d;
            if (apmiVar == null) {
                apmiVar = apmi.a;
            }
        } else {
            apmiVar = null;
        }
        v(apmiVar);
        if ((avxcVar.b & 2048) != 0) {
            apmg apmgVar4 = avxcVar.k;
            if (apmgVar4 == null) {
                apmgVar4 = apmg.a;
            }
            atfhVar = apmgVar4.f;
            if (atfhVar == null) {
                atfhVar = atfh.a;
            }
        } else {
            atfhVar = null;
        }
        r(atfhVar);
        if ((avxcVar.b & 512) != 0) {
            apmg apmgVar5 = avxcVar.i;
            if (apmgVar5 == null) {
                apmgVar5 = apmg.a;
            }
            apmhVar = apmgVar5.e;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
        } else {
            apmhVar = null;
        }
        u(apmhVar);
        avxe avxeVar = avxcVar.r;
        if (avxeVar == null) {
            avxeVar = avxe.a;
        }
        if ((avxeVar.b & 1) != 0) {
            avxe avxeVar2 = avxcVar.r;
            if (avxeVar2 == null) {
                avxeVar2 = avxe.a;
            }
            C(ajrsVar, avxeVar2);
            ViewStub viewStub = this.G;
            if (viewStub != null) {
                if ((this.L.b & 8) != 0) {
                    super.s(ajrsVar, null);
                } else {
                    if (this.K == null) {
                        this.K = this.F.a(viewStub, null);
                    }
                    this.K.b(ajrsVar);
                }
            }
        }
        avxd avxdVar2 = avxcVar.q;
        if (avxdVar2 == null) {
            avxdVar2 = avxd.a;
        }
        int ac2 = awwc.ac(avxdVar2.b);
        if (ac2 != 0 && ac2 == 3) {
            int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.preview_card_video_card_width);
            this.f222J = dimensionPixelSize;
            this.f222J = dimensionPixelSize + this.i.getPaddingLeft() + this.i.getPaddingRight();
            this.z = this.g.getResources().getInteger(R.integer.preview_card_video_card_title_max_lines);
            this.c = this.g.getResources().getInteger(R.integer.preview_card_video_description_row_number);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).setMarginStart(this.g.getResources().getDimensionPixelSize(R.dimen.preview_card_video_card_menu_start_margin));
            this.j.setMaxLines(this.z);
            ((ViewGroup.MarginLayoutParams) this.j.getLayoutParams()).setMarginEnd(this.g.getResources().getDimensionPixelSize(R.dimen.preview_card_video_card_margin));
            this.i.getViewTreeObserver().addOnGlobalLayoutListener(new kzd(this, avxcVar));
        } else {
            avxd avxdVar3 = avxcVar.q;
            if (avxdVar3 == null) {
                avxdVar3 = avxd.a;
            }
            int ac3 = awwc.ac(avxdVar3.b);
            if (ac3 != 0 && ac3 == 4) {
                TypedValue typedValue = new TypedValue();
                this.g.getResources().getValue(R.dimen.big_video_card_width_percent, typedValue, true);
                this.f222J = (int) (zew.l(this.g) * typedValue.getFloat());
                int integer = this.g.getResources().getInteger(R.integer.video_card_title_max_lines);
                this.z = integer;
                this.j.setMaxLines(integer);
            } else {
                int dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.video_card_width);
                this.f222J = dimensionPixelSize2;
                this.f222J = dimensionPixelSize2 + this.i.getPaddingLeft() + this.i.getPaddingRight();
                int integer2 = this.g.getResources().getInteger(R.integer.video_card_title_max_lines);
                this.z = integer2;
                this.j.setMaxLines(integer2);
            }
        }
        zgd.t(a(), zgd.r(this.f222J), ViewGroup.LayoutParams.class);
        this.a.e(ajrsVar2);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.L = null;
        jku jkuVar = this.K;
        if (jkuVar != null) {
            jkuVar.a();
        }
        this.D.c();
    }
}
