package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acmo  reason: default package */
/* loaded from: classes.dex */
public final class acmo implements View.OnClickListener, ajru {
    public final ajmy a;
    public final abtc b;
    public final Handler c;
    private final Context d;
    private final ajxz e;
    private final aafo f;
    private final Executor g;
    private final acmp h;
    private final View i;
    private final View j;
    private final ImageButton k;

    public acmo(Context context, ajmy ajmyVar, ajxz ajxzVar, abtc abtcVar, aafo aafoVar, Executor executor, acmp acmpVar) {
        this.d = context;
        this.c = new Handler(context.getMainLooper());
        this.a = ajmyVar;
        this.e = ajxzVar;
        this.b = abtcVar;
        this.f = aafoVar;
        this.g = executor;
        this.h = acmpVar;
        View inflate = View.inflate(context, R.layout.lc_scheduled_stream_item, null);
        this.i = inflate;
        this.k = (ImageButton) inflate.findViewById(R.id.event_delete);
        this.j = inflate.findViewById(R.id.event_overlay);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.i;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        final atgh atghVar = (atgh) obj;
        if ((atghVar.b & 1) != 0) {
            TextView textView = (TextView) this.i.findViewById(R.id.title);
            arag aragVar = atghVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
        }
        TextView textView2 = (TextView) this.i.findViewById(R.id.date);
        if ((atghVar.b & 2) != 0) {
            arag aragVar2 = atghVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            textView2.setText(ajgl.b(aragVar2));
        }
        if ((atghVar.b & 8) != 0) {
            arhs arhsVar = atghVar.e;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            int a = this.e.a(b);
            if (a != 0) {
                Resources resources = this.d.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lc_scheduled_event_date_drawable_dimensions);
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(new BitmapDrawable(resources, Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, a), dimensionPixelSize, dimensionPixelSize, true)), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        final ImageView imageView = (ImageView) this.i.findViewById(R.id.event_thumbnail);
        if ((atghVar.b & 16) != 0) {
            avhn avhnVar = atghVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            final Uri j = zgt.j(akel.u(avhnVar).c);
            this.g.execute(new Runnable() { // from class: acmk
                @Override // java.lang.Runnable
                public final void run() {
                    acmo acmoVar = acmo.this;
                    atgh atghVar2 = atghVar;
                    Uri uri = j;
                    ImageView imageView2 = imageView;
                    abtc abtcVar = acmoVar.b;
                    aunb aunbVar = atghVar2.h;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    String str = null;
                    if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                        aunb aunbVar2 = atghVar2.h;
                        if (aunbVar2 == null) {
                            aunbVar2 = aunb.a;
                        }
                        apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                        apzg apzgVar = apojVar.n;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        if (apzgVar.qn(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)) {
                            apzg apzgVar2 = apojVar.n;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            DeleteVideoEndpointOuterClass$DeleteVideoEndpoint deleteVideoEndpointOuterClass$DeleteVideoEndpoint = (DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) apzgVar2.qm(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint);
                            if ((deleteVideoEndpointOuterClass$DeleteVideoEndpoint.b & 1) != 0) {
                                str = deleteVideoEndpointOuterClass$DeleteVideoEndpoint.c;
                            }
                        }
                    }
                    abtcVar.d(str, acmoVar.a, uri, abww.a, new acmm(acmoVar, imageView2));
                }
            });
        }
        if ((atghVar.b & 32) != 0) {
            this.j.setOnClickListener(this);
            View view = this.j;
            apzg apzgVar = atghVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            view.setTag(apzgVar);
        }
        aunb aunbVar = atghVar.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = atghVar.h;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
            if ((apojVar.b & 65536) != 0) {
                ImageButton imageButton = this.k;
                aovr aovrVar = apojVar.r;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                imageButton.setContentDescription(aovrVar.c);
            }
            if ((apojVar.b & 32) != 0) {
                ajxz ajxzVar = this.e;
                arhs arhsVar2 = apojVar.g;
                if (arhsVar2 == null) {
                    arhsVar2 = arhs.a;
                }
                arhr b2 = arhr.b(arhsVar2.c);
                if (b2 == null) {
                    b2 = arhr.UNKNOWN;
                }
                int a2 = ajxzVar.a(b2);
                if (a2 != 0) {
                    this.k.setImageDrawable(akf.a(this.d, a2));
                }
            }
            this.k.setTag(apojVar);
            this.k.setOnClickListener(this);
        }
        int i = atghVar.b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar;
        if (view != this.j || !(view.getTag() instanceof apzg)) {
            if (view != this.k || !(view.getTag() instanceof apoj)) {
                return;
            }
            apoj apojVar = (apoj) view.getTag();
            aafo aafoVar = this.f;
            if ((apojVar.b & 16384) != 0) {
                apzgVar = apojVar.o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = apojVar.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            }
            aafoVar.c(apzgVar, this.h.p());
            return;
        }
        this.f.c((apzg) view.getTag(), this.h.p());
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
