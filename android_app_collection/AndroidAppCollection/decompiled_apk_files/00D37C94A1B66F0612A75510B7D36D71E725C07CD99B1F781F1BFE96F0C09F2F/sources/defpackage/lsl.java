package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.ScrollToTopLinearLayoutManager;
import com.google.android.apps.youtube.app.ui.SearchEditText;
import com.google.android.youtube.R;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: lsl  reason: default package */
/* loaded from: classes3.dex */
public final class lsl extends ajsl {
    public final Context a;
    public final ViewGroup b;
    public final SearchEditText c;
    public final TextView d;
    public final Animation e;
    public boolean f;
    public CharSequence g;
    public lse h;
    boolean i;
    private final ajxz j;
    private final yni k;
    private final ImageView l;
    private final ImageView m;
    private final Animation n;
    private boolean o;
    private auov p;
    private String q;

    public lsl(Context context, ajxz ajxzVar, yni yniVar) {
        this.a = context;
        this.j = ajxzVar;
        this.k = yniVar;
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.search_box, null);
        this.b = viewGroup;
        SearchEditText searchEditText = (SearchEditText) viewGroup.findViewById(R.id.search_edit_text);
        this.c = searchEditText;
        searchEditText.addTextChangedListener(new lsi(this));
        searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lsh
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                lsl lslVar = lsl.this;
                if (i == 3) {
                    lslVar.h(false);
                    return true;
                }
                return false;
            }
        });
        searchEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: lsg
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                lsl lslVar = lsl.this;
                if (z) {
                    if (lslVar.h != null && !zdg.e(lslVar.a)) {
                        ((ScrollToTopLinearLayoutManager) lslVar.h.b.n).c = false;
                    }
                    if (lslVar.i) {
                        return;
                    }
                    lslVar.d.setVisibility(4);
                    lslVar.d.startAnimation(lslVar.e);
                    lslVar.i = true;
                }
            }
        });
        this.l = (ImageView) viewGroup.findViewById(R.id.search_icon);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.clear);
        this.m = imageView;
        imageView.setOnClickListener(new lsf(this, 1));
        TextView textView = (TextView) viewGroup.findViewById(R.id.cancel);
        this.d = textView;
        textView.setOnClickListener(new lsf(this));
        zag.k(textView, textView.getBackground());
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.search_cancel_show);
        this.e = loadAnimation;
        loadAnimation.setAnimationListener(new lsj(this, 1));
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.search_cancel_hide);
        this.n = loadAnimation2;
        loadAnimation2.setAnimationListener(new lsj(this));
        this.i = false;
    }

    private final void k() {
        this.c.setText(this.g);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        auov auovVar = (auov) obj;
        auov auovVar2 = this.p;
        if (auovVar2 == null || auovVar2 != auovVar) {
            if ((auovVar.b & 8) != 0) {
                arag aragVar = auovVar.e;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                this.g = ajgl.b(aragVar);
                this.f = true;
            } else {
                this.g = "";
                this.f = false;
            }
            k();
        }
        if ((auovVar.b & 16) != 0) {
            SearchEditText searchEditText = this.c;
            arag aragVar2 = auovVar.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            searchEditText.setHint(ajgl.b(aragVar2));
            SearchEditText searchEditText2 = this.c;
            arag aragVar3 = auovVar.f;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            searchEditText2.setContentDescription(ajgl.b(aragVar3));
        }
        this.l.setVisibility(8);
        auow auowVar = auovVar.c;
        if (auowVar == null) {
            auowVar = auow.a;
        }
        if ((auowVar.b & 1) != 0) {
            auow auowVar2 = auovVar.c;
            if (auowVar2 == null) {
                auowVar2 = auow.a;
            }
            apoj apojVar = auowVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 32) != 0) {
                ImageView imageView = this.l;
                ajxz ajxzVar = this.j;
                arhs arhsVar = apojVar.g;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                imageView.setImageResource(ajxzVar.a(b));
                this.l.setVisibility(0);
            }
        }
        this.o = false;
        auou auouVar = auovVar.d;
        if (auouVar == null) {
            auouVar = auou.a;
        }
        if ((auouVar.b & 1) != 0) {
            auou auouVar2 = auovVar.d;
            if (auouVar2 == null) {
                auouVar2 = auou.a;
            }
            apoj apojVar2 = auouVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            if ((apojVar2.b & 32) != 0) {
                ImageView imageView2 = this.m;
                ajxz ajxzVar2 = this.j;
                arhs arhsVar2 = apojVar2.g;
                if (arhsVar2 == null) {
                    arhsVar2 = arhs.a;
                }
                arhr b2 = arhr.b(arhsVar2.c);
                if (b2 == null) {
                    b2 = arhr.UNKNOWN;
                }
                imageView2.setImageResource(ajxzVar2.a(b2));
                this.o = true;
                aovs aovsVar = apojVar2.s;
                if (aovsVar == null) {
                    aovsVar = aovs.a;
                }
                aovr aovrVar = aovsVar.c;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                if ((aovrVar.b & 2) != 0) {
                    ImageView imageView3 = this.m;
                    aovs aovsVar2 = apojVar2.s;
                    if (aovsVar2 == null) {
                        aovsVar2 = aovs.a;
                    }
                    aovr aovrVar2 = aovsVar2.c;
                    if (aovrVar2 == null) {
                        aovrVar2 = aovr.a;
                    }
                    imageView3.setContentDescription(aovrVar2.c);
                }
            }
        }
        j();
        i();
        lse c = lse.c(ajrsVar);
        this.h = c;
        if (c != null) {
            c.e = this;
            this.q = c.d;
        }
        this.p = auovVar;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auov) obj).g.I();
    }

    public final void f() {
        if (this.i) {
            this.d.startAnimation(this.n);
            this.i = false;
        }
    }

    public final void g() {
        this.g = "";
        k();
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(boolean z) {
        if (this.c.getEditableText().length() != 0 || z) {
            zag.i(this.c);
            lse lseVar = this.h;
            if (lseVar != null) {
                lseVar.d();
            }
            this.k.f(new lsk(this.c.getEditableText().toString(), this.q));
        }
    }

    public final void i() {
        this.d.clearAnimation();
        if (this.g.length() > 0 || this.f) {
            this.d.setVisibility(0);
            this.i = true;
            return;
        }
        this.d.setVisibility(8);
        this.i = false;
    }

    public final void j() {
        zfx d;
        if (!this.o) {
            this.m.setImageAlpha(0);
            this.m.setVisibility(8);
            return;
        }
        this.m.setVisibility(0);
        if (this.c.getEditableText().length() == 0) {
            d = zgd.d(16, R.id.cancel);
            this.m.setImageAlpha(0);
            this.m.setClickable(false);
        } else {
            d = zgd.d(16, R.id.clear);
            this.m.setImageAlpha(PrivateKeyType.INVALID);
            this.m.setClickable(true);
        }
        zgd.t(this.c, d, RelativeLayout.LayoutParams.class);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
