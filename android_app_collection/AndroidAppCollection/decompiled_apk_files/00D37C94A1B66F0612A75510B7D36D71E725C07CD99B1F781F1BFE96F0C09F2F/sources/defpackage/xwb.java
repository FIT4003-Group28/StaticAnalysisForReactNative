package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: xwb  reason: default package */
/* loaded from: classes4.dex */
public final class xwb extends xwn implements DialogInterface.OnShowListener {
    private static final Pattern aJ = Pattern.compile("^\\s*$");
    private static final Pattern aK = Pattern.compile("^\\s*");
    private static final Pattern aL = Pattern.compile("\\s*$");
    public boolean aA;
    public boolean aB;
    public boolean aC;
    public int aD;
    public String aE;
    public Long aF;
    public aacz aG;
    public xks aH;
    public emm aI;
    private avhn aM;
    private awlh aN;
    private apoj aO;
    private CharSequence aP;
    private boolean aQ;
    private apoj aR;
    private aqus aS;
    private aqak aT;
    private aqbc aU;
    private Spanned aV;
    private Spanned aW;
    private boolean aX;
    private boolean aY;
    private boolean aZ;
    public aafo ae;
    public akbx af;
    public ajvj ag;
    public akce ah;
    public ajmr ai;
    public ajxz aj;
    public acti ak;
    public akfc al;
    public akge am;
    public Context an;
    public akbv ao;
    public EditText ap;
    public View aq;
    public ImageView ar;
    public View as;
    public View at;
    public Runnable au;
    public Runnable av;
    public DialogInterface.OnDismissListener aw;
    public DialogInterface.OnCancelListener ax;
    public DialogInterface.OnShowListener ay;
    public Dialog az;
    private View ba;
    private ImageView bb;
    private View bc;
    private ImageView bd;
    private ImageView be;
    private TextView bf;
    private TextView bg;
    private View bh;
    private TextView bi;
    private View bj;
    private ImageView bk;
    private ImageView bl;
    private TextWatcher bm;
    private String bn;
    private aypf bo;

    private static aoqu aM(Bundle bundle, String str, aoqu aoquVar) {
        if (bundle.containsKey(str)) {
            try {
                return aphq.j(bundle, str, aoquVar, aoos.b());
            } catch (RuntimeException unused) {
                zep.b(str.length() != 0 ? "Failed to merge proto for ".concat(str) : new String("Failed to merge proto for "));
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        if (this.aC) {
            dismiss();
        }
    }

    @Override // defpackage.xwd
    public final Spanned a() {
        EditText editText = this.ap;
        if (editText == null) {
            return new SpannedString("");
        }
        return new SpannedString(editText.getText());
    }

    public final void aE(boolean z) {
        if (m()) {
            z = false;
        } else if (this.aB) {
            z = true;
        }
        this.aA = z;
        aG(z);
    }

    public final void aF(CharSequence charSequence, boolean z) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.ap.getText().clear();
            this.ap.append(charSequence);
            aE(z);
            if (!this.aA) {
                String charSequence2 = charSequence.toString();
                this.bn = charSequence2;
                String replaceAll = charSequence2.replaceAll(aK.toString(), "");
                this.bn = replaceAll;
                this.bn = replaceAll.replaceAll(aL.toString(), "");
            } else {
                this.bn = "";
            }
            xxq[] xxqVarArr = (xxq[]) this.ap.getText().getSpans(0, this.ap.getText().length(), xxq.class);
            if (xxqVarArr != null && xxqVarArr.length != 0) {
                return;
            }
            this.ap.getText().setSpan(new xxq(), 0, this.ap.getText().length(), 18);
        }
    }

    public final void aG(boolean z) {
        int i = 0;
        boolean z2 = this.ar.getVisibility() == 0 || (this.aY && this.be.getVisibility() == 0);
        ImageView imageView = this.bb;
        if (!z) {
            i = z2 ? 8 : 4;
        }
        imageView.setVisibility(i);
        zag.l(this.bb, null, 1);
    }

