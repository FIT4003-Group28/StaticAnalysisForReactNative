package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mjk  reason: default package */
/* loaded from: classes3.dex */
public final class mjk extends ajsl {
    public final aafo a;
    public final View b;
    public apzg c;
    private final ajmy d;
    private final fmg e;
    private final YouTubeTextView f;
    private final ImageView g;
    private final YouTubeTextView h;
    private final ajmu i;
    private final View.OnClickListener j;
    private final Context k;

    public mjk(Context context, ajmy ajmyVar, aafo aafoVar, fmh fmhVar, fnz fnzVar, akem akemVar) {
        this.k = context;
        ajmyVar.getClass();
        this.d = ajmyVar;
        aafoVar.getClass();
        this.a = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.feed_channel_filter_header, (ViewGroup) null);
        this.b = inflate;
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.title);
        this.f = youTubeTextView;
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.subscriber_count);
        this.h = youTubeTextView2;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.g = imageView;
        ajmt b = ajmyVar.c().b();
        b.b(2131232143);
        this.i = b.a();
        this.e = fmhVar.a((TextView) inflate.findViewById(R.id.subscribe_button), fnzVar.a(inflate.findViewById(R.id.subscription_notification_view)));
        this.j = new mji(this);
        if (akemVar.d()) {
            mjj mjjVar = new mjj(this);
            imageView.setOnTouchListener(mjjVar);
            youTubeTextView.setOnTouchListener(mjjVar);
            youTubeTextView2.setOnTouchListener(mjjVar);
        }
        inflate.setClickable(true);
        akemVar.b(inflate, akemVar.a(inflate, null));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        aqxv aqxvVar = (aqxv) obj;
        ajmy ajmyVar = this.d;
        ImageView imageView = this.g;
        avhn avhnVar = aqxvVar.f;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.k(imageView, avhnVar, this.i);
        avaq avaqVar = null;
        if ((aqxvVar.b & 1) != 0) {
            aragVar = aqxvVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        this.f.setText(b);
        YouTubeTextView youTubeTextView = this.h;
        if ((aqxvVar.b & 2) != 0) {
            aragVar2 = aqxvVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        youTubeTextView.setText(ajgl.b(aragVar2));
        apzg apzgVar = aqxvVar.e;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        this.c = apzgVar;
        this.g.setOnClickListener(this.j);
        this.f.setOnClickListener(this.j);
        this.h.setOnClickListener(this.j);
        this.g.setContentDescription(b);
        aqxu aqxuVar = aqxvVar.g;
        if (aqxuVar == null) {
            aqxuVar = aqxu.a;
        }
        if (aqxuVar.b == 55419609) {
            aqxu aqxuVar2 = aqxvVar.g;
            if (aqxuVar2 == null) {
                aqxuVar2 = aqxu.a;
            }
            if (aqxuVar2.b == 55419609) {
                avaqVar = (avaq) aqxuVar2.c;
            } else {
                avaqVar = avaq.a;
            }
        }
        if (avaqVar != null) {
            Context context = this.k;
            aopa mo52toBuilder = avaqVar.mo52toBuilder();
            fyv.d(context, mo52toBuilder, b);
            avaqVar = (avaq) mo52toBuilder.mo39build();
        }
        this.e.i(avaqVar, ajrsVar.a);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqxv) obj).h.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.d();
    }
}
