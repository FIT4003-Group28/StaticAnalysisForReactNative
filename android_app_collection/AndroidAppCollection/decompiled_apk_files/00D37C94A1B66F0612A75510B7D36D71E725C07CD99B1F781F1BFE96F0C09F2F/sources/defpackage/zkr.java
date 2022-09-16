package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zkr  reason: default package */
/* loaded from: classes4.dex */
public final class zkr extends BaseAdapter {
    private final Context a;
    private final List b;
    private final zjy c;
    private final boolean d;
    private final ajmr e;

    public zkr(Context context, List list, zjy zjyVar, ajmr ajmrVar, boolean z) {
        context.getClass();
        this.a = context;
        this.b = list;
        zjyVar.getClass();
        this.c = zjyVar;
        ajmrVar.getClass();
        this.e = ajmrVar;
        this.d = z;
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
        zkq zkqVar;
        if (view != null) {
            zkqVar = (zkq) view;
        } else if (this.d) {
            zkqVar = new zks(this.a, this.c, this.e);
        } else {
            zkqVar = new zkq(this.a, this.c, this.e, R.layout.audio_swap_track_bar);
        }
        Track track = (Track) getItem(i);
        track.getClass();
        if (!track.equals(zkqVar.h)) {
            zkqVar.h = track;
            zkqVar.b.setText(track.a);
            zkqVar.c.setText(track.b);
            zkqVar.d.setText(vqw.f(zkqVar.getContext(), track.c, false));
            TextView textView = zkqVar.e;
            if (textView != null) {
                textView.setText(track.f);
            }
            if (zkqVar.a != null) {
                zkqVar.f.l(track.e, zkqVar.g);
            }
            zkqVar.a();
        }
        return zkqVar;
    }
}
