package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* renamed from: xvx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xvx implements ayqb {
    public final /* synthetic */ xwb a;
    private final /* synthetic */ int b;

    public /* synthetic */ xvx(xwb xwbVar, int i) {
        this.b = i;
        this.a = xwbVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.aF = Long.valueOf(((ahhx) obj).e());
        } else if (i == 1) {
            xwb xwbVar = this.a;
            ahgn ahgnVar = (ahgn) obj;
            aijs d = ahgnVar.d();
            if (d == aijs.FULLSCREEN || d == aijs.MINIMIZED) {
                xwbVar.az.hide();
            } else if (d == aijs.DEFAULT) {
                xwbVar.az.show();
            }
            xwbVar.aD = ahgnVar.a();
        } else if (i == 2) {
            xwb xwbVar2 = this.a;
            ahic ahicVar = (ahic) obj;
            xwbVar2.aH(xwbVar2.aI.c().booleanValue());
        } else {
            xwb xwbVar3 = this.a;
            PlaybackStartDescriptor g = ((ahic) obj).a().g();
            if (g == null || TextUtils.equals(g.l(), xwbVar3.aE)) {
                return;
            }
            xwbVar3.dismiss();
        }
    }
}
