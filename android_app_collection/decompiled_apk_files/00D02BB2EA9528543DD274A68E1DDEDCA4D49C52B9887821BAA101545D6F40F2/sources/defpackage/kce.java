package defpackage;
/* compiled from: PG */
/* renamed from: kce  reason: default package */
/* loaded from: classes7.dex */
public class kce {
    public final boolean a;

    public kce(akfa akfaVar, btvo btvoVar) {
        btlu j = akfaVar.j();
        boolean z = false;
        boolean z2 = j == null || !j.m();
        dkyr ugcParameters = btvoVar.getUgcParameters();
        if (z2 && ugcParameters.G()) {
            z = true;
        }
        this.a = z;
        if (z2) {
            ugcParameters.bg();
        }
        if (z2) {
            ugcParameters.bh();
        }
    }
}
