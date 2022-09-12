package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cabz  reason: default package */
/* loaded from: classes4.dex */
final class cabz extends BaseAdapter {
    final /* synthetic */ gga a;
    final /* synthetic */ cacc b;

    public cabz(cacc caccVar, gga ggaVar) {
        this.b = caccVar;
        this.a = ggaVar;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final cauj getItem(int i) {
        return this.b.e.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.e.size();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, @dzsi View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            textView = (TextView) this.a.getLayoutInflater().inflate(17367043, viewGroup, false);
        } else {
            textView = (TextView) view;
        }
        cauj caujVar = cauj.ALL;
        int ordinal = getItem(i).ordinal();
        if (ordinal == 0 || ordinal == 1) {
            textView.setText(R.string.PLACE_QA_ALL_DROPDOWN_MENU);
        } else if (ordinal == 2) {
            textView.setText(R.string.PLACE_QA_QUESTION_DROPDOWN_MENU);
        } else if (ordinal == 3) {
            textView.setText(R.string.PLACE_QA_ANSWER_DROPDOWN_MENU);
        } else if (ordinal == 4) {
            textView.setText(bdys.PLACE_QA_REPLY_DROPDOWN_MENU);
        }
        textView.setTextAppearance(this.a, R.style.QuBody1);
        return textView;
    }
}