    public final void aH(boolean z) {
        this.be.setEnabled(!z);
        Drawable l = iy.l(po.b(this.an, R.drawable.ic_timestamp));
        l.setTint(zhn.j(this.an, true != z ? R.attr.ytTextSecondary : R.attr.ytTextDisabled).orElse(0));
        this.be.setImageDrawable(l);
    }

    public final void aI() {
        akbv akbvVar = this.ao;
        if (akbvVar != null) {
            akbvVar.f((ViewGroup) this.ba, this.aS, this.ap, new xwa(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aJ() {
        return TextUtils.isEmpty(this.bn) ? !m() : !a().toString().replaceAll(aK.toString(), "").replaceAll(aL.toString(), "").equals(this.bn);
    }

    @Override // defpackage.xwd
    public final void b() {
        this.az.cancel();
    }

    @Override // defpackage.dh
    public final void dismiss() {
        eo eoVar = this.z;
        if (eoVar == null || eoVar.Z()) {
            return;
        }
        super.dismiss();
    }

    @Override // defpackage.xwd
    public final void e(DialogInterface.OnCancelListener onCancelListener) {
        this.ax = onCancelListener;
    }

    @Override // defpackage.xwd
    public final void g() {
        this.ar.setVisibility(0);
    }

    @Override // defpackage.xwd
    public final void i() {
        if (this.ao.h) {
            aI();
        }
    }

    @Override // defpackage.xwd
    public final void j() {
        TextWatcher textWatcher = this.bm;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(this.ap.getText());
        }
    }

    @Override // defpackage.xwd
    public final boolean k() {
        return this.aA;
    }

    @Override // defpackage.xwd
    public final boolean m() {
        String obj = a().toString();
        return TextUtils.isEmpty(obj) || aJ.matcher(obj).find();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f6, code lost:
        if (r5 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    @Override // defpackage.dh, defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mQ(android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwb.mQ(android.os.Bundle):void");
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mR() {
        super.mR();
        aypf aypfVar = this.bo;
        if (aypfVar != null) {
            aypfVar.c();
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog == null) {
            return;
        }
        Window window = dialog.getWindow();
        window.setLayout(-1, -2);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        window.setAttributes(attributes);
        window.setSoftInputMode(5);
        this.ap.requestFocus();
        if (this.aZ) {
            window.setFlags(32, 32);
            window.clearFlags(2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View decorView = mJ().getWindow().getDecorView();
            final int height = decorView.getHeight();
            final Window window2 = this.az.getWindow();
            decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: xvs
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    xwb xwbVar = xwb.this;
                    int i = height;
                    Window window3 = window2;
                    int systemWindowInsetTop = i - (((windowInsets.getSystemWindowInsetTop() + windowInsets.getSystemWindowInsetBottom()) + xwbVar.an.getApplicationContext().getResources().getDimensionPixelSize(R.dimen.comment_dialog_scrubber_offset)) + xwbVar.aD);
                    if (systemWindowInsetTop > xwbVar.at.getHeight()) {
                        xwbVar.as.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                        window3.setLayout(-1, systemWindowInsetTop);
                    } else {
                        xwbVar.as.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 0.0f));
                        window3.setLayout(-1, -2);
                    }
                    return windowInsets;
                }
            });
            decorView.requestApplyInsets();
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(zhn.j(this.an, R.attr.ytGeneralBackgroundA).orElse(0)));
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aqus aqusVar;
        final actj actjVar;
        super.mc(layoutInflater, viewGroup, bundle);
        View inflate = LayoutInflater.from(this.an).inflate(true != this.aZ ? R.layout.comment_dialog : R.layout.comment_dialog_with_dismiss_button, viewGroup, false);
        this.ba = inflate;
        this.am.g(inflate);
        this.ap = (EditText) this.ba.findViewById(R.id.comment);
        this.bb = (ImageView) this.ba.findViewById(R.id.send_button);
        this.aq = this.ba.findViewById(R.id.progress_bar);
        this.bc = this.ba.findViewById(R.id.actions);
        this.bd = (ImageView) this.ba.findViewById(R.id.video_reply_button);
        this.ar = (ImageView) this.ba.findViewById(R.id.toggle_emoji_picker_icon);
        this.be = (ImageView) this.ba.findViewById(R.id.timestamp_button);
        this.bf = (TextView) this.ba.findViewById(R.id.header_text);
        this.bg = (TextView) this.ba.findViewById(R.id.caption_text);
        this.bh = this.ba.findViewById(R.id.caption_divider);
        this.bi = (TextView) this.ba.findViewById(R.id.footer_text);
        this.bj = this.ba.findViewById(R.id.footer_divider);
        this.bk = (ImageView) this.ba.findViewById(R.id.profile_photo);
        this.bl = (ImageView) this.ba.findViewById(R.id.profile_photo_compact);
        this.az = this.d;
        this.bn = "";
        if (this.aX) {
            this.bk.setVisibility(8);
            this.bl.setVisibility(0);
        } else {
            this.bk.setVisibility(0);
            this.bl.setVisibility(8);
        }
        new ajnj(this.ai, new yyj(), this.aX ? this.bl : this.bk, false).k(this.aM);
        if (this.aY) {
            this.be.setEnabled(true);
            this.be.setOnClickListener(new xvv(this, 2));
            final acti oi = mJ() instanceof acth ? ((acth) mJ()).oi() : null;
            if (this.aT != null) {
                actjVar = actj.COMMENT_DIALOG_TIMESTAMP_BUTTON;
            } else {
                actjVar = actj.COMMENT_REPLY_DIALOG_TIMESTAMP_BUTTON;
            }
            if (oi != null) {
                oi.n(new acte(actjVar));
            }
            if (this.aY && this.aI.d() != null) {
                boolean booleanValue = this.aI.c().booleanValue();
                this.av = new Runnable() { // from class: xvu
                    @Override // java.lang.Runnable
                    public final void run() {
                        Long l;
                        xwb xwbVar = xwb.this;
                        acti actiVar = oi;
                        actj actjVar2 = actjVar;
                        if (xwbVar.aI.c().booleanValue() || (l = xwbVar.aF) == null) {
                            return;
                        }
                        bahu b = bahu.b(l.longValue());
                        Editable text = xwbVar.ap.getText();
                        int selectionStart = Selection.getSelectionStart(text);
                        int selectionEnd = Selection.getSelectionEnd(text);
                        boolean z = false;
                        if (selectionStart != 0) {
                            if (" \n\r-_".indexOf(text.charAt(selectionStart - 1)) == -1) {
                                z = true;
                            }
                        }
                        bahu c = bahu.c((b.b + 500) / 1000);
                        int i = b.a() > 0 ? 2 : 1;
                        balp balpVar = new balp();
                        balpVar.e();
                        balpVar.i(":");
                        balpVar.h();
                        balpVar.a = i;
                        balpVar.f();
                        balpVar.i(":");
                        balpVar.h();
                        balpVar.a = 2;
                        balpVar.g();
                        String a = balpVar.a().a(c.e());
                        String str = true != z ? "" : " ";
                        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(a).length());
                        sb.append(str);
                        sb.append(a);
                        sb.append(" ");
                        text.replace(selectionStart, selectionEnd, sb.toString());
                        if (actiVar == null) {
                            return;
                        }
                        actiVar.H(3, new acte(actjVar2), null);
                    }
                };
                if (this.bb.getVisibility() == 4) {
                    this.bb.setVisibility(8);
                }
                this.be.setVisibility(0);
                aH(booleanValue);
                zag.l(this.be, null, 1);
                aqak aqakVar = this.aT;
                if (aqakVar != null) {
                    aunb aunbVar = aqakVar.j;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    if (aunbVar.qn(HintRendererOuterClass.hintRenderer)) {
                        akfc akfcVar = this.al;
                        aunb aunbVar2 = this.aT.j;
                        if (aunbVar2 == null) {
                            aunbVar2 = aunb.a;
                        }
                        akfcVar.b((argj) aunbVar2.qm(HintRendererOuterClass.hintRenderer), this.be, this.aT, this.ak);
                    }
                }
                aqbc aqbcVar = this.aU;
                if (aqbcVar != null) {
                    aunb aunbVar3 = aqbcVar.l;
                    if (aunbVar3 == null) {
                        aunbVar3 = aunb.a;
                    }
                    if (aunbVar3.qn(HintRendererOuterClass.hintRenderer)) {
                        akfc akfcVar2 = this.al;
                        aunb aunbVar4 = this.aU.l;
                        if (aunbVar4 == null) {
                            aunbVar4 = aunb.a;
                        }
                        akfcVar2.b((argj) aunbVar4.qm(HintRendererOuterClass.hintRenderer), this.be, this.aU, this.ak);
                    }
                }
            }
        }
        TextWatcher c = this.ao.c(this.ap);
        this.bm = c;
        this.ap.addTextChangedListener(c);
        this.ap.addTextChangedListener(new xxr());
        this.ap.addTextChangedListener(new xvz(this));
        this.ap.post(new Runnable() { // from class: xvt
            @Override // java.lang.Runnable
            public final void run() {
                xwb xwbVar = xwb.this;
                if (xwbVar.ap == null) {
                    return;
                }
                SpannableString spannableString = new SpannableString(xwbVar.a());
                if (TextUtils.isEmpty(spannableString)) {
                    return;
                }
                xxs.a(spannableString, xwbVar.an.getApplicationContext().getResources().getDimension(R.dimen.comment_mention_chip_corner_radius), xwbVar.an.getApplicationContext().getResources().getDimension(R.dimen.comment_mention_chip_horizontal_padding), xwbVar.ap.getMeasuredWidth() * 0.9f, zhn.j(xwbVar.an, R.attr.ytBadgeChipBackground).orElse(0));
                ajwp[] ajwpVarArr = (ajwp[]) spannableString.getSpans(0, spannableString.length(), ajwp.class);
                if (ajwpVarArr == null || ajwpVarArr.length <= 0) {
                    return;
                }
                xwbVar.aF(spannableString, xwbVar.aA);
            }
        });
        aF(this.aP, this.aQ);
        Spanned spanned = this.aW;
        if (!TextUtils.isEmpty(spanned)) {
            this.ap.setHint(spanned);
        }
        awlh awlhVar = this.aN;
        if (awlhVar != null) {
            arag aragVar = awlhVar.b;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            Spanned b = ajgl.b(aragVar);
            this.bf.setText(b);
            zag.o(this.bf, !TextUtils.isEmpty(b));
            arag aragVar2 = this.aN.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            Spanned a = aafv.a(aragVar2, this.ae, false);
            this.bi.setText(a);
            zag.o(this.bj, !TextUtils.isEmpty(a));
            zag.o(this.bi, !TextUtils.isEmpty(a));
        } else {
            Spanned spanned2 = this.aV;
            if (spanned2 != null) {
                this.bg.setText(spanned2);
                zag.o(this.bg, !TextUtils.isEmpty(spanned2));
                zag.o(this.bh, !TextUtils.isEmpty(spanned2));
            }
        }
        this.bd.setEnabled(true);
        this.bd.setOnClickListener(new xvv(this, 3));
        apoj apojVar = this.aO;
        if (apojVar != null) {
            int i = apojVar.b;
            if ((i & 32) != 0 && (i & 16384) != 0) {
                ajxz ajxzVar = this.aj;
                arhs arhsVar = apojVar.g;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b2 = arhr.b(arhsVar.c);
                if (b2 == null) {
                    b2 = arhr.UNKNOWN;
                }
                int a2 = ajxzVar.a(b2);
                this.bc.setVisibility(0);
                this.bd.setVisibility(0);
                this.bd.setImageResource(a2);
            }
        }
        this.bb.setOnClickListener(new xvv(this));
        aypf aypfVar = new aypf();
        this.bo = aypfVar;
        if (this.aY) {
            aypfVar.g(this.aI.a().Z(new xvx(this, 2)), this.aI.b().Z(new xvx(this)));
        }
        if (this.aZ) {
            this.as = this.ba.findViewById(R.id.dismiss_button);
            this.at = this.ba.findViewById(R.id.comment_dialog_wrapper);
            View view = this.as;
            if (view != null) {
                view.setEnabled(true);
                this.as.setVisibility(0);
                this.as.setOnClickListener(new xvv(this, 1));
            }
            this.bo.g(this.aI.a.ab().Z(new xvx(this, 3)), this.aI.a.s().b.Z(new xvx(this, 1)));
        }
        apoj apojVar2 = this.aR;
        ajxz ajxzVar2 = this.aj;
        if (apojVar2 != null && (aqusVar = this.aS) != null && aqusVar.c.size() != 0 && (apojVar2.b & 32) != 0) {
            arhs arhsVar2 = apojVar2.g;
            if (arhsVar2 == null) {
                arhsVar2 = arhs.a;
            }
            arhr b3 = arhr.b(arhsVar2.c);
            if (b3 == null) {
                b3 = arhr.UNKNOWN;
            }
            if (b3 != arhr.UNKNOWN) {
                arhs arhsVar3 = apojVar2.g;
                if (arhsVar3 == null) {
                    arhsVar3 = arhs.a;
                }
                arhr b4 = arhr.b(arhsVar3.c);
                if (b4 == null) {
                    b4 = arhr.UNKNOWN;
                }
                int a3 = ajxzVar2.a(b4);
                final Drawable l = iy.l(po.b(this.an, a3));
                l.setTint(zhn.j(this.an, R.attr.ytIconInactive).orElse(0));
                final Drawable l2 = iy.l(po.b(this.an, a3));
                l2.setTint(zhn.j(this.an, R.attr.ytCallToAction).orElse(0));
                this.ar.setImageDrawable(l);
                ImageView imageView = this.ar;
                aovs aovsVar = apojVar2.s;
                if (aovsVar == null) {
                    aovsVar = aovs.a;
                }
                aovr aovrVar = aovsVar.c;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                imageView.setContentDescription(aovrVar.c);
                if (this.ag.h()) {
                    this.ar.setVisibility(0);
                } else {
                    this.ar.setVisibility(4);
                }
                this.ar.setOnClickListener(new View.OnClickListener() { // from class: xvw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        xwb xwbVar = xwb.this;
                        Drawable drawable = l;
                        Drawable drawable2 = l2;
                        akbv akbvVar = xwbVar.ao;
                        if (akbvVar.h) {
                            akbvVar.d();
                            xwbVar.ap.requestFocus();
                            zag.p(xwbVar.ap);
                            xwbVar.ar.setImageDrawable(drawable);
                            return;
                        }
                        xwbVar.aI();
                        xwbVar.ar.setImageDrawable(drawable2);
                    }
                });
            }
        }
        return this.ba;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ax;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
        this.ak.t();
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.aw;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.ak.t();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        acti actiVar;
        DialogInterface.OnShowListener onShowListener = this.ay;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
        awlh awlhVar = this.aN;
        if (awlhVar == null || this.aQ || (actiVar = this.ak) == null) {
            return;
        }
        actiVar.n(new acte(awlhVar.d));
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        oy.setOnShowListener(this);
        return oy;
    }
}
