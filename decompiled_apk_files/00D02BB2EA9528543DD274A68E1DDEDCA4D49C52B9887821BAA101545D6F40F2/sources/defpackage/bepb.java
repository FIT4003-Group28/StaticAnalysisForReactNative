package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bepb  reason: default package */
/* loaded from: classes3.dex */
public final class bepb implements crzp<apsi<dbsg<List<dfzw>>>> {
    public final /* synthetic */ bepe a;

    public bepb(bepe bepeVar) {
        this.a = bepeVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<apsi<dbsg<List<dfzw>>>> crzmVar) {
        bepe bepeVar;
        apsi<dbsg<List<dfzw>>> l = crzmVar.l();
        if (l == null) {
            return;
        }
        int b = l.b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        }
        if (i == 1) {
            ckos.a(this.a.a.findViewById(16908290), this.a.a.getString(R.string.MERCHANT_PANEL_ERROR_MESSAGE_SNACKBAR), 0).c();
            this.a.h = false;
            this.a.m();
        } else if (i != 2) {
        } else {
            if (!l.a().a() || l.a().b().isEmpty()) {
                this.a.h = false;
                this.a.m();
                return;
            }
            List<dfzw> b2 = l.a().b();
            int size = this.a.f.size() - b2.size();
            bepe bepeVar2 = this.a;
            bgza bgzaVar = bepeVar2.d;
            List<String> list = bepeVar2.f;
            Integer valueOf = Integer.valueOf(size);
            bgzaVar.a(list, valueOf, Integer.valueOf(this.a.f.size() - 1), valueOf, new bepa(this, size, b2), jkn.n);
            this.a.n(size, bepeVar.f.size() - 1, size, b2);
            final bepe bepeVar3 = this.a;
            View o = cqkx.o(bepeVar3);
            if (o == null) {
                return;
            }
            bepeVar3.b.b(o, beku.b, new bgyi(bepeVar3) { // from class: beoz
                private final bepe a;

                {
                    this.a = bepeVar3;
                }

                @Override // defpackage.bgyi
                public final void a() {
                    bepe bepeVar4 = this.a;
                    bepeVar4.h = false;
                    cqkx.p(bepeVar4.g);
                }
            });
        }
    }
}
