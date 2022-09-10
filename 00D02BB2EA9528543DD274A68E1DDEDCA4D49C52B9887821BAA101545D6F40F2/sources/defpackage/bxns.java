package defpackage;
/* compiled from: PG */
/* renamed from: bxns  reason: default package */
/* loaded from: classes4.dex */
public final class bxns {
    public static boolean a(@dzsi ddgg ddggVar) {
        int i;
        if (ddggVar == null) {
            return false;
        }
        ddgf ddgfVar = ddggVar.h;
        if (ddgfVar == null) {
            ddgfVar = ddgf.e;
        }
        int i2 = ddgfVar.b;
        ddgf ddgfVar2 = ddggVar.h;
        if (ddgfVar2 == null) {
            ddgfVar2 = ddgf.e;
        }
        return ddgfVar2.d.contains(169) || (ddggVar.i.size() > (i = i2 + 1) && ddggVar.i.get(i).d.contains(169));
    }
}
