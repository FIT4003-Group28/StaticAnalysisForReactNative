package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nel  reason: default package */
/* loaded from: classes3.dex */
public final class nel extends nez {
    public final ViewGroup a;
    private final Context b;
    private final mqy c;
    private final akem d;
    private final bnk e;
    private mqx f;
    private mqx g;
    private mqx h;
    private mqx i;
    private final aacz m;

    public nel(Context context, mqy mqyVar, akem akemVar, aacz aaczVar) {
        this.b = context;
        this.c = mqyVar;
        this.d = akemVar;
        this.m = aaczVar;
        this.a = new FrameLayout(context);
        bne bneVar = new bne();
        bneVar.y(R.id.channel_subscribers);
        bneVar.y(R.id.channel_subscribers_long);
        this.e = bneVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.nez
    protected final void d() {
        int aT;
        auxc auxcVar = (auxc) this.k;
        ajrs ajrsVar = this.j;
        ateb atebVar = auxcVar.m;
        if (atebVar == null) {
            atebVar = ateb.a;
        }
        if (atebVar.b == 65153809) {
            mqx mqxVar = this.h;
            if (mqxVar == null) {
                if (eog.am(this.m)) {
                    this.h = this.c.a(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_with_sponsorship_reduced_margins, this.a, false));
                } else {
                    this.h = this.c.a(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_with_sponsorship, this.a, false));
                }
                mqxVar = this.h;
            }
            this.f = mqxVar;
        } else {
            int i = auxcVar.b;
            if ((i & 4) != 0 || ((i & 32768) != 0 && (aT = awwc.aT(auxcVar.n)) != 0 && aT == 3)) {
                mqx mqxVar2 = this.i;
                if (mqxVar2 == null) {
                    if (eog.am(this.m)) {
                        this.i = this.c.a(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_autotagging_reduced_margins, this.a, false));
                    } else {
                        this.i = this.c.a(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_autotagging, this.a, false));
                    }
                    mqxVar2 = this.i;
                }
                this.f = mqxVar2;
            } else {
                mqx mqxVar3 = this.g;
                if (mqxVar3 == null) {
                    if (eog.am(this.m)) {
                        this.g = this.c.a(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_default_reduced_margins, this.a, false));
                    } else {
                        this.g = this.c.a(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_default, this.a, false));
                    }
                    View findViewById = this.g.a.findViewById(R.id.channel_navigation_container);
                    if (findViewById != null) {
                        this.d.b(findViewById, this.d.a(findViewById, null));
                    }
                    mqxVar3 = this.g;
                }
                this.f = mqxVar3;
            }
        }
        this.k = this.f.d(auxcVar.mo52toBuilder(), this.l.f, ajrsVar.a, (akaf) ajrsVar.c("sectionListController"));
        this.a.removeAllViews();
        this.a.addView(this.f.a);
    }

    @Override // defpackage.nez
    protected final void e() {
        bno.c(this.a);
        mqx mqxVar = this.f;
        if (mqxVar != null) {
            mqxVar.a();
        }
        mqx mqxVar2 = this.g;
        if (mqxVar2 != null) {
            mqxVar2.a();
        }
        mqx mqxVar3 = this.h;
        if (mqxVar3 != null) {
            mqxVar3.a();
        }
        mqx mqxVar4 = this.i;
        if (mqxVar4 != null) {
            mqxVar4.a();
        }
    }

    @Override // defpackage.nez, defpackage.odj
    public final void oT() {
        bno.b(this.a, this.e);
        ajrs ajrsVar = this.j;
        this.k = this.f.d(((auxc) this.k).mo52toBuilder(), this.l.f, ajrsVar.a, (akaf) ajrsVar.c("sectionListController"));
    }
}
