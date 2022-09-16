package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iio  reason: default package */
/* loaded from: classes3.dex */
public final class iio extends ajsl {
    public iig a;
    private final ajmy b;
    private final View c;
    private final ImageView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;

    public iio(Context context, ajmy ajmyVar) {
        aqxo.p(ajmyVar != null);
        this.b = ajmyVar;
        View inflate = View.inflate(context, R.layout.user_mention_suggestion, null);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.channel_thumbnail);
        this.e = (YouTubeTextView) inflate.findViewById(R.id.channel_display_name);
        this.f = (YouTubeTextView) inflate.findViewById(R.id.channel_details);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        final avvu avvuVar = (avvu) obj;
        ajmy ajmyVar = this.b;
        ImageView imageView = this.d;
        avhn avhnVar = avvuVar.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        this.e.setText(avvuVar.d);
        YouTubeTextView youTubeTextView = this.f;
        arag aragVar = avvuVar.f;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        youTubeTextView.setText(ajgl.b(aragVar));
        final acti actiVar = ajrsVar.a;
        this.a = (iig) ajrsVar.c("listener");
        Integer num = (Integer) ajrsVar.c("color");
        if (num != null) {
            this.e.setTextColor(num.intValue());
            this.f.setTextColor(num.intValue());
        }
        if (this.a != null) {
            final int b = ajrsVar.b("position", -1);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: iin
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iio iioVar = iio.this;
                    acti actiVar2 = actiVar;
                    avvu avvuVar2 = avvuVar;
                    int i = b;
                    actiVar2.H(3, new acte(avvuVar2.g), null);
                    iil iilVar = iioVar.a.a;
                    iilVar.c.g(avvuVar2);
                    avvr a = iilVar.a(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_SUGGESTION_SELECTED);
                    aopa createBuilder = avvs.a.createBuilder();
                    createBuilder.copyOnWrite();
                    avvs avvsVar = (avvs) createBuilder.instance;
                    avvsVar.b |= 1;
                    avvsVar.c = i;
                    a.copyOnWrite();
                    ((avvt) a.instance).j((avvs) createBuilder.mo39build());
                    iilVar.b((avvt) a.mo39build());
                }
            });
            return;
        }
        this.c.setOnClickListener(null);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avvu) obj).g.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
