package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kxo  reason: default package */
/* loaded from: classes3.dex */
final class kxo extends kxm {
    private final TextView l;

    public kxo(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, Handler handler, ajxz ajxzVar, int i, ViewGroup viewGroup) {
        super(context, ajmyVar, aafoVar, ajycVar, handler, ajxzVar, i, viewGroup);
        this.l = (TextView) this.g.findViewById(R.id.header);
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
    }
}
