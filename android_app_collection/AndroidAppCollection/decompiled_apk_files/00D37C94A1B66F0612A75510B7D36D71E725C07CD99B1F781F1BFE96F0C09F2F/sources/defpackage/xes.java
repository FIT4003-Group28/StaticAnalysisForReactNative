package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: xes  reason: default package */
/* loaded from: classes4.dex */
public final class xes implements wly {
    public final aizp a;
    public boolean e;
    private final Bitmap f;
    private final aizr g;
    public int c = 2;
    public wzu d = wzu.d;
    public final Set b = new HashSet();

    public xes(Context context, aizr aizrVar, aizp aizpVar, aynx aynxVar) {
        this.g = aizrVar;
        this.a = aizpVar;
        this.f = BitmapFactory.decodeResource(context.getResources(), 2131232404);
        aynxVar.n().Z(new xer(this, 2));
    }

    private final void e(aalc aalcVar) {
        if (aalcVar == null) {
            aizp aizpVar = this.a;
            aizpVar.k(aizpVar.o, this.f);
            return;
        }
        this.a.l(aalcVar);
        this.g.b(aalcVar);
    }

    @Override // defpackage.wly
    public final void a(xgs xgsVar) {
        aizp aizpVar = this.a;
        aizpVar.m(aizpVar.l, xgsVar.c);
        avhn avhnVar = xgsVar.d;
        e(avhnVar == null ? null : new aalc(avhnVar));
    }

    @Override // defpackage.wly
    public final void b(wzu wzuVar, int i) {
        this.d = wzuVar;
        if (this.c != i) {
            this.c = i;
            for (xev xevVar : this.b) {
                ainn ainnVar = xevVar.a;
                if (ainnVar != null) {
                    ((ainw) ainnVar).a(false);
                }
            }
        }
    }

    @Override // defpackage.wly
    public final void c() {
        this.a.d();
        e(null);
    }

    @Override // defpackage.wly
    public final void d(PlayerResponseModel playerResponseModel) {
        aalc aalcVar = null;
        String A = playerResponseModel == null ? null : playerResponseModel.A();
        aizp aizpVar = this.a;
        aizpVar.m(A, aizpVar.m);
        if (this.a.p == null) {
            if (playerResponseModel != null) {
                aalcVar = playerResponseModel.b();
            }
            e(aalcVar);
        }
    }
}
