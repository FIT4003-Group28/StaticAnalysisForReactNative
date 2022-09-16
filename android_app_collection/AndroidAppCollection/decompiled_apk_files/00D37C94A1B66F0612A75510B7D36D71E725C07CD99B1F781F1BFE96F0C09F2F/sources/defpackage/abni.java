package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abni  reason: default package */
/* loaded from: classes.dex */
public abstract class abni implements ajru {
    protected final View a;
    protected final Resources b;
    private final Context c;
    private final ajxz d;
    private final TextView e;
    private final ImageView f;
    private final TextView g;
    private View.OnClickListener h;

    public abni(Context context, ajxz ajxzVar) {
        this.c = context;
        ajxzVar.getClass();
        this.d = ajxzVar;
        this.b = context.getResources();
        View inflate = View.inflate(context, d(), null);
        this.a = inflate;
        this.e = (TextView) inflate.findViewById(R.id.live_chat_vem_text);
        this.f = (ImageView) inflate.findViewById(R.id.live_chat_vem_icon);
        this.g = (TextView) inflate.findViewById(R.id.live_chat_vem_button);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    public abstract int d();

    public abstract aafo e();

    public abstract Map f();

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        final asrg asrgVar = (asrg) obj;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: abng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abni abniVar = abni.this;
                asrg asrgVar2 = asrgVar;
                if ((asrgVar2.b & 64) != 0) {
                    aafo e = abniVar.e();
                    apzg apzgVar = asrgVar2.h;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    e.c(apzgVar, null);
                }
            }
        };
        this.h = onClickListener;
        this.a.setOnClickListener(onClickListener);
        if ((asrgVar.b & 16) != 0) {
            arag aragVar = asrgVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            this.e.setText(aafv.a(aragVar, new aafo() { // from class: abnh
                @Override // defpackage.aafo
                public final /* synthetic */ void a(apzg apzgVar) {
                    aafn.a(this, apzgVar);
                }

                @Override // defpackage.aafo
                public final /* synthetic */ void b(List list) {
                    aafn.b(this, list);
                }

                @Override // defpackage.aafo
                public final void c(apzg apzgVar, Map map) {
                    abni abniVar = abni.this;
                    abniVar.e().c(apzgVar, abniVar.f());
                }

                @Override // defpackage.aafo
                public final /* synthetic */ void d(List list, Map map) {
                    aafn.c(this, list, map);
                }

                @Override // defpackage.aafo
                public final /* synthetic */ void e(List list, Object obj2) {
                    aafn.d(this, list, obj2);
                }
            }, false));
            this.e.setVisibility(0);
            this.e.setOnClickListener(this.h);
            this.e.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if ((asrgVar.b & 32) != 0) {
            aunb aunbVar = asrgVar.g;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if ((((apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer)).b & 256) != 0) {
                aunb aunbVar2 = asrgVar.g;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                final apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                TextView textView = this.g;
                arag aragVar2 = apojVar.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                textView.setText(ajgl.b(aragVar2));
                this.g.setOnClickListener(new View.OnClickListener() { // from class: abnf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abni abniVar = abni.this;
                        apoj apojVar2 = apojVar;
                        aafo e = abniVar.e();
                        apzg apzgVar = apojVar2.o;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        e.c(apzgVar, abniVar.f());
                    }
                });
                this.g.setVisibility(0);
            }
        } else {
            this.e.setPadding(0, 0, 0, this.b.getDimensionPixelOffset(R.dimen.live_chat_vem_content_margin_bottom));
        }
        if (asrgVar.c == 3) {
            arhr b = arhr.b(((arhs) asrgVar.d).c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            if (b == arhr.UNKNOWN) {
                return;
            }
            ajxz ajxzVar = this.d;
            arhr b2 = arhr.b((asrgVar.c == 3 ? (arhs) asrgVar.d : arhs.a).c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            if (ajxzVar.a(b2) == 0) {
                return;
            }
            this.f.setVisibility(0);
            Context context = this.c;
            ajxz ajxzVar2 = this.d;
            arhr b3 = arhr.b((asrgVar.c == 3 ? (arhs) asrgVar.d : arhs.a).c);
            if (b3 == null) {
                b3 = arhr.UNKNOWN;
            }
            Drawable a = akf.a(context, ajxzVar2.a(b3));
            if (a != null) {
                arhr b4 = arhr.b((asrgVar.c == 3 ? (arhs) asrgVar.d : arhs.a).c);
                if (b4 == null) {
                    b4 = arhr.UNKNOWN;
                }
                if (b4 == arhr.POLL) {
                    Drawable l = iy.l(a);
                    l.mutate();
                    l.setTint(zhn.d(this.c, R.attr.ytBrandRed));
                    this.f.setImageDrawable(l);
                    return;
                }
            }
            this.f.setImageDrawable(a);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.e.setPadding(0, 0, 0, 0);
    }
}
