package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cumn  reason: default package */
/* loaded from: classes5.dex */
public final class cumn implements cuvw {
    public static final Handler e = new Handler(Looper.getMainLooper());
    public final cuiv a;
    public final ConversationId b;
    public final View c;
    public final String d;
    public final ctcu f;
    private final ImageView g;

    public cumn(Context context, ConversationId conversationId, final aqfn aqfnVar, cuiv cuivVar, ctcu ctcuVar) {
        this.b = conversationId;
        this.a = cuivVar;
        this.f = ctcuVar;
        View inflate = View.inflate(context, R.layout.photos_composer_entrypoint, null);
        this.c = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.photos_button);
        this.g = imageView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(akm.c(context, R.color.outgoing_background_color));
        gradientDrawable.setShape(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photos_composer_start_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.photos_composer_vertical_padding);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        imageView.setBackground(new InsetDrawable((Drawable) gradientDrawable, layoutDirection != 0 ? 0 : dimensionPixelSize, dimensionPixelSize2, layoutDirection == 0 ? 0 : dimensionPixelSize, dimensionPixelSize2));
        imageView.setOnClickListener(new View.OnClickListener(aqfnVar) { // from class: cumk
            private final aqfn a;

            {
                this.a = aqfnVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aqfn aqfnVar2 = this.a;
                Handler handler = cumn.e;
                aqfu aqfuVar = aqfnVar2.a;
                if (!aqfuVar.b.aD) {
                    return;
                }
                bbuz m = bbve.m();
                bbva c = bbvb.c();
                ((bbsw) c).a = dbsg.i(aqfuVar.b.Rp(R.string.MESSAGING_PHOTO_PICKER_TITLE));
                m.f(c.a());
                m.e(dwyd.BUSINESS_MESSAGING_COMPOSE_BOX);
                aqfuVar.o.a().k(m.a(), aqfuVar.b);
                cjql cjqlVar = aqfuVar.D;
                if (cjqlVar == null) {
                    return;
                }
                aqfuVar.w.execute(new Runnable(aqfuVar, cjqlVar) { // from class: aqfg
                    private final aqfu a;
                    private final cjql b;

                    {
                        this.a = aqfuVar;
                        this.b = cjqlVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aqfu aqfuVar2 = this.a;
                        aqfuVar2.u.j(this.b, cjtd.a(dtxv.dt));
                    }
                });
            }
        });
        imageView.setElevation(2.0f);
        this.d = context.getString(R.string.photo_message_fallback_text);
    }
}
