package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ekz  reason: default package */
/* loaded from: classes3.dex */
public final class ekz extends ajsl {
    public final aafo a;
    private final Context b;
    private final ajrx c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final View h;
    private final View i;
    private final ViewGroup j;

    public ekz(Context context, gem gemVar, aafo aafoVar) {
        context.getClass();
        this.b = context;
        this.c = gemVar;
        aafoVar.getClass();
        this.a = aafoVar;
        View inflate = View.inflate(context, R.layout.channel_about_metadata_item, null);
        this.d = (TextView) inflate.findViewById(R.id.description);
        this.e = (TextView) inflate.findViewById(R.id.joined_date);
        this.f = (TextView) inflate.findViewById(R.id.subscribers);
        this.g = (TextView) inflate.findViewById(R.id.views);
        this.h = inflate.findViewById(R.id.description_separator);
        this.i = inflate.findViewById(R.id.stats_separator);
        this.j = (ViewGroup) inflate.findViewById(R.id.links);
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.c).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        apqu apquVar = (apqu) obj;
        TextView textView = this.d;
        arag aragVar5 = null;
        if ((apquVar.b & 4) != 0) {
            aragVar = apquVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.e;
        if ((apquVar.b & 1024) != 0) {
            aragVar2 = apquVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        aopu<apqo> aopuVar = apquVar.d;
        this.j.removeAllViews();
        boolean z = false;
        if (aopuVar.isEmpty()) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
            for (apqo apqoVar : aopuVar) {
                TextView textView3 = (TextView) View.inflate(this.b, R.layout.channel_link_item, null);
                if ((apqoVar.b & 1) != 0) {
                    final apzg apzgVar = apqoVar.c;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: eky
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ekz ekzVar = ekz.this;
                            ekzVar.a.c(apzgVar, null);
                        }
                    });
                }
                if ((apqoVar.b & 4) != 0) {
                    aragVar3 = apqoVar.d;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                zag.m(textView3, ajgl.b(aragVar3));
                this.j.addView(textView3, new ViewGroup.LayoutParams(-2, -2));
            }
        }
        zag.o(this.h, (this.d.getVisibility() == 8 && this.e.getVisibility() == 8 && this.j.getVisibility() == 8) ? false : true);
        TextView textView4 = this.f;
        if ((apquVar.b & 128) != 0) {
            aragVar4 = apquVar.e;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        zag.m(textView4, ajgl.b(aragVar4));
        TextView textView5 = this.g;
        if ((apquVar.b & 256) != 0 && (aragVar5 = apquVar.f) == null) {
            aragVar5 = arag.a;
        }
        zag.m(textView5, ajgl.b(aragVar5));
        if (this.f.getVisibility() != 8 && this.g.getVisibility() != 8) {
            z = true;
        }
        zag.o(this.i, z);
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        apqu apquVar = (apqu) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
