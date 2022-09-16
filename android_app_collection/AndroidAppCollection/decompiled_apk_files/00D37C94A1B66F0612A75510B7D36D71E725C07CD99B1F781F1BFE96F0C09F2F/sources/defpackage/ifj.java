package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PlayerOverlayVideoInteractionsOuterClass;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ifj  reason: default package */
/* loaded from: classes3.dex */
public final class ifj {
    final int a;
    public final int b;
    public final Context c;
    public final aafo d;
    public final aadd e;
    public ifd f;
    public aubp g;
    public ViewTreeObserver.OnGlobalLayoutListener h;
    public Dialog i;
    int j;
    int k;
    private final acth l;
    private final ajxz m;

    public ifj(Context context, aafo aafoVar, acth acthVar, aadd aaddVar, ajxz ajxzVar) {
        this.c = context;
        this.d = aafoVar;
        this.l = acthVar;
        this.e = aaddVar;
        this.m = ajxzVar;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.video_interaction_dialog_y_offset);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.video_interaction_dialog_top_limit);
    }

    public static amuk c(aubo auboVar) {
        ArrayList arrayList = new ArrayList();
        for (aunb aunbVar : auboVar.d) {
            aubq d = d(aunbVar);
            if (d != null) {
                arrayList.add(d);
            }
        }
        if (arrayList.isEmpty()) {
            aunb aunbVar2 = auboVar.c;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aubq d2 = d(aunbVar2);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        return amuk.o(arrayList);
    }

    public static aubq d(aunb aunbVar) {
        aubq aubqVar = (aubq) ajjh.l(aunbVar, PlayerOverlayVideoInteractionsOuterClass.videoInteractionPopUpRenderer);
        if (aubqVar == null || (aubqVar.b & 8) == 0) {
            return null;
        }
        return aubqVar;
    }

    public static boolean h(aubq aubqVar, aubq aubqVar2) {
        if (aubqVar == null || (aubqVar.b & 1) == 0) {
            return false;
        }
        if (aubqVar2 == null || (aubqVar2.b & 1) == 0) {
            return true;
        }
        arag aragVar = aubqVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        int length = ajgl.b(aragVar).length();
        arag aragVar2 = aubqVar2.c;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        return length > ajgl.b(aragVar2).length();
    }

    private final void i(ImageView imageView, arhr arhrVar) {
        Drawable drawable = this.c.getResources().getDrawable(this.m.a(arhrVar));
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            imageView.setScaleX(imageView.getParent().getLayoutDirection() == 1 ? -1.0f : 1.0f);
        }
    }

    public final Point a(View view) {
        if (view == null || !zdg.e(this.c)) {
            ifd ifdVar = this.f;
            return new Point(ifdVar.a, ifdVar.b);
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return new Point(rect.centerX(), rect.centerY());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View b(View view, amuk amukVar) {
        View inflate = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.video_interaction_dialog_list, (ViewGroup) this.f, false);
        View findViewById = inflate.findViewById(R.id.top_arrow);
        View findViewById2 = inflate.findViewById(R.id.bottom_arrow);
        if (a(view).y < this.b) {
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
        } else {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
        }
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.video_interaction_dialog_list);
        int i = 0;
        while (i < amukVar.size()) {
            final aubq aubqVar = (aubq) amukVar.get(i);
            int size = amukVar.size();
            View inflate2 = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.video_interaction_dialog_item, (ViewGroup) linearLayout, false);
            inflate2.setOnClickListener(new View.OnClickListener() { // from class: ifh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ifj ifjVar = ifj.this;
                    aubq aubqVar2 = aubqVar;
                    ifjVar.f(aubqVar2.g);
                    ifjVar.i.dismiss();
                    ifjVar.i = null;
                    aafo aafoVar = ifjVar.d;
                    apzg apzgVar = aubqVar2.f;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.a(apzgVar);
                }
            });
            Drawable background = inflate2.getBackground();
            if (size > 1) {
                background = this.c.getDrawable(i == 0 ? R.drawable.video_interaction_dialog_item_top_bg : R.drawable.video_interaction_dialog_item_bottom_bg);
            }
            zag.k(inflate2, background);
            if (aubqVar != null && (aubqVar.b & 2) != 0) {
                ImageView imageView = (ImageView) inflate2.findViewById(R.id.video_interaction_start_icon);
                arhs arhsVar = aubqVar.d;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                i(imageView, b);
                inflate2.findViewById(R.id.dialog_end_padding).setVisibility(0);
            }
            if (aubqVar != null && (aubqVar.b & 4) != 0) {
                ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.video_interaction_end_icon);
                arhs arhsVar2 = aubqVar.e;
                if (arhsVar2 == null) {
                    arhsVar2 = arhs.a;
                }
                arhr b2 = arhr.b(arhsVar2.c);
                if (b2 == null) {
                    b2 = arhr.UNKNOWN;
                }
                i(imageView2, b2);
                inflate2.findViewById(R.id.dialog_end_padding).setVisibility(8);
            }
            if (aubqVar != null) {
                int i2 = aubqVar.b;
                if ((i2 & 4) == 0 && (i2 & 2) == 0) {
                    View findViewById3 = inflate2.findViewById(R.id.video_interaction_end_icon);
                    findViewById3.setScaleX(lj.e(inflate2) == 1 ? -1.0f : 1.0f);
                    findViewById3.setVisibility(0);
                }
            }
            if (aubqVar != null && (aubqVar.b & 1) != 0) {
                TextView textView = (TextView) inflate2.findViewById(R.id.dialog_text);
                arag aragVar = aubqVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                textView.setText(ajgl.b(aragVar));
            }
            linearLayout.addView(inflate2);
            i++;
        }
        return inflate;
    }

    public final void e(aoob aoobVar) {
        if (aoobVar == null) {
            return;
        }
        this.l.oi().n(new acte(aoobVar));
    }

    public final void f(aoob aoobVar) {
        if (aoobVar == null) {
            return;
        }
        this.l.oi().H(3, new acte(aoobVar), null);
    }

    public final void g() {
        Dialog dialog = this.i;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
