package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lao  reason: default package */
/* loaded from: classes3.dex */
final class lao extends lal {
    public lao(Context context, aafo aafoVar, ajmy ajmyVar, akep akepVar, akbn akbnVar, ajxz ajxzVar, fmh fmhVar, fnz fnzVar, akem akemVar, ViewGroup viewGroup) {
        super(context, aafoVar, ajmyVar, akepVar, akbnVar, ajxzVar, fmhVar, fnzVar, akemVar, R.layout.watch_card_rich_header_vertical_layout, viewGroup);
    }

    @Override // defpackage.lal
    public final void d(awdt awdtVar) {
        arag aragVar;
        TextView textView = this.b;
        if ((awdtVar.b & 4) != 0) {
            aragVar = awdtVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
    }
}
