package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kkw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class kkw implements View.OnClickListener {
    public final /* synthetic */ kkz a;
    private final /* synthetic */ int b;

    public /* synthetic */ kkw(kkz kkzVar) {
        this.a = kkzVar;
    }

    public /* synthetic */ kkw(kkz kkzVar, int i) {
        this.b = i;
        this.a = kkzVar;
    }

    public kkw(kkz kkzVar, int i, byte[] bArr) {
        this.b = i;
        this.a = kkzVar;
    }

    public kkw(kkz kkzVar, int i, char[] cArr) {
        this.b = i;
        this.a = kkzVar;
    }

    public kkw(kkz kkzVar, int i, short[] sArr) {
        this.b = i;
        this.a = kkzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            xfu xfuVar = this.a.G;
            if (xfuVar == null) {
                return;
            }
            xfx xfxVar = xfuVar.a;
            xfxVar.d(xfxVar.g);
        } else if (i == 1) {
            xfu xfuVar2 = this.a.G;
            if (xfuVar2 == null) {
                return;
            }
            xfx xfxVar2 = xfuVar2.a;
            xfxVar2.d(xfxVar2.f);
        } else if (i == 2) {
            xfu xfuVar3 = this.a.G;
            if (xfuVar3 == null) {
                return;
            }
            xfx xfxVar3 = xfuVar3.a;
            xfxVar3.d(xfxVar3.h);
        } else if (i == 3) {
            kkz kkzVar = this.a;
            xfu xfuVar4 = kkzVar.G;
            if (xfuVar4 == null) {
                return;
            }
            int i2 = kkzVar.p;
            int i3 = kkzVar.q;
            xfx xfxVar4 = xfuVar4.a;
            xfxVar4.c.j(i2, i3);
            xfxVar4.b(wzq.USER_SKIPPED);
        } else if (i != 4) {
            xfu xfuVar5 = this.a.G;
            if (xfuVar5 == null) {
                return;
            }
            xfuVar5.a();
        } else {
            xfu xfuVar6 = this.a.G;
            if (xfuVar6 == null) {
                return;
            }
            xfuVar6.a();
        }
    }
}
