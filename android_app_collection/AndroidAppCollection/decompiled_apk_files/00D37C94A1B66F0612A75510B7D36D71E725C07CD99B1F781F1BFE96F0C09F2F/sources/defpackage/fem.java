package defpackage;
/* compiled from: PG */
/* renamed from: fem  reason: default package */
/* loaded from: classes3.dex */
public final class fem implements fen {
    public final afy a = new afy();
    public boolean b;

    @Override // defpackage.fen
    public final void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        int i = 0;
        while (true) {
            afy afyVar = this.a;
            if (i >= afyVar.b) {
                return;
            }
            ((fen) afyVar.b(i)).a(z);
            i++;
        }
    }
}
