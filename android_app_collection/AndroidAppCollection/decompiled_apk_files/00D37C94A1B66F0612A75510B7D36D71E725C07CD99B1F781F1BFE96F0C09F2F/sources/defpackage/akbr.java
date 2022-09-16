package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: akbr  reason: default package */
/* loaded from: classes.dex */
public final class akbr extends xo {
    public akbv d;
    public List e;
    private final ajvj f;
    private final ajmy g;

    public akbr(ajmy ajmyVar, ajvj ajvjVar) {
        this.f = ajvjVar;
        this.g = ajmyVar;
    }

    @Override // defpackage.xo
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new akbq(new akbp(this.d), LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.emoji_holder, viewGroup, false), this.f);
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        akbq akbqVar = (akbq) yoVar;
        if (this.e.size() > i) {
            int i2 = akbq.w;
            this.g.h(akbqVar.t, this.f.b((String) this.e.get(i)));
            String str = (String) this.e.get(i);
            akbqVar.u.a = str;
            akbqVar.t.setContentDescription(akbqVar.v.c(str));
        }
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void p(yo yoVar) {
        int i = akbq.w;
        ImageView imageView = ((akbq) yoVar).t;
        if (imageView != null) {
            this.g.e(imageView);
        }
    }
}
