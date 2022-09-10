package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.photos.ui.common.RoundedImageView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: culc  reason: default package */
/* loaded from: classes5.dex */
public final class culc extends FrameLayout implements cvdc {
    public final int a;
    public final int b;
    public String c;
    public cukr e;
    public final RoundedImageView f;
    public final ImageView g;
    public culb h;
    private static final dehp i = cstu.b().a;
    public static final Handler d = new Handler(Looper.getMainLooper());

    public culc(Context context) {
        super(context);
        this.c = null;
        inflate(getContext(), R.layout.photo_message_content_layout, this);
        this.f = (RoundedImageView) findViewById(R.id.photo_content_image);
        this.g = (ImageView) findViewById(R.id.photos_icon);
        this.a = (int) getResources().getDimension(R.dimen.photos_bubble_cell_min_dim);
        this.b = (int) getResources().getDimension(R.dimen.photos_bubble_cell_max_dim);
        this.h = cukx.a;
    }

    private final void c(cukp cukpVar) {
        Bitmap a = cums.a(null, cukpVar.d(), cukpVar.e(), this.a, this.b);
        a.eraseColor(akm.c(getContext(), R.color.missing_thumbnail_color));
        this.f.setImageBitmap(a);
        this.g.setVisibility(0);
    }

    @Override // defpackage.cvdc
    public final void a(final cugu cuguVar) {
        this.c = cuguVar.a();
        final dbsg<cukp> b = cuiq.b(cuguVar);
        if (b.a()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd, yyyy HH:mm:ss", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            String format = simpleDateFormat.format(new Date(TimeUnit.MICROSECONDS.toMillis(cuguVar.d().longValue())));
            int o = cuguVar.o();
            int i2 = o - 1;
            if (o == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.f.setContentDescription(getContext().getString(R.string.content_description_photo_message_list_received, format));
            } else if (i2 == 1) {
                this.f.setContentDescription(getContext().getString(R.string.content_description_photo_message_list_sent, format));
            }
            if (b.b().c().a()) {
                this.g.setVisibility(8);
                this.f.setImageBitmap(cums.a(BitmapFactory.decodeByteArray(b.b().c().b(), 0, b.b().c().b().length), b.b().d(), b.b().e(), this.a, this.b));
            } else if (b.b().b() == null || this.e == null) {
                c(b.b());
            } else {
                c(b.b());
                i.a(new Runnable(this, b, cuguVar) { // from class: cuky
                    private final culc a;
                    private final dbsg b;
                    private final cugu c;

                    {
                        this.a = this;
                        this.b = b;
                        this.c = cuguVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        final culc culcVar = this.a;
                        dbsg dbsgVar = this.b;
                        final cugu cuguVar2 = this.c;
                        cukr cukrVar = culcVar.e;
                        Context context = culcVar.getContext();
                        Uri parse = Uri.parse(((cukp) dbsgVar.b()).b());
                        int i3 = culcVar.b;
                        Bitmap a = cukrVar.a(context, parse, i3, i3);
                        if (a != null) {
                            final Bitmap a2 = cums.a(a, ((cukp) dbsgVar.b()).d(), ((cukp) dbsgVar.b()).e(), culcVar.a, culcVar.b);
                            culc.d.post(new Runnable(culcVar, cuguVar2, a2) { // from class: cula
                                private final culc a;
                                private final cugu b;
                                private final Bitmap c;

                                {
                                    this.a = culcVar;
                                    this.b = cuguVar2;
                                    this.c = a2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    culc culcVar2 = this.a;
                                    cugu cuguVar3 = this.b;
                                    Bitmap bitmap = this.c;
                                    if (culcVar2.c.equals(cuguVar3.a())) {
                                        culcVar2.g.setVisibility(8);
                                        culcVar2.f.setImageBitmap(bitmap);
                                    }
                                }
                            });
                        }
                    }
                });
            }
        } else {
            cstl.a("PhotoBubbleCell");
        }
        if (cuguVar.g().equals(cugo.OUTGOING_FAILED_SEND)) {
            this.f.setClickable(false);
        } else {
            this.f.setOnClickListener(new View.OnClickListener(this, cuguVar) { // from class: cukz
                private final culc a;
                private final cugu b;

                {
                    this.a = this;
                    this.b = cuguVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    culc culcVar = this.a;
                    culcVar.h.a(this.b);
                }
            });
        }
    }

    @Override // defpackage.cuww
    public final void b() {
        this.f.setImageDrawable(null);
    }

    public void setCopyEnabled(boolean z) {
    }

    public void setIncomingBackgroundColor(int i2) {
    }

    public void setLinkClickLoggingEnabled(boolean z) {
    }

    public void setOutgoingBackgroundColor(int i2) {
    }

    public void setPhotoClickListener(culb culbVar) {
        this.h = culbVar;
    }

    public void setPresenter(Void r1) {
    }

    @Override // defpackage.cvdc
    public void setRadii(float f, float f2, float f3, float f4) {
        this.f.setRadii(cuwg.a(getContext(), f / 2.0f), cuwg.a(getContext(), f2 / 2.0f), cuwg.a(getContext(), f3 / 2.0f), cuwg.a(getContext(), f4 / 2.0f));
    }

    public void setRichTextEnabled(boolean z) {
    }

    public void setUriLoader(cukr cukrVar) {
        this.e = cukrVar;
    }
}
