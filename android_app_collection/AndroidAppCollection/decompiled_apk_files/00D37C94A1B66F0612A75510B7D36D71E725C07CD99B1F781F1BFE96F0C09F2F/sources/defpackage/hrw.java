package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: hrw  reason: default package */
/* loaded from: classes3.dex */
public final class hrw implements View.OnTouchListener, hvm {
    public final ajmy b;
    public final ajmu c;
    public final Activity d;
    public ViewGroup e;
    public hrv f;
    public axbm g;
    public View h;
    public View i;
    public View j;
    public View.OnLayoutChangeListener k;
    private final ajmw n;
    private final hpx o;
    private final hpx p;
    private final List q;
    private boolean r;
    private AnimatorSet s;
    public static final znz l = new znz();
    private static final amup m = amup.l(axaa.COMMENT_NORMAL, Integer.valueOf((int) R.style.NormalDynamicSticker), axaa.COMMENT_LIGHT, Integer.valueOf((int) R.style.LightDynamicSticker));
    public static final axaa a = axaa.COMMENT_NORMAL;

    public hrw(Activity activity, ajmy ajmyVar, hrv hrvVar) {
        hrs hrsVar = new hrs(this);
        this.n = hrsVar;
        ajmt a2 = ajmu.a();
        a2.c = hrsVar;
        a2.b(2131232295);
        this.c = a2.a();
        hrt hrtVar = new hrt(this, 1);
        this.o = hrtVar;
        hrt hrtVar2 = new hrt(this);
        this.p = hrtVar2;
        this.q = Arrays.asList(hrtVar, hrtVar2);
        this.d = activity;
        this.b = ajmyVar;
        this.f = hrvVar;
    }

