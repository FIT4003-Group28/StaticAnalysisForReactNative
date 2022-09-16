package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
/* compiled from: PG */
/* renamed from: hhz  reason: default package */
/* loaded from: classes3.dex */
public final class hhz extends ajsl {
    public View a;
    public final dt b;
    public final hip c;
    public final aafo d;
    private final Context e;
    private final ajxz f;
    private final acth g;

    public hhz(Context context, dt dtVar, aafo aafoVar, ajxz ajxzVar, acth acthVar, hip hipVar) {
        this.e = context;
        this.b = dtVar;
        this.d = aafoVar;
        this.f = ajxzVar;
        this.g = acthVar;
        this.c = hipVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        aqye aqyeVar;
        Drawable drawable;
        final BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
        arlo arloVar = browseResponseModel.a.d;
        if (arloVar == null) {
            arloVar = arlo.a;
        }
        if (arloVar.b == 50236216) {
            aqyeVar = (aqye) arloVar.c;
        } else {
            aqyeVar = aqye.a;
        }
        View inflate = LayoutInflater.from(this.e).inflate(R.layout.feed_tabbed_header, (ViewGroup) null);
        this.a = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.feed_tabbed_header_title_text);
        arag aragVar = aqyeVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        ImageView imageView = (ImageView) this.a.findViewById(R.id.feed_tabbed_back);
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            drawable.setAutoMirrored(true);
        }
        if (browseResponseModel.a.m.size() != 0) {
            for (aunb aunbVar : browseResponseModel.a.m) {
                if (aunbVar.qn(IconBadgeRendererOuterClass.iconBadgeRenderer)) {
                    final arhm arhmVar = (arhm) aunbVar.qm(IconBadgeRendererOuterClass.iconBadgeRenderer);
                    arhs arhsVar = arhmVar.d;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhr b = arhr.b(arhsVar.c);
                    if (b == null) {
                        b = arhr.UNKNOWN;
                    }
                    if (b == arhr.SHOPPING_CART) {
                        arhs arhsVar2 = arhmVar.d;
                        if (arhsVar2 == null) {
                            arhsVar2 = arhs.a;
                        }
                        arhr b2 = arhr.b(arhsVar2.c);
                        if (b2 == null) {
                            b2 = arhr.UNKNOWN;
                        }
                        if (b2 == arhr.SHOPPING_CART) {
                            if ((arhmVar.b & 512) != 0) {
                                this.g.oi().n(new acte(arhmVar.k));
                            }
                            ImageView imageView2 = (ImageView) this.a.findViewById(R.id.cart_button);
                            imageView2.setVisibility(0);
                            ajxz ajxzVar = this.f;
                            arhs arhsVar3 = arhmVar.d;
                            if (arhsVar3 == null) {
                                arhsVar3 = arhs.a;
                            }
                            arhr b3 = arhr.b(arhsVar3.c);
                            if (b3 == null) {
                                b3 = arhr.UNKNOWN;
                            }
                            imageView2.setImageResource(ajxzVar.a(b3));
                            aovr aovrVar = arhmVar.i;
                            if (aovrVar == null) {
                                aovrVar = aovr.a;
                            }
                            imageView2.setContentDescription(aovrVar.c);
                            imageView2.setOnClickListener(new View.OnClickListener() { // from class: hhy
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    hhz hhzVar = hhz.this;
                                    arhm arhmVar2 = arhmVar;
                                    aafo aafoVar = hhzVar.d;
                                    apzg apzgVar = arhmVar2.h;
                                    if (apzgVar == null) {
                                        apzgVar = apzg.a;
                                    }
                                    aafoVar.a(apzgVar);
                                }
                            });
                        }
                    }
                }
            }
        }
        if ((browseResponseModel.a.b & 131072) == 0) {
            f().setVisibility(8);
            return;
        }
        View f = f();
        f.setVisibility(0);
        f.setOnClickListener(new View.OnClickListener() { // from class: hhx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                atep atepVar;
                hhz hhzVar = hhz.this;
                BrowseResponseModel browseResponseModel2 = browseResponseModel;
                hip hipVar = hhzVar.c;
                dt dtVar = hhzVar.b;
                arlx arlxVar = browseResponseModel2.a.k;
                if (arlxVar == null) {
                    arlxVar = arlx.a;
                }
                if (arlxVar.b == 66439850) {
                    atepVar = (atep) arlxVar.c;
                } else {
                    atepVar = atep.a;
                }
                hipVar.a(dtVar, atepVar);
            }
        });
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((BrowseResponseModel) obj).d();
    }

    public final View f() {
        return this.a.findViewById(R.id.feed_tabbed_more);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
