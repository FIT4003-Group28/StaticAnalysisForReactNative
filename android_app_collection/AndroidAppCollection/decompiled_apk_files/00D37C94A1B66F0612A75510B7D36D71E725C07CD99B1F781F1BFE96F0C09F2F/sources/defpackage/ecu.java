package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ecu  reason: default package */
/* loaded from: classes3.dex */
public final class ecu implements wlk {
    public final wll a;
    public final wwg b;
    public int c = 0;
    private final wli d;
    private final asaj e;
    private final xdu f;
    private final xci g;
    private final String h;
    private int i;
    private boolean j;

    public ecu(wll wllVar, wli wliVar, wwg wwgVar, asaj asajVar, xdu xduVar, xci xciVar, String str) {
        this.a = wllVar;
        this.d = wliVar;
        this.b = wwgVar;
        this.e = asajVar;
        this.f = xduVar;
        this.g = xciVar;
        this.h = str;
    }

    private final void i() {
        if (this.c != 1) {
            return;
        }
        this.c = 2;
        try {
            wli wliVar = this.d;
            asap asapVar = this.e.g;
            if (asapVar == null) {
                asapVar = asap.a;
            }
            wliVar.d(asapVar.c, this.h);
        } catch (wlb e) {
            wwf.b(this.f, this.g, e.toString());
        }
        this.b.b(6, new afzn[0]);
        this.b.b(1, new afzn[0]);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.wlk
    public final void h(int i, String str) {
        if (this.c == 3) {
            return;
        }
        if (str != null && !TextUtils.equals(str, this.h)) {
            if (this.c != 2) {
                return;
            }
            this.c = 3;
        } else if (i == 2) {
            i();
            if (this.i == 0) {
                this.i = 1;
            } else {
                this.b.a(7, new afzn[0]);
            }
        } else if (i == 3) {
            this.b.a(9, new afzn[0]);
        } else if (i != 7) {
        } else {
            try {
                wli wliVar = this.d;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                asap asapVar = this.e.g;
                if (asapVar == null) {
                    asapVar = asap.a;
                }
                wliVar.e(timeUnit.toMillis(asapVar.e));
            } catch (wlb e) {
                wwf.b(this.f, this.g, e.toString());
            }
            this.b.b(14, new afzn[0]);
            this.b.b(13, new afzn[0]);
            this.i = 5;
            this.c = 3;
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
        boolean z3 = this.j;
        boolean z4 = aijsVar == aijs.FULLSCREEN;
        this.j = z4;
        if (this.c != 2) {
            return;
        }
        try {
            this.d.f(aijsVar, aijsVar2, i, i2, z, z2);
        } catch (wlb e) {
            wwf.b(this.f, this.g, e.toString());
        }
        if (!z3 && z4) {
            this.b.a(4, new afzn[0]);
        } else if (!z3 || z4) {
        } else {
            this.b.a(5, new afzn[0]);
        }
    }

    @Override // defpackage.wlk
    public final void qG(String str, long j, long j2, long j3, boolean z) {
        if (this.c != 3 && z && TextUtils.equals(str, this.h)) {
            i();
            int i = (int) j;
            try {
                this.d.e(i);
            } catch (wlb e) {
                wwf.b(this.f, this.g, e.toString());
            }
            this.b.c(i, new afzn[0]);
            asap asapVar = this.e.g;
            if (asapVar == null) {
                asapVar = asap.a;
            }
            int i2 = (i * 4) / ((int) (asapVar.e * 1000));
            if (i2 < this.i) {
                return;
            }
            for (int i3 = i2; i3 >= this.i; i3--) {
                if (i3 == 1) {
                    this.b.b(10, new afzn[0]);
                } else if (i3 == 2) {
                    this.b.b(11, new afzn[0]);
                } else if (i3 == 3) {
                    this.b.b(12, new afzn[0]);
                }
            }
            this.i = i2 + 1;
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }
}