    private static Rect f(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    private final void g(boolean z) {
        this.s = hqb.c(this.q, z, this.s, true != z ? 70L : 150L);
    }

    @Override // defpackage.hvm
    public final void a(axaj axajVar) {
    }

    public final axbl c(zqz zqzVar) {
        awzy awzyVar;
        awzy awzyVar2;
        axbk i = this.g.i();
        if (i.c == 4) {
            awzyVar = (awzy) i.d;
        } else {
            awzyVar = awzy.a;
        }
        awzs awzsVar = awzyVar.c;
        if (awzsVar == null) {
            awzsVar = awzs.a;
        }
        aopa mo52toBuilder = awzsVar.mo52toBuilder();
        String str = zqzVar.c;
        mo52toBuilder.copyOnWrite();
        awzs awzsVar2 = (awzs) mo52toBuilder.instance;
        str.getClass();
        awzsVar2.b = 1;
        awzsVar2.c = str;
        axbk i2 = this.g.i();
        if (i2.c == 4) {
            awzyVar2 = (awzy) i2.d;
        } else {
            awzyVar2 = awzy.a;
        }
        aopa mo52toBuilder2 = awzyVar2.mo52toBuilder();
        mo52toBuilder2.copyOnWrite();
        awzy awzyVar3 = (awzy) mo52toBuilder2.instance;
        awzs awzsVar3 = (awzs) mo52toBuilder.mo39build();
        awzsVar3.getClass();
        awzyVar3.c = awzsVar3;
        awzyVar3.b |= 1;
        aopa mo52toBuilder3 = this.g.i().mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        axbk axbkVar = (axbk) mo52toBuilder3.instance;
        awzy awzyVar4 = (awzy) mo52toBuilder2.mo39build();
        awzyVar4.getClass();
        axbkVar.d = awzyVar4;
        axbkVar.c = 4;
        axbl axblVar = (axbl) this.g.mo52toBuilder();
        axblVar.copyOnWrite();
        ((axbm) axblVar.instance).F((axbk) mo52toBuilder3.mo39build());
        return axblVar;
    }

    public final void d(axaa axaaVar) {
        awzy awzyVar;
        axbk i = this.g.i();
        if (i.c == 4) {
            awzyVar = (awzy) i.d;
        } else {
            awzyVar = awzy.a;
        }
        axbl axblVar = (axbl) this.g.mo52toBuilder();
        aopa mo52toBuilder = this.g.i().mo52toBuilder();
        aopa mo52toBuilder2 = awzyVar.mo52toBuilder();
        awzx awzxVar = awzyVar.g;
        if (awzxVar == null) {
            awzxVar = awzx.b;
        }
        aopa mo52toBuilder3 = awzxVar.mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        awzx awzxVar2 = (awzx) mo52toBuilder3.instance;
        awzxVar2.d = axaaVar.d;
        awzxVar2.c |= 1;
        mo52toBuilder2.copyOnWrite();
        awzy awzyVar2 = (awzy) mo52toBuilder2.instance;
        awzx awzxVar3 = (awzx) mo52toBuilder3.mo39build();
        awzxVar3.getClass();
        awzyVar2.g = awzxVar3;
        awzyVar2.b |= 16;
        mo52toBuilder.copyOnWrite();
        axbk axbkVar = (axbk) mo52toBuilder.instance;
        awzy awzyVar3 = (awzy) mo52toBuilder2.mo39build();
        awzyVar3.getClass();
        axbkVar.d = awzyVar3;
        axbkVar.c = 4;
        axblVar.copyOnWrite();
        ((axbm) axblVar.instance).F((axbk) mo52toBuilder.mo39build());
        this.g = (axbm) axblVar.mo39build();
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.d, ((Integer) m.get(axaaVar)).intValue())).inflate(R.layout.comment_sticker, (ViewGroup) null, false);
        this.h = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.author);
        TextView textView2 = (TextView) this.h.findViewById(R.id.comment);
        textView2.setText(awzyVar.d);
        textView.setText(awzyVar.e);
        textView.setAccessibilityTraversalAfter(R.id.reel_camera_close);
        textView2.setAccessibilityTraversalAfter(R.id.author);
    }

    public final void e() {
        Rect f;
        this.e.setVisibility(0);
        Rect f2 = f(this.e);
        float height = f.height() / Math.min(f2.width(), f2.height());
        float exactCenterY = f(this.h).exactCenterY();
        float exactCenterY2 = f2.exactCenterY();
        int height2 = f2.height();
        Matrix matrix = new Matrix();
        matrix.setTranslate(0.0f, (exactCenterY - exactCenterY2) / height2);
        matrix.preScale(height, height, 0.5f, 0.5f);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        aopa createBuilder = aotm.a.createBuilder();
        createBuilder.copyOnWrite();
        aotm.a((aotm) createBuilder.instance);
        createBuilder.copyOnWrite();
        aotm.b((aotm) createBuilder.instance);
        createBuilder.copyOnWrite();
        aotm aotmVar = (aotm) createBuilder.instance;
        aotmVar.f = 1;
        aotmVar.b |= 4;
        for (int i = 0; i < 9; i++) {
            createBuilder.U(fArr[i]);
        }
        final aotm aotmVar2 = (aotm) createBuilder.mo39build();
        final ViewGroup viewGroup = (ViewGroup) this.h.getParent();
        final ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        int width = this.h.getWidth();
        int height3 = this.h.getHeight();
        viewGroup.removeView(this.h);
        zgd.u(this.h, new zfr(width, height3, 1), zgd.s(width, height3), ViewGroup.LayoutParams.class);
        final Bitmap c = aakr.c(this.d, this.h);
        aakr.e(this.d, c, new zov() { // from class: hrr
            @Override // defpackage.zov
            public final void a(zqz zqzVar) {
                hrw hrwVar = hrw.this;
                Bitmap bitmap = c;
                ViewGroup.LayoutParams layoutParams2 = layoutParams;
                ViewGroup viewGroup2 = viewGroup;
                aotm aotmVar3 = aotmVar2;
                if (hrwVar.d.isFinishing() || hrwVar.d.isDestroyed()) {
                    return;
                }
                bitmap.recycle();
                hrwVar.h.setLayoutParams(layoutParams2);
                viewGroup2.addView(hrwVar.h);
                axbl c2 = hrwVar.c(zqzVar);
                c2.copyOnWrite();
                ((axbm) c2.instance).E(aotmVar3);
                aahp.g(c2, zqzVar);
                hrwVar.f.a((axbm) c2.mo39build());
            }
        });
    }

    @Override // defpackage.hvm
    public final void mt(axbm axbmVar) {
        awzy awzyVar;
        this.g = axbmVar;
        axbk i = axbmVar.i();
        if (i.c == 4) {
            awzyVar = (awzy) i.d;
        } else {
            awzyVar = awzy.a;
        }
        awzx awzxVar = awzyVar.g;
        if (awzxVar == null) {
            awzxVar = awzx.b;
        }
        aops aopsVar = new aops(awzxVar.e, awzx.a);
        awzx awzxVar2 = awzyVar.g;
        if (awzxVar2 == null) {
            awzxVar2 = awzx.b;
        }
        axaa b = axaa.b(awzxVar2.d);
        if (b == null) {
            b = axaa.COMMENT_STYLE_UNSPECIFIED;
        }
        d((axaa) htj.a(aopsVar, b));
        zgd.v(this.h, this.g.c(), this.g.a());
        zov zovVar = new zov() { // from class: hrq
            @Override // defpackage.zov
            public final void a(zqz zqzVar) {
                hrw hrwVar = hrw.this;
                if (hrwVar.d.isFinishing() || hrwVar.d.isDestroyed()) {
                    return;
                }
                axbl c = hrwVar.c(zqzVar);
                aahp.g(c, zqzVar);
                hrwVar.f.a((axbm) c.mo39build());
            }
        };
        Uri j = zgt.j(awzyVar.f);
        ImageView imageView = (ImageView) this.h.findViewById(R.id.author_avatar);
        imageView.setImageDrawable(this.d.getResources().getDrawable(2131232295));
        this.b.l(j, new hru(this, imageView, zovVar));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view == this.h) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.r) {
                        g(false);
                        this.r = false;
                        this.h.performClick();
                    }
                    return true;
                } else if (action != 2) {
                    return false;
                }
            }
            if (!this.r) {
                g(true);
                this.r = true;
            }
            return true;
        }
        return false;
    }
}
