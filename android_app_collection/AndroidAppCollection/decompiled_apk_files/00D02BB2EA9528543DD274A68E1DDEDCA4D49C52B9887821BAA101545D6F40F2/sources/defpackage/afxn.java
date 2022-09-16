package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: afxn  reason: default package */
/* loaded from: classes2.dex */
public final class afxn {
    public dcdn<String, List<String>> a = afxg.a;
    public dcdc<String> b = dcdc.e();
    public final btvo c;
    public final afye d;

    public afxn(btvo btvoVar, afye afyeVar) {
        this.c = btvoVar;
        this.d = afyeVar;
    }

    public final boolean a() {
        dkng dkngVar = this.c.getLensParameters().i;
        if (dkngVar == null) {
            dkngVar = dkng.c;
        }
        dknf dknfVar = dkngVar.a;
        if (dknfVar == null) {
            dknfVar = dknf.h;
        }
        return dknfVar.e;
    }

    public final boolean b() {
        return this.c.getLensParameters().e;
    }
}
