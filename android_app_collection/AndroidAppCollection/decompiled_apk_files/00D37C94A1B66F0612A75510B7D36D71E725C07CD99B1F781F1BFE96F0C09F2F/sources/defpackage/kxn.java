package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kxn  reason: default package */
/* loaded from: classes3.dex */
final class kxn extends kxm {
    private final TextView l;
    private final TextView m;

    public kxn(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, Handler handler, ajxz ajxzVar, ViewGroup viewGroup) {
        super(context, ajmyVar, aafoVar, ajycVar, handler, ajxzVar, R.layout.clarification_item_large, viewGroup);
        this.l = (TextView) this.g.findViewById(R.id.header);
        this.m = (TextView) this.g.findViewById(R.id.section_title);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kxm
    public final void f(apvm apvmVar) {
        super.f(apvmVar);
        TextView textView = this.l;
        arag aragVar = apvmVar.j;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.m;
        arag aragVar2 = apvmVar.k;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        WrappingTextViewForClarifyBox wrappingTextViewForClarifyBox = this.h;
        arag aragVar3 = apvmVar.e;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(wrappingTextViewForClarifyBox, ajgl.b(aragVar3));
    }

    @Override // defpackage.kxm
    public final void g(int i, boolean z) {
    }
}
