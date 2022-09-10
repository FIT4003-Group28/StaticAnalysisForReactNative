package defpackage;
/* compiled from: PG */
/* renamed from: auom  reason: default package */
/* loaded from: classes2.dex */
public class auom {
    public final boolean a;
    public final boolean b;

    public auom(btvo btvoVar) {
        boolean z = btvoVar.getInboxParameters().a;
        this.a = z;
        dkly dklyVar = btvoVar.getHomeScreenParameters().d;
        boolean z2 = false;
        if ((dklyVar == null ? dkly.d : dklyVar).c && z) {
            z2 = true;
        }
        this.b = z2;
    }
}
