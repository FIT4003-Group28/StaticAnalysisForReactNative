package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.List;
/* compiled from: PG */
/* renamed from: acmb  reason: default package */
/* loaded from: classes.dex */
public final class acmb extends BaseAdapter {
    public final Context a;
    public final ashz b;
    public final aafo c;
    public final acti d;
    public int e;
    ImageView f;
    private final LayoutInflater g;
    private final ajxz h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final List o;

    public acmb(Context context, ajxz ajxzVar, acti actiVar, aafo aafoVar, ashz ashzVar, int i) {
        this.e = -1;
        context.getClass();
        this.a = context;
        this.g = LayoutInflater.from(context);
        this.h = ajxzVar;
        this.i = R.layout.lc_input_select_spinner_item;
        this.j = R.layout.lc_input_select_spinner_dropdown_item;
        this.k = R.id.icon;
        this.l = R.id.title;
        this.m = R.id.subtitle;
        this.n = i;
        this.c = aafoVar;
        this.d = actiVar;
        ashzVar.getClass();
        this.b = ashzVar;
        this.o = ashzVar.c;
    }

    private final View b(LayoutInflater layoutInflater, int i, View view, ViewGroup viewGroup, int i2, boolean z) {
        TextView textView;
        TextView textView2;
        arag aragVar;
        int i3;
        ajxz ajxzVar;
        if (view == null) {
            view = layoutInflater.inflate(i2, viewGroup, false);
        }
        ashy item = getItem(i);
        if (item == null) {
            return view;
        }
        ImageView imageView = (ImageView) view.findViewById(this.k);
        if (imageView != null) {
            if (this.k != 0 && (item.b & 16) != 0 && (ajxzVar = this.h) != null) {
                arhs arhsVar = item.g;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                int a = ajxzVar.a(b);
                if (a != 0) {
                    imageView.setImageResource(a);
                    i3 = 0;
                    imageView.setVisibility(i3);
                }
            }
            i3 = 8;
            imageView.setVisibility(i3);
        }
        int i4 = this.l;
        arag aragVar2 = null;
        if (i4 != 0 && (item.b & 1) != 0 && (textView2 = (TextView) view.findViewById(i4)) != null) {
            if ((item.b & 1) != 0) {
                aragVar = item.e;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView2.setText(ajgl.b(aragVar));
        }
        if (z) {
            if (this.e == i) {
                view.setBackgroundColor(ake.d(this.a, R.color.quantum_grey700));
            }
            int i5 = this.m;
            if (i5 != 0 && (item.b & 2) != 0 && (textView = (TextView) view.findViewById(i5)) != null) {
                if ((item.b & 2) != 0 && (aragVar2 = item.f) == null) {
                    aragVar2 = arag.a;
                }
                textView.setText(ajgl.b(aragVar2));
                textView.setVisibility(0);
            }
        }
        int i6 = this.n;
        if (i6 != 0) {
            ImageView imageView2 = (ImageView) view.findViewById(i6);
            this.f = imageView2;
            if (imageView2 != null && i < this.b.c.size() && this.c != null && this.d != null) {
                aunb aunbVar = ((ashy) this.b.c.get(i)).j;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                    aunb aunbVar2 = ((ashy) this.b.c.get(i)).j;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                    ajxz ajxzVar2 = this.h;
                    arhs arhsVar2 = apojVar.g;
                    if (arhsVar2 == null) {
                        arhsVar2 = arhs.a;
                    }
                    arhr b2 = arhr.b(arhsVar2.c);
                    if (b2 == null) {
                        b2 = arhr.UNKNOWN;
                    }
                    int a2 = ajxzVar2.a(b2);
                    if (a2 != 0) {
                        if ((apojVar.b & 65536) != 0) {
                            ImageView imageView3 = this.f;
                            aovr aovrVar = apojVar.r;
                            if (aovrVar == null) {
                                aovrVar = aovr.a;
                            }
                            imageView3.setContentDescription(aovrVar.c);
                        }
                        this.f.setImageDrawable(akf.a(this.a, a2));
                        this.f.setVisibility(0);
                        this.f.setOnClickListener(new acma(this, i));
                    }
                }
            }
        } else {
            ImageView imageView4 = this.f;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        return view;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final ashy getItem(int i) {
        return (ashy) this.o.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.o.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return b(this.g, i, view, viewGroup, this.j, true);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return b(this.g, i, view, viewGroup, this.i, false);
    }

    public acmb(Context context, ajxz ajxzVar, ashz ashzVar) {
        this(context, ajxzVar, null, null, ashzVar, 0);
    }
}
