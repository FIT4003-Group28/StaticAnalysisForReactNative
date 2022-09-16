package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: lux  reason: default package */
/* loaded from: classes3.dex */
public final class lux extends fse implements View.OnClickListener, frx, fsm {
    public View.OnLongClickListener a;
    private final akfb b;
    private final LayoutInflater c;
    private final Resources d;
    private final acti e;
    private final apoj f;
    private final aafo g;
    private final ajxz h;
    private final akfw i;
    private final List j;
    private ImageView k;
    private String l;
    private int m;
    private View n;
    private mdt o;
    private final lyb p;

    public lux(aafo aafoVar, ajxz ajxzVar, akfb akfbVar, Context context, lya lyaVar, akfw akfwVar, acti actiVar, apoj apojVar, List list) {
        this.b = akfbVar;
        this.c = LayoutInflater.from(context);
        this.d = context.getResources();
        this.g = aafoVar;
        this.h = ajxzVar;
        this.i = akfwVar;
        this.e = actiVar;
        this.f = apojVar;
        this.p = lyaVar.b();
        this.j = list;
    }

    @Override // defpackage.frx
    public final void a(yzh yzhVar, int i) {
        if (i == zhn.d(this.k.getContext(), R.attr.ytIconActiveOther)) {
            ImageView imageView = this.k;
            imageView.setImageDrawable(yzhVar.b(imageView.getDrawable(), zhn.d(this.k.getContext(), R.attr.ytTextPrimary)));
            return;
        }
        ImageView imageView2 = this.k;
        imageView2.setImageDrawable(yzhVar.b(imageView2.getDrawable(), i));
    }

    @Override // defpackage.fse
    public final int b() {
        return this.p.a + 1000;
    }

    @Override // defpackage.fse
    public final CharSequence c() {
        aovs aovsVar = this.f.s;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        aovr aovrVar = aovsVar.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        if ((aovrVar.b & 2) != 0) {
            aovs aovsVar2 = this.f.s;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar2 = aovsVar2.c;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            return aovrVar2.c;
        }
        aovr aovrVar3 = this.f.r;
        if (aovrVar3 == null) {
            aovrVar3 = aovr.a;
        }
        if ((aovrVar3.b & 2) == 0) {
            return null;
        }
        aovr aovrVar4 = this.f.r;
        if (aovrVar4 == null) {
            aovrVar4 = aovr.a;
        }
        return aovrVar4.c;
    }

    @Override // defpackage.fse
    public final List d() {
        return this.j;
    }

    @Override // defpackage.fse
    public final void e(aynx aynxVar) {
        final mdt mdtVar = this.o;
        aypg aypgVar = mdtVar.c;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            mdtVar.c = null;
        }
        mdtVar.c = aynxVar.Z(new ayqb() { // from class: mds
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                String format;
                mdt mdtVar2 = mdt.this;
                agcf agcfVar = (agcf) obj;
                boolean z = false;
                if (mdtVar2.b.a() != null) {
                    if (agcfVar.c || agcfVar.b <= 0) {
                        zag.o(mdtVar2.b.a(), false);
                    } else {
                        zag.o(mdtVar2.b.a(), true);
                        TextView textView = (TextView) mdtVar2.b.a();
                        if (agcfVar.b <= 9) {
                            format = String.format(Locale.getDefault(), "%d", Integer.valueOf(agcfVar.b));
                        } else {
                            format = String.format(Locale.getDefault(), "%d+", 9);
                        }
                        textView.setText(format);
                    }
                }
                if (mdtVar2.a.a() != null) {
                    if (agcfVar.c || agcfVar.b > 0 || !agcfVar.a) {
                        z = true;
                    }
                    zag.o(mdtVar2.a.a(), !z);
                }
            }
        });
    }

    @Override // defpackage.fse
    public final boolean f() {
        return true;
    }

    @Override // defpackage.fry
    public final int g() {
        return this.p.a();
    }

    @Override // defpackage.fse, defpackage.fry
    public final int h() {
        return 0;
    }

    @Override // defpackage.fry
    public final frx i() {
        return this;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        argj argjVar;
        if (this.n == null) {
            View inflate = this.c.inflate(R.layout.mobile_topbar_button_item, (ViewGroup) null, false);
            this.n = inflate;
            this.k = (ImageView) inflate.findViewById(R.id.menu_item_view);
            this.o = new mdt(zap.b((ViewStub) this.n.findViewById(R.id.new_content_dot), View.class), zap.b((ViewStub) this.n.findViewById(R.id.new_content_count), TextView.class));
        }
        menuItem.setShowAsAction(2);
        ajxz ajxzVar = this.h;
        arhs arhsVar = this.f.g;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        this.k.setImageDrawable(this.d.getDrawable(ajxzVar.a(b)));
        this.k.setContentDescription(c());
        this.k.setOnClickListener(this);
        View.OnLongClickListener onLongClickListener = this.a;
        if (onLongClickListener != null) {
            this.k.setOnLongClickListener(onLongClickListener);
        }
        menuItem.setActionView(this.n);
        apoj apojVar = this.f;
        if ((apojVar.b & 4096) != 0) {
            argl arglVar = apojVar.m;
            if (arglVar == null) {
                arglVar = argl.a;
            }
            if (arglVar.b == 102716411) {
                akfb akfbVar = this.b;
                argl arglVar2 = this.f.m;
                if (arglVar2 == null) {
                    arglVar2 = argl.a;
                }
                if (arglVar2.b == 102716411) {
                    argjVar = (argj) arglVar2.c;
                } else {
                    argjVar = argj.a;
                }
                ImageView imageView = this.k;
                argl arglVar3 = this.f.m;
                if (arglVar3 == null) {
                    arglVar3 = argl.a;
                }
                akfbVar.b(argjVar, imageView, arglVar3, this.e);
            }
        }
        apoj apojVar2 = this.f;
        if ((apojVar2.b & 2048) != 0) {
            this.i.d(apojVar2.k, this.k);
        }
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fry
    public final boolean m() {
        return false;
    }

    @Override // defpackage.fsm
    public final void n(String str) {
        this.l = str;
    }

    @Override // defpackage.fsm
    public final void o() {
        this.m = 10349;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apoj apojVar = this.f;
        if ((apojVar.b & 1048576) != 0) {
            this.e.H(3, new acte(apojVar.t), null);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("parent_csn", this.l);
        hashMap.put("parent_ve_type", Integer.valueOf(this.m));
        apoj apojVar2 = this.f;
        if ((apojVar2.b & 32768) != 0) {
            aafo aafoVar = this.g;
            apzg apzgVar = apojVar2.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        }
        apoj apojVar3 = this.f;
        if ((apojVar3.b & 8192) != 0) {
            aafo aafoVar2 = this.g;
            apzg apzgVar2 = apojVar3.n;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.c(apzgVar2, hashMap);
        }
        apoj apojVar4 = this.f;
        if ((apojVar4.b & 16384) != 0) {
            aafo aafoVar3 = this.g;
            apzg apzgVar3 = apojVar4.o;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            aafoVar3.c(apzgVar3, hashMap);
        }
    }
}
