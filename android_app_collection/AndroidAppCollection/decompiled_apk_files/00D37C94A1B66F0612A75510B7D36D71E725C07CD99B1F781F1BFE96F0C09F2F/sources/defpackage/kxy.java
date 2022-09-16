package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kxy  reason: default package */
/* loaded from: classes3.dex */
public final class kxy extends ajsl implements View.OnClickListener, View.OnLayoutChangeListener {
    private final Activity a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final ajmy e;
    private final ImageView f;
    private final ImageView g;
    private final ImageView h;
    private final ImageView i;
    private String j;
    private ardb k;
    private float l = 0.0f;

    public kxy(Activity activity, ajmy ajmyVar, ViewGroup viewGroup) {
        this.a = activity;
        this.e = ajmyVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.geo_details_card, viewGroup, false);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.place_name);
        this.d = (TextView) inflate.findViewById(R.id.place_address);
        this.f = (ImageView) inflate.findViewById(R.id.place_image);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.place_map);
        this.g = imageView;
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.wide_place_map);
        this.h = imageView2;
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.place_link_icon);
        this.i = imageView3;
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        inflate.addOnLayoutChangeListener(this);
    }

    private final void f() {
        ImageView imageView;
        int i;
        if (this.k == null) {
            return;
        }
        if (this.h.getVisibility() == 0) {
            float f = this.l;
            if (f == 0.0f) {
                return;
            }
            imageView = this.h;
            i = Math.round(f * 300.0f);
        } else {
            imageView = this.g;
            i = 300;
        }
        Uri.Builder path = new Uri.Builder().scheme("https").authority("maps.googleapis.com").path("/maps/api/staticmap");
        arcz arczVar = this.k.f;
        if (arczVar == null) {
            arczVar = arcz.a;
        }
        Uri.Builder appendQueryParameter = path.appendQueryParameter("key", arczVar.e);
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x300");
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("size", sb.toString());
        arcz arczVar2 = this.k.f;
        if (arczVar2 == null) {
            arczVar2 = arcz.a;
        }
        double d = arczVar2.b;
        arcz arczVar3 = this.k.f;
        if (arczVar3 == null) {
            arczVar3 = arcz.a;
        }
        double d2 = arczVar3.c;
        StringBuilder sb2 = new StringBuilder(49);
        sb2.append(d);
        sb2.append(",");
        sb2.append(d2);
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("markers", sb2.toString());
        if (this.k.g.size() > 0) {
            StringBuilder sb3 = new StringBuilder();
            for (int i2 = 0; i2 < this.k.g.size(); i2++) {
                if (i2 > 0) {
                    sb3.append('|');
                }
                sb3.append(((arda) this.k.g.get(i2)).b);
                sb3.append(',');
                sb3.append(((arda) this.k.g.get(i2)).c);
            }
            appendQueryParameter3.appendQueryParameter("visible", sb3.toString());
        }
        String.valueOf(String.valueOf(appendQueryParameter3.build())).length();
        this.e.g(imageView, appendQueryParameter3.build());
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        ardb ardbVar = (ardb) obj;
        int i = ardbVar.b;
        if ((i & 1) == 0 || (i & 16) == 0) {
            return;
        }
        this.k = ardbVar;
        arcz arczVar = ardbVar.f;
        if (arczVar == null) {
            arczVar = arcz.a;
        }
        this.j = arczVar.d;
        TextView textView = this.c;
        arag aragVar = ardbVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.d;
        arag aragVar2 = ardbVar.d;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textView2.setText(ajgl.b(aragVar2));
        avhn avhnVar = ardbVar.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        if (akel.A(avhnVar)) {
            ajmy ajmyVar = this.e;
            ImageView imageView = this.f;
            avhn avhnVar2 = ardbVar.e;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar2);
            this.f.setVisibility(0);
            this.g.setVisibility(0);
            this.h.setVisibility(4);
            f();
            return;
        }
        this.f.setVisibility(4);
        this.g.setVisibility(4);
        this.h.setVisibility(0);
        if (this.l <= 0.0f) {
            return;
        }
        f();
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        ardb ardbVar = (ardb) obj;
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = this.j;
        if (str != null) {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i == i7 - i5) {
            return;
        }
        this.l = this.h.getWidth() / this.h.getHeight();
        f();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
