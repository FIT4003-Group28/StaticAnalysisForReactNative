package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: msa  reason: default package */
/* loaded from: classes3.dex */
public final class msa implements ajru {
    private final ajmy a;
    private final mrx b;
    private final View c;
    private final TextView d;
    private final ImageView e;
    private final View f;
    private final Context g;
    private final float h;

    public msa(Context context, ajmy ajmyVar, mrx mrxVar, ViewGroup viewGroup) {
        this.a = ajmyVar;
        this.b = mrxVar;
        this.g = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.topic_picker_item, viewGroup, false);
        this.c = inflate;
        View findViewById = inflate.findViewById(R.id.content_view);
        this.f = findViewById;
        this.d = (TextView) findViewById.findViewById(R.id.title);
        this.e = (ImageView) findViewById.findViewById(R.id.image);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.topic_picker_item_selected_alpha, typedValue, true);
        this.h = typedValue.getFloat();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    public final void d(mry mryVar) {
        mry mryVar2;
        attr attrVar;
        mrx mrxVar = this.b;
        String a = mryVar.a();
        if (mryVar.g) {
            mrxVar.h.add(a);
        } else {
            mrxVar.h.remove(a);
        }
        mrxVar.i();
        if (mryVar.g && (mryVar == null || !mryVar.c)) {
            int i = mryVar != null ? mryVar.f : 0;
            int i2 = mrxVar.c;
            if (i2 == -1 || i < i2) {
                if (mrxVar.j.containsKey(a)) {
                    mrxVar.c(a, (List) mrxVar.j.get(a));
                } else {
                    ajfz ajfzVar = null;
                    if (mryVar == null) {
                        mryVar2 = null;
                    } else if (!mryVar.d) {
                        mryVar2 = mryVar;
                    }
                    mrq mrqVar = mrxVar.k;
                    if (mrqVar != null) {
                        if (mryVar.a.g.size() != 0) {
                            aopu aopuVar = mryVar.a.g;
                            if (aopuVar.size() > 1) {
                                zep.b("Only one continuation expected. First will be processed, others will be ignored.");
                            }
                            if (((avjl) aopuVar.get(0)).b == 91229939) {
                                avjl avjlVar = (avjl) aopuVar.get(0);
                                if (avjlVar.b == 91229939) {
                                    attrVar = (attr) avjlVar.c;
                                } else {
                                    attrVar = attr.a;
                                }
                                ajfzVar = ajna.g(attrVar);
                            }
                        }
                        if (ajfzVar != null) {
                            mrqVar.b.b(mrqVar.b.a(ajfzVar), mrqVar.d, new mro(mrqVar));
                            mryVar.d = true;
                        }
                    }
                    mryVar = mryVar2;
                }
            }
        }
        this.c.setSelected(mryVar.g);
        this.e.setAlpha(mryVar.g ? this.h : 1.0f);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(final ajrs ajrsVar, Object obj) {
        arag aragVar;
        avhn avhnVar;
        final mry mryVar = (mry) obj;
        int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.topic_picker_item_top_bottom_padding);
        int dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.topic_picker_item_start_end_padding);
        this.f.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: mrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                msa msaVar = msa.this;
                mry mryVar2 = mryVar;
                ajrs ajrsVar2 = ajrsVar;
                mryVar2.g = !mryVar2.g;
                msaVar.d(mryVar2);
                acti actiVar = ajrsVar2.a;
                byte[] b = mryVar2.b();
                boolean z = mryVar2.g;
                aopa createBuilder = asjj.a.createBuilder();
                aopa createBuilder2 = asja.a.createBuilder();
                int i = true != z ? 3 : 2;
                createBuilder2.copyOnWrite();
                asja asjaVar = (asja) createBuilder2.instance;
                asjaVar.c = i - 1;
                asjaVar.b |= 1;
                createBuilder.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder.instance;
                asja asjaVar2 = (asja) createBuilder2.mo39build();
                asjaVar2.getClass();
                asjjVar.m = asjaVar2;
                asjjVar.b |= 32768;
                asjj asjjVar2 = (asjj) createBuilder.mo39build();
                if (b != null) {
                    actiVar.H(3, new acte(b), asjjVar2);
                }
            }
        });
        d(mryVar);
        TextView textView = this.d;
        avjo avjoVar = mryVar.a;
        if ((avjoVar.b & 1) != 0) {
            aragVar = avjoVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        ajmy ajmyVar = this.a;
        ImageView imageView = this.e;
        avjo avjoVar2 = mryVar.a;
        if ((avjoVar2.b & 2) != 0) {
            avhnVar = avjoVar2.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.h(imageView, avhnVar);
        if (mryVar.b() != null) {
            ajrsVar.a.u(new acte(mryVar.b()), null);
        }
        mrx mrxVar = this.b;
        String a = mryVar.a();
        if (mrxVar.i.containsKey(a)) {
            ((mry) mrxVar.i.get(a)).b = true;
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
