package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: msm  reason: default package */
/* loaded from: classes3.dex */
public final class msm implements ajru {
    private final View a;
    private final View b;
    private final View c;
    private final View d;
    private final View e;
    private final /* synthetic */ int f;

    public msm(Context context, int i) {
        this.f = i;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_video_ghost_card, (ViewGroup) null);
        this.a = inflate;
        this.b = inflate.findViewById(R.id.thumbnail_layout);
        this.d = inflate.findViewById(R.id.title);
        this.c = inflate.findViewById(R.id.author);
        this.e = inflate.findViewById(R.id.numViews);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f != 0 ? this.a : this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        if (this.f == 0) {
            int i = ((ezy) obj).a * 3;
            mpe.g(this.b, i);
            int i2 = i + 1;
            mpe.g(this.c, i2);
            mpe.g(this.d, i2);
            mpe.g(this.e, i + 2);
            return;
        }
        ezv ezvVar = (ezv) obj;
        throw null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        if (this.f == 0) {
            mpe.h(this.b);
            mpe.h(this.c);
            mpe.h(this.d);
            mpe.h(this.e);
            return;
        }
        mpe.h(this.b);
        mpe.h(this.d);
        mpe.h(this.c);
        mpe.h(this.e);
    }

    public msm(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.video_with_context_ghost_card, (ViewGroup) null);
        this.a = inflate;
        this.b = inflate.findViewById(R.id.thumbnail_layout);
        this.c = inflate.findViewById(R.id.channel_avatar);
        this.d = inflate.findViewById(R.id.title);
        this.e = inflate.findViewById(R.id.subtitle);
    }
}
