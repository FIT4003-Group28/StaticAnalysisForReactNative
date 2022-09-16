package defpackage;
/* compiled from: PG */
/* renamed from: gdn  reason: default package */
/* loaded from: classes3.dex */
public final class gdn implements aiaq {
    public boolean a = false;
    public boolean b = false;
    public aiap c = null;
    public final azpd d = azpd.ar();

    @Override // defpackage.aiaq
    public final void nK(boolean z) {
        this.a = z;
        this.d.c(Boolean.TRUE);
    }

    @Override // defpackage.aiaq
    public final void pB(boolean z) {
        this.b = z;
        this.d.c(Boolean.TRUE);
    }

    @Override // defpackage.aiaq
    public final void pD(aiap aiapVar) {
        this.c = aiapVar;
    }
}
