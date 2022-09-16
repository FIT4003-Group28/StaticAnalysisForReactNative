package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;
/* compiled from: PG */
/* renamed from: ablw  reason: default package */
/* loaded from: classes.dex */
public final class ablw extends ablg implements DialogInterface.OnShowListener, abkr, yze {
    public acti ae;
    public ajyi af;
    public ajyi ag;
    public abks ah;
    public abjy ai;
    Object aj;
    public Integer ak;
    public Integer al;
    private View am;
    private ajru an;
    private ajyi ao;
    private apzg ap;
    private yzf aq;
    private boolean ar;

    @Override // defpackage.abkr
    public final void d() {
        Window window;
        Dialog dialog = this.d;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Context context = window.getContext();
        int j = zew.j(context) - ((int) (zew.l(context) / context.getResources().getFraction(R.fraction.live_chat_aspect_ratio_16_9, 1, 1)));
        if (this.ah.c || context.getResources().getConfiguration().orientation == 2 || this.ak != null) {
            j = -1;
        }
        window.setLayout(-1, j);
        window.setGravity(this.ah.b);
    }

    @Override // defpackage.yze
    public final void lE(boolean z, int i) {
        Dialog dialog;
        if (z != this.ar && (dialog = this.d) != null) {
            dialog.dismiss();
        }
        this.ar = z;
    }

    @Override // defpackage.yze
    public final void lF(boolean z, int i) {
        this.ar = z;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        Object a;
        super.mQ(bundle);
        mN(2, R.style.show_live_chat_item_dialog);
        Bundle bundle2 = this.m;
        ajyi ajyiVar = this.ah.c ? this.ag : this.af;
        this.ao = ajyiVar;
        ajyiVar.a(assn.class);
        if (bundle2 != null) {
            byte[] byteArray = bundle2.getByteArray("applied_action");
            if (byteArray != null) {
                try {
                    this.ap = (apzg) aopi.parseFrom(apzg.a, byteArray, aoos.b());
                } catch (aopx unused) {
                }
            }
            byte[] byteArray2 = bundle2.getByteArray("endpoint");
            if (byteArray2 != null) {
                try {
                    ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint = (ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint) aopi.parseFrom(ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.a, byteArray2, aoos.b());
                    if (showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint != null && (showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.b & 1) != 0) {
                        asqy asqyVar = showLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.c;
                        if (asqyVar == null) {
                            asqyVar = asqy.a;
                        }
                        int i = asqyVar.b;
                        if (i == 117300536) {
                            a = (asrf) asqyVar.c;
                        } else if (i == 129492606) {
                            a = (asrb) asqyVar.c;
                        } else if (i == 130661514) {
                            a = (asqz) asqyVar.c;
                        } else if (i == 132496275) {
                            a = (asrw) asqyVar.c;
                        } else if (i == 133279312) {
                            a = (asrc) asqyVar.c;
                        } else if (i == 146948953) {
                            a = (asre) asqyVar.c;
                        } else if (i == 146966970) {
                            a = (asqw) asqyVar.c;
                        } else if (i == 165252689) {
                            a = (asrg) asqyVar.c;
                        } else if (i == 232396290) {
                            a = (asra) asqyVar.c;
                        } else if (i == 197064214) {
                            a = (asrx) asqyVar.c;
                        } else {
                            a = i == 153515154 ? ajhh.a((aqtb) asqyVar.c) : null;
                        }
                        this.aj = a;
                        if (a != null) {
                            return;
                        }
                    }
                } catch (aopx unused2) {
                }
            }
        }
        dismiss();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        d();
        this.ah.a(this);
        if (this.ah.c) {
            Window window = this.d.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
        if (mJ() == null || mJ().getWindowManager() == null || !zew.y(rb()) || this.ah.c) {
            return;
        }
        yzf yzfVar = new yzf(mJ(), mJ().getWindowManager());
        this.aq = yzfVar;
        yzfVar.a(this);
        this.aq.enable();
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, ajsa] */
    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new ablv(this));
        ajru h = akel.h(this.ao.get(), this.aj, frameLayout);
        this.an = h;
        if (h != null) {
            Resources resources = context.getResources();
            View a = this.an.a();
            this.am = a;
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_show_ticker_item_dialog_margin);
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_header_height);
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.live_chat_ticker_item_radius);
            int i = dimensionPixelOffset3 + dimensionPixelOffset3;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            if (this.ah.c && (this.aj instanceof asrx) && !this.ai.a()) {
                layoutParams.width = (int) rh().getDimension(R.dimen.live_chat_overlay_sponsor_item_max_width);
            }
            Integer num = this.ak;
            if (num != null) {
                layoutParams.topMargin = num.intValue();
            } else if (!this.ah.c) {
                layoutParams.topMargin = dimensionPixelOffset2 + dimensionPixelOffset + i;
            }
            Integer num2 = this.al;
            if (num2 != null) {
                layoutParams.setMarginStart(num2.intValue());
            } else {
                layoutParams.setMarginStart(dimensionPixelOffset);
            }
            layoutParams.bottomMargin = dimensionPixelOffset;
            layoutParams.setMarginEnd(dimensionPixelOffset);
            frameLayout.addView(a, layoutParams);
            ajrs ajrsVar = new ajrs();
            ajrsVar.f("live_chat_item_action", this.ap);
            ajrsVar.a(this.ae);
            this.an.oK(ajrsVar, this.aj);
        }
        return frameLayout;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void my() {
        super.my();
        this.ah.b(this);
        yzf yzfVar = this.aq;
        if (yzfVar != null) {
            yzfVar.disable();
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((zew.y(rb()) || configuration.orientation != 2) && !this.ah.c) {
            return;
        }
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ajsa] */
    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ajru ajruVar = this.an;
        if (ajruVar != 0) {
            ajruVar.qZ(this.ao.get());
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int intValue;
        int intValue2;
        View view = this.am;
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.am.getLayoutParams();
            Integer num = this.ak;
            if (num != null && (intValue2 = num.intValue() - i2) != 0) {
                marginLayoutParams.topMargin += intValue2;
                this.O.requestLayout();
            }
            Integer num2 = this.al;
            if (num2 == null || (intValue = num2.intValue() - i) == 0) {
                return;
            }
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + intValue);
            this.O.requestLayout();
        }
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        oy.setOnShowListener(this);
        return oy;
    }
}
