package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: aqy  reason: default package */
/* loaded from: classes2.dex */
public class aqy {
    public final Context e;
    public final aqw f;
    public final aqv g = new aqv(this);
    public aqp h;
    public aqo i;
    public boolean j;
    public ara k;
    public boolean l;

    public aqy(Context context, aqw aqwVar) {
        if (context != null) {
            this.e = context;
            if (aqwVar == null) {
                this.f = new aqw(new ComponentName(context, getClass()));
                return;
            } else {
                this.f = aqwVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public final void Nb(aqp aqpVar) {
        arv.a();
        this.h = aqpVar;
    }

    public final void Nc(aqo aqoVar) {
        arv.a();
        if (!Objects.equals(this.i, aqoVar)) {
            this.i = aqoVar;
            if (this.j) {
                return;
            }
            this.j = true;
            this.g.sendEmptyMessage(2);
        }
    }

    public final void Nd(ara araVar) {
        arv.a();
        if (this.k != araVar) {
            this.k = araVar;
            if (this.l) {
                return;
            }
            this.l = true;
            this.g.sendEmptyMessage(1);
        }
    }

    public aqu Nf(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public void a(aqo aqoVar) {
    }

    public aqx b(String str) {
        throw null;
    }

    public aqx Ne(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                throw new IllegalArgumentException("routeGroupId cannot be null");
            }
            return b(str);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }
}
