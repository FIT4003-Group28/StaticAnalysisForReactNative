package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: igd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class igd implements ayqb {
    public final /* synthetic */ ige a;
    private final /* synthetic */ int b;

    public /* synthetic */ igd(ige igeVar) {
        this.a = igeVar;
    }

    public /* synthetic */ igd(ige igeVar, int i) {
        this.b = i;
        this.a = igeVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        cff cffVar;
        int i = this.b;
        if (i == 0) {
            ige igeVar = this.a;
            Throwable th = (Throwable) obj;
            if (th instanceof cff) {
                cffVar = (cff) th;
            } else {
                cffVar = new cff(th);
            }
            igeVar.kV(cffVar);
        } else if (i == 1) {
            this.a.lG((artv) obj);
        } else {
            ige igeVar2 = this.a;
            Optional optional = (Optional) obj;
            if (!optional.isPresent()) {
                return;
            }
            String b = igeVar2.b.b();
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) optional.get();
            synchronized (igeVar2.d) {
                if (!igeVar2.i) {
                    igg iggVar = (igg) igeVar2.d.get(b);
                    if (iggVar != null) {
                        iggVar.c = playerResponseModel;
                        igeVar2.d.put(b, iggVar);
                    }
                }
            }
            for (afzf afzfVar : igeVar2.c) {
                afzfVar.lG((PlayerResponseModel) optional.get());
            }
        }
    }
}
