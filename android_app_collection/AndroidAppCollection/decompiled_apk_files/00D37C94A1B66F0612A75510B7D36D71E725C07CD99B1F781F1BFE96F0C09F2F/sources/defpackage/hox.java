package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelPickerItemRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hox  reason: default package */
/* loaded from: classes3.dex */
public final class hox extends xo {
    public final aafo d;
    public ArrayList e;
    public String f;
    public hoo g;
    public hov h;
    List i;
    private final Context j;
    private final ajmr k;
    private final ajxz l;

    public hox(Context context, ajmr ajmrVar, ajxz ajxzVar, aafo aafoVar) {
        this.j = context;
        this.k = ajmrVar;
        this.l = ajxzVar;
        this.d = aafoVar;
    }

    public static final String w(aulg aulgVar) {
        arag aragVar = aulgVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b = ajgl.b(aragVar);
        if (!aulgVar.e.isEmpty()) {
            String valueOf = String.valueOf(b);
            String str = aulgVar.e;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(str);
            return sb.toString();
        }
        return b.toString();
    }

    @Override // defpackage.xo
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new how(((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.reel_saved_stories_item, viewGroup, false));
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        final how howVar = (how) yoVar;
        if (howVar.t.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = howVar.t.getLayoutParams();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) this.j).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            double d = displayMetrics.widthPixels;
            Double.isNaN(d);
            layoutParams.width = (int) (d * 0.22d);
        }
        arag aragVar = null;
        if (((aunb) this.e.get(i)).qn(ReelPickerItemRendererOuterClass.reelPickerItemRenderer)) {
            final aulg aulgVar = (aulg) ((aunb) this.e.get(i)).qm(ReelPickerItemRendererOuterClass.reelPickerItemRenderer);
            howVar.u.setVisibility(8);
            howVar.v.setVisibility(0);
            howVar.v.setImageDrawable(null);
            if ((aulgVar.b & 1) != 0) {
                ajnj ajnjVar = new ajnj(new ajmq(this.k), new yyj(), howVar.v, false);
                avhn avhnVar = aulgVar.c;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                ajnjVar.k(avhnVar);
            }
            if (this.i.contains(w(aulgVar))) {
                howVar.w.setVisibility(0);
            } else {
                howVar.w.setVisibility(8);
            }
            arag aragVar2 = aulgVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            Spanned b = ajgl.b(aragVar2);
            if (b != null) {
                howVar.x.setText(b.toString());
            }
            howVar.t.setOnClickListener(new View.OnClickListener() { // from class: hou
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    hox hoxVar = hox.this;
                    aulg aulgVar2 = aulgVar;
                    how howVar2 = howVar;
                    String w = hox.w(aulgVar2);
                    if ((aulgVar2.b & 2) != 0) {
                        arag aragVar3 = aulgVar2.d;
                        if (aragVar3 == null) {
                            aragVar3 = arag.a;
                        }
                        str = ajgl.b(aragVar3).toString();
                    } else {
                        str = null;
                    }
                    if (hoxVar.i.contains(w)) {
                        hoxVar.i.remove(w);
                        hov hovVar = hoxVar.h;
                        String str2 = aulgVar2.e;
                        hnu hnuVar = (hnu) hovVar;
                        hni hniVar = hnuVar.ai;
                        if (str2 == null || !hniVar.l.contains(str2)) {
                            if (hniVar.m.contains(str)) {
                                hniVar.m.remove(str);
                            }
                        } else {
                            hniVar.l.remove(str2);
                        }
                        if (hniVar.l.isEmpty() && hniVar.m.isEmpty()) {
                            hniVar.m(2131231312);
                        }
                        hnuVar.aj.d();
                        hnuVar.be();
                        howVar2.w.setVisibility(8);
                    } else {
                        hoxVar.i.add(w);
                        hov hovVar2 = hoxVar.h;
                        String str3 = aulgVar2.e;
                        hnu hnuVar2 = (hnu) hovVar2;
                        hni hniVar2 = hnuVar2.ai;
                        if (str3 != null) {
                            hniVar2.l.add(str3);
                        } else {
                            hniVar2.m.add(str);
                        }
                        if (!hniVar2.l.isEmpty() || !hniVar2.m.isEmpty()) {
                            hniVar2.m(2131232360);
                        }
                        hnuVar2.aj.d();
                        hnuVar2.be();
                        howVar2.w.setVisibility(0);
                    }
                    hoxVar.mr();
                }
            });
        }
        if (((aunb) this.e.get(i)).qn(ButtonRendererOuterClass.buttonRenderer)) {
            final apoj apojVar = (apoj) ((aunb) this.e.get(i)).qm(ButtonRendererOuterClass.buttonRenderer);
            howVar.v.setVisibility(8);
            howVar.w.setVisibility(8);
            howVar.u.setVisibility(0);
            TextView textView = howVar.x;
            if ((apojVar.b & 256) != 0 && (aragVar = apojVar.i) == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
            ajxz ajxzVar = this.l;
            arhs arhsVar = apojVar.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b2 = arhr.b(arhsVar.c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            howVar.u.setImageResource(ajxzVar.a(b2));
            howVar.w.setVisibility(8);
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.f);
            hashMap.put("callback_key", this.g);
            howVar.t.setOnClickListener(new View.OnClickListener() { // from class: hot
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hox hoxVar = hox.this;
                    apoj apojVar2 = apojVar;
                    Map map = hashMap;
                    view.setEnabled(false);
                    aafo aafoVar = hoxVar.d;
                    apzg apzgVar = apojVar2.o;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, map);
                    view.postDelayed(new gys(view, 3), 1000L);
                }
            });
        }
    }
}
