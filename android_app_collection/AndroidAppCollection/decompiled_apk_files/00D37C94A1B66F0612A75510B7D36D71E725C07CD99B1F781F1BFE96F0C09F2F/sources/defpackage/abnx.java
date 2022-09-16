package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatProductButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint;
import com.google.protos.youtube.api.innertube.OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand;
/* compiled from: PG */
/* renamed from: abnx  reason: default package */
/* loaded from: classes.dex */
public final class abnx implements ajru {
    public final aafo a;
    public final abks b;
    private final Context c;
    private final ajxz d;
    private final ViewGroup e;
    private final ViewGroup f;
    private final ViewGroup g;
    private final View h;
    private final azqb i;
    private ajrs j;
    private final TextView k;
    private final View l;

    public abnx(Context context, azqb azqbVar, aafo aafoVar, ajxz ajxzVar, zhf zhfVar, abks abksVar) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.live_chat_product_picker_menu, (ViewGroup) null);
        this.e = viewGroup;
        this.f = (ViewGroup) viewGroup.findViewById(R.id.product_picker);
        this.g = (ViewGroup) viewGroup.findViewById(R.id.product_picker_menu);
        this.h = viewGroup.findViewById(R.id.loading_spinner);
        View findViewById = viewGroup.findViewById(R.id.product_picker_header);
        this.l = findViewById;
        this.k = (TextView) findViewById.findViewById(R.id.product_picker_header_text);
        this.c = new ContextThemeWrapper(context, zhfVar.a);
        this.i = azqbVar;
        this.a = aafoVar;
        this.d = ajxzVar;
        this.b = abksVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    public final acti d() {
        return ((abiq) this.i.get()).p;
    }

    public final void e() {
        Object c = this.j.c("listenerKey");
        if (c instanceof abri) {
            ((abri) c).p();
        }
    }

    public final void f() {
        Object c = this.j.c("listenerKey");
        if (c instanceof abri) {
            ((abri) c).aE();
        }
    }

    public final void g(boolean z) {
        if (z) {
            this.h.setVisibility(0);
            this.f.setVisibility(8);
            return;
        }
        this.h.setVisibility(8);
        this.f.setVisibility(0);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        assi assiVar = (assi) obj;
        d().u(new acte(assiVar.d), null);
        this.j = ajrsVar;
        arag aragVar2 = assiVar.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        Spanned b = ajgl.b(aragVar2);
        if (!TextUtils.isEmpty(b)) {
            this.l.setVisibility(0);
            this.k.setText(b);
            this.k.setContentDescription(b);
        }
        for (aunb aunbVar : assiVar.c) {
            if (aunbVar.qn(LiveChatProductButtonRendererOuterClass.liveChatProductButtonRenderer)) {
                ViewGroup viewGroup = this.g;
                final assh asshVar = (assh) aunbVar.qm(LiveChatProductButtonRendererOuterClass.liveChatProductButtonRenderer);
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.c).inflate(R.layout.bottom_panel_product, (ViewGroup) null);
                ImageView imageView = (ImageView) linearLayout.findViewById(R.id.product_card_image);
                ViewStub viewStub = (ViewStub) linearLayout.findViewById(R.id.new_content_count);
                TextView textView = (TextView) linearLayout.findViewById(R.id.product_card_text);
                TextView textView2 = (TextView) linearLayout.findViewById(R.id.product_card_subtext);
                if ((asshVar.b & 1) != 0) {
                    aragVar = asshVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                textView.setText(ajgl.b(aragVar));
                arag aragVar3 = asshVar.d;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                zag.m(textView2, ajgl.b(aragVar3));
                if ((asshVar.b & 4) == 0) {
                    zep.b("Product picker button icon not available");
                } else {
                    ajxz ajxzVar = this.d;
                    arhs arhsVar = asshVar.e;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhr b2 = arhr.b(arhsVar.c);
                    if (b2 == null) {
                        b2 = arhr.UNKNOWN;
                    }
                    int a = ajxzVar.a(b2);
                    if (a != 0) {
                        imageView.setImageResource(a);
                    }
                }
                if (asshVar.f) {
                    imageView.setColorFilter(zhn.d(this.c, R.attr.ytIconDisabled));
                    textView.setTextColor(zhn.d(this.c, R.attr.ytTextDisabled));
                    textView2.setTextColor(zhn.d(this.c, R.attr.ytTextDisabled));
                    imageView.setContentDescription(this.e.getResources().getString(R.string.pdg_product_disabled));
                } else if ((asshVar.b & 4) != 0) {
                    imageView.setColorFilter(zhn.d(this.c, R.attr.ytIconInactive));
                    textView2.setTextColor(zhn.d(this.c, R.attr.ytTextSecondary));
                }
                if (viewStub != null && !asshVar.h.isEmpty() && !asshVar.f) {
                    float applyDimension = TypedValue.applyDimension(1, 2.0f, this.c.getResources().getDisplayMetrics());
                    TextView textView3 = (TextView) viewStub.inflate();
                    zag.m(textView3, asshVar.h);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(zhn.d(this.c, R.attr.ytThemedBlue));
                    gradientDrawable.setStroke((int) applyDimension, zhn.d(this.c, R.attr.ytBrandBackgroundSolid));
                    textView3.setBackground(gradientDrawable);
                }
                final acte acteVar = new acte(asshVar.i);
                d().u(acteVar, null);
                linearLayout.setOnClickListener(asshVar.f ? null : new View.OnClickListener() { // from class: abnw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abnx abnxVar = abnx.this;
                        acte acteVar2 = acteVar;
                        assh asshVar2 = asshVar;
                        abnxVar.d().H(3, acteVar2, null);
                        if ((asshVar2.b & 16) != 0) {
                            apzg apzgVar = asshVar2.g;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            if (apzgVar.qn(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand) || apzgVar.qn(OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.openSuperStickerBuyFlowCommand) || apzgVar.qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
                                if (abnxVar.b.c) {
                                    abnxVar.f();
                                }
                                abnxVar.e();
                            }
                            if (apzgVar.qn(LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.liveChatPurchaseMessageEndpoint) && abnxVar.b.c) {
                                abnxVar.f();
                            }
                            aafo aafoVar = abnxVar.a;
                            apzg apzgVar2 = asshVar2.g;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            aafoVar.c(apzgVar2, amup.l("live_chat_product_picker_endpoint_key", abnxVar, "engagement_panel_id_key", "live-chat-item-section"));
                        }
                    }
                });
                viewGroup.addView(linearLayout);
            }
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.g.removeAllViews();
        this.l.setVisibility(8);
        this.j = null;
    }
}
