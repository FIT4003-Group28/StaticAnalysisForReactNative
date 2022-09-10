package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: atca  reason: default package */
/* loaded from: classes2.dex */
public final class atca {
    public String a;
    public boolean b;
    public boolean c;
    private final Context d;
    private EnumSet<vux> e;
    private final dpec f;

    public atca(Context context, amub amubVar) {
        EnumSet<vux> enumSet;
        String string;
        String str = "";
        this.a = str;
        this.d = context;
        dpec b = amubVar.d.b();
        this.f = b;
        if (b != null) {
            EnumSet<vux> c = vxi.c(amubVar.J);
            this.e = c;
            if (c == null || c.isEmpty()) {
                return;
            }
            dqvj c2 = dqvj.c(b.b);
            if ((c2 == null ? dqvj.DRIVE : c2) != dqvj.DRIVE) {
                dqvj c3 = dqvj.c(b.b);
                if ((c3 == null ? dqvj.DRIVE : c3) != dqvj.TAXICAB) {
                    dqvj c4 = dqvj.c(b.b);
                    if ((c4 == null ? dqvj.DRIVE : c4) != dqvj.TWO_WHEELER) {
                        this.e.remove(vux.AVOID_HIGHWAYS);
                        this.e.remove(vux.AVOID_TOLLS);
                    }
                }
            }
            if (this.e.isEmpty() || b == null || (enumSet = this.e) == null) {
                return;
            }
            boolean z = true;
            boolean z2 = enumSet.contains(vux.AVOID_TOLLS) && vxp.c(b);
            boolean z3 = this.e.contains(vux.AVOID_FERRIES) && vxp.d(b);
            if (z2 && z3) {
                string = context.getString(R.string.COULDNT_AVOID_TOLLS_FERRIES);
            } else if (z2) {
                string = context.getString(R.string.COULDNT_AVOID_TOLLS);
            } else {
                string = z3 ? context.getString(R.string.COULDNT_AVOID_FERRIES) : str;
            }
            boolean z4 = !string.isEmpty();
            this.b = z4;
            if (z4) {
                this.a = string;
            }
            if (!this.e.contains(vux.AVOID_HIGHWAYS) || !this.e.contains(vux.AVOID_TOLLS) || !this.e.contains(vux.AVOID_FERRIES)) {
                if (!this.e.contains(vux.AVOID_HIGHWAYS) || !this.e.contains(vux.AVOID_TOLLS)) {
                    if (!this.e.contains(vux.AVOID_HIGHWAYS) || !this.e.contains(vux.AVOID_FERRIES)) {
                        if (!this.e.contains(vux.AVOID_TOLLS) || !this.e.contains(vux.AVOID_FERRIES)) {
                            if (this.e.contains(vux.AVOID_HIGHWAYS)) {
                                str = context.getString(R.string.AVOIDING_HIGHWAYS);
                            } else if (this.e.contains(vux.AVOID_TOLLS)) {
                                str = context.getString(R.string.AVOIDING_TOLLS);
                            } else if (this.e.contains(vux.AVOID_FERRIES)) {
                                str = context.getString(R.string.AVOIDING_FERRIES);
                            }
                        } else {
                            str = context.getString(R.string.AVOIDING_TOLLS_FERRIES);
                        }
                    } else {
                        str = context.getString(R.string.AVOIDING_HIGHWAYS_FERRIES);
                    }
                } else {
                    str = context.getString(R.string.AVOIDING_HIGHWAYS_TOLLS);
                }
            } else {
                str = context.getString(R.string.AVOIDING_HIGHWAYS_TOLLS_FERRIES);
            }
            this.c = (((z2 || z3) && !this.e.contains(vux.AVOID_HIGHWAYS) && ((!z2 || !this.e.contains(vux.AVOID_FERRIES)) && (!z3 || !this.e.contains(vux.AVOID_TOLLS)))) || str.isEmpty()) ? false : z;
            if (str.isEmpty() || this.b) {
                return;
            }
            this.a = str;
        }
    }
}
