package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: abma  reason: default package */
/* loaded from: classes.dex */
public final class abma implements ajru {
    protected final Context a;
    protected final View b;
    public final aafo c;
    final abjh d;
    private final ajyi e;

    public abma(Context context, aafo aafoVar, azqb azqbVar, ajyi ajyiVar) {
        this.a = context;
        this.b = View.inflate(context, R.layout.live_chat_light_auto_mod_item, null);
        this.e = ajyiVar;
        this.c = aafoVar;
        this.d = new iux(azqbVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    protected final ViewGroup d() {
        return (ViewGroup) this.b.findViewById(R.id.auto_moderated_item);
    }

    protected final ViewGroup e() {
        return (ViewGroup) this.b.findViewById(R.id.auto_mod_buttons);
    }

    protected final TextView f() {
        return (TextView) this.b.findViewById(R.id.header_text);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        aunb aunbVar;
        aunb aunbVar2;
        final asqw asqwVar = (asqw) obj;
        TextView f = f();
        if ((asqwVar.b & 16) != 0) {
            aragVar = asqwVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        f.setText(ajgl.b(aragVar));
        aunb aunbVar3 = asqwVar.f;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ablz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abma abmaVar = abma.this;
                    aunb aunbVar4 = asqwVar.f;
                    if (aunbVar4 == null) {
                        aunbVar4 = aunb.a;
                    }
                    apzg apzgVar = ((apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer)).o;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    abmaVar.c.c(apzgVar, null);
                }
            };
            f().setOnClickListener(onClickListener);
            View findViewById = this.b.findViewById(R.id.warning_icon);
            if (findViewById != null) {
                findViewById.setOnClickListener(onClickListener);
            }
        }
        int i = asqwVar.b & 8;
        if (i != 0) {
            ajsa ajsaVar = ((ivc) this.e).b;
            if (i != 0) {
                aunbVar = asqwVar.d;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
            } else {
                aunbVar = null;
            }
            int c = ajsaVar.c(ajjh.k(aunbVar));
            ajrsVar.f("is-auto-mod-message", true);
            ajru e = ((ivc) this.e).b.e(c, d());
            if ((asqwVar.b & 8) != 0) {
                aunbVar2 = asqwVar.d;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
            } else {
                aunbVar2 = null;
            }
            e.oK(ajrsVar, ajjh.k(aunbVar2));
            d().addView(e.a());
        }
        ViewGroup e2 = e();
        e2.removeAllViews();
        for (aunb aunbVar4 : asqwVar.g) {
            final apoj apojVar = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
            if (apojVar.c == 1) {
                ((Integer) apojVar.d).intValue();
            }
            Button button = (Button) LayoutInflater.from(this.a).inflate(R.layout.live_chat_auto_mod_button_grey_light, (ViewGroup) null, false);
            if (apojVar.h) {
                button.setEnabled(false);
            } else {
                button.setEnabled(true);
                if ((apojVar.b & 8192) != 0) {
                    button.setOnClickListener(new View.OnClickListener() { // from class: ably
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            abma abmaVar = abma.this;
                            apzg apzgVar = apojVar.n;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", abmaVar.d);
                            abmaVar.c.c(apzgVar, hashMap);
                        }
                    });
                }
            }
            arag aragVar2 = apojVar.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            button.setText(ajgl.b(aragVar2));
            e2.addView(button);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        d().removeAllViews();
        e().removeAllViews();
    }
}
