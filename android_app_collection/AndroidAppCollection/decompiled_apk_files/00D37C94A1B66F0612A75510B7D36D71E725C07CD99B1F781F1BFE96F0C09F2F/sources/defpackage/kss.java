package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: kss  reason: default package */
/* loaded from: classes3.dex */
public class kss extends ajsl {
    public final aafo a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final ktb f;
    private final gem g;

    public kss(Context context, aafo aafoVar, gem gemVar, ktc ktcVar, int i, xx xxVar, xx xxVar2, int i2) {
        this.a = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.labels);
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.collage);
        recyclerView.setNestedScrollingEnabled(false);
        Resources resources = context.getResources();
        ktb a = ktcVar.a(xxVar, xxVar2, i2);
        this.f = a;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        recyclerView.ag(gridLayoutManager);
        recyclerView.ad(a);
        gridLayoutManager.g = new ksx(a);
        recyclerView.aC(new ksw(a, resources.getDimensionPixelSize(R.dimen.bundle_item_image_padding)));
        this.g = gemVar;
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajsl
    public void d(ajrs ajrsVar, Object obj) {
        final ksm i = ohn.i(obj);
        zag.m(this.c, ajgl.b(i.c()));
        zag.m(this.e, ajgl.b(i.b()));
        TextView textView = this.d;
        List e = i.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (e != null && e.size() > 0) {
            spannableStringBuilder.append((CharSequence) aafv.a((arag) e.get(0), this.a, false));
            for (int i2 = 1; i2 < e.size(); i2++) {
                spannableStringBuilder.append((CharSequence) " · ").append((CharSequence) aafv.a((arag) e.get(i2), this.a, false));
            }
        }
        zag.m(textView, spannableStringBuilder);
        this.f.y(i.h(), i.d(), i.f());
        this.f.mr();
        this.b.setOnClickListener(new View.OnClickListener() { // from class: ksr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kss.this.a.c(i.a(), null);
            }
        });
        emn.J(ajrsVar, 2);
        this.g.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    public final byte[] e(Object obj) {
        return ohn.i(obj).g();
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
    }
}
