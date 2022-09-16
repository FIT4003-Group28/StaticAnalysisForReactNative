package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: acks  reason: default package */
/* loaded from: classes.dex */
final class acks extends xo {
    private final Context d;
    private final List e;

    public acks(Context context, List list) {
        this.d = context;
        list.getClass();
        this.e = list;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new yo(new acnk(this.d));
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        acnk acnkVar = (acnk) yoVar.a;
        avac avacVar = (avac) this.e.get(i);
        arag aragVar4 = null;
        if ((avacVar.b & 1) == 0) {
            acnkVar.a.setText("");
            acnkVar.b.setText("");
            acnkVar.setContentDescription(null);
            return;
        }
        avab avabVar = avacVar.c;
        if (avabVar == null) {
            avabVar = avab.a;
        }
        TextView textView = acnkVar.a;
        if ((avabVar.b & 2) != 0) {
            aragVar = avabVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = acnkVar.b;
        if ((avabVar.b & 4) != 0) {
            aragVar2 = avabVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setText(ajgl.b(aragVar2));
        String string = acnkVar.getContext().getString(R.string.lc_statistic_item_cd);
        if ((avabVar.b & 2) != 0) {
            aragVar3 = avabVar.c;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        CharSequence i2 = ajgl.i(aragVar3);
        if ((avabVar.b & 4) != 0 && (aragVar4 = avabVar.d) == null) {
            aragVar4 = arag.a;
        }
        CharSequence i3 = ajgl.i(aragVar4);
        if (i2 == null || i3 == null) {
            return;
        }
        acnkVar.setContentDescription(String.format(string, i2, i3));
    }
}
