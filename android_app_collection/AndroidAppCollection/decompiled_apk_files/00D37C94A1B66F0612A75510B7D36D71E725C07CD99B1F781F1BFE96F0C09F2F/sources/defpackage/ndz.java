package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ndz  reason: default package */
/* loaded from: classes3.dex */
public final class ndz extends ajsl {
    public final View a;
    private final ajmy b;
    private final ajxz c;
    private final ajrp d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final ImageView i;
    private final TextView j;
    private final ViewStub k;
    private fta l;

    public ndz(Context context, ajmy ajmyVar, ajxz ajxzVar, aafo aafoVar, ftb ftbVar, int i, ViewGroup viewGroup) {
        this.b = ajmyVar;
        this.c = ajxzVar;
        int i2 = i - 1;
        int i3 = R.layout.rich_metadata_box_art;
        if (i2 == 1) {
            i3 = R.layout.rich_metadata_topic;
        } else if (i2 != 2 && i2 == 3) {
            i3 = R.layout.rich_metadata_thumbnail;
        }
        View inflate = LayoutInflater.from(context).inflate(i3, viewGroup, false);
        this.a = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.subtitle);
        this.h = (TextView) inflate.findViewById(R.id.call_to_action);
        this.i = (ImageView) inflate.findViewById(R.id.call_to_action_icon);
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.j = (TextView) inflate.findViewById(R.id.thumbnail_bottom_label);
        this.d = new ajrp(aafoVar, inflate);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.metadata_badge);
        this.k = viewStub;
        if (viewStub != null) {
            this.l = ftbVar.b(context, viewStub);
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        atft atftVar = (atft) obj;
        apzg apzgVar = null;
        if ((atftVar.b & 2) != 0) {
            avhn avhnVar = atftVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            for (avhc avhcVar : atftVar.e) {
                if (this.j != null && (avhcVar.b & 2) != 0) {
                    avgs avgsVar = avhcVar.d;
                    if (avgsVar == null) {
                        avgsVar = avgs.a;
                    }
                    TextView textView = this.j;
                    if ((avgsVar.b & 1) != 0) {
                        aragVar4 = avgsVar.c;
                        if (aragVar4 == null) {
                            aragVar4 = arag.a;
                        }
                    } else {
                        aragVar4 = null;
                    }
                    zag.m(textView, ajgl.b(aragVar4));
                }
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                this.b.h(imageView, avhnVar);
                aovs aovsVar = avhnVar.d;
                if (aovsVar == null) {
                    aovsVar = aovs.a;
                }
                aovr aovrVar = aovsVar.c;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                if ((aovrVar.b & 2) == 0) {
                    this.e.setContentDescription(null);
                } else {
                    ImageView imageView2 = this.e;
                    aovs aovsVar2 = avhnVar.d;
                    if (aovsVar2 == null) {
                        aovsVar2 = aovs.a;
                    }
                    aovr aovrVar2 = aovsVar2.c;
                    if (aovrVar2 == null) {
                        aovrVar2 = aovr.a;
                    }
                    imageView2.setContentDescription(aovrVar2.c);
                }
            }
        }
        TextView textView2 = this.f;
        if (textView2 != null) {
            if ((atftVar.b & 4) != 0) {
                aragVar3 = atftVar.g;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            zag.m(textView2, ajgl.b(aragVar3));
        }
        TextView textView3 = this.g;
        if (textView3 != null) {
            if ((atftVar.b & 8) != 0) {
                aragVar2 = atftVar.h;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            zag.m(textView3, ajgl.b(aragVar2));
        }
        TextView textView4 = this.h;
        if (textView4 != null) {
            if ((atftVar.b & 16) != 0) {
                aragVar = atftVar.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(textView4, ajgl.b(aragVar));
        }
        ImageView imageView3 = this.i;
        if (imageView3 != null) {
            if ((atftVar.b & 32) == 0) {
                imageView3.setVisibility(8);
            } else {
                ajxz ajxzVar = this.c;
                arhs arhsVar = atftVar.j;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                imageView3.setImageResource(ajxzVar.a(b));
                this.i.setVisibility(0);
            }
        }
        int i = atftVar.b & 128;
        if (i != 0) {
            ajrp ajrpVar = this.d;
            acti actiVar = ajrsVar.a;
            if (i != 0 && (apzgVar = atftVar.k) == null) {
                apzgVar = apzg.a;
            }
            ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        }
        ViewStub viewStub = this.k;
        if (viewStub != null) {
            viewStub.setVisibility(8);
            for (aplw aplwVar : atftVar.f) {
                if ((aplwVar.b & 131072) != 0) {
                    fta ftaVar = this.l;
                    atfh atfhVar = aplwVar.f;
                    if (atfhVar == null) {
                        atfhVar = atfh.a;
                    }
                    ftaVar.f(atfhVar);
                    this.k.setVisibility(0);
                    return;
                }
            }
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atft) obj).l.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.c();
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageResource(0);
            this.i.setVisibility(8);
        }
    }
}
