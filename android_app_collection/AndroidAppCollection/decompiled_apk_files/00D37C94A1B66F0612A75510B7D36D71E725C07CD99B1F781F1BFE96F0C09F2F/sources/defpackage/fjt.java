package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fjt  reason: default package */
/* loaded from: classes3.dex */
public abstract class fjt implements ajru {
    private final ajmy a;
    public final View b;
    protected final TextView c;
    protected final TextView d;
    protected final TextView e;
    private final ImageView f;
    private final ajmu g;

    public fjt(Context context, ajmy ajmyVar, int i) {
        ajmyVar.getClass();
        this.a = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.channel_name);
        this.d = (TextView) inflate.findViewById(R.id.video_count);
        this.e = (TextView) inflate.findViewById(R.id.subscriber_count);
        this.f = (ImageView) inflate.findViewById(R.id.channel_avatar);
        ajmt b = ajmyVar.c().b();
        b.b(2131232143);
        this.g = b.a();
    }

    public final void d(avhn avhnVar) {
        this.a.k(this.f, avhnVar, this.g);
    }

    public final void e(CharSequence charSequence) {
        zag.m(this.e, charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
