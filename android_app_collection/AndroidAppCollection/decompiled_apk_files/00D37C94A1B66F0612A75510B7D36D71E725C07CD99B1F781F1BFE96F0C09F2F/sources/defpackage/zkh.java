package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zkh  reason: default package */
/* loaded from: classes4.dex */
public final class zkh extends BaseAdapter {
    private final Context a;
    private final List b;
    private final ajmr c;

    public zkh(Context context, List list, ajmr ajmrVar) {
        context.getClass();
        this.a = context;
        list.getClass();
        this.b = list;
        ajmrVar.getClass();
        this.c = ajmrVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        zkg zkgVar;
        arag aragVar;
        if (view != null) {
            zkgVar = (zkg) view;
        } else {
            zkgVar = new zkg(this.a, this.c);
        }
        apis apisVar = (apis) getItem(i);
        apisVar.getClass();
        if (!apisVar.equals(zkgVar.e)) {
            zkgVar.e = apisVar;
            if ((apisVar.b & 1) != 0) {
                aragVar = apisVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b = ajgl.b(aragVar);
            zkgVar.b.setText(b);
            zkgVar.a.setContentDescription(b);
            zkgVar.a.setBackground(null);
            zkgVar.a.setBackgroundColor(zkgVar.getResources().getColor(R.color.yt_black3));
            zkgVar.c.n();
            ajnj ajnjVar = zkgVar.c;
            avhn avhnVar = apisVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajnjVar.l(avhnVar, zkgVar.d);
            if ((apisVar.b & 2) == 0) {
                zkgVar.c.e(R.drawable.audio_swap_track_not_loaded);
            }
            zkgVar.c.i(ImageView.ScaleType.CENTER_CROP);
        }
        return zkgVar;
    }
}
