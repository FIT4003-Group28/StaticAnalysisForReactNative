package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abnd  reason: default package */
/* loaded from: classes.dex */
public class abnd extends abnb {
    private final acte j;
    private final ajnj k;
    private final ajmr l;
    private final LinearLayout m;

    public abnd(Context context, acth acthVar, aafo aafoVar, ajmr ajmrVar) {
        super(context, acthVar, aafoVar);
        this.j = new acte(actj.PDG_LIVE_CHAT_TICKER_PAID_STICKER);
        this.k = akel.o(ajmrVar, this.c);
        this.l = ajmrVar;
        this.m = (LinearLayout) this.b.findViewById(R.id.thumbnail_holder);
    }

    @Override // defpackage.abnb
    public final void d(avhn avhnVar) {
        this.k.k(avhnVar);
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ int f(Object obj) {
        assz asszVar = (assz) obj;
        return 0;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ int g(Object obj) {
        return ((assz) obj).e;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ int h(Object obj) {
        return ((assz) obj).d;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ long i(Object obj) {
        return TimeUnit.SECONDS.toMillis(((assz) obj).f);
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ long j(Object obj) {
        return TimeUnit.SECONDS.toMillis(((assz) obj).g);
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ Spanned k(Object obj) {
        assz asszVar = (assz) obj;
        return null;
    }

    @Override // defpackage.abnb
    protected final acte l() {
        return this.j;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ apzg m(Object obj) {
        apzg apzgVar = ((assz) obj).h;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    @Override // defpackage.abnb
    protected final /* bridge */ /* synthetic */ avhn n(Object obj) {
        avhn avhnVar = ((assz) obj).c;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    @Override // defpackage.abnb, defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        assz asszVar = (assz) obj;
        super.oK(ajrsVar, asszVar);
        if (asszVar.j.size() != 0) {
            for (avhn avhnVar : asszVar.j) {
                ImageView imageView = new ImageView(this.a);
                aovs aovsVar = avhnVar.d;
                if (aovsVar == null) {
                    aovsVar = aovs.a;
                }
                if ((aovsVar.b & 1) != 0) {
                    aovr aovrVar = aovsVar.c;
                    if (aovrVar == null) {
                        aovrVar = aovr.a;
                    }
                    imageView.setContentDescription(aovrVar.c);
                }
                int dimension = (int) this.a.getResources().getDimension(R.dimen.live_chat_ticker_thumbnail_size);
                this.m.setVisibility(0);
                this.m.addView(imageView, dimension, dimension);
                akel.o(this.l, imageView).k(avhnVar);
            }
            this.d.setVisibility(8);
        }
    }

    @Override // defpackage.abnb, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.k.a();
        this.m.removeAllViews();
        this.m.setVisibility(8);
        this.d.setVisibility(0);
    }
}
