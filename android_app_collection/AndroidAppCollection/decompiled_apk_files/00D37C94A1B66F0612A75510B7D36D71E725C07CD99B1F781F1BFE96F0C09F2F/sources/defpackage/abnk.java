package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abnk  reason: default package */
/* loaded from: classes.dex */
public final class abnk implements ajru {
    public ajrs a;
    public final aafo b;
    private final ViewGroup c;
    private final Context d;
    private final abkw e;

    public abnk(Context context, aafo aafoVar, abkw abkwVar) {
        this.d = context;
        this.b = aafoVar;
        this.e = abkwVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.live_chat_purchase_menu, (ViewGroup) null);
        this.c = viewGroup;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_creator_support_menu_padding);
        lj.Y(viewGroup, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }

    private final Button d(apoj apojVar) {
        int i;
        int a;
        final apzg apzgVar;
        if (apojVar.c != 1 || (i = akzj.l(((Integer) apojVar.d).intValue())) == 0) {
            i = 1;
        }
        int i2 = i - 1;
        if (i2 != 4) {
            a = i2 != 6 ? R.layout.live_chat_action_button_primary : R.layout.live_chat_action_button_payment;
        } else {
            a = this.e.a(9);
        }
        arag aragVar = null;
        Button button = (Button) LayoutInflater.from(this.d).inflate(a, (ViewGroup) null, false);
        zag.k(button, button.getBackground());
        if (apojVar.h) {
            button.setEnabled(false);
        } else {
            button.setEnabled(true);
            if ((apojVar.b & 16384) != 0) {
                apzgVar = apojVar.o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = null;
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: abnj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abnk abnkVar = abnk.this;
                    apzg apzgVar2 = apzgVar;
                    if (apzgVar2 != null) {
                        abnkVar.b.c(apzgVar2, null);
                        return;
                    }
                    Object c = abnkVar.a.c("listenerKey");
                    if (!(c instanceof abri)) {
                        return;
                    }
                    ((abri) c).s();
                }
            });
        }
        if ((apojVar.b & 256) != 0 && (aragVar = apojVar.i) == null) {
            aragVar = arag.a;
        }
        button.setText(ajgl.b(aragVar));
        return button;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        asqh asqhVar;
        asqh asqhVar2;
        asqj asqjVar = (asqj) obj;
        this.a = ajrsVar;
        Resources resources = this.d.getResources();
        for (asqi asqiVar : asqjVar.c) {
            int i = asqiVar.b;
            if (i == 65153809) {
                this.c.addView(d((apoj) asqiVar.c), -1, resources.getDimensionPixelOffset(R.dimen.live_chat_button_height));
            } else if (i == 138897108) {
                ViewGroup viewGroup = this.c;
                apok apokVar = ((asqh) asqiVar.c).c;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                apoj apojVar = apokVar.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                viewGroup.addView(d(apojVar), -1, resources.getDimensionPixelOffset(R.dimen.live_chat_button_height));
                if (asqiVar.b == 138897108) {
                    asqhVar = (asqh) asqiVar.c;
                } else {
                    asqhVar = asqh.a;
                }
                if ((asqhVar.b & 2) != 0) {
                    if (asqiVar.b == 138897108) {
                        asqhVar2 = (asqh) asqiVar.c;
                    } else {
                        asqhVar2 = asqh.a;
                    }
                    arag aragVar = asqhVar2.d;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    Spanned b = ajgl.b(aragVar);
                    TextView textView = (TextView) LayoutInflater.from(this.d).inflate(this.e.a(8), (ViewGroup) null, false);
                    textView.setText(b);
                    this.c.addView(textView);
                }
            }
        }
        apok apokVar2 = asqjVar.d;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        if ((apokVar2.b & 1) != 0) {
            apok apokVar3 = asqjVar.d;
            if (apokVar3 == null) {
                apokVar3 = apok.a;
            }
            apoj apojVar2 = apokVar3.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            this.c.addView(d(apojVar2), -1, this.d.getResources().getDimensionPixelOffset(R.dimen.live_chat_button_height));
        }
        this.c.setVisibility(0);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.removeAllViews();
    }
}
