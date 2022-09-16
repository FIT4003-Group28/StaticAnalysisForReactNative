package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mhy  reason: default package */
/* loaded from: classes3.dex */
public final class mhy {
    public final ViewGroup a;
    public final ajmy b;
    public final int c;
    final ImageView d;
    final TextView e;
    final TextView f;
    final TextView g;
    final ImageView h;
    final gga i;
    final frf j;
    final /* synthetic */ mhz k;
    public final aacz l;

    public mhy(mhz mhzVar, final Context context, ajmy ajmyVar, aacz aaczVar, boolean z) {
        this.k = mhzVar;
        this.b = ajmyVar;
        this.l = aaczVar;
        if (!zew.y(context) || !eog.aJ(aaczVar)) {
            this.a = (RelativeLayout) View.inflate(context, R.layout.compact_promoted_item, null);
        } else {
            this.a = (LinearLayout) View.inflate(context, R.layout.compact_promoted_item_linear_feed_tablet, null);
        }
        this.d = (ImageView) this.a.findViewById(R.id.thumbnail);
        this.e = (TextView) this.a.findViewById(R.id.title);
        this.f = (TextView) this.a.findViewById(R.id.subtitle);
        TextView textView = (TextView) this.a.findViewById(R.id.button);
        this.g = textView;
        this.i = mhzVar.d.a(textView);
        ImageView imageView = (ImageView) this.a.findViewById(R.id.dismiss_button);
        this.h = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: mhw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mhy mhyVar = mhy.this;
                apok apokVar = mhyVar.k.f.j;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                apoj apojVar = apokVar.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                if ((apojVar.b & 8192) != 0) {
                    mhz mhzVar2 = mhyVar.k;
                    aafo aafoVar = mhzVar2.b;
                    apok apokVar2 = mhzVar2.f.j;
                    if (apokVar2 == null) {
                        apokVar2 = apok.a;
                    }
                    apoj apojVar2 = apokVar2.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    apzg apzgVar = apojVar2.n;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, actk.f(mhyVar.k.f));
                } else {
                    mhz mhzVar3 = mhyVar.k;
                    aqel aqelVar = mhzVar3.f;
                    if ((aqelVar.b & 256) != 0) {
                        aafo aafoVar2 = mhzVar3.b;
                        apzg apzgVar2 = aqelVar.k;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar2.c(apzgVar2, actk.f(mhyVar.k.f));
                    }
                }
                mhz mhzVar4 = mhyVar.k;
                mhzVar4.g = true;
                mhy mhyVar2 = mhzVar4.i;
                if (mhyVar2 != null) {
                    mhyVar2.a.setVisibility(8);
                }
                mhy mhyVar3 = mhzVar4.h;
                if (mhyVar3 != null) {
                    mhyVar3.a.setVisibility(8);
                }
            }
        });
        this.c = context.getResources().getDimensionPixelSize(R.dimen.slight_start_end_padding);
        frf frfVar = new frf(zhn.j(context, R.attr.yt10PercentLayer).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        this.j = frfVar;
        if (z) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: mhx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mhy mhyVar = mhy.this;
                    Context context2 = context;
                    if (mhyVar.k.e.o()) {
                        mhz mhzVar2 = mhyVar.k;
                        aafo aafoVar = mhzVar2.b;
                        apok apokVar = mhzVar2.f.i;
                        if (apokVar == null) {
                            apokVar = apok.a;
                        }
                        apoj apojVar = apokVar.c;
                        if (apojVar == null) {
                            apojVar = apoj.a;
                        }
                        apzg apzgVar = apojVar.p;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.c(apzgVar, actk.f(mhyVar.k.f));
                        return;
                    }
                    fvf fvfVar = mhyVar.k.k;
                    fvg d = fvl.d();
                    d.k(context2.getResources().getString(R.string.habanero_entry_point_offline_message));
                    fvfVar.i(d.b());
                }
            });
            frfVar.e(false);
        }
    }
}
