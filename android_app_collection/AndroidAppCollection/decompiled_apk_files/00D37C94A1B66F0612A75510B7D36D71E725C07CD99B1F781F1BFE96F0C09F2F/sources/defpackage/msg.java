package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: msg  reason: default package */
/* loaded from: classes3.dex */
public final class msg extends msi {
    public final fmr a;
    public final fmr b;
    final /* synthetic */ msk c;
    private final ViewGroup g;
    private final View h;
    private final ViewGroup i;
    private final ViewGroup j;
    private final ImageView k;
    private final ImageView l;
    private final TextView m;
    private final View n;
    private final View o;
    private final akbj p;
    private final akbj q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msg(msk mskVar) {
        super(mskVar, R.layout.video_feed_entry_top_aligned);
        this.c = mskVar;
        this.g = (ViewGroup) this.d.findViewById(R.id.action_toolbar);
        this.h = this.d.findViewById(R.id.bottom_margin);
        ViewGroup viewGroup = (ViewGroup) this.d.findViewById(R.id.dislike_button);
        this.j = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) this.d.findViewById(R.id.like_button);
        this.i = viewGroup2;
        ImageView imageView = (ImageView) this.d.findViewById(R.id.comment_button);
        this.k = imageView;
        ImageView imageView2 = (ImageView) this.d.findViewById(R.id.live_chat_button);
        this.l = imageView2;
        this.m = (TextView) this.d.findViewById(R.id.comment_count);
        this.n = this.d.findViewById(R.id.contextual_menu_anchor);
        this.o = this.d.findViewById(R.id.down_contextual_menu_anchor);
        this.p = mskVar.h.a(imageView);
        this.q = mskVar.h.a(imageView2);
        this.a = mskVar.g.a(viewGroup2);
        this.b = mskVar.g.a(viewGroup);
    }

    private final void d(boolean z) {
        int i = true != z ? 4 : 0;
        this.k.setVisibility(i);
        this.k.setClickable(z);
        this.m.setVisibility(i);
    }

    private final void e(boolean z) {
        this.l.setVisibility(true != z ? 4 : 0);
        this.l.setClickable(z);
    }

    @Override // defpackage.msi
    public final void a(ajrs ajrsVar) {
        apoj apojVar;
        arag aragVar;
        String str;
        apoj apojVar2;
        apos aposVar;
        apos aposVar2;
        int i;
        View view;
        c(ajrsVar);
        itx itxVar = this.c.o;
        awao awaoVar = itxVar.a().A;
        if (awaoVar == null) {
            awaoVar = awao.a;
        }
        if (awaoVar.b == 65153809) {
            awao awaoVar2 = itxVar.a().A;
            if (awaoVar2 == null) {
                awaoVar2 = awao.a;
            }
            if (awaoVar2.b == 65153809) {
                apojVar = (apoj) awaoVar2.c;
            } else {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        String str2 = "";
        if (apojVar == null) {
            d(false);
        } else {
            this.p.b(apojVar, ajrsVar.a);
            TextView textView = this.m;
            if ((apojVar.b & 256) != 0) {
                aragVar = apojVar.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            ImageView imageView = this.k;
            if ((apojVar.b & 65536) != 0) {
                aovr aovrVar = apojVar.r;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                str = aovrVar.c;
            } else {
                str = str2;
            }
            imageView.setContentDescription(str);
            d(true);
        }
        itx itxVar2 = this.c.o;
        awao awaoVar3 = itxVar2.a().B;
        if (awaoVar3 == null) {
            awaoVar3 = awao.a;
        }
        if (awaoVar3.b == 65153809) {
            awao awaoVar4 = itxVar2.a().B;
            if (awaoVar4 == null) {
                awaoVar4 = awao.a;
            }
            if (awaoVar4.b == 65153809) {
                apojVar2 = (apoj) awaoVar4.c;
            } else {
                apojVar2 = apoj.a;
            }
        } else {
            apojVar2 = null;
        }
        if (apojVar2 == null) {
            e(false);
        } else {
            this.q.b(apojVar2, ajrsVar.a);
            ImageView imageView2 = this.l;
            if ((65536 & apojVar2.b) != 0) {
                aovr aovrVar2 = apojVar2.r;
                if (aovrVar2 == null) {
                    aovrVar2 = aovr.a;
                }
                str2 = aovrVar2.c;
            }
            imageView2.setContentDescription(str2);
            e(true);
        }
        itx itxVar3 = this.c.o;
        awao awaoVar5 = itxVar3.a().y;
        if (awaoVar5 == null) {
            awaoVar5 = awao.a;
        }
        if (awaoVar5.b == 79971800) {
            awao awaoVar6 = itxVar3.a().y;
            if (awaoVar6 == null) {
                awaoVar6 = awao.a;
            }
            if (awaoVar6.b == 79971800) {
                aposVar = (apos) awaoVar6.c;
            } else {
                aposVar = apos.a;
            }
        } else {
            aposVar = null;
        }
        itx itxVar4 = this.c.o;
        awao awaoVar7 = itxVar4.a().z;
        if (awaoVar7 == null) {
            awaoVar7 = awao.a;
        }
        if (awaoVar7.b == 79971800) {
            awao awaoVar8 = itxVar4.a().z;
            if (awaoVar8 == null) {
                awaoVar8 = awao.a;
            }
            if (awaoVar8.b == 79971800) {
                aposVar2 = (apos) awaoVar8.c;
            } else {
                aposVar2 = apos.a;
            }
        } else {
            aposVar2 = null;
        }
        this.a.b(aposVar);
        this.b.b(aposVar2);
        if (aposVar == null || aposVar2 == null) {
            fmr fmrVar = this.a;
            fmrVar.e = null;
            this.b.e = null;
            fmrVar.a();
            this.b.a();
        } else {
            this.a.e = new msf(this, aposVar2, 1);
            this.b.e = new msf(this, aposVar);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.g.getChildCount()) {
                i = 8;
                break;
            } else if (this.g.getChildAt(i2).getVisibility() == 0) {
                i = 0;
                break;
            } else {
                i2++;
            }
        }
        this.g.setVisibility(i);
        this.h.setVisibility(i == 0 ? 8 : 0);
        ajrs ajrsVar2 = new ajrs(ajrsVar);
        ajrsVar2.b = this.c.o.d();
        if (this.g.getVisibility() == 0) {
            this.o.setVisibility(0);
            this.n.setVisibility(8);
            view = this.o;
        } else {
            this.n.setVisibility(0);
            this.o.setVisibility(8);
            view = this.n;
        }
        b(view, ajrsVar2);
    }
}
