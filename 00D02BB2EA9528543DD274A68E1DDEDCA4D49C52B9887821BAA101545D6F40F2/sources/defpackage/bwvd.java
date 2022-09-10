package defpackage;

import com.google.geo.imagery.viewer.api.Callback;
import com.google.geo.imagery.viewer.api.PhotoHandle;
/* compiled from: PG */
/* renamed from: bwvd  reason: default package */
/* loaded from: classes4.dex */
public final class bwvd extends Callback implements dfui {
    public boolean a = false;
    final /* synthetic */ bwve b;

    public bwvd(bwve bwveVar) {
        this.b = bwveVar;
    }

    @Override // defpackage.dfui
    public final void a(@dzsi dfuj<?> dfujVar) {
        dftb dftbVar;
        if (dfujVar == null || (dftbVar = dfujVar.a) == null) {
            return;
        }
        this.b.a.g(new bwvb(this, dftbVar));
    }

    @Override // com.google.geo.imagery.viewer.api.Callback
    public final void onComplete(int i, PhotoHandle photoHandle) {
        synchronized (this) {
            if (!this.a && i == 0) {
                this.b.a.post(new bwvc(this, photoHandle));
            }
        }
    }
}
