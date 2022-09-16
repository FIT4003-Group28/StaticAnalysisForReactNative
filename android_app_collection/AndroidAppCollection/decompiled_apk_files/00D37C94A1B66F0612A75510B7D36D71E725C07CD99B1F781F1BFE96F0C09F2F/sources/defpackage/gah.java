package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gah  reason: default package */
/* loaded from: classes3.dex */
public final class gah implements ajru, ynl {
    public ajyv a;
    private final Context b;
    private final ajrx c;
    private final yni d;
    private final FrameLayout e;
    private final YouTubeTextView f;
    private final View.OnClickListener g;
    private final Drawable h;
    private ProgressBar i;
    private View j;
    private View k;
    private int l;
    private acti m;

    public gah(Context context, ajsn ajsnVar, yni yniVar) {
        this(context, ajsnVar, yniVar, null, null);
    }

    private final void i() {
        zag.o(this.f, false);
    }

    private final void j() {
        View view = this.j;
        if (view != null) {
            zag.o(view, false);
        }
        View view2 = this.k;
        if (view2 != null) {
            zag.o(view2, false);
        }
    }

    private final void k() {
        ProgressBar progressBar = this.i;
        if (progressBar != null) {
            zag.o(progressBar, false);
        }
    }

    private final void l(View view, ajxd ajxdVar, View.OnClickListener onClickListener) {
        ((TextView) view.findViewById(R.id.error_message_text)).setText(ajxdVar.c());
        View findViewById = view.findViewById(R.id.error_retry_button);
        zag.o(findViewById, ajxdVar.d());
        if (true != ajxdVar.d()) {
            onClickListener = null;
        }
        findViewById.setOnClickListener(onClickListener);
        ImageView imageView = (ImageView) view.findViewById(R.id.error_icon);
        if (imageView != null) {
            imageView.setImageDrawable(akf.a(this.b, 1 != ajxdVar.a() ? 2131232477 : 2131232447));
        }
        zag.o(view, true);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((ajsn) this.c).a;
    }

    public final void d(ajwz ajwzVar) {
        if (!ajwzVar.b()) {
            k();
            j();
            zag.o(this.f, true);
            return;
        }
        h();
    }

    @Override // defpackage.ajru
    /* renamed from: e */
    public final void oK(ajrs ajrsVar, ajyv ajyvVar) {
        actj actjVar;
        ajyv ajyvVar2;
        this.m = ajrsVar.a;
        Object obj = ajyvVar.b;
        if (obj != null && ((ajyvVar2 = this.a) == null || ajyvVar2.b != obj)) {
            this.d.m(this);
            this.d.i(this, obj);
        }
        this.a = ajyvVar;
        this.c.d(ajyvVar.c);
        this.f.setText(R.string.load_more_label);
        zgd.t(this.e, zgd.h(-2), ViewGroup.LayoutParams.class);
        this.l = ajrsVar.b("position", -1);
        ajxf ajxfVar = ajyvVar.a;
        if (ajxfVar instanceof ajwz) {
            d((ajwz) ajxfVar);
        } else if (ajxfVar instanceof ajxe) {
            ajxe ajxeVar = (ajxe) ajxfVar;
            h();
            if (this.a != null && this.m != null && ajxeVar.b().h() && ((ajfy.NEXT.a((ajfz) ajxeVar.b().c()) || ajfy.RELOAD.a((ajfz) ajxeVar.b().c())) && ((ajfz) ajxeVar.b().c()).d().length > 0)) {
                aopa createBuilder = awbs.a.createBuilder();
                aoob x = aoob.x(((ajfz) ajxeVar.b().c()).d());
                createBuilder.copyOnWrite();
                awbs awbsVar = (awbs) createBuilder.instance;
                awbsVar.b |= 1;
                awbsVar.c = x;
                awbs awbsVar2 = (awbs) createBuilder.mo39build();
                int ordinal = ((ajfz) ajxeVar.b().c()).a().ordinal();
                if (ordinal == 1) {
                    actjVar = actj.NEXT_CONTINUATION_SPINNER;
                } else if (ordinal == 3) {
                    actjVar = actj.RELOAD_CONTINUATION_SPINNER;
                }
                this.m.o(acun.a(this.m.g(this.a, actjVar)), acun.a(awbsVar2));
            }
        } else if (ajxfVar instanceof ajxd) {
            g((ajxd) ajxfVar);
        }
        this.c.e(ajrsVar);
    }

    public final void g(ajxd ajxdVar) {
        i();
        k();
        j();
        if (ajxdVar.a() == 1) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (this.l >= 2 || !ajfy.RELOAD.a(ajxdVar.b())) {
            if (this.j == null) {
                this.j = ((ViewStub) this.e.findViewById(R.id.error_compact_view_stub)).inflate();
            }
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            l(this.j, ajxdVar, this.g);
            return;
        }
        if (this.k == null) {
            this.k = ((ViewStub) this.e.findViewById(R.id.error_full_view_stub)).inflate();
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        l(this.k, ajxdVar, this.g);
    }

    public final void h() {
        if (this.i == null) {
            ProgressBar progressBar = (ProgressBar) ((ViewStub) this.e.findViewById(R.id.load_progress_stub)).inflate();
            this.i = progressBar;
            Drawable drawable = this.h;
            if (drawable != null) {
                progressBar.setIndeterminateDrawable(drawable);
            }
        }
        i();
        j();
        zag.o(this.i, true);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                d((ajwz) obj);
                return null;
            } else if (i == 1) {
                g((ajxd) obj);
                return null;
            } else if (i == 2) {
                ajxe ajxeVar = (ajxe) obj;
                h();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ajwz.class, ajxd.class, ajxe.class};
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.m(this);
    }

    public gah(Context context, ajsn ajsnVar, yni yniVar, ViewGroup viewGroup, Drawable drawable) {
        this.l = -1;
        this.b = context;
        this.c = ajsnVar;
        this.d = yniVar;
        this.h = drawable;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.loading_status_view, viewGroup, viewGroup != null);
        this.e = frameLayout;
        this.f = (YouTubeTextView) frameLayout.findViewById(R.id.link_item);
        ajsnVar.c(frameLayout);
        this.g = new View.OnClickListener() { // from class: gag
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ajyw ajywVar;
                ajyv ajyvVar = gah.this.a;
                if (ajyvVar == null || (ajywVar = ajyvVar.d) == null) {
                    return;
                }
                ajywVar.lk();
            }
        };
    }
}
