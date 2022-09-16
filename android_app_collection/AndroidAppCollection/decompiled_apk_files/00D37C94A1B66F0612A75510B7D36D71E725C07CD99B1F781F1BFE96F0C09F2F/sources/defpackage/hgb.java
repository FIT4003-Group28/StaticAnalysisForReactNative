package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hgb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hgb implements View.OnClickListener {
    public final /* synthetic */ hgc a;
    private final /* synthetic */ int b;

    public /* synthetic */ hgb(hgc hgcVar) {
        this.a = hgcVar;
    }

    public /* synthetic */ hgb(hgc hgcVar, int i) {
        this.b = i;
        this.a = hgcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.dismiss();
            return;
        }
        hgc hgcVar = this.a;
        hgz hgzVar = hgcVar.ah;
        if (hgzVar != null) {
            hgzVar.a.e.j();
            hgzVar.a.m();
            hgzVar.a.w.a(actj.SHORTS_CREATION_AUDIO_SCRUBBER_REMOVE_SOUND).b();
        }
        hgcVar.dismiss();
    }
}
