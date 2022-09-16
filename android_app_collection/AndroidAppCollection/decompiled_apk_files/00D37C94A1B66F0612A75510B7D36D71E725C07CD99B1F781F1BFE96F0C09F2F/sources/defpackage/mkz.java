package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mkz  reason: default package */
/* loaded from: classes3.dex */
public final class mkz extends ajsl {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final ajrx d;
    private final Resources e;
    private final Context f;

    public mkz(Context context, gem gemVar) {
        context.getClass();
        this.d = gemVar;
        View inflate = View.inflate(context, R.layout.item_section_header, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (TextView) inflate.findViewById(R.id.subtitle);
        this.f = context;
        this.e = context.getResources();
        gemVar.c(inflate);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.d).b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        asln aslnVar = (asln) obj;
        TextView textView = this.b;
        int i = 1;
        arag aragVar2 = null;
        if ((aslnVar.b & 1) != 0) {
            aragVar = aslnVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.c;
        if ((aslnVar.b & 4) != 0 && (aragVar2 = aslnVar.e) == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        this.d.e(ajrsVar);
        int A = akzj.A(aslnVar.d);
        if (A != 0) {
            i = A;
        }
        if (i == 2 || i == 3) {
            kz.s(this.b, 2132083712);
            kz.s(this.c, 2132083717);
        } else if (i == 4) {
            kz.s(this.b, 2132083734);
            kz.s(this.c, 2132083712);
            this.c.setTextColor(zhn.j(this.f, R.attr.ytTextSecondary).orElse(0));
        } else if (i == 6) {
            kz.s(this.b, 2132083727);
            this.b.setTextColor(zhn.j(this.f, R.attr.ytTextSecondary).orElse(0));
        } else if (i == 5) {
            kz.s(this.b, 2132083734);
            this.b.setTextColor(zhn.j(this.f, R.attr.ytTextPrimary).orElse(0));
            this.b.setTypeface(ajgo.ROBOTO_MEDIUM.c(this.f));
        } else {
            kz.s(this.b, 2132083714);
            kz.s(this.c, 2132083717);
        }
        View view = this.a;
        if (i == 2) {
            dimensionPixelSize = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_mysubs_min_height);
        } else if (i == 3) {
            dimensionPixelSize = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_notifications_shelf_min_height);
        } else if (i == 4) {
            dimensionPixelSize = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_search_min_height);
        } else if (i == 6) {
            dimensionPixelSize = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_history_min_height);
        } else {
            dimensionPixelSize = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_min_height);
        }
        view.setMinimumHeight(dimensionPixelSize);
        View view2 = this.a;
        int paddingLeft = view2.getPaddingLeft();
        if (i == 2) {
            dimensionPixelSize2 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_mysubs_top_padding);
        } else if (i == 3) {
            dimensionPixelSize2 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_notifications_shelf_top_padding);
        } else if (i == 4) {
            dimensionPixelSize2 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_search_top_padding);
        } else if (i == 6) {
            dimensionPixelSize2 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_history_top_padding);
        } else {
            dimensionPixelSize2 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_top_padding);
        }
        int paddingRight = this.a.getPaddingRight();
        if (i == 2) {
            dimensionPixelSize3 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_mysubs_bottom_padding);
        } else if (i == 3) {
            dimensionPixelSize3 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_notifications_shelf_bottom_padding);
        } else if (i == 4) {
            dimensionPixelSize3 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_search_bottom_padding);
        } else if (i == 6) {
            dimensionPixelSize3 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_history_bottom_padding);
        } else {
            dimensionPixelSize3 = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_bottom_padding);
        }
        view2.setPadding(paddingLeft, dimensionPixelSize2, paddingRight, dimensionPixelSize3);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        asln aslnVar = (asln) obj;
        return null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
