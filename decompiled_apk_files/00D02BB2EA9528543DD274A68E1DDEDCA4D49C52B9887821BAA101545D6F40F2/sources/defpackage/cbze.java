package defpackage;
/* compiled from: PG */
/* renamed from: cbze  reason: default package */
/* loaded from: classes4.dex */
public class cbze {
    public final boolean a;
    public final boolean b;

    public cbze(btvo btvoVar) {
        boolean z = true;
        boolean z2 = !btvoVar.getHashtagParameters().a && btvoVar.getHashtagParameters().b;
        this.a = z2;
        if (z2) {
            boolean z3 = btvoVar.getHashtagParameters().d;
        }
        this.b = (btvoVar.getHashtagParameters().a || !btvoVar.getHashtagParameters().c) ? false : z;
    }
}
