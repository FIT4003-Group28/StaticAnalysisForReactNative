package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ibv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ibv implements Runnable {
    public final /* synthetic */ ico a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ ibv(ico icoVar, String str) {
        this.a = icoVar;
        this.b = str;
    }

    public /* synthetic */ ibv(ico icoVar, String str, int i) {
        this.c = i;
        this.a = icoVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            ico icoVar = this.a;
            String str = this.b;
            aumh aK = icoVar.aK();
            if (aK == null || !str.equals(aK.d)) {
                return;
            }
            icoVar.bk();
        } else if (i == 1) {
            ico icoVar2 = this.a;
            String str2 = this.b;
            icoVar2.aj.i(str2, 2);
            if (icoVar2.av.d()) {
                icoVar2.bC = new rzc(str2);
                return;
            }
            icm icmVar = icoVar2.bq;
            if (icmVar.a != null) {
                icmVar.a = null;
                icoVar2.bg(iah.a(2), true);
                return;
            }
            iet aF = icoVar2.aF();
            if (aF == null) {
                return;
            }
            aF.d.d(icoVar2.N(R.string.reel_error_video_not_available), null);
        } else {
            ico icoVar3 = this.a;
            String str3 = this.b;
            aumh aK2 = icoVar3.aK();
            if (aK2 == null || !str3.equals(aK2.d)) {
                return;
            }
            icoVar3.bk();
        }
    }
}
