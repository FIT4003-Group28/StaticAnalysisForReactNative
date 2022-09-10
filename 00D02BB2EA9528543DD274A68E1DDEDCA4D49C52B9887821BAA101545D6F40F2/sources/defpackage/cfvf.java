package defpackage;

import java.util.EnumSet;
/* renamed from: cfvf  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cfvf implements dbsl {
    static final dbsl a = new cfvf();

    private cfvf() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dwud dwudVar;
        dwue dwueVar = (dwue) obj;
        EnumSet<dwub> enumSet = cfvh.a;
        if (dwueVar.a == 1) {
            dwudVar = (dwud) dwueVar.b;
        } else {
            dwudVar = dwud.d;
        }
        dwub b = dwub.b(dwudVar.c);
        if (b == null) {
            b = dwub.UNKNOWN_ACTION;
        }
        return enumSet.contains(b);
    }
}
