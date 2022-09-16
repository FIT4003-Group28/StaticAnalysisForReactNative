package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mrl  reason: default package */
/* loaded from: classes3.dex */
public final class mrl extends ajsl {
    public final aafo a;
    private final View b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;
    private final YouTubeTextView g;
    private final YouTubeTextView h;

    public mrl(Context context, aafo aafoVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ticket_event, (ViewGroup) null, false);
        this.b = inflate;
        this.c = (YouTubeTextView) inflate.findViewById(R.id.title_view);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.subtitle_view);
        this.e = (YouTubeTextView) inflate.findViewById(R.id.subtitle_view2);
        this.f = (YouTubeTextView) inflate.findViewById(R.id.link_view);
        this.g = (YouTubeTextView) inflate.findViewById(R.id.calendar_month);
        this.h = (YouTubeTextView) inflate.findViewById(R.id.calendar_day);
        this.a = aafoVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        final avhv avhvVar = (avhv) obj;
        zag.m(this.c, avhvVar.c);
        zag.m(this.d, avhvVar.e);
        zag.m(this.e, avhvVar.f);
        this.b.setContentDescription(avhvVar.d);
        this.g.setText(avhvVar.j);
        this.h.setText(avhvVar.k);
        zag.m(this.f, avhvVar.l);
        if ((avhvVar.b & 256) == 0) {
            this.b.setClickable(false);
            return;
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: mrk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mrl mrlVar = mrl.this;
                avhv avhvVar2 = avhvVar;
                aafo aafoVar = mrlVar.a;
                apzg apzgVar = avhvVar2.i;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, actk.f(avhvVar2));
            }
        });
        this.b.setClickable(true);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avhv) obj).m.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
