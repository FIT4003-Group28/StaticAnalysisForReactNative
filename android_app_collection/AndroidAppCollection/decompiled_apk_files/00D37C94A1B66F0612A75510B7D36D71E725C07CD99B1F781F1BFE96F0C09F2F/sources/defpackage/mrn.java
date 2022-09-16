package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mrn  reason: default package */
/* loaded from: classes3.dex */
public final class mrn extends ajsl {
    public final aafo a;
    public avhy b;
    public Map c;
    private final ajxz d;
    private final gem e;
    private final GridLayout f;
    private final ImageView g;
    private final TextView h;
    private final TextView i;
    private final TextView j;

    public mrn(Context context, ajxz ajxzVar, aafo aafoVar, gem gemVar) {
        this.d = ajxzVar;
        this.a = aafoVar;
        this.e = gemVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.tile_button, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.card_view);
        this.f = (GridLayout) inflate.findViewById(R.id.content);
        this.g = (ImageView) inflate.findViewById(R.id.icon);
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (TextView) inflate.findViewById(R.id.info);
        this.j = (TextView) inflate.findViewById(R.id.description);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: mrm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mrn mrnVar = mrn.this;
                avhy avhyVar = mrnVar.b;
                apzg apzgVar = null;
                if (avhyVar != null) {
                    int i = avhyVar.c;
                    if (i == 6) {
                        apzgVar = (apzg) avhyVar.d;
                    } else if (i == 5) {
                        apzgVar = (apzg) avhyVar.d;
                    }
                }
                if (apzgVar != null) {
                    mrnVar.a.c(apzgVar, mrnVar.c);
                }
            }
        });
        gemVar.c(inflate);
    }

    private static GridLayout.LayoutParams f(int i, int i2, int i3) {
        return new GridLayout.LayoutParams(GridLayout.spec(i, i3, GridLayout.CENTER), GridLayout.spec(i2, 1));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        amup b;
        arag aragVar;
        arag aragVar2;
        avhy avhyVar = (avhy) obj;
        this.b = avhyVar;
        arag aragVar3 = null;
        if (ajrsVar == null) {
            b = null;
        } else {
            amum h = amup.h();
            h.f("sectionListController", ajrsVar.c("sectionListController"));
            h.h(ajrsVar.e());
            b = h.b();
        }
        this.c = b;
        GridLayout gridLayout = this.f;
        int at = awwc.at(avhyVar.i);
        if (at == 0) {
            at = 1;
        }
        int i = at + (-1) != 2 ? 8388611 : 1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gridLayout.getLayoutParams();
        layoutParams.gravity = i;
        gridLayout.setLayoutParams(layoutParams);
        int i2 = avhyVar.b;
        int i3 = i2 & 4;
        boolean z = false;
        boolean z2 = i3 == 0 || (i2 & 1) == 0;
        if (i3 == 0) {
            this.h.setLayoutParams(f(0, 1, 2));
        } else if ((i2 & 1) == 0) {
            this.j.setLayoutParams(f(0, 1, 2));
        } else {
            this.h.setLayoutParams(f(0, 1, 1));
            this.j.setLayoutParams(f(1, 1, 1));
        }
        if (z2) {
            this.i.setLayoutParams(f(0, 2, 2));
        } else {
            this.i.setLayoutParams(f(0, 2, 1));
        }
        ImageView imageView = this.g;
        if ((avhyVar.b & 8) != 0) {
            z = true;
        }
        zag.o(imageView, z);
        if ((avhyVar.b & 8) != 0) {
            ImageView imageView2 = this.g;
            ajxz ajxzVar = this.d;
            arhs arhsVar = avhyVar.h;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b2 = arhr.b(arhsVar.c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            imageView2.setImageResource(ajxzVar.a(b2));
        }
        TextView textView = this.h;
        if ((avhyVar.b & 1) != 0) {
            aragVar = avhyVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.i;
        if ((avhyVar.b & 2) != 0) {
            aragVar2 = avhyVar.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = this.j;
        if ((avhyVar.b & 4) != 0 && (aragVar3 = avhyVar.g) == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar3));
        this.e.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avhy) obj).j.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
